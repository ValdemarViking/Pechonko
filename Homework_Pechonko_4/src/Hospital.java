
import java.util.Scanner;

import Model.Doctor;
import Model.Pacient;


public class Hospital {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in); 
				
		Doctor[] doctor = new Doctor[3];
		Pacient[] pacient = new Pacient[6];
					
		for (int i=0; i<doctor.length; i++){
			
			System.out.println("������� ������� � �������� ������� �" + i+1);
			doctor[i].setName(in.nextLine());
			System.out.println("������� ������� �������:" + i+1);
			doctor[i].setAge(in.nextInt());
			System.out.println("������� ������������� ������� (������, ������, �����, ������)�:" + i+1);
			doctor[i].setSpecialist(in.nextLine());
			}
		for (int i=0; i<pacient.length; i++){
			System.out.println("������� ������� � �������� ��������:" + i+1);
			pacient[i].setName(in.nextLine());
			System.out.println("������� ������� ��������:" + i+1);
			pacient[i].setAge(in.nextInt());
			System.out.println("��� ����� � �������� (������, ������, �����, ������)�:" + i+1);
		    }

		for (int i=0; i<pacient.length; i++){
			for (int j=0; j<doctor.length; j++){
				if (pacient[i].getBolezn()==doctor[j].getSpecialist()); 
						System.out.println("������" + pacient[i].getName() + "- ��� ������" + doctor[j].getName());
				
			}
			
		}
	}

}

