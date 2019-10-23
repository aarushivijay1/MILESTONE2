public class Milestone2Main {

	public static void main (String []args) throws Exception{ 
		
	Milestone2Article a = new Milestone2Article();
	String nytimes = "/Users/nicholasrichardson/Desktop/MILESTONE2-master/guardian.txt";
        Milestone2Counter c = new Milestone2Counter();
        String text = a.runArticles(nytimes);
        c.Counter(text);
        Milestone2StopWordEliminator nostopwords = new Milestone2StopWordEliminator();
        String nostopwordsstring = nostopwords.RemoveStopWords(text);
	//Pull from this string for the sentiment analysis	
		
		
		
        System.out.println("The following are the statistics without stop words");
        c.Counter(nostopwordsstring);
        


	}
}
