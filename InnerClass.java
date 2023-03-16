class A{
    public void show(){
        System.out.println("in a");
    }
    static class B{
        public void show1(){
            System.out.println("in B");
        }
    }
}

public class InnerClass{
    public static void main(String[] args){
        A obj = new A();
        A.B obj1 = new A.B();
        obj.show();
        obj1.show1();
    }
}

// if u don't want class B to be static then create obj for B using the A's object like below
// A obj = new A();
// A.B obj1 = obj.new B();
