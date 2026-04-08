package day17;

public class Customer {

	private String name;
	private int age;
	private int cost;
	
	
	
	
	public Customer() {}
	
	
	public Customer(String name, int age) {
		this.name = name;
		this.age = age;
		this.cost=this.age>=15 ? 100:80;
		//settingCost(age);
	}
	
	
//	public void settingCost(int age) {
//		if(age>=15) {
//			this.cost=100;
//		}
//		else {
//			this.cost=80;
//		}
//	}
//	
	

	@Override
	public String toString() {
		return "이름:"+name + " 나이:" + age + " 비용:" + cost+"만원";
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	
}
