package day16;

public class Generic02 {
	public static void main(String[] args) {
		
		GenericPrint<Powder> powderPrint=new GenericPrint<Powder>();
		powderPrint.setMaterial(new Powder());
		System.out.println(powderPrint);
		
		GenericPrint<Plastic> plasticPrint=new GenericPrint<>();
		plasticPrint.setMaterial(new Plastic());
		System.out.println(plasticPrint);
		
	}
}


class GenericPrint<T> {
	private T material;

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return material.toString();
	}
	
}

class Powder{
	public String toString() {
		return "재료는 파우더 입니다.";
	}
}

class Plastic{
	public String toString() {
		return "재료는 플라스틱 입니다.";
	}
}











