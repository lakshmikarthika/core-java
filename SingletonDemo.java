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
        SingletonTest d = SingletonTest.getObject();
        d.show();
    }
    
}