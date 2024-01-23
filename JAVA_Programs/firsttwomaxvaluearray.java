package programs;

public class firsttwomaxvaluearray {
    public static void main(String[] args) {
        int a[] = {89,7,100,22,44};
            int temp = 0; 
        int max = a[0];
           for (int i = 0; i < a.length; i++) {
             if (a[i]>max) {
                max = a[i];   
             }
            }
            for (int k = 0; k < a.length; k++) {
                for (int j = k+1 ; j < a.length; j++) {
                    temp=a[k];
                    a[k] = a[j];
                    a[j] = temp;
                }
            }
            System.out.println(max +" and "+ temp);
    }
}
