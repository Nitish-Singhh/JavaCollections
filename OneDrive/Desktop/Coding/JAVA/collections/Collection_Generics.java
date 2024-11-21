package collections;

class gen<t1> { // User Define Data Type
    t1 ab;

    public gen(t1 ab) { //This Is A Constructor
        this.ab = ab;
    }

    void disp() {//This is A Method 
        System.out.println("The type of data " + ab.getClass());
    }

    public t1 getab() {
        return ab;
    }
}

public class Collection_Generics {
    public static void main(String[] args) {
        gen<Integer> g = new gen<Integer>(4);
        g.disp();
        System.out.println(g.getab());
        // gen g1 =new gen("Hello");
        System.out.println("********************************************");
        gen<String> g1 = new gen<String>("Nitish Sharma");
        System.out.println(g1.getab());
    }

}