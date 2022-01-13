public class MatrixMultiplication {
    
    public static void main(String[] args) {
    	
		int[][] matrix1 = {
			{2,1},
			{3,5},
		};
		int[][] matrix2 = {
			{-2,3},
			{4,-1},
		};
		int[][] product = new int[2][2];
		
		for(int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                for (int k = 0; k < matrix1[0].length; k++) {
                    product[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
		
		for(int[] i: product) {
			for(int x: i) {
				System.out.print(x + "\t");
			}
			System.out.println();
		}
    }
}
