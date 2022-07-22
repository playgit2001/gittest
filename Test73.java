package com.example.test;

public class Test73 {
    public void setZeroes(int[][] matrix) {
        boolean[] row=new boolean[matrix.length];
        boolean[] col=new boolean[matrix[0].length];
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]==0)
                {
                    row[i]=true;
                    col[j]=true;
                }
            }

        }
        for(int i=0;i<matrix.length;i++)
        {
            if(row[i])
            {
                for(int j=0;j<matrix[0].length;j++)
                {
                    matrix[i][j]=0;
                }
            }
        }
        for(int i=0;i<matrix[0].length;i++)
        {
            if(col[i])
            {
                for(int j=0;j<matrix.length;j++)
                {
                    matrix[j][i]=0;
                }
            }
        }
    }
}
