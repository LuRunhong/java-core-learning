package org.javase;

import java.util.HashMap;
import java.util.Map;

public class NumberMath {

    public static void main(String[] args) {
       /*内置基本数据类型 byte int long double short float  char boolean
        Java为每一个内置数据类型提供了对应的包装类
        所有的包装类（Integer、Long、Byte、Double、Float、Short）都是抽象类 Number 的子类
       当内置数据类型被当作对象使用的时候，编译器会把内置类型装箱为包装类。相似的，编译器也可以把一个对象拆箱为内置类型。Number 类属于 java.lang 包
       */
        Integer x = 5;//装箱为包装类  相当于Integer.valueOf(5);

        x = x +10;//拆箱为内置类型
        System.out.println(x);
        /*
        * Boolean是boolean的包装类，但不继承自Number
        * */
        Boolean b = Boolean.TRUE;
        System.out.println(b);
        Boolean flag = new Boolean("true");//Boolean flag = new Boolean(true);
        System.out.println("flag is"+ flag);
        /*
        * Boolean和boolean的位移使用上的区别是：
        * 从列表或者哈希表获取值时
        * 只能用Boolean
        * */
        boolean t = false;
        Map map = new HashMap();
        map.put("t",t);
        //取值时只能用Boolean
        Boolean t1 = (Boolean) map.get(t);
        System.out.println(t1);

        /*
        *Character类用于对单个字符进行操作
        *Character是char的包装类
        *Character类在对象中包装一个基本类型char的值*/
       // char ch = 'a';
        Character ch = 'a';

        /*
        * Java 的 Math 包含了用于执行基本数学运算的属性和方法，
        * 如初等指数、对数、平方根和三角函数；
        * Math 的方法都被定义为 static 形式，通过 Math 类可以在主函数中直接调用
        * */
        System.out.println("90度正弦值："+Math.sin(Math.PI/2));//sin参数默认double类型

        // xxValue()方法将Number对象转换为xx类型数据的值并返回
        //如byteValue(),doubleValue(),floatValue(),intValue(),longValue(),shortValue();
        System.out.println(x.byteValue());//返回byte原生数据类型 15
        System.out.println(x.doubleValue());//15.0
        System.out.println(x.longValue());//15
        System.out.println(x.floatValue());//15.0
        System.out.println(x.shortValue());//15

        /*
        * compareTo()方法用于将Number对象与方法的参数进行比较
        * 适用于两个相同数据类型，不同类型数据不能比较
        * referenceName可以是Byte,Double,Integer，Float,Long,Short
        * */
        Integer i = 15;
        System.out.println(i.compareTo(x));//指定的数i与参数x相等 返回0
        System.out.println(i.compareTo(15));//0
        System.out.println(i.compareTo(5));//1   15>5 返回1
        System.out.println(i.compareTo(20));//-1   15<20 返回-1
        /*
        * equals() 方法用于判断 Number 对象与方法的参数进是否相等
        * 且与方法的参数类型与数值都相等返回 True，否则返回 False
        * */
        System.out.println(x.equals(i));//false

        /*
        * valueOf() 方法用于返回给定参数的原生 Number 对象值，
        * 参数可以是原生数据类型, String等
        * 该方法是静态方法。该方法可以接收两个参数一个是字符串，一个是基数。
        * */
        Integer x1 =Integer.valueOf(9); //相当于Integer x1 = 9

        Double x2 = Double.valueOf(5);
        Float x3 = Float.valueOf("80");
        Integer x4 = Integer.valueOf("444",16);   // 使用 16 进制

        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);
        System.out.println(x4);
        /*
        * toString() 方法用于返回以一个字符串表示的 Number 对象值。
        * */
        System.out.println(x.toString());

        /*
        * parseInt() 方法用于将字符串参数作为有符号的十进制整数进行解析
        * */
        int y = Integer.parseInt("2");
        double d = Double.parseDouble("5");
        int s = Integer.parseInt("156",16);
        System.out.println(y);//2
        System.out.println(d);//5.0
        System.out.println(s);//342
    }

}
