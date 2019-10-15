public class Milestone2Main {

	public static void main (String []args) throws Exception{ 
		
		System.out.println("Hi");
		Milestone2Article a = new Milestone2Article();
		String nytimes = "/Users/nicholasrichardson/Desktop/MILESTONE2-master/guardian.txt";
		a.runArticles(nytimes);
        System.out.println(a.runArticles(nytimes));
        Milestone2Counter c = new Milestone2Counter();
        System.out.println("statistics of NY Times Article:");
        c.Counter(nytimes);
        c.removeStopWords(nytimes);
        Milestone2freqtest f = new Milestone2freqtest();
        f.Frequency();
        System.out.println("--------------------");
        


	}
}