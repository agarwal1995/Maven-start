package start.maven;

public class Application{
	public Application(){
		System.out.println("Inside Application");
	}

	public static void main(String... args){
		System.out.println("Starts");
		Application app=new Application();
	}
}