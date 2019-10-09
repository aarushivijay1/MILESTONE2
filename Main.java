package CourseLabProject;


public class Main {

	public static void main(String []args) throws Exception {
		
		//Runs Programs
		
		Articles a = new Articles();
		Counter c = new Counter();
		freqtest f = new freqtest();
		
		//article 1
		String nytimes = "C:\\Users\\brian\\eclipse-workspace\\Programming Workshop\\Lab\\CourseLabProject\\nytimes.txt";
		a.runArticles(nytimes);
		System.out.println("statistics of NY Times Article:");
		c.removeStopWords(nytimes);
		c.Counter(nytimes);
		f.Frequency();
		System.out.println("--------------------");
		
		//article 2
		String britt = "C:\\Users\\brian\\eclipse-workspace\\Programming Workshop\\Lab\\CourseLabProject\\britannica.txt";
		a.runArticles(britt);
		System.out.println("statistics of Britannica Article:");
		c.removeStopWords(nytimes);
		c.Counter(britt);
		f.Frequency();
		System.out.println("--------------------");
		
		//article 3
		String theguardian = "C:\\Users\\brian\\eclipse-workspace\\Programming Workshop\\Lab\\CourseLabProject\\guardian.txt";
		a.runArticles(theguardian);
		System.out.println("statistics of Guardian Article: ");
		c.removeStopWords(nytimes);
		c.Counter(theguardian);
		f.Frequency();
		
		
		
	}
}
