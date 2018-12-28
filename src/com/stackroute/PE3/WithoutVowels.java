package com.stackroute.PE3;
import java.util.Scanner;

public class WithoutVowels {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of names");
        int inp = sc.nextInt();
        String[] inputArray = new String[inp];
        for (int i = 0; i < inp; i++) {
            System.out.println("Enter the names ");
            inputArray[i] = sc.next();
        }
       // WithoutVowels a1 = new WithoutVowels();
        removeVowels(inputArray);
        //System.out.println(a1.toString());
    }

    public static String removeVowels(String[] inputArray) {
        /*StringBuilder result[] = new StringBuilder[inputArray.length];
        int count = 0;
        for (int j = 0; j < inputArray.length; j++) {

            for (int i = 0; i < inputArray[i].length(); i++) {
                if (inputArray[i].charAt(count) != 'a' || inputArray[i].charAt(count) != 'e' || inputArray[i].charAt(count) != 'i' || inputArray[i].charAt(count) != 'o' || inputArray[i].charAt(count) != 'u') {
                    result[j] = result[j].append(inputArray[i].charAt(count));
                    count++;
                } else
                    count++;
            }
        }
        for (int l = 0; l < inputArray.length; l++) {
            for (int k = 0; k < result.length; k++) {
                System.out.println(result[k]);
            }
        }*/
        String result="";
        String[] res=new String[inputArray.length];
        int i;

        for (int j = 0; j < inputArray.length; j++) {
            res[j] = inputArray[j].replaceAll("[aeiouAEIOU]", "");
        }
        for ( i = 0; i < res.length; i++) {
           res[i] = inputArray[i].replaceAll("[aeiouAEIOU]", "");
            System.out.println(res[i]);
            result=result+res[i];

        }
        return result;

    }
}
