import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Student {
//changets from git
	public static void main(String[] args) {

		ArrayList<String> listOfWords= new ArrayList();
		listOfWords.add("mya");
		listOfWords.add("mya");
		listOfWords.add("myc");
		listOfWords.add("myd");
		for(String tempWord:listOfWords) {
			 System.out.println(tempWord+ " ");
		}
		
		Set<String> days= new HashSet();
		days.add("sun");
		days.add("sun");
		days.add("tues");
		
		for(String day:days) {
			 System.out.println(day+ " ");
		}
		
		
		Set<Integer> numbers= new TreeSet();
		numbers.add(1);
		numbers.add(3);
		numbers.add(0);
		
		for(int number:numbers) {
			 System.out.println(number+ " ");
		}
		
		
		
	}

}
