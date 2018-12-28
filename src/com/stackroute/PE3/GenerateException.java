package com.stackroute.PE3;
import java.util.Scanner;

public class GenerateException {

    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        int[] inp=new int[2];
        System.out.println("Enter the input size for array");
        try{
             inp=new int[-1];
        }
        catch(NegativeArraySizeException e){
           e.printStackTrace();
        }

        try {

                inp[2]=23;

            }
        catch (ArrayIndexOutOfBoundsException e)
        {
          e.printStackTrace();
        }
        try{
            String s=null;
            //System.out.println(s);
            char ch = s.charAt(0);
        }catch (NullPointerException e)
        {
            //e.printStackTrace();
            System.out.println(e);
        }
    }
}
