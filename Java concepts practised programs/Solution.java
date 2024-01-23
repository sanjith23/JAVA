import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    int[] nums1 = new int[5];
    for (int i = 0; i < nums1.length; i++)
    {
        nums1[i] = sc.nextInt();
    }

    int[] num2 = new int[5];
    for (int j = 0; j < nums2.length; j++)
    {
        nums2[j] = sc.nextInt();
    }  

        int m = sc.nextInt();
        int n = sc.nextInt();

        System.out.println(Arrays.toString(nums1) + m + Arrays.toString(nums2) + n);
    }
}
