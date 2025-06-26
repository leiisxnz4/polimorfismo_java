public class Triangulo extends FiguraGeometrica {
    private double base;
    private double altura;

    public Triangulo(String nombre, double base, double altura){
        super(nombre); 
        this.altura = altura;
        this.base = base;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // Polimorfismo dinámico - sobre-escritura de métodos
    @Override
    public double getArea(){
        double a = this.base * this.altura / 2;
        return a;
    }

    @Override                                  
    public double getPerimetro(){
        double p = 3 * this.base;
        // Si desde la clase hija necesitas usar un método de la clase padre, debes usar la palabra super 
        // el . y el nombre del método de la clase padre
        // super.setPerimetro(p);
        return p;
    }

    // Polimorfismo dinámico - sobre-escritura de métodos
    // El método que se sobre-escribe es el toString de FiguraGeometrica
    @Override
    public String toString() {
        return "Triangulo [base=" + base + ", altura=" + altura + "]";
    }
    
}
