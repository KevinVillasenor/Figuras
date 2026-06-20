public class Main {

    public static void main(String[] args) {

        Figura triangulo = new Triangulo(10, 5, 6, 8, 10);
        Figura rectangulo = new Rectangulo(4, 7);
        Figura circulo = new Circulo(3);

        System.out.println("TRIÁNGULO");
        System.out.println("Área: " + triangulo.calcularArea());
        System.out.println("Perímetro: " + triangulo.calcularPerimetro());

        System.out.println("\nRECTÁNGULO");
        System.out.println("Área: " + rectangulo.calcularArea());
        System.out.println("Perímetro: " + rectangulo.calcularPerimetro());

        System.out.println("\nCÍRCULO");
        System.out.println("Área: " + circulo.calcularArea());
        System.out.println("Perímetro: " + circulo.calcularPerimetro());
    }
}