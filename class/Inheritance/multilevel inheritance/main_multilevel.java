class A{
    void display(){
        System.out.println("A");
    }
}
class B extends A{
    void display1(){
        System.out.println("B");
    }
}
class C extends A{
    void display2(){
        System.out.println("C");
    }
}
public class main_multilevel {
    public static void main(String[]args){
        C c=new C();
        c.display2();
    }
    
}
