public class MatrixTranspose {
	public static void main(String args[]) {
		int values[][];
		values = new int[2][4];
		int riterator = 0;
		int index=0;
		while(riterator < values.length) {
			int citerator = 0;
			while(citerator < values[riterator].length) {
				values[riterator][citerator] = Integer.parseInt(args[index]);
				System.out.print(values[riterator][citerator]+" ");
				index++;
				citerator++;
			}
			System.out.print("\n");
			riterator++;
		}
		System.out.println("Transpose Matrix");
		int citerator = 0;
		while(citerator < values[0].length) {
			riterator=0;
			while(riterator < values.length) {
				System.out.print(values[riterator][citerator]+" ");
				riterator++;
			}
			citerator++;
			System.out.print("\n");
		}
	}
}
