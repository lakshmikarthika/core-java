// static methods are executed even before main method
// first memory is allocated and then code is executed line by line
class StaticFlow{
    static int i = 10;
    static{
        methodOne();
        System.out.println("first static");
    }
    public static void main(String[] args){
        methodOne();
        System.out.println("main");
    }
    public static void methodOne(){
        System.out.println(j);
    }
    static{
        System.out.println("second static");
    }
    static int j = 20;
}

