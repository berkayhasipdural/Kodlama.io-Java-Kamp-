
public class Main {

	public static void main(String[] args) {
		char grade = 'A';
		//result in different options according to the entered text
		switch(grade) {//belli birka� ihtimalin ve bunun sonucu yaz�lmas� gereken
		case 'A' :
			System.out.println("M�kemmel Ge�tiniz");
			break;//bitirir
		case 'B':
			System.out.println("�ok G�zel Ge�tiniz");
			break;
		case 'C':
			System.out.println("�yi Ge�tiniz");
			break;
		case 'D':
			System.out.println("Fena De�il Daha �ok �al�� Ama Ge�tiniz");
			break;
		}
	}

}
