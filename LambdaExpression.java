// lambda can be used in functional interface(only one method is used) 
// while creating anonymous Inner class
@FunctionalInterface
interface A{
    int show(int n);
}
public class LambdaExpression{
    public static void main(String[] args){
        // A obj = new A()
        // {
        //     public void show(){
        //         System.out.println("in method");
        //     }
        // };
        A obj = (n) -> n;
        
        System.out.println(obj.show(5));
    }
}
