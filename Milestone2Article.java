import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Milestone2Article {

	MileStone2Article(){
		
	}

	public BufferedReader runArticles (String pathname) throws IOException {
		// Stores articles to be used in the main
	        File file = new File(pathname); 
	      	FileInputStream fileStream = new FileInputStream(file); 
	        InputStreamReader input = new InputStreamReader(fileStream); 
	        BufferedReader reader = new BufferedReader(input); 
	        return reader;
	        }
}