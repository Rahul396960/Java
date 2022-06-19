package com.learning.shape;

public class rectangle  extends shape{
    rectangle(int a,int b)
    {
        super(a,b);
    }
    public int area()
    {
        return this.a*this.b;
    }

}
