package programs;

/**
 * largestnumberinarray
 */
public class largestnumberinarray {

    public static void main(String[] args) {
        int a[] ={23,44,100,55,77};
        
        int max = a[0];

        for (int i = 0; i < a.length; i++) {
            if(a[i]>max){
                max = a[i];
            }
        }

        System.out.println(max);
    }
}