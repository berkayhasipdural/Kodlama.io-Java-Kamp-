
public class Main {

	public static void main(String[] args) {
		sayiBulmaca();
		sayiBulmaca();
		sayiBulmaca();
		sayiBulmaca();
		sayiBulmaca();
		//use for testing

	}
	
	public static void sayiBulmaca() { //bu bir methoddur
        int[] numbers = new int[] {1, 2, 0, 5, 7, 9};
        int number = 6;
        boolean cond = false;
        for(int i=0; i<numbers.length; i++) {
            if(numbers[i] == number) {
                cond = true;
                break;
            }
        }
        if(cond) System.out.println("Say� Mevcuttur : " + number);
        else System.out.println("Say� Mevcut De�ildir : " + number);
	}

}
