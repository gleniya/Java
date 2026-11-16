package accenture_JavaBootcamp;

public class FindInArray {
    public static void main(String[] args) {
        int[] number = {100, 150, 65, 15};
        // assuming 0th index number is bigger
        int largest= number[0];
        //
        for(int i=1; i<number.length; i++){

            // if the current element is bigger, then assigning that value to largest
          if(number[i]>number[0]){
             largest=number[i];
          }
        }
        System.out.println("The largest number is: "+largest);
    }
}
