package com.later;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author later
 * @e-mail 2046094579@qq.com
 * @date 2020/8/6 - 9:50
 */
public class TemplatesTest {

    //模板一：psvm
    public static void main(String[] args) {

        //模板二：sout
        System.out.println("模板：sout");
        //变形：soutp、soutm、soutv、xxx.sout
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("TemplatesTest.main");

        int num1 = 1;
        int num2 = 2;
        System.out.println(num1);
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        //模板三：fori
        String[] str = new String[]{"张三", "赵四", "王五", "孙六", "谭七"};
        for (int i = 0; i < str.length; i++) {
            System.out.println("str[" + i + "] = " + str[i]);
        }
        //变形：iter
        for (String s : str) {
            System.out.println(s);
        }
        //变形：itar
        for (int i = 0; i < str.length; i++) {
            String s = str[i];
            System.out.println(s);
        }

        //模板四：List.for
        ArrayList list = new ArrayList();
        list.add("100");
        list.add("101");
        list.add("102");
        for (Object o : list) {
            System.out.println(o);
        }
        //变形：List.fori
        for (int i = 0; i < list.size(); i++) {

        }
        //变形：List.forr
        for (int i = list.size() - 1; i >= 0; i--) {

        }

        //模板五：ifn
        if (list == null) {

        }
        //变形：inn
        if (list != null) {
            
        }
        //变形：xxx.nn / xxx.null
        if (list != null) {

        }
        if (list == null) {

        }
    }

}
