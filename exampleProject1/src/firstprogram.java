import java.util.Scanner;

public class firstprogram {

	public static void main(String[] args) {
		Scanner aaa = new Scanner(System.in);
		System.out.print("최고기온과 최저기온, 미세먼지 농도와 습도 4가지를 space로 구분하여 입력하세요: ");
		String temMax = aaa.next();
		String temMin = aaa.next();
		String micro = aaa.next();
		String humidity = aaa.next();
		
		System.out.format("오늘 최고기온은 %s도이고 최저기온은 %s도 입니다.\n미세먼지 농도는 %s이고, 습도는 %s입니다.", temMax, temMin, micro, humidity);

	}

}
