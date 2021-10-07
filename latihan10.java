/**
 *Contoh aplikasi restoran sederhana yang menggunakan seleksi
 *dan looping
*/

import java.util.Scanner;

public class latihan10
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int pilihan;
		boolean loop = true;
		
		System.out.print("Menu Pilihan:");
		System.out.print("1. Nasi Goreng Ayam");
		System.out.print("2. Nasi Goreng Seafood");
		System.out.print("3. Soto Ayam");
		System.out.print("4. Juice Jeruk");
		System.out.print("Pilihan: ");
		pilihan = input.nextInt();
		
		while(loop)
		{
			switch (pilihan)
			{
				case 1:
				System.out.println("Anda memilih Nasi Goreng Ayam");
				loop = false;
				break;
				case 2:
				System.out.println("Anda memilih Nasi Goreng Seafood");
				loop = false;
				break;
				case 3:
				System.out.println("Anda memilih Soto Ayam");
				loop = false;
				break;
				case 4:
				System.out.println("Anda memilih Juice Jeruk");
				loop = false;
				break;
				default:
				System.out.println("Silahkan pilih menu 1-4");
			}
		}
		System.out.println("Pesanan anda akan diantar sebentar lagi...");
	}
}