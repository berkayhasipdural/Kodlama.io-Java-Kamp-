
public class Main {

	public static void main(String[] args) {
		double[] myList = {1.2,1.3,4.3,1.6};//double cinsinden yeni liste oluþturur
		double total=0;
		double max = myList[0];//0. elemana max tanýmlar
		for (double number:myList) { //mylist i tarar ve number adlý deðiþkene tanýmlar
			if(max<number) { //
				max = number;
			}
			
			total = total + number;
			System.out.println(number);
		}
		
		System.out.println("Toplam = " + total);
		System.out.println("En büyük = " + max);
		
	}

}
