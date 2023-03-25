class SingletonTest{
    static SingletonTest testObj = null;
    private SingletonTest(){
        
    }
    public static SingletonTest getObject(){
        if(testObj == null){
            testObj = new SingletonTest();
        }
        return testObj;
    }
    public void show(){
        System.out.println("in show");
    }
}
class SingletonDemo{
    public static void main(String[] args){
        SingletonTest d = SingletonTest.getObject();    // to test,create one more instance and call hashCode()
        SingletonTest d1 = SingletonTest.getObject();
        d.show();
        System.out.println(d.hashCode());
        System.out.println(d1.hashCode());
    }
    
}
