package AI;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BreadthFirstSearch breadthFirstSearch = new BreadthFirstSearch();
		
		Vertex vertex1 =  new Vertex(1);
		Vertex vertex2 =  new Vertex(2);
		Vertex vertex3 =  new Vertex(3);
		Vertex vertex4 =  new Vertex(4);
		Vertex vertex5 =  new Vertex(5);
		
		vertex1.addNeighbour(vertex2);
		vertex1.addNeighbour(vertex4);
		vertex4.addNeighbour(vertex5);
		vertex2.addNeighbour(vertex3);
		
		breadthFirstSearch.bfs(vertex1);
	}

}
