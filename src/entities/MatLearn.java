package entities;

final public class MatLearn {
	private int M; 			// number of rows
	private int N; 			// number of columns
	private int[][] matrix; 		// M-by-N array
	
	public MatLearn(int M, int N) {
		
		
		this.M = M;
		this.N = N;
		matrix = new int[M][N];
		
	}
	
	//generates a M x N matrix
	public MatLearn(int[][] matrix) {
		M = matrix.length;
		N = matrix[0].length;
		this.matrix = new int[M][N];
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				this.matrix[i][j] = matrix[i][j]; 
			}
		}
		
	}
	

	public int getM() {
		return M;
	}

	public int getN() {
		return N;
	}
	
	//sysout representation
	public void show() {
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.println(matrix[i][j]);
            
            }
        }
    }
	
	public int[][] getMatrix() {
		return matrix;
	}

	public void setAtPosition(int m, int n, int o) {
		matrix[m][n] = o;
	}

	public void setN(int n) {
		N = n;
	}

	public void setMatrix(int[][] matrix) {
		this.matrix = matrix;
	}
	
	
}
