public class latihan6
{
	public static void main(String args[])
	{
		
		char hurufAwal = 'a';
		System.out.print("Masukkan huruf awal nama anda: ");
		try{
			hurufAwal = (char)System.in.read();
		}catch(Exception e){
			System.out.println("Salah ko menginput ces...!");
		}
		switch(hurufAwal)
		{
		case (char)-1 : System.out.println("bukan huruf besar !!!");break;
		case 'a' : System.out.println("apa namanu amin ?");break;
		case 'b' : System.out.println("apa namanu bambang ?");break;
		case 'c' : System.out.println("apa namanu ceceo ?");break;
		case 'd' : System.out.println("apa namanu daud ?");break;
		case 'e' : System.out.println("apa namanu endang ?");break;
		default : System.out.println("aku tidak bisa menebak");
		}		
	}
}