import java.util.ArrayList;

//Change "123456" with your student id. 
public class As4_123456 extends As4{
	//sample classes. Remove them if they are not needed
	private class Vertex{
	
	}
	private class Graph{
	
	}

	//Don't change the definition of this method. 
	public ArrayList<Integer> secondShortestPath(ArrayList<String> data, int start, int end){
		//create a path and add start vertex, intermediate vertex and end vertex index one by one
		ArrayList<Integer> path = new ArrayList<Integer>();

		path.add(start);
		path.add(2);
		path.add(1);
		path.add(end);
		return(path);
	}
	
	//sample of tests. remove them if it is not needed
	public void test(){
		ArrayList<String> data = new ArrayList<String>();
		data.add("7"); //total number of nodes is 7. Index starts from 0 to 6
		data.add("0 1 1.0"); //Edge from 0 to 1 with the weight 1
		data.add("1 0 1.0");
		data.add("0 2 7.0");
		data.add("2 0 7.0 "); //Edge from 2 to 0 with the weight 7
		data.add("1 2 1.0");
		data.add("2 1 1.0");
		data.add("1 3 3.0");
		data.add("3 1 3.0");
		data.add("1 4 2.0");
		data.add("4 1 2.0");
		data.add("2 4 4.0");
		data.add("4 2 4.0");
		data.add("3 5 6");
		data.add("5 3 6");
		data.add("3 4 1");
		data.add("4 3 1");
		data.add("4 5 2");
		data.add("5 4 2");
		data.add("3 6 100.0");
		data.add("6 3 100");
		data.add("6 1 1");
		data.add("1 6 1");
		ArrayList<Integer> path = secondShortestPath(data, 0, 6); //second shortest path (0 2 1 6)
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//change 123456 with your student id to do the test
		As4_123456 as4 = new As4_123456();
		as4.test();
		
	}

}
