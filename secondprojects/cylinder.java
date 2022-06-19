package com.learning.shape;

 public class cylinder extends shape{
    cylinder(int a,int b)
    {
        super(a,b);
    }
    public double area()
    {
        return 2*Math.PI*this.a*this.b+(2*Math.PI*a*a);
    }
    
}

