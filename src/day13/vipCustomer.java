package day13;

public class vipCustomer extends Customer {
	
	private double saleRatio;
	private String agentName;
	private String agentNo;
	
	public vipCustomer() {}

	public vipCustomer(String id, String name, String agentName,String agentNo) {
		super(id,name);
		super.setRank("VIP");
		super.setBonusRate(0.05);
		this.saleRatio=0.1;
		this.agentName=agentName;
		this.agentNo=agentNo;
	}
	


	@Override
	public int calcPrice(int price) {
		super.calcPrice(price);
		return price=(int)(price-(price*saleRatio));
	}


	
	@Override
	public void printCustomerInfo() {
		// TODO Auto-generated method stub
		super.printCustomerInfo();
		System.out.println("담당 상담사:"+this.agentName+"상담사 번호:"+this.agentNo);
	}
	
	

	@Override
	public String toString() {
		return "vipCustomer [saleRatio=" + saleRatio + ", agentName=" + agentName + ", agentNo=" + agentNo + "]";
	}

	public double getSaleRatio() {
		return saleRatio;
	}

	public void setSaleRatio(double saleRatio) {
		this.saleRatio = saleRatio;
	}

	public String getAgentName() {
		return agentName;
	}

	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}

	public String getAgentNo() {
		return agentNo;
	}

	public void setAgentNo(String agentNo) {
		this.agentNo = agentNo;
	}


}
