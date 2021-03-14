package week1.day2;

public class ControlFlowSwitch {

	public static void main(String[] args) {
		int day = 7;
		switch (day)  {
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
		break;
		default:
			System.out.println("please enter correct day");
		}
	}

}
