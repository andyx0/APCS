public class MagicSquareMaker {
	
	public static void main(String[] args) {
		int n = 5;
		int[][] magicSquare = new int[n][n];
		int row = n - 1, col = n/2;
		int rowPrev, colPrev;
		
		for(int k = 1; k <= n*n; k++) {
			magicSquare[row][col] = k;
			rowPrev = row;
			colPrev = col;
			row++;
			col++;
			if(row == n) {
				row = 0;
			}
			if(col == n) {
				col = 0;
			}
			if(magicSquare[row][col] > 0) {
				row = rowPrev;
				col = colPrev;
				row--;
			}
		}
		for(int[] x: magicSquare) {
			for(int i: x) {
				System.out.print(i + "\t");
			}
			System.out.println();
		}
	}
}
