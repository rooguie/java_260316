package day13;

public class Customer {

	private String id;
	private String name;
	private String rank;
	private int bonusPoint;
	private double bonusRate;
	
	public Customer() {}

	public Customer(String id, String name) {
		this.id = id;
		this.name = name;
		this.rank = "Silver";
		this.bonusPoint=0;
		this.bonusRate=0.01;
	}
	
	
	
	
	public void printCustomerInfo() {
		System.out.println("아이디:"+this.id+", "+"이름:"+this.name);
		System.out.println("등급:"+this.rank+", "+"적립금:"+bonusPoint);
	}

	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", rank=" + rank + ", bonusPoint=" + bonusPoint + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public double getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}

	public double getBonusRate() {
		return bonusRate;
	}

	public void setBonusRate(double bonusRate) {
		this.bonusRate = bonusRate;
	}

	
	
}
