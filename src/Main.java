public class Main {
    public static void main(String[] args) {
        double PrecioArticulo1 = 25.0;
        double b = 21;
        double x1 = PrecioArticulo1 + (PrecioArticulo1 * b / 100);
        System.out.println("Precio final del articulo 1: " + x1);
        double c = 40.0;
        double d = 21;
        double x2 = c + (c * d / 100);
        System.out.println("Precio final del articulo 2: " + x2);
    }
}