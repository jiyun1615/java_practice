import java.util.Scanner;

public class firstprogram {

	public static void main(String[] args) {
		Scanner aaa = new Scanner(System.in);
		System.out.print("�ְ��°� �������, �̼����� �󵵿� ���� 4������ space�� �����Ͽ� �Է��ϼ���: ");
		String temMax = aaa.next();
		String temMin = aaa.next();
		String micro = aaa.next();
		String humidity = aaa.next();
		
		System.out.format("���� �ְ����� %s���̰� ��������� %s�� �Դϴ�.\n�̼����� �󵵴� %s�̰�, ������ %s�Դϴ�.", temMax, temMin, micro, humidity);

	}

}
