
public class Customer {
	int bill;
	String name;
	int id;
	public Customer() {
		this.bill=0;
		this.name="NA";
		this.id=1;
	}
	public Customer(int bill, String name, int id) {
		this();
		this.bill = bill;
		this.name = name;
		this.id = id;
	}
	public Customer(String name, int id) {
		this();
		this.name = name;
		this.id = id;
	}
	public Customer(int bill, int id) {
		this();
		this.bill = bill;
		this.id = id; 	
	}
	public Customer(int bill, String name) {
		this();
		this.bill = bill;
		this.name = name;
	}
	 public static void main(String args[])
	 {
		 Customer c = new Customer(2,"Blh",1);
		 Customer c1 = new Customer(2000,"Blh",123);
		 System.out.println(c.equals(c1));
		 System.out.println(c.hashCode());
		 
		 	 
	 }
	private void disp() {
		System.out.println("Id="+this.id);
		System.out.println("Name="+this.name);
		System.out.println("Bill="+this.bill);
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + bill;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (bill != other.bill)
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	

}
