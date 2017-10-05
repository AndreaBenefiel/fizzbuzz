
/*
FizzBuzz code challenge
 */
public class fizzbuzz
{
 
    public static void fizzbuzz()
    {
        
        for (int i = 1; i<101 ; i++){           //count from 1-100
        if(i%3 == 0 && i%5==0){                 //divisible by 3 and 5
            System.out.print("FizzBuzz");
            System.out.print("\n");
        }
        else if(i%3==0 && i %5 != 0){           //divisible by 3 only
            System.out.print("Fizz");
            System.out.print("\n");
        }
        else if(i%3!=0 && i %5 == 0){           //divisible by 5 only
            System.out.print("Buzz");
            System.out.print("\n");
        }
        else{                                   //divisible by neither
            System.out.print(i);
            System.out.print("\n");
        }
        }
        
        return ;
    }
}
