package start.maven;
import java.util.*;
import org.apache.commons.lang3.StringUtils;

public class Application{

	public int countWords(String str){
		if(str==null || str.equals(""))
			return 0;
		String []strs=str.trim().split("\\s+");
		return strs.length;
	}
	public Application(){
		System.out.println("Inside Application");
	}

	public static void main(String... args){
		System.out.println("Starts");
		Application app=new Application();
		Stack<Integer> st=new Stack<>();
		System.out.println(app.countWords("My Name is Raag"));
		System.out.println(app.countWords("My Name is Raag"));
		System.out.println(app.countWords(""));
		System.out.println(app.countWords(null));
	}
}