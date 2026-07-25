package OOP_Class.Inheritance.multilevel_inheritance;


class Grandfather {
    void land(){
        System.out.println("Land Owned by Grandfather...");
    }
}
class Father extends Grandfather{
      void house(){
        System.out.println("The house give to the father...");
      }
}

