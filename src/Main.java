
interface Forma {
    void draw();
}

class Circulo implements Forma {
    @Override
    public void draw() {
        System.out.println("Dibujando un círculo");
    }
}

class Rectangulo implements Forma {
    @Override
    public void draw() {
        System.out.println("Dibujando un rectángulo");
    }
}

class Cuadrado implements Forma {
    @Override
    public void draw() {
        System.out.println("Dibujando un cuadrado");
    }
}

class ShapeMaker {
    private Circulo circulo;
    private Rectangulo rectangulo;
    private Cuadrado cuadrado;

    public ShapeMaker() {
        this.circulo = new Circulo();
        this.rectangulo = new Rectangulo();
        this.cuadrado = new Cuadrado();
    }

    public void drawCircle() {
        circulo.draw();
    }

    public void drawRectangle() {
        rectangulo.draw();
    }

    public void drawSquare() {
        cuadrado.draw();
    }
}

class FacadeDemo {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
