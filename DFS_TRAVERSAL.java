import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;

class Graph{
	 public int v;
	 public int a[][];
	 
	 public Graph(int[][] a) {
		super();
		this.v = a.length;
		this.a = a;
	}
	public List<Integer> getChildren(int i){
		ArrayList<Integer>children=new ArrayList<>();
		for(int j=i+1;j<v;j++) {
			if(a[i][j]==1) {
				children.add(j);
			}
		}
		return children;
	}
	
	public void DFS(int r,Set<Integer>visited) {
//		if(r!=null) {
//			
//		}
		
		if(visited.contains(r))
			return;
		System.out.println(r);
		visited.add(r);
		List<Integer>children=getChildren(r);
		children.removeAll(visited);
		for(Integer child:children) {
			DFS(child, visited);
		}
	}
	



	
 }
public class DFS_TRAVERSAL {

	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		//System.out.println("Enter the no of vertices:- ");
		//int v=sc.nextInt();
		int a[][]=new int[5][5];
		a[0][1]=1;a[1][0]=1;a[1][2]=1;a[1][4]=1;a[2][1]=1;a[2][3]=1;a[3][4]=1;a[3][2]=1;
		a[4][1]=1;a[4][3]=1;
		Graph g=new Graph(a);
		g.DFS(0, new HashSet<Integer>());
	}

}
