public class Main {

	public static void main(String[] args) {
		String[][] city = new String [3][3];
		
		city[0][0] = "Ýstanbul";//MultiDimensionalArray oluþturur , benim tanýmýmca iç içe array demek.
		city[0][1] = "BURSA";
		city[0][2] = "Bilecik";
		city[1][0] = "Ankara";
		city[1][1] = "Konya";
		city[1][2] = "Kayseri";
		city[2][0] = "Diyarbakýr";
		city[2][1] = "Þanlýurfa";
		city[2][2] = "Gaziantep";
		//More sub-options
		for(int i = 0; i<=2;i++) {
			System.out.println("-------");
			for(int j=0;j<=2;j++) {
				System.out.println(city[i][j]);
				
			}
		}
	

	}

}
