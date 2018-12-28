package com.stackroute.PE3;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Consecutivenum {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the input");
        String input=sc.next();
        boolean result=consecNum(input);
         if(result)
         {
          System.out.println(input+"is consecutive number");
          }
            else
            {
            System.out.println(input+"is not consecutive number");
            }
    }
    public static boolean consecNum(String input)
    {
        String[] res=input.split(",");
        int [] arr=new int[res.length];
        for(int i=0;i<res.length;i++)
        {
            arr[i]=parseInt(res[i]);
        }
        for(int i=0;i<res.length-1;)
        {
            if((arr[i+1]==arr[i]+1)||(arr[i+1]==arr[i]-1))
            {

                i++;
                //System.out.print(res[i]);
            }
            else
            {     return false;
               // System.out.println(res[i]);

            }
        }
        return true;
    }
}
