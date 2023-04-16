import java.util.*;
//Largest Number in Array

public class arraylargestnumbersum {
    public static int getlargest(int numbers[]){
        int largest = Integer.MIN_VALUE;  //-infinity and same as for smallest number

        for(int i=0; i<numbers.length; i++) {
              if(largest < numbers[i]) { // means compare index numbers with array numbers   
                largest = numbers[i];
            }
        }
        return largest;
    }

    public static void main (String args[]) {
        int numbers[] = {1,2,6,3,5};
        System.out.println("largest value is : " + getlargest(numbers));  
  
    }
}
