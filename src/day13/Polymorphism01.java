package day13;



public class Polymorphism01 {

	public static void main(String[] args) {
		//다형성(Polymorphism)-다양한 객체로 형변환이 가능
		/*
		 * -하나의 클래스가(부모객체) 여러 자료형(자식객체)으로 구현되어 실행되는 형태
		 * -코드는 같은데, 들어오는 객체에 따라 다른 실행결과를 얻을 수 있음
		 */
		
		//Dog,Tiger,Eagle,Human 객체를 각자 생성해서 move 메서드 호출
		Dog d=new Dog();
		d.move();
		d.walk();
		
		Tiger t=new Tiger();
		t.move();
		t.hunt();
		
		Eagle e=new Eagle();
		e.move();
		e.flying();
		
		Human h=new Human();
		h.move();
		h.readBook();
		
		Cat c= new Cat();
		c.move();
		
		Animal a=new Animal();
		a.move();
		
		//자식의 타입으로 부모객체를 만드는거는 안됨
		//Dog a2=new Animal();
		
		//Animal c1=new Cat();
		//상속을 안받은 객체는 불가능
		
		System.out.println("-------부모타입으로 자식객체 생성가능---------");
		//조상 타입으로 자식 객체를 생성하는 것이 가능
		//조상객체로 상속받은 자식 객체만 가능
		Animal d1=new Dog();
		d1.move();
		//=> 조상타입으로 자식객체를 생성하면 자식의 고유값은 사용이 불가능
		//즉 오버라이딩 된 메소드만 사용이 가능하다.
		
		Animal t1=new Tiger();
		t1.move();
		
		Animal e1=new Eagle();
		e1.move();
		
		Animal h1=new Human();
		h1.move();
		
		//Animal 객체의 배열에 자식 객체를 추가할 수 있음
		// 다형성을 사용하는 이유
		//부모클래스가 자식 클래스를 배열로 한번에 관리가 가능해짐
		Animal[] aniList =new Animal[5];
		int cnt=0;
		
		aniList[cnt]=d1;cnt++;
		aniList[cnt]=t1;cnt++;
		aniList[cnt]=e1;cnt++;
		aniList[cnt]=h1;cnt++;
		aniList[cnt]=h;cnt++; //animal 객체로 형변환(업케스팅)
		
		System.out.println("--aniList 배열출력--");
		for(int i=0;i<cnt;i++) {
			aniList[i].move();
		}
		
		//자식 객체가 가지고 있는 고유값을 사용하려면
		//부모객체를 자식의 객체로 다운케스팅 해야 사용이 가능
		Dog d_1=(Dog)aniList[0];//다운 케스팅
		d_1.walk();
		
//		Dog t_1=(Dog)aniList[1]; //가능은 하지만 walk가 없으니까 에러발생
//		t_1.walk();
		
		System.out.println(aniList[1] instanceof Dog);
		//=>true면 형변환 가능 false면 형변환 불가능
		
		for(int i=0;i<cnt;i++) {
			if(aniList[i] instanceof Dog) {
				System.out.println("-Dog");
				((Dog)aniList[i]).walk();
			}else if(aniList[i] instanceof Tiger) {
				System.out.println("-Tiger");
				((Tiger)aniList[i]).hunt();
			}else if(aniList[i] instanceof Eagle) {
				System.out.println("-Eagle");
				((Eagle)aniList[i]).flying();
			}else {
				System.out.println("-Human");
				((Human)aniList[i]).readBook();
			}
		}
		System.out.println();
		
		System.out.println("--다형성 메서드 활용--");
		Polymorphism01 p1=new Polymorphism01();
		
		for(int i=0; i<cnt;i++) {
			p1.moveAnimal(aniList[i]);
		}
		
	}//main 끝

	//각 개체의 move() 실행해주는 메서드
	public void moveAnimal (Human human) {
		human.move();
	}
	public void moveAnimal (Dog Dog) {
		Dog.move();
	}
	//.
	//.
	//.
	
	//다형성을 활용한 메서드
	public void moveAnimal(Animal Animal) {
		Animal.move();
	}
	//=> 하나로 팍 줄일 수 있음
	
	
}


class Human extends Animal{

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("사람은 두 발로 걷습니다.");
	}
	
	public void readBook() {
		System.out.println("사람은 책을 읽을 수 있습니다.");
	}
}



class Eagle extends Animal{

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("독수리가 날아다닙니다.");
		
	}
	
	public void flying() {
		System.out.println("독수리가 날아다니면서 사냥을 합니다.");
	}
	
}

class Tiger extends Animal {

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("호랑이가 성큼성큼 걸어갑니다");
	}
	
	public void hunt() {
		System.out.println("호랑이가 사냥을 합니다");
	}
	
}

class Cat{
	public void move() {
		System.out.println("고양이가 꽁꽁 얼어붙은 한강 위를 걸어다닙니다.");
	}
}


class Dog extends Animal{

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("강아지가 아장아장 걷습니다.");
	}
	
	public void walk() {
		System.out.println("강아지는 아침 저녁으로 산책을 합니다.");
	}
	
}


class Animal{
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}