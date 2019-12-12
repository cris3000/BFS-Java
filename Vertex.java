/**
 * 
 */
package AI;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cris29
 *
 */
public class Vertex {

	/**
	 * @param args
	 */
	
	
	private int data;
	private boolean visited;
	private List<Vertex> neighbourList;
	
	
	public Vertex(int data) {
		this.data = data;
		this.neighbourList = new ArrayList<>();
	}


	/**
	 * @return the data
	 */
	public int getData() {
		return data;
	}


	/**
	 * @param data the data to set
	 */
	public void setData(int data) {
		this.data = data;
	}


	/**
	 * @return the visited
	 */
	public boolean isVisited() {
		return visited;
	}


	/**
	 * @param visited the visited to set
	 */
	public void setVisited(boolean visited) {
		this.visited = visited;
	}


	/**
	 * @return the neighbourList
	 */
	public List<Vertex> getNeighbourList() {
		return neighbourList;
	}


	public void addNeighbour(Vertex vertex) {
		// TODO Auto-generated method stub
		this.neighbourList.add(vertex);
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  " " +this.data;
	}




}
