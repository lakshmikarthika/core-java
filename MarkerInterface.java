interface P{
	// interface with no methods 
  // used to give heads up to compiler about serialization or clonable
}
class Memory implements P{
	public void greet() {
		System.out.println("Hello");
	}
}

public class MarkerInterface {
	public static void main(String[] args) {
		Memory obj = new Memory();
		if(obj instanceof P) {
			obj.greet();
		}
		else {
			System.out.println("no permission");
		}
	}
}
