import java.util.Scanner;
public class latihan5
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int nilai;
		
		System.out.print("Masukkan nilai= ");
		nilai = input.nextInt();
		
		//posisi if berjalan
		if(nilai>0)
		{
			System.out.println("Angka yang dimasukkan adalah bernilai Positif");
		}
		else
			System.out.println("Angka yang dimasukkan adalah bernilai Negatif");
	}
}