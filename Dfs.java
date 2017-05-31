package graph;

public class Dfs {
	public static void main(String[] args) {
		Graph graph = new Graph();
		graph.addVertex('a');
		graph.addVertex('b');
		graph.addVertex('c');
		graph.addVertex('d');
		graph.addVertex('e');
		graph.addVertex('f');
		
		graph.addEdge(0,1 );//a-b
	//	graph.addEdge(0,2 );
		graph.addEdge(0,3 );
		graph.addEdge(0,4 );
		graph.addEdge(1,4 );
		graph.addEdge(1,5 );
		graph.addEdge(2,4 );
		graph.addEdge(3,4 );
		graph.addEdge(3,5 );
		graph.bfs();
		
	}
}




class Graph{
	private final int MAX_VERTS = 20;//最大顶点数
	private Vertex[] vertexList ;
	private int[][] adjMat;//邻接矩阵
	private int nVerts;//当前顶点数量
	private Stack thesStack;
	private Queue theQueue ;
	public Graph() {		//constructor
		vertexList = new Vertex[MAX_VERTS];
		adjMat = new int[MAX_VERTS][MAX_VERTS];
		for (int i = 0; i < MAX_VERTS; i++) {
			for (int j = 0; j < MAX_VERTS; j++) {
				adjMat[i][j]=0;//初始化邻接矩阵
			}
		}//end for、
		nVerts = 0;
		thesStack = new Stack();
		theQueue = new Queue(MAX_VERTS);
	}
	//深度优先搜索 deep first search
	public void dfs(){
		vertexList[0].wasVisited = true;
		display(0);
		thesStack.push(0);
		while(!thesStack.isEmpty()){
			for (int i = 0; i<nVerts; i++) {
				int currentVert = thesStack.peek();
//				System.out.print("adjMat["+currentVert+"]["+i+"]="+adjMat[currentVert][i]);
//				System.out.println(" vertexList["+currentVert+"].wasVisited=="+
//						vertexList[i].wasVisited);
				if (adjMat[currentVert][i]==1&&vertexList[i].wasVisited==false) {
					vertexList[i].wasVisited = true;
					display(i);
					thesStack.push(i);
					continue;//不执行后面的代码，开始下一次循环
				} 
			}//end for
			thesStack.pop();
		}//end while	
		for (int i = 0; i < nVerts; i++) {
			vertexList[i].wasVisited = false;
		}
	}
/*
 * 广度优先搜索
 */
	public void bfs(){
		vertexList[0].wasVisited = true;
		display(0);
		theQueue.insert(0);
		
		while (!theQueue.isEmpty()) {
			int nextVert = getAdjUnvisitedVertex(theQueue.peek());
			if (nextVert==-1) {
				theQueue.remove();
			} else {
				theQueue.insert(nextVert);
				display(nextVert);
				vertexList[nextVert].wasVisited = true;
			}
		}
		for (int i = 0; i < nVerts; i++) {
			vertexList[i].wasVisited = false;
		}
	}
	
	private int getAdjUnvisitedVertex(int v) {
		for (int i = 0; i < nVerts; i++) {
			if (adjMat[v][i]==1&&vertexList[i].wasVisited==false) {
				return i;
			}
		}
		return -1;
		
	}
	//增加顶点
	public void addVertex(char lable ){
		vertexList[nVerts++]= new Vertex(lable) ;
	}
	//增加边
	public void addEdge(int start, int end ){
		adjMat[start][end] = 1;
		adjMat[end][start] = 1;
	}
	//显示顶点
	public void display(int v ){
		System.out.print(vertexList[v].lable+" ");
	}
}



class Vertex {
	public char lable ;
	public boolean wasVisited ;
	
	public Vertex(char c ) {
		lable = c ;
		wasVisited = false;
	}
}





class Stack {
	private final int SIZE ;
	private int[] st ;
	private int top;
	
	public Stack() {
		SIZE = 20;
		st = new int[SIZE];
		top = -1;
	}
	
	public void push (int j){
		st[++top] = j;
 	}
	
	public int pop(){
		return st[top--];
	}
	
	public int  peek(){
		return st[top];
	}
	
	public boolean isEmpty(){
		return top==-1?true:false;
	}
}
