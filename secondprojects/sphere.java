package com.learning.shape;

public class sphere extends shape{
    sphere(int a,int b)
    {
        super(a,b);
    }
    public double area()
    {
        return 4*Math.PI*this.a*this.a;
    }
    
}

