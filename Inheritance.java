public class Inheritance{
    void get(){
        System.out.println("learn inheritance parent class");
    }
}
class base extends Inheritance{
    void get(){
        System.out.println("learn inheritance base class");
    }
}
class Main{
    public static void main(String[] args){
        Inheritance a=new Inheritance();
        a.get();
    }
}