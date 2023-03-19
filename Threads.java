class A extends Thread{
    public void run(){
        for(int i =1; i<=100; i++){
            System.out.println("Hi");
            try{
                Thread.sleep(10);
            }
            catch(InterruptedException e){

            }
        }
    }
}
class B extends Thread{
    public void run(){
        for(int i =1; i<=100; i++){
            System.out.println("Hello");
            try{
                Thread.sleep(10);
            }
            catch(InterruptedException e){
                
            }
        }
    }
}
public class Threads{
    public static void main(String[] args){
        A obj1 = new A();
        B obj2 = new B();
        obj1.start();
        obj2.start();
    }
}
