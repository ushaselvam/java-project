public class Pyramid {
	public static void main(String args[]) {
		int size = Integer.parseInt(args[0]);
		int i = 0,number = 1,count = 1;
		while(i < 10) {
			int j = size;
			while(j > 0) {
				System.out.print(" ");
				j--;
			}
			int tempCount = count;
			int tempNumber = number;
			while(count > 0) {
				if(number < 9)
					System.out.print(number);
				else
					System.out.print(number%10);
				number++;
				count--;
			}
			count = tempCount;
			number--;
			while(count > 1) {
				number--;
				if(number < 9)
					System.out.print(number);
				else
					System.out.print(number%10);
				count--;
			} 
			count = tempCount;
			System.out.print("\n");
			i++;
			size--;
			if(number < 9)
				number = number+count;
			else {
				number = number%10;
				number = number+count;
			}
			count++;
		}
	}
}
