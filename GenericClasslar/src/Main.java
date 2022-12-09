import java.util.ArrayList;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {

		Character[] charDizi = new Character[] { 'J', 'A', 'V', 'A' };
		Integer[] integerDizisi = new Integer[] { 1, 2, 3, 4, 5, 6 };

		String[] stringDizi = new String[] { "Java", "Python", "C++", "Php" };

		Ogrenci[] ogrenciDizi = { new Ogrenci("Harun"), new Ogrenci("Hüseyin"), new Ogrenci("Özkan") };

		YazdirmaSinifi<Character> yazdirChar = new YazdirmaSinifi<Character>();
		yazdirChar.yazdir(charDizi);
		System.out.println("**************************");
		YazdirmaSinifi<String> yazdirString = new YazdirmaSinifi<String>();
		yazdirString.yazdir(stringDizi);
		System.out.println("**************************");
		YazdirmaSinifi<Integer> yazdirInteger = new YazdirmaSinifi<Integer>();
		yazdirInteger.yazdir(integerDizisi);
		System.out.println("**************************");
		YazdirmaSinifi<Ogrenci> yazdirOgrenci = new YazdirmaSinifi<Ogrenci>();
		yazdirOgrenci.yazdir(ogrenciDizi);
	}

}
