
public class Main {

	public static void main(String[] args) {
		char grade = 'A';
		//result in different options according to the entered text
		switch(grade) {//belli birkaç ihtimalin ve bunun sonucu yazýlmasý gereken
		case 'A' :
			System.out.println("Mükemmel Geçtiniz");
			break;//bitirir
		case 'B':
			System.out.println("Çok Güzel Geçtiniz");
			break;
		case 'C':
			System.out.println("Ýyi Geçtiniz");
			break;
		case 'D':
			System.out.println("Fena Deðil Daha Çok Çalýþ Ama Geçtiniz");
			break;
		}
	}

}
