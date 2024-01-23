package programs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class secondlargsetarraylist {
    
public static void main(String args[]){
    
 int total =0,temp;   
Integer a[]={1,2,5,6,3,2};  
 
for (int i = 0; i < a.length; i++) {
    for (int j = i+1; j < a.length; j++) {
        if(a[i]>a[j]){
            temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
    }
    int len = a.length;   

    System.out.println(a[len-1]);
}
// Arrays.sort(a);
// int len = a.length;

// int element= a[len-1];
//System.out.println("Second Largest: " + element);

}}  