package programs;

import java.io.IOException;

public class vowelsinstring {
    public static void main(String[] args)  throws IOException {
        String str = "aaeeii";
        str = str.toLowerCase();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)== 'a' || str.charAt(i)== 'e'
            || str.charAt(i)== 'i' || str.charAt(i)== 'o' ||
            (str.charAt(i)== 'u')){
                count++;
            }

        }

            System.out.println(count);

        // String str = "GeeksForGeeks";
        // str = str.toLowerCase();
        // int count = 0;
 
        // for (int i = 0; i < str.length(); i++) {
        //     // check if char[i] is vowel
        //     if (str.charAt(i) == 'a' || str.charAt(i) == 'e'
        //         || str.charAt(i) == 'i'
        //         || str.charAt(i) == 'o'
        //         || str.charAt(i) == 'u') {
        //         // count increments if there is vowel in
        //         // char[i]
        //         count++;
        //     }
        // }
 
        // // display total count of vowels in string
        // System.out.println(
        //     "Total no of vowels in string are: " + count);
            
        
    }
}

