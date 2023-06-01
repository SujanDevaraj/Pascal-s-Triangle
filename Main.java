import java.util.*;

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ArrayList<Integer>> triangle = pascalTriangle(n);
        for (int i = 0; i < triangle.size(); i++) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                System.out.print(triangle.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

	public static ArrayList<ArrayList<Integer>> pascalTriangle(int n) {
        // write code here
		ArrayList<ArrayList<Integer>> pasc = new ArrayList<ArrayList<Integer>>();
		for( int i=0;i<n;i++){
			ArrayList<Integer> row = new ArrayList<Integer>();
			for(int j=0;j<=i;j++){
				if(j==0||j==i){
					row.add(1);
				}else{
					row.add(pasc.get(i-1).get(j-1)+pasc.get(i-1).get(j));
				}
				
			}
			pasc.add(row);
		}
		return pasc;
    }
}
