package src;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
        
        int[] input = new int[6]; 
        
        for(int j = 0; j < 6; j++){
            input[j] = scanner.nextInt();
        }

        input[0] = 1 - input[0];
        input[1] = 1 - input[1];
        input[2] = 2 - input[2];
        input[3] = 2 - input[3];
        input[4] = 2 - input[4];
        input[5] = 8 - input[5];

		for(int i : input){
            System.out.print(i);
            System.out.print(' ');
        }
	}
}