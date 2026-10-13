public class Main {
    public static void main(String[] args) {
        double PrecioArticulo1 = 25.0;
        double IVAPorcentaje1 = 21;
        double PrecioConIVA1 = PrecioArticulo1 + (PrecioArticulo1 * IVAPorcentaje1 / 100);
        System.out.println("Precio final del articulo 1: " + PrecioConIVA1);
        double PrecioArticulo2 = 40.0;
        double IVAPorcentaje2 = 21;
        double PrecioConIVA2 = PrecioArticulo2 + (PrecioArticulo2 * IVAPorcentaje2 / 100);
        System.out.println("Precio final del articulo 2: " + PrecioConIVA2);
    }
}