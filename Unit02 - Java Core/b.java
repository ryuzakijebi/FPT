public class b {
    public static void main(String[] args) {
    MyClass obj = new MyClass();
    obj.value = 5;
    changeReference (obj);
    System.out.println("obj.value after changeReference: " + obj.value);
    }

    public static void changeReference (MyClass x) {
        x = new MyClass(); 
        x.value = 10;
    }
}

class MyClass {
    int value;
}