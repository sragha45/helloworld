/**
 * Created by raghav on 27/2/16.
 */
import java.io.*;
import java.util.*;

class MyException extends Exception{
    public MyException() {
    }

    @Override
    public String toString() {
        return super.toString()+"n and p should be non-negative";
    }
}
class myCalculator {
    int power(int n, int p) throws Exception {
        if (n < 0 || p < 0) {
            throw new MyException();
        }
        else return (int)Math.pow((double) n,(double)p);
    }
}

public class Solutions {

        public static void main(String []argh)
        {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
                int p = in.nextInt();
                myCalculator M = new myCalculator();
                try
                {
                    System.out.println(M.power(n,p));
                }
                catch(Exception e)
                {
                    System.out.println(e);
                }
            }

        }
