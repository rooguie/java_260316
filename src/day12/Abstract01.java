package day12;

public class Abstract01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog("뽀삐", "개과", "소고기");
		d.printInfo();
		d.howl();
		d.eating();

		Cat c = new Cat("나비", "고양이과", "츄르");
		c.printInfo();
		c.howl();
		c.eating();

		// Animal a=new Animal(); //추상은 객체 구현이 안된다.

	}

}

class Cat extends Animal {


	public Cat(String name, String category, String eat) {
		super.name = name;
		super.category = category;
		super.eat = eat;
	}

	@Override
	void howl() {
		System.out.println(super.name + "의 울음소리 야옹");

	}

	@Override
	void eating() {
		System.out.println("우리집 고양이 " + super.eat + "를 좋아해.");

	}

}

class Dog extends Animal {

	public Dog(String name, String category, String eat) {
		super.name = name;
		super.category = category;
		super.eat = eat;
	}

	@Override
	void howl() {
		System.out.println(super.name + "의 울음소리 멍멍");

	}

	@Override
	void eating() {
		System.out.println(super.name + "는" + this.eat + "를 좋아해요");

	}

}

//abstract: 상속 용도로 사용
abstract class Animal {
	protected String name;
	protected String category;
	protected String eat;

	public void printInfo() {
		System.out.println("이름:" + name + "(" + category + ")");
	}

	abstract void howl();

	abstract void eating();// 추상 클래스는 abstract 키워드가 없으면 에러가 남
}
