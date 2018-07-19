
public class Calculator {

	
    void add(int n, int m)
    {
    	System.out.println(n+m);
    }
    
    void add(double n, double m)
    {
    	System.out.println(n+m);
    }

    void add(int n, double m)
    {
    	System.out.println(n+m);
    }
    
    void add(double n, int m)
    {
    	System.out.println(n+m);
    }
    
    void diff(int n, int m)
    {
    	System.out.println(n-m);
    }
    
    void diff(double n, double m)
    {
    	System.out.println(n-m);
    }

    void diff(int n, double m)
    {
    	System.out.println(n-m);
    }
    
    void diff(double n, int m)
    {
    	System.out.println(n-m);
    }
    
    void mul(int n, int m)
    {
    	System.out.println(n*m);
    }
    
    void mul(double n, double m)
    {
    	System.out.println(n*m);
    }

    void mul(int n, double m)
    {
    	System.out.println(n*m);
    }
    
    void mul(double n, int m)
    {
    	System.out.println(n*m);
    }
    
    void div(int n, int m)
    {
    	System.out.println(n/m);
    }
    
    void div(double n, double m)
    {
    	System.out.println(n/m);
    }

    void div(int n, double m)
    {
    	System.out.println(n/m);
    }
    
    void div(double n, int m)
    {
    	System.out.println(n/m);
    }
	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.add(4,5.0);
        c.diff(4,5.0);
		c.mul(4,5.0);
		c.div(4,5.00);
		
	}

}
