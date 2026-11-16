package accenture_JavaBootcamp;

public class MultiplicationTable {
    public static void main(String[] args) {
        int num= 11;
        for (int i= 1; i<=10; i++){
          int value = i * num;
            System.out.println(num+ " * "+i+" = "+value);
        }

    }
}
