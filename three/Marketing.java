package l8.three;

public class Marketing {
	String employeename;
	String productname;
	double salesamount;
	
	public Marketing(String employeename, String productname, double salesamount) {
		super();
		this.employeename = employeename;
		this.productname = productname;
		this.salesamount = salesamount;
	}
	
	public String getEmployeename() {
		return employeename;
	}
	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public double getSalesamount() {
		return salesamount;
	}
	public void setSalesamount(double salesamount) {
		this.salesamount = salesamount;
	}
}
