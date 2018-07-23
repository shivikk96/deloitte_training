package com.javatraining.deloitte.assessment1;
import java.util.Scanner;

abstract class Shape {
	
	public abstract double area();
	
	public abstract double volume();

	public abstract void disp();

	}

class Cube extends Shape
{
    int a;
    
	public Cube(int a) {
		super();
		this.a = a;
	}

	@Override
	public double area() {
		double ar = 6*a*a;
		return ar;
	}

	@Override
	public double volume() {
		double vol = a*a*a;
		return vol;
	}
	
	public void disp()
	{
		System.out.println("Cube Area is:"+area()+" and Volume is:"+volume());
	}
}
class Rectangle extends Shape
{ 
	int l,b;
	

	public Rectangle(int l, int b) {
		super();
		this.l = l;
		this.b = b;
	}

	@Override
	public double area() {
		double ar = l*b;
		return ar;
	}

	@Override
	public double volume() {
		// TODO Auto-generated method stub
		return -1;
	}
	public void disp()
	{
		System.out.println("Rectangle Area is:"+area()+" and Volume is:"+volume());
	}

}
class Triangle extends Shape
{
    int b,h;
    
	public Triangle(int b, int h) {
		super();
		this.b = b;
		this.h = h;
	}

	@Override
	public double area() {
		double ar = 0.5*b*h;
		return ar;
	}

	@Override
	public double volume() {
		// TODO Auto-generated method stub
		return -1;
	}
	public void disp()
	{
		System.out.println("Triangle Area is:"+area()+" and Volume is:"+volume());
	}
		
}
class Sphere extends Shape
{
    int rad;
    
	public Sphere(int rad) {
		super();
		this.rad = rad;
	}

	@Override
	public double area() {
		double ar = 4*3.14*rad*rad;
		return ar;
	}

	@Override
	public double volume() {
		double vol = 4*3.14*rad*rad*rad/3;
		return vol;
	}
	public void disp()
	{
		System.out.println("Sphere Area is:"+area()+" and Volume is:"+volume());
	}
}

public class Main
{
    public static void main(String args[])
    {
    	int i=0,a=0,l=0,b=0,bs=0,h=0,rad=0;
    	Scanner sc = new Scanner(System.in);
    	Shape[] sp = new Shape[5];
    	for(i=0;i<5;++i)
    	{
    		String ch="null";
    		System.out.println("Input shape"+(i+1)+":");
    		ch = sc.next();
    		switch(ch)
    		{
    		case "Cube": System.out.println("Enter cube side:");
    					 a = sc.nextInt(); 
    					 sp[i] = new Cube(a);
    					 break;
    		case "Rectangle": System.out.println("Enter length and breadth:");
    						  l = sc.nextInt();
    						  b = sc.nextInt(); 
    						  sp[i] = new Rectangle(l,b);
    	    				  break;
    		case "Triangle": System.out.println("Enter base and height:");
			                 b = sc.nextInt();
			                 h = sc.nextInt(); 
			                 sp[i] = new Triangle(b,h);
    	                     break;
    		case "Sphere": System.out.println("Enter radius:");
			               rad = sc.nextInt(); 
			               sp[i] = new Sphere(rad);
    		               break;
			default: i--; System.out.println("Enter valid shape"); 
    		}
	
    	}
    	
    	for (int j = 0; j < 5; j++) {
			sp[j].disp();
		}
    }
}







