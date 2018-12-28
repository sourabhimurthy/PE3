package com.stackroute.PE3;
public class Chessboard {
    public static void main(String[]args)
    {
        String[][] matrix=new String[8][8];
        String[][] result=chessBoard(matrix);
    }

    public static String[][] chessBoard(String[][] matrix)
    { String[][] res=new String[8][8];
        for(int i =0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                if(j%2==0)
                {
                    res[i][j]+="WW";
                    //System.out.print("WW|");
                }
                else{
                    res[i][j]+="BB";
                   // System.out.print("BB|");
                }
            }
            System.out.println();
        }
        return res;
    }
}
