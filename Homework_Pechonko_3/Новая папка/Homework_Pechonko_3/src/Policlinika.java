import java.util.Scanner;
public class Policlinika {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Doctor doctor1 = new Doctor();
		Doctor doctor2 = new Doctor();
		Doctor doctor3 = new Doctor();
		
		Pacient pacient1 = new Pacient();
		Pacient pacient2 = new Pacient();
		Pacient pacient3 = new Pacient();
		Pacient pacient4 = new Pacient();
		Pacient pacient5 = new Pacient();
		
		
		
		
		
		
		System.out.println("������ ����� =");
        int a = in.nextInt();//��������� ����� ����� a
        System.out.println("������ ����� =");
        int b = in.nextInt();//��������� ����� ����� b
        System.out.println("����� ����� = " + a+b);//������� ����� a+b
	}

}
