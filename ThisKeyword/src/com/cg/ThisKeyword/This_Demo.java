package com.cg.ThisKeyword;

public class This_Demo {
    int a=20;

    public static void main(String[] args) {
        This_Demo tk=new This_Demo();
        System.out.println(tk);
        tk.m1();
    }
    public void m1()
    {
        int a=30;
        System.out.println(a);
        System.out.println(this);
        System.out.println(this.a);
    }
}
/* NOTE:-
-We are unable to access this keyword in a static context


 */