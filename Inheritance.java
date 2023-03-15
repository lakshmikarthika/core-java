
class Calc{
    public int add(int n1,int n2){
        return n1+n2;
    }
}
class AdvCal extends Calc{              // single level inheritance
    public int multi(int n1,int n2){
        return n1*n2;
    }
}
class VeryAdvCal extends AdvCal{        // multi level inheritance
    public double power(int n1,int n2){
        return Math.pow(n1,n2);
    }
}
class HelloWorld {
    public static void main(String[] args) {
        VeryAdvCal c = new VeryAdvCal();
        int addition = c.add(1,2);
        int mul = c.multi(2,3);
        double p = c.power(2,2);
        System.out.println(addition+" "+mul+" "+p);
    }
}
