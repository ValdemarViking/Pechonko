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
		
		
		
		
		
		
		System.out.println("Первое число =");
        int a = in.nextInt();//считываем целое число a
        System.out.println("Второе число =");
        int b = in.nextInt();//считываем целое число b
        System.out.println("Сумма чисел = " + a+b);//выводим сумму a+b
	}

}
