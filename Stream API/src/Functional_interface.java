//Interface having only one abstract method is called functional interface
//Before Java 8, we had to create anonymous classes for single-method interfaces.
//Contains exactly one abstract method (though it can have multiple default or static methods).
//Primarily used in lambda expressions and functional programming.


//This annotation to make an interface have only one method
@FunctionalInterface
interface A{
    void show();
}

//Now toString method is always part of any object class, so it won't show error
@FunctionalInterface
interface ABC{
    void showABC();
    String toString();
}


//B implements A
class B implements A{
    public void show(){
        System.out.println("B is A");
    }
}


public class Functional_interface {
    public static void main(String[] args) {

        B b = new B();
        b.show();

//        Alternate way of using A, without creating a class B to implement it
//        Called Anonymous inner class
        A obj = new A() {
            @Override
            public void show() {
                System.out.println("directly display A");
            }
        };
        obj.show();

//        Modern way: Lambda expression
        A objnew = () -> System.out.println("Lambda expression for A");
        objnew.show();

    }
}
