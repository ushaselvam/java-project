import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Array {
	public static void main(String args[]) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int values[] = new int[5];
		int i = 0;
		while(i < values.length) {
			values[i] = Integer.parseInt(bf.readLine());
			i++;
		}
		i=0;
		while (i < values.length) {
			System.out.println(values[i]);
			i++;
		}
	}
}
