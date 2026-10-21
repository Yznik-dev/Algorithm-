import java.util.Random;
public class Main {
    public static void main (String[] args)
    {
       int min = 101;
       int max = 0;
       int i = 0;

       Random r = new Random();

       while (i < 10)
       {
           int number = (r.nextInt(100) + 1);
           System.out.println(number + ",");

           if (number < min) min = number;
           if (number > max) max = number;

           i ++;

       }
        System.out.println("The largest number in the collection is: " + max);
        System.out.println("The smallest number in the set is: " + min);









    }
}
