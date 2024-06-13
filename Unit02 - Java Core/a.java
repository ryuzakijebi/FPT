public class a {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.value = 5;
        modifyObject(obj);
        System.out.println("obj.value after modifyObject: " + obj.value);
    }

    public static void modifyObject(MyClass x) {
        x.value = 10;
    }
}

class MyClass {
    int value;
}
