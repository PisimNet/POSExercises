package ex2;

public class Pascal {

	public static int calc(int n){
		//ArrayList<ArrayList<Integer>> rows = new ArrayList <ArrayList<Integer>>();
		long rows [][] = new long [100][100];
		for(int i=1;i<=n;i++){
			//rows.add(i,new ArrayList<Integer>());
			
			for(int j=1;j<=i;j++){
				if(j==1 || j==i){
					//rows.get(i).add(j,1);
					rows [i][j]= 1; 
				}
				else{
				//	int sum = rows.get(i-1).get(j) + rows.get(i-1).get(j-1);
				//	rows.get(i).add(j,sum);
					long sum = rows [i-1][j] + rows [i-1][j-1];
					rows[i][j] = sum;
				}
				System.out.print(" " + rows[i][j]);
			}
			System.out.println("");
		}
		return n;	
	}
}
	

