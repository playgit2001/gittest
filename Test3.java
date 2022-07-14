package com.example.test;

import java.util.ArrayList;

public class Test3 {
    public int lengthOfLongestSubstring(String s) {
        int length=s.length();
        if(length==1)
            return length;
        String s2;
        ArrayList<String> s1 =new ArrayList<String>();
        int maxnum=0;
        for(int i=0;i<length;i++)
        {
            for(int j=i;j<=length;j++)
                //s1.add(s.substring(i,j));
            {
                s2=s.substring(i,j);
                if(repeat(s2))
                {
                    if(s2.length()>maxnum)
                        maxnum=s2.length();
                }
            }

        }

        /*for(String str:s1)
        {
            if(repeat(str)){
                if(str.length()>=maxnum)
                    maxnum=str.length();

            }

        }*/
        return maxnum;
    }
    public static boolean repeat(String str)
    {
        if(str==null||str.isEmpty())
            return false;
        char[] str1=str.toCharArray();
        for(char str2:str1 )
            if(str.indexOf(str2)!=str.lastIndexOf(str2))
                return false;

        return true;
    }
    public static void main(String[] arg){
        String s1="au";
        Test3 test3=new Test3();
        System.out.println(test3.lengthOfLongestSubstring(s1));
    }

}
