package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.Shape;

public class Renderer {

    // Өмнө: public Rectangle rectangle
    // Одоо: private Shape shape
    private Shape shape;

    public Renderer(Shape shape) {
        this.shape = shape; // Renderer зөвхөн Shape интерфэйсээс хамаардаг болсон
    }

    public void draw() {
        double area = shape.getArea(); // Polymorphism ашиглаж area-ийг авна
        System.out.println("Shape printed");
        System.out.println("Its area is " + area);
    }
}
