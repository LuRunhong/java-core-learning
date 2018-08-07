package org.javase;

import com.sun.deploy.util.ArrayUtil;

import java.util.Arrays;
import java.util.List;

public class ForTest {

        public static void main(String args[]) {
            int[] numbers = {10, 20, 30, 40, 50};

            for (int x:numbers) {
                System.out.println(x);
            }
            
            String[] strs = {"a", "b", "c", "d"};
            List list = Arrays.asList(strs);

            list.forEach(str -> System.out.println(str));

        

            //int  4
            //float  4
            //long   8
            //double 8
            //实际存储补码
            //原码
            //反码

            //00000111;  7
            //10000111;  -7    ->
            //01111001; 
    }
}
