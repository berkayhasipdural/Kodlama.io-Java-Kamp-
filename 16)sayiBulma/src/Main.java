public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[] {1, 2, 0, 5, 7, 9};
        int number = 6;
        boolean cond = false;
        for(int i=0; i<numbers.length; i++) {
            if(numbers[i] == number) {
                cond = true;
                break;
            }
        }
        if(cond) System.out.println("Say� Mevcuttur");
        else System.out.println("Say� Mevcut De�ildir");
    }
}