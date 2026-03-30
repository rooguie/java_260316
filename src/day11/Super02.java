package day11;

public class Super02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog("뽀삐","개과");
		d.printInfo();
		d.howl();
		
		Tiger t =new Tiger("어흥이","고양이과");
		t.printInfo();
		t.howl();

	}

}

class Dog extends Animal{
	
	public Dog(String name,String category) {
		
		
		//부모 생성자를 호출 super()
		super(name,category);
		
		//부모생성자를 호출을 할 수는 있음
//		super.setName(name);
//		super.setCategory(category);
		
	
	}

	@Override
	public void howl() {
		// 부모의 메서드 내용
		super.howl();
		System.out.println("멍멍~!!");
	}
	
	
	
}


class Tiger extends Animal {
	
	public Tiger(String name,String category){
		super.setName(name);
		super.setCategory(category);
		//=super(name,category);
	}

	@Override
	public void howl() {
		// TODO Auto-generated method stub
		super.howl();
		System.out.println("어흥~!");
	}
	
	
}





class Animal{ //부모 클래스
	private String name;// 이름
	private String category;// 종
	
	
	//생성자 => 상속에서 제외
	public Animal() {}
	public Animal(String name,String category) {
		this.name=name;
		this.category=category;
	}
	
	public void printInfo() {
		System.out.println("이름:"+name+"("+category+")");
	}
	
	
	//울음 소리 출력 메소드
	public void howl() {
		System.out.println("--"+name+"의 울음소리--");
		
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	
	
}
