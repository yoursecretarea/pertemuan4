public class latihan1{
	public static void main(String args[]){
		char hurufAwal = 'a';
		System.out.print("Masukkan huruf awal nama anda: ");
		try{
			hurufAwal = (char)System.in.read();
		}catch(Exception e){
			System.out.println("Salah ko menginput ces...!");
		}
		if (hurufAwal == 'a')
			System.out.println("apa namanu amin ?");
		else if (hurufAwal == 'b')
			System.out.println("apa namanu bambang ?");
		else if (hurufAwal == 'c')
			System.out.println("apa namanu ceceo ?");
		else if (hurufAwal == 'd')
			System.out.println("apa namanu daud ?");
		else if (hurufAwal == 'e')
			System.out.println("apa namanu endang ?");
		else
			System.out.println("aku tidak bisa menebak");
	}
}