public class PerfectNumber {
    public static boolean isPerfectNumber(int number) {
     int sum = 0;
     if(number > 0) {
         int i = 1;
         while (i <= number / 2) {
             if (number % i == 0) {
                 sum += i;
             }
             i++;
         }
     } else {
         return false;
     }
     if(sum == number) {
         System.out.println(sum);
         return true;
     }else {
         return false;
     }
    }
}
