package oops_inheritance;

//multiple inheritance
//-->Java allows multiple inheritance through interfaces, which only declare methods (no implementation), so there's no ambiguity.

interface Printable {
    void print();
}

interface Showable {
    void show();
}

class Document implements Printable, Showable {
    public void print() {
        System.out.println("Printing document...");
    }

    public void show() {
        System.out.println("Showing document...");
    }
}

public class Xeroxshop {
    public static void main(String[] args) {
        Document doc = new Document();
        doc.print();
        doc.show();
    }
}
