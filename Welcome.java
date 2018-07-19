

public class Welcome {

int num1=10,num2=20;
public Welcome(int num1,int num2)
{
	this.num1=num2;
	num2=num1;
}
public void changeValues(int num1, Welcome welcome) {
	this.num1++;
	welcome.num2=--num1;
	welcome.num2=this.num1++;
	System.out.println(num1+this.num1+this.num2+welcome.num1);
	
}
	

	public static void main(String[] args) {
		
		int num1=100;int num2=200;
		Welcome welcome = new Welcome(100,200);
		welcome.changeValues(num1,welcome);
		System.out.println(num1+num2+welcome.num1+welcome.num2);
	}

}
