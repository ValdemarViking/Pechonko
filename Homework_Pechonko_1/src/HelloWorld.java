
public class HelloWorld {

	public static void main(String[] args) {
		//����� ��������� �������� "for" ������� ��� �������� �� ����� � ����:"��������" | "�������� 2" | "�������� 3" |  � ��.
		//����� ����� ����������� ������� �������������� �������� ���� ���������� � ��������� �������� 
		
		//������� 1
		float[] myFirstArray = {2, 4, 6, 8, 10, 12, 14, 16, 20, 22}; // ������  � �������� ������ ���������� 10 ���������� ���� float
			for (int i = 0; i < myFirstArray.length; i++) {// ���������������� ����� �������� ������� ���������� "for"
			System.out.print(myFirstArray[i] + " |");
		}
		System.out.println(); //������� ������
		float summaChisel = 0;
		for (int i = 0; i < myFirstArray.length; i++) { //������� ����� ����� �������
			summaChisel = summaChisel + myFirstArray[i];
			}
		float averageValue = summaChisel / myFirstArray.length; // ������� �������������� ��������
		System.out.println("average value =" + averageValue); // ����� �� �����
		
		// ������� 2
		String str = "��� ������ ���� ������� �� ������ �������� �����. ��� ��� ���������� ����� ������ �� �������, ������ ���� ������� �����������."; // ������ ���������� ���� String 
		System.out.println ("����� ������ " + str.length() + " ��������."); //����� �� ����� ���������� �������� � ������ ������. 
		String strResult1 = str.substring (0, str.length() / 2); //�������� ������
		String strResult2 = str.substring (str.length() / 2, str.length()); //�������� ������
		System.out.println(strResult1); // ����� �� ����� ������ ����� ������
		System.out.println(strResult2); // ����� �� ����� ������ ����� ������
		
		//������� 3
		int [] massiv = {1,0,2,5,6,9,8,3,7,4}; // ������ ������ � 10 ����������� ���� int
		int minValue = massiv[0];
		for(int i=0;i<massiv.length;i++) // ��������� �������� "for" ������ ����������� ��������
		{
		  if(minValue > massiv[i])
			  minValue = massiv[i];
		}
		System.out.println("min value =" + minValue); // ������ �� ����� ����������� ��������
		int maxValue = massiv[0];
		for(int i=0;i<massiv.length;i++) // ��������� �������� "for" ������ ������������ ��������
		{
		  if(maxValue < massiv[i])
			  maxValue = massiv[i];
		}
		System.out.println("max value =" + maxValue); // ������ �� ����� ������������ ��������
		
	}


}
