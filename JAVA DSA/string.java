 import java.util.*;
 
 public static void main(String args []) {
    StringBuilder sb = new StringBuilder("");
    for (char ch='a'; ch<='z'; ch++) {
        sb.append(ch); // append ka mtlb piche jodna
    }
    System.out.println(sb);
 }
 // O(26) 
 //strong bulder program ko efficent krdeta hau toh string or s builder dono use kr skte hai


public static String  toUpperCase(String str) {
    StringBuildern sb = new StringBuilder(""):

    char ch = Character.toUpperCase(str.charAt(0));
    sb.append(ch);

    for(int i=1; i<str.length(); i++) {
        if(str.charAt(i)== '' && i<str.length()-1) {

       
        sb.append(str.charAt(i));
        i++;
        sb.append(Character.toUpperCase(str.charAt(i)));
    }else {
        sb.append(str.charAt(i)); 
    }
}
return sb.toString();
 }
public static void main (String args[]) {
    String str = "hi, i am hiten";
    System.out.println(toUpperCase(str));
}


//compression

public static String compress(String str) {
    String newStr = "";

    for (int i=0; i <str.length(); i++) {
        Integer count = 1;
        while(i<str.lenght()-1 && str.charAt(i) == str.charAt(i+1)) {
            count++;
            i++;
        }
        newStr += str.charAt(i);
        if(count > 1) {
            newStr += count.toString();
        }
    }
    return newStr;
}

public static void main (String args []){
  String str = "aaabbcccdd";
  System.out.println(compress(str));
}