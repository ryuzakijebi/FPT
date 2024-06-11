interface Printable {
    void print();
}

class Document implements Printable {
    @Override
    public void print() {
        System.out.println("Printing a document");
    }
}

class Image implements Printable {
    @Override
    public void print() {
        System.out.println("Printing an image");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Printable document = new Document();
        document.print(); 

        Printable image = new Image();
        image.print(); 
    }
}