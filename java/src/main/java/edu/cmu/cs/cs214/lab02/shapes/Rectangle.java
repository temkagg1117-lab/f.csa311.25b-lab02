package edu.cmu.cs.cs214.lab02.shapes;

public class Rectangle implements Shape {

    // Өмнө: public double height, width
    // Одоо: private - мэдээлэл нууцлагдсан (encapsulation)
    private double height;
    private double width;

    // Конструктор ашиглан объект үүсгэхэд зааж өгнө
    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double getArea() {
        return height * width; // Renderer-ийн draw() энэ аргыг дуудаж ашиглана
    }
}
