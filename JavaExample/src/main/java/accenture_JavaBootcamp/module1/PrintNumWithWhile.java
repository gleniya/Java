package accenture_JavaBootcamp;

public class PrintNumWithWhile {
    public static void main(String[] args) {
        int x=1;
        while (x<100){
            if(x % 2 != 0) {
                System.out.println("The value is odd number: " + x);
            }
            x++;
        }
    }
}
