
import java.util.Scanner;

public class WeatherSystem {

	int temp=0;
	String type;
	public WeatherSystem(int temp,String type)
	{
		this.temp=temp;
		this.type = type;
	};
    private void dispResult() {
    	if((this.temp<-10)||(this.temp>60))
    	{
    		System.out.println("WARNING!!");
    	}
    	else
    		System.out.println("No warning");
	}
	private void convTemp() {
		if(this.type=="Fahrenheit") {
			this.temp = 5*(this.temp-32)/19;
		}
		
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String ask = "Yes";
		while(ask.equals("Yes"))
		{
			System.out.println("Enter type of temperature (C/F):");
			String type = scanner.next();
			System.out.println("\nEnter temperature:");
			int temp = scanner.nextInt();
			WeatherSystem w = new WeatherSystem(temp, type);
			w.convTemp();
			w.dispResult();
			System.out.println("Do you wnt to enter more?(Yes/No)");
			ask = scanner.next();
		}
        System.out.println("Thank you");
	}
	

}

