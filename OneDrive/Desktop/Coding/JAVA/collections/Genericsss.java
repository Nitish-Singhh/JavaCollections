package collections;

// import java.util.Scanner;

class gen1<Type> {
    private Type x;

    public gen1(Type x) {
        this.x = x;
    }

    void disp() {
        System.out.println("The Type of A Data " + x.getClass());
    }

    public Type getX() {
        return x;
    }

}

public class Genericsss {
    public static void main(String[] args) {
        gen1<Integer> obj = new gen1<Integer>(78);
 
        obj.disp();
        System.out.println(obj.getX());

        gen1<String> obj1 = new gen1 <String> ("Nitish");
        obj1.disp();
        System.out.println(obj1.getX());

    }
}
