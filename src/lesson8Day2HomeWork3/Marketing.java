package lesson8Day2HomeWork3;

public class Marketing {

	private String employeename;
	private String productname;
	private double salesamount;

	public Marketing() {
		this.employeename = null;
		this.productname = null;
		this.salesamount = 0.0;
	}

	public Marketing(String emplyeename, String productname, double salesamount) {
		this.employeename = emplyeename;
		this.productname = productname;
		this.salesamount = salesamount;
	}

	public String getEmployeename() {
		return employeename;
	}

	public void setEmplyeename(String emplyeename) {
		this.employeename = emplyeename;
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
	

	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
			if(!obj.getClass().equals(this.getClass())) 
				return false;
			Marketing m= (Marketing)obj;
			if(this.salesamount == m.salesamount && 
					this.employeename.equals(m.employeename)
					&& this.productname.equals(m.productname)) {
			return true;
		}
		return  false;
	}

	@Override
	public String toString() {
		return "Marketing [employeename =" +employeename + ", productname =" + productname +
				", salesamount= " + salesamount +"]\n";	
				
	}

}
