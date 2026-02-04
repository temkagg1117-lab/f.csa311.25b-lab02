package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.*;

public class Main {
    public static void main(String[] args) {

        // Өмнө: Rectangle object шууд ашиглаж Renderer-д өгдөг байсан
        // Одоо: Polymorphism ашиглаж Shape-аар дамжуулж өгнө
        Shape shape = new Rectangle(2, 3);
        //Shape shape = new Circle(5);
        //Shape shape = new Square(4);

        Renderer renderer = new Renderer(shape);
        renderer.draw();
    }
}
