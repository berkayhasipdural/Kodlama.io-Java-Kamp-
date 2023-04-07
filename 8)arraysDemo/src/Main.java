
public class Main {

	public static void main(String[] args) {
		String ogrenci1="Berkay";
		String ogrenci2="Hasip";
		String ogrenci3="Dural";
		//we use when arrays have multiple terms
		String[] ogrenciler = new String [3]; //yeni bir liste oluþtururuz
		ogrenciler[0]="Berkay";
		ogrenciler[1]="Hasip";
		ogrenciler[2]="Dural";

		for (int i=0;i<ogrenciler.length;i++) {
			System.out.println(ogrenciler[i]);
		}
 	}

}
