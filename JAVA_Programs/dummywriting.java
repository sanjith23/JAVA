package programs;

//Prime number
public class dummywriting {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        int n = 10;
        boolean isPrime = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
    }
}
// Output:
//10 is not a prime number.