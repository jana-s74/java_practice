class Employee {
    void work(){
        System.out.println("Employee is working...");
    }
}
class developer extends Employee{
    void code(){
        System.out.println("Developer is coding...");
    }
}
class main{
    public static void main(String[]args){
        developer d=new developer();
        d.work();
        d.code();
    }
}
