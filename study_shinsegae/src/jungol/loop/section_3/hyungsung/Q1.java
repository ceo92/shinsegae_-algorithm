package jungol.loop.section_3.hyungsung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.io.*;
import java.util.*;

public class Q1{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int sum = 0 , count = 0;
        while(st.hasMoreTokens()){
            int a = Integer.parseInt(st.nextToken());
            if(a == 0) break;
            sum+=a;
            count++;

        }
        System.out.println(sum+" "+(sum/count));





    }
}