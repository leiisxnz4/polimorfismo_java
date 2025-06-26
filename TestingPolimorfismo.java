public class TestingPolimorfismo {

    public static void main(String[] args) {
        FiguraGeometrica unaFigura = new FiguraGeometrica("Hexágono", 0);
        unaFigura.setArea(48.5);
        unaFigura.setPerimetro(32.9);
        System.out.println();
        System.out.println("Datos de una figura: " + unaFigura);
        System.out.println();


        // Un ejemplo de uso de sobreccarga:
        // Como programadores decidimos en tiempo de edición cual constructor usar
        FiguraGeometrica otraFigura = new FiguraGeometrica("Pentágono", 25.12);
        // Ejemplo de uso de sobre-escritura:
        // Al momento de correr, Java decide cuál método toString debe usar
        System.out.println("Datos de otraFigura: " + otraFigura.toString());
        System.out.println();

        Triangulo triangulo1 = new Triangulo("Triangulo 1", 10.2, 15.8);
        System.out.println("Datos del triángulo 1: " + triangulo1.toString());
        System.out.println("Área del triangulo1: " + triangulo1.getArea());
        double perimetro = triangulo1.getPerimetro();
        System.out.println("Perímetro del triángulo 1: " + triangulo1.getPerimetro());
        // Si desde fuera de la clase hija necesitas usar un nmétodo de la clase padre sólo debes
        // escribir el objeto de la clase hija y el . y elk nombre del método
        // Porque un objeto de la clase hija es también un objeto de la clase padre 
        triangulo1.setPerimetro(perimetro);
        System.out.println("Datos del triángulo 1: " + triangulo1.toString());

        // Pirámide con constructor de 4 parámetros (sobrecarga)
        Piramide piramide1 = new Piramide("Pirámide 1", 6.0, 5.0, 0);
        piramide1.setAlturaPiramide(9.0); 
        System.out.println("Datos de pirámide 1:");
        System.out.println(piramide1);
        System.out.println("Volumen calculado: " + piramide1.calcularVolumen());
        piramide1.setVolumen(piramide1.calcularVolumen());
        System.out.println(piramide1);
        System.out.println();

        // Pirámide con constructor de 5 parámetros (sobrecarga)
        Piramide piramide2 = new Piramide("Pirámide 2", 4.0, 3.0, 0, 6.0);
        System.out.println("Datos de pirámide 2:");
        System.out.println(piramide2);
        System.out.println("Volumen calculado: " + piramide2.calcularVolumen());
    }
}
