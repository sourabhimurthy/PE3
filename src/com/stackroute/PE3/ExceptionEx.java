package com.stackroute.PE3;
// A Class that represents use-defined expception
class MyException extends Exception
{
    public MyException(String s)
    {
        // Call constructor of parent Exception
        super(s);
    }
}

public class ExceptionEx {

        // Driver Program
        public static void main(String args[])
        {
            try
            {
                // Throw an object of user defined exception
                throw new MyException("Hello");
            }
            catch (MyException ex)
            {
                System.out.println("Caught");

                // Print the message from MyException object
                System.out.println(ex.getMessage());
            }
            finally
            {
                System.out.println("in finally block");
        }
    }


}
