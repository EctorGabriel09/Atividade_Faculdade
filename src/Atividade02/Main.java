package Atividade02;

// Parte A — LSP corrigido

interface Shape {
    int getArea();
}


class Rectangle implements Shape {
    private final int width;
    private final int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public int getArea() {
        return width * height;
    }
}


class Square implements Shape {
    private final int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public int getArea() {
        return side * side;
    }
}


// Parte B — ISP corrigido


interface Printer {
    void print(String content);
}

interface Scanner {
    void scan(String document);
}

interface Fax {
    void fax(String number, String content);
}


class BasicPrinter implements Printer {
    @Override
    public void print(String content) {
        System.out.println("[PRINT] " + content);
    }
}


class OfficeAllInOne implements Printer, Scanner, Fax {
    @Override
    public void print(String content) {
        System.out.println("[PRINT] " + content);
    }

    @Override
    public void scan(String document) {
        System.out.println("[SCAN] " + document);
    }

    @Override
    public void fax(String number, String content) {
        System.out.println("[FAX] Enviando para " + number + ": " + content);
    }
}


public class Main {
    public static void main(String[] args) {

        Shape r1 = new Rectangle(5, 10);
        System.out.println("Área (retângulo): " + r1.getArea()); // 50

        Shape s1 = new Square(5);
        System.out.println("Área (quadrado): " + s1.getArea()); // 25


        Printer impressoraSimples = new BasicPrinter();
        impressoraSimples.print("Contrato 009");


        OfficeAllInOne multifuncional = new OfficeAllInOne();
        multifuncional.print("Relatório");
        multifuncional.scan("RG");
        multifuncional.fax("559-157", "Olá");
    }
}