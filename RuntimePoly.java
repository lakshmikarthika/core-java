abstract class Computer{
    public abstract void code();
}
class Laptop extends Computer{
    public void code(){
        System.out.println("coding in laptop");
    }
}
class Desktop extends Computer{
    public void code(){
        System.out.println("coding in desktop");
    }
}
class Developer{
    public void developApp(Computer comp){
        comp.code();
    }
}
class Poly{
    public static void main(String[] args){
        Computer lap= new Laptop();
        Computer desk = new Desktop();
        Developer lucky = new Developer();
        lucky.developApp(desk);
        

    }
}
