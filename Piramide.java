public class Piramide extends Triangulo {
    private double volumen;
    private double alturaPiramide;

    // Sobrecarga de constructores - polimorfismo estático
    public Piramide(String nombre, double base, double alturaTriangulo, double volumen) {
        super(nombre, base, alturaTriangulo);
        this.volumen = volumen;
        this.alturaPiramide = 0;
    }
    
    public Piramide(String nombre, double base, double alturaTriangulo, double volumen, double alturaPiramide) {
        super(nombre, base, alturaTriangulo);
        this.volumen = volumen;
        this.alturaPiramide = alturaPiramide;
    }

    // Calcula el volumen a partir del área de la base y altura de la pirámide
    public double calcularVolumen() {
        return (super.getArea() * alturaPiramide) / 3;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    public double getAlturaPiramide() {
        return alturaPiramide;
    }

    public void setAlturaPiramide(double alturaPiramide) {
        this.alturaPiramide = alturaPiramide;
    }

    // Polimorfismo dinámico - sobre-escritura del método toString
    @Override
    public String toString() {
        return "Piramide [" + "base=" + getBase() + ", alturaTriangulo=" + getAltura() + ", areaBase=" + getArea() +", alturaPiramide=" + alturaPiramide +
                ", volumenCalculado=" + calcularVolumen() +", volumenAlmacenado=" + volumen +"]";
    }
}
