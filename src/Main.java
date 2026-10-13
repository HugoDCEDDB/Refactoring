public class Main {
    public static void main(String[] args) {
        double PrecioArticulo1 = 25.0;
        double IVAPorcentaje1 = 21;
        double PrecioConIVA1 = getPrecioConIVA1(PrecioArticulo1, IVAPorcentaje1);
        System.out.println("Precio final del articulo 1: " + PrecioConIVA1);
        double PrecioArticulo2 = 40.0;
        double IVAPorcentaje2 = 21;
        double PrecioConIVA2 = getPrecioConIVA1(PrecioArticulo2, IVAPorcentaje2);
        System.out.println("Precio final del articulo 2: " + PrecioConIVA2);
    }

    private static double getPrecioConIVA1(double precioArticulo1, double IVAPorcentaje1) {
        double PrecioConIVA1 = precioArticulo1 + (precioArticulo1 * IVAPorcentaje1 / 100);
        return PrecioConIVA1;
    }
}