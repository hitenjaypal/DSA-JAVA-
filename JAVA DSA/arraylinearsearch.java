import java.util.*;
//Linear search
public class arraylinearsearch {
    public static int linearsearch (int numbers[], int key){ //new function (cuz array by reference pass hote hai )

        for(int i=0; i<numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }

        return -1;
    }  

  public static void main(String args[]) {
    int numbers [] ={2,4,6,8,10,12,14,16};
    int key = 10;

    int index = linearsearch(numbers, key);
    if(index== -1){
        System.out.println("NOT found");

    }else {
        System.out.println("Key is at index :" + index);
    }
  }}