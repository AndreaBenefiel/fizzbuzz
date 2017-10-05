
/**
 * Write a description of class fizzbuzz here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class fizzbuzz
{
    // instance variables - replace the example below with your own

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void fizzbuzz()
    {
        // put your code here
        for (int i = 1; i<101 ; i++){
        if(i%3 == 0 && i%5==0){
            System.out.print("Fizzbuzz");
            System.out.print("\n");
        }
        else if(i%3==0 && i %5 != 0){
            System.out.print("Fizz");
            System.out.print("\n");
        }
        else if(i%3!=0 && i %5 == 0){
            System.out.print("Buzz");
            System.out.print("\n");
        }
        else{
            System.out.print(i);
            System.out.print("\n");
        }
        }
        
        return ;
    }
}
