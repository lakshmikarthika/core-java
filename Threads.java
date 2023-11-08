class A extends Thread{
	public void run() {        // when thread is started JVM calls the run method
		show();
	} 
	public void show() {
		for(int i=0;i<50;i++) {
			System.out.println("Hi");
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				
			}
		}
		
	}
}
class B extends Thread{
	public void run() {
		show();
	}
	public void show() {
		for(int i=0;i<50;i++) {
			System.out.println("Hello");
			try {
				Thread.sleep(6);
			} catch (InterruptedException e) {
                
			}
		}
	}
}
public class ThreadPractise {
	public static void main(String[] args) {
		A obj = new A();
		B obj1 = new B();
		System.out.println(obj.getPriority());
		obj.start();
		obj1.start();
		obj1.setPriority(Thread.MAX_PRIORITY);
		System.out.println(obj1.getPriority());
	}
}
