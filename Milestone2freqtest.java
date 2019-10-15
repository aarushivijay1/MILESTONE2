import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Milestone2freqtest {

	public Milestone2freqtest(){
		
	}
		public void Frequency() throws FileNotFoundException {
		        Scanner console = new Scanner(System.in);
		        System.out.print("Copy/Paste txt. file name here: ");
		        String fileName = console.nextLine();
		        Scanner input = new Scanner(new File(fileName));

		        // count occurrences
		        Map<String, Integer> wordCounts = new TreeMap<String, Integer>();
		        while (input.hasNext()) {
		            String next = input.next().toLowerCase();
		            if (!wordCounts.containsKey(next)) {
		                wordCounts.put(next, 1);
		            } else {
		                wordCounts.put(next, wordCounts.get(next) + 1);
		            }
		        }

		        // report frequencies
		        System.out.println("Total # words = " + wordCounts.size());
		        
		        // ask the computer to print the minimum amount of frequencies that occurred on certain words
		        System.out.print("Minimum number of occurrences for printing? ");
		        int min = console.nextInt();
		        for (String word : wordCounts.keySet()) {
		            int count = wordCounts.get(word);
		            if (count >= min) {
		                System.out.println(count + "\t" + word);
		            }
		        }
		    }
		}
