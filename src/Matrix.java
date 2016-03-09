
public class Matrix {

	public static void main(String[] args) {

		int[][] arr = new int[2][3];
		int[][] arr2 = new int[3][4];
		int[][] arr3 = new int[2][4];
		int S = 0;
		int i, j, k;
		for (i = 0; i < arr.length; i++) {

			for (j = 0; j < arr[i].length; j++) {
				arr[i][j] = (int) (Math.random() * 10);
				System.out.print(arr[i][j] + "  ");
			}
			System.out.println();
		}
		for (i = 0; i < arr2.length; i++) {

			for (j = 0; j < arr2[i].length; j++) {
				arr2[i][j] = (int) (Math.random() * 10);
				System.out.print(arr2[i][j] + "  ");
			}
			System.out.println();
		}
		System.out.println();

		for (i = 0; i < arr.length; i++) {

			for (j = 0; j < arr2[i].length; j++) {
				S = 0;
				for (k = 0; k < arr2.length; k++) {
					S = S + arr[i][k] * arr2[k][j];
					arr3[i][j] = S;
				}

				//
			}
		}
		for (i = 0; i < 2; i++) {
			for (j = 0; j < 4; j++) {
				System.out.print(arr3[i][j] + "  ");
			}
			System.out.println();
		}
	}

}
