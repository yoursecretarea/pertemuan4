import java.util.Scanner;
import java.util.Arrays;
public class latihan4 {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		int[] nilai = new int[5];
		System.out.print("Masukkan nilai 1 : ");
		nilai[0] = input.nextInt();
		System.out.print("Masukkan nilai 2 : ");
		nilai[1] = input.nextInt();
		System.out.print("Masukkan nilai 3 : ");
		nilai[2] = input.nextInt();
		System.out.print("Masukkan nilai 4 : ");
		nilai[3] = input.nextInt();
		System.out.print("Masukkan nilai 5 : ");
		nilai[4] = input.nextInt();
		
		Arrays.sort(nilai);
		System.out.println("Min : " +nilai[0]);
		System.out.println("Max : " +nilai[nilai.length-1]);
		
		
		
	}
}