import java.util.Arrays;
import java.util.Scanner;
public class homework2 {

	public static void main(String[] args) {
		// ������� ������
int[] array = new int[10];
		Scanner in = new Scanner(System.in);
		// ��������� ������
   for (int i=0; i<array.length; i++) {
       System.out.println("������� �����");
       array[i] = in.nextInt();
   }
 //��������� ������
   Arrays.sort(array);
 //������� ������ �� ������
   System.out.println( "�� �����������: ");
   for (int i=0; i<array.length; i++) {
       System.out.print(array[i] + " |");
	}
 //������� �� ������ ������ ��������
   System.out.println();
   System.out.println( "������: ");
   for (int i=0; i<array.length; i++) {
	   if (array[i]%2==0)
       System.out.print(array[i] + " |");
   }
}
}
