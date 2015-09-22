import java.util.Arrays;
import java.util.Scanner;
public class homework2 {

	public static void main(String[] args) {
		// Создаем массив
int[] array = new int[10];
		Scanner in = new Scanner(System.in);
		// Заполняем массив
   for (int i=0; i<array.length; i++) {
       System.out.println("Введите число");
       array[i] = in.nextInt();
   }
 //Сортируем массив
   Arrays.sort(array);
 //Выводим массив на печать
   System.out.println( "По возрастанию: ");
   for (int i=0; i<array.length; i++) {
       System.out.print(array[i] + " |");
	}
 //Выводим на печать четные элементы
   System.out.println();
   System.out.println( "Четные: ");
   for (int i=0; i<array.length; i++) {
	   if (array[i]%2==0)
       System.out.print(array[i] + " |");
   }
}
}
