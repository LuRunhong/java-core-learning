package org.javacore.io.base;

import java.util.Scanner;

/**
 * 类用作输入输出测试使用
 * 输入必须先构造一个Scanner对象
 * 并将该对象与标准输入流 System.in关联
 */

public class InputTest
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("what is your name?");
        //String name = in.next();//读取下一个单词，以空格符为分隔符
        String name = in.nextLine();//读取下一行


        System.out.print("how old are you?");
        int age = in.nextInt();//nextInt读取下一个整数

        //display output
        System.out.println("Hello,"+ name +"next year,you will be "+(age+1));

    }
}
