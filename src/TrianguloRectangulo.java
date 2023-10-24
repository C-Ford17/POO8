public class TrianguloRectangulo extends Triangulo{
    
    public TrianguloRectangulo(double lado) {
        super(lado, lado, 90);
    }

    @Override
    public void dibujarTxt() {
        for (int i = 0; i < getLado1(); i++) {
            for (int j = 0; j < i +1; j++) {
                System.out.print("▲");
            }
            System.out.println();
        }
    }
}
