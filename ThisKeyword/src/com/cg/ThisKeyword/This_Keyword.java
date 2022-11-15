package com.cg.ThisKeyword;

class This_Keyword {
	This_Keyword()
    {
        this(10);
        System.out.println("hii"+(char)1);
    }
	This_Keyword(int a)
    {
        this(111.2f);
        System.out.println("hello"+(char)2);

    }
	This_Keyword(float b)
    {
        System.out.println("how are you"+(char)3);
    }

    public static void main(String[] args) {
    	This_Keyword t= new This_Keyword();

    }
}
