
public class Main {

	public static void main(String[] args) {
		double[] myList = {1.2,1.3,4.3,1.6};//double cinsinden yeni liste olu�turur
		double total=0;
		double max = myList[0];//0. elemana max tan�mlar
		for (double number:myList) { //mylist i tarar ve number adl� de�i�kene tan�mlar
			if(max<number) { //
				max = number;
			}
			
			total = total + number;
			System.out.println(number);
		}
		
		System.out.println("Toplam = " + total);
		System.out.println("En b�y�k = " + max);
		
	}

}
