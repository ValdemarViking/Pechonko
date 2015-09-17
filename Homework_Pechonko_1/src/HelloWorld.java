
public class HelloWorld {

	public static void main(String[] args) {
		//Далее используя оператор "for" вывести все значения на экран в виде:"значение" | "значение 2" | "значение 3" |  и тд.
		//После этого подсчитайте среднее арифметическое значение всех переменных и результат выведите 
		
		//Задание 1
		float[] myFirstArray = {2, 4, 6, 8, 10, 12, 14, 16, 20, 22}; // Создал  и заполнил массив содержащий 10 переменных типа float
			for (int i = 0; i < myFirstArray.length; i++) {// Последовательный вывод значений массива оператором "for"
			System.out.print(myFirstArray[i] + " |");
		}
		System.out.println(); //Перевод строки
		float summaChisel = 0;
		for (int i = 0; i < myFirstArray.length; i++) { //Подсчет суммы чисел массива
			summaChisel = summaChisel + myFirstArray[i];
			}
		float averageValue = summaChisel / myFirstArray.length; // Среднее арифметическое значение
		System.out.println("average value =" + averageValue); // Вывод на экран
		
		// Задание 2
		String str = "Тут должен быть написан не сильно короткий текст. Так как конкретная длина текста не указана, считаю этот отрывок достаточным."; // Создал переменную типа String 
		System.out.println ("Длина текста " + str.length() + " символов."); //Вывел на экран количество символов в данной строке. 
		String strResult1 = str.substring (0, str.length() / 2); //Разделяю строку
		String strResult2 = str.substring (str.length() / 2, str.length()); //Разделяю строку
		System.out.println(strResult1); // Вывод на экран первой части строки
		System.out.println(strResult2); // Вывод на экран первой части строки
		
		//Задание 3
		int [] massiv = {1,0,2,5,6,9,8,3,7,4}; // Создал массив с 10 переменными типа int
		int minValue = massiv[0];
		for(int i=0;i<massiv.length;i++) // Используя оператор "for" нахожу минимальное значение
		{
		  if(minValue > massiv[i])
			  minValue = massiv[i];
		}
		System.out.println("min value =" + minValue); // Вывожу на экран минимальное значение
		int maxValue = massiv[0];
		for(int i=0;i<massiv.length;i++) // Используя оператор "for" нахожу максимальное значение
		{
		  if(maxValue < massiv[i])
			  maxValue = massiv[i];
		}
		System.out.println("max value =" + maxValue); // Вывожу на экран максимальное значение
		
	}


}
