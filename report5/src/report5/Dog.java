package report5;

public class Dog extends Animal implements Happy{
	public Dog() {
		species = "ġ�Ϳ�";
		name = "�׷�Ʈ";
		age = "1��";	
	}
	
	String introduce() {
		return ("���� �ֿϰ� " + name + "!");
	}
	public String play() {
		return ("�����̸� �����ؿ�.");
	}
}
