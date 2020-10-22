package report5;

public class Dog extends Animal implements Happy{
	public Dog() {
		species = "치와와";
		name = "그루트";
		age = "1살";	
	}
	void introduce() {
		System.out.println("종: "+ species + " 이름: " + name + " 나이 : " + age);
		System.out.println("저의 애완견 " + name + "!");
	}
	public String play() {
		return ("공놀이를 좋아해요.");
	}
}
