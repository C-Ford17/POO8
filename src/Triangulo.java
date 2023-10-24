public abstract class Triangulo implements Figura{
    private double lado1;
    private double lado2;
    private double angulo;

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public double getAngulo() {
        return angulo;
    }

    public Triangulo(double lado1, double lado2, double angulo) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.angulo = angulo;
    }

    public double lado3(){
        return Math.sqrt(Math.pow(lado1,2) + Math.pow(lado2,2)-2*lado1*lado2*Math.cos(Math.toRadians(angulo)));
    }

    @Override
    public String nombre() {
        return getClass().getName();
    }

    @Override
    public double calcularArea() {
        return lado1*lado2*Math.sin(Math.toRadians(angulo))/2;
    }

    @Override
    public double calcularPerimetro() {
        return lado1+lado2+lado3();
    }

    @Override
    public abstract void dibujarTxt();
}
