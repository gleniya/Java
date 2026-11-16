package accenture_JavaBootcamp;

public class NumToWordUsingMethod {
    public static void main(String[] args) {
        printWord(8);
        printWord(9);
        printWord(10);
    }

    public static void printWord(int x) {
        String text = "";

        switch (x) {
            case 1:
                text = "The number to word is: One";
                break;
            case 2:
                text = "The number to word is: Two";
                break;
            case 3:
                text = "The number to word is: Three";
                break;
            case 4:
                text = "The number to word is: four";
                break;
            case 5:
                text = "The number to word is: five";
                break;
            case 6:
                text = "The number to word is: six";
                break;
            case 7:
                text = "The number to word is: seven";
                break;
            case 8:
                text = "The number to word is: eight";
                break;
            case 9:
                text = "The number to word is: nine";
                break;
            case 10:
                text = "The number to word is: ten";
                break;
            default:
                text = "invalid number";

        }
    }
}


