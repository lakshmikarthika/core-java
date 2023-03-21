class TooYoungException extends RuntimeException{
    TooYoungException(String s){
        super(s);
    }
}
class TooOldException extends RuntimeException{
    TooOldException(String s){
        super(s);
    }
}
public class CustomExceptions{
    public static void main(String[] args){
        int age = Integer.parseInt(args[0]);
        if(age>60){
            throw new TooOldException("Too old to get married");
        }
        else if(age<18){
            throw new TooYoungException("Too young to get married");
        }
        else{
            System.out.println("Details will be emailed");
        }
    }
}