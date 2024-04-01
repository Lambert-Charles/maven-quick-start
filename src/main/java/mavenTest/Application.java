package mavenTest;

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

public class Application {
    
	public int countWords(String words){
		String[] separateWords = StringUtils.split(words);
		return (separateWords == null) ? 0 : separateWords.length;
	}
	
	public void greet(){
		List<String> greetings = new ArrayList<>();
		greetings.add("Hello");
		
		for(String s: greetings){
			System.out.println("Greeting: " + s);
		}
	}
	
    public Application() {
        System.out.println ("Inside Application");
    }

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	System.out.println ("Starting Application");
		Application app = new Application();
		app.greet();
		String words = "This sentence has five words";
		int count = app.countWords(words);
		System.out.println("Number of words :" + count);
    }
}
