public class Main {

    public static void main(String[] args) {
	int number = 0;
    boolean isPrime = true;
    
    if (number<1) {
    	System.out.println("Asal say�dan bahsedilemez ");
    	return;
    }

            if (number==1){
                System.out.println("Asal say� de�ildir.");
                return;
            }
           for (int i = 2; i < number; i++) {
               if (number % i == 0) {
                   isPrime = false;
               }
           }
            if(isPrime){
                System.out.println("Asal say�d�r: " + number);
            } else{
                System.out.println("Asal say� de�ildir: " + number);
            }
        }

}