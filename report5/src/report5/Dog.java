package report5;

public class Dog extends Animal implements Happy{
	public Dog() {
		species = "ġ�Ϳ�";
		name = "�׷�Ʈ";
		age = "1��";	
	}
	void introduce() {
		System.out.println("��: "+ species + " �̸�: " + name + " ���� : " + age);
		System.out.println("���� �ֿϰ� " + name + "!");
	}
	public String play() {
		return ("�����̸� �����ؿ�.");
	}
}
