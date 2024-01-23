package programs;

public class armstrongnumber {

    public static void checknumber(int num) {
        int temp = num;
        int rem, sum = 0;

        while (num > 0) {
            rem = num % 10;
            sum = sum + (rem * rem * rem);
            num = num / 10;
        }
        if (temp == sum) {
            System.out.println(temp + " is armstrong number");
        } else {
            System.out.println(temp + " is not armstrong number");
        }

    }

    public static void main(String[] args) {

      
        checknumber(153);
        checknumber(1221);
        checknumber(111);
        checknumber(1234);

    }
}
