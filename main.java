public class main {
    public static void main(String[] args) {
        // Precios originales
        double precioCamiseta = 25.0;
        double precioPantalon = 30.0;

        // Descuentos
        double descuentoGeneral = 0.15;
        double descuentoAdicionalCamiseta = 0.05;

        // Calcular precios después del descuento general
        double precioCamisetaDescuento = precioCamiseta * (1 - descuentoGeneral);
        double precioPantalonDescuento = precioPantalon * (1 - descuentoGeneral);

        // Calcular precio de la segunda camiseta con el descuento adicional
        double precioSegundaCamisetaDescuento = precioCamisetaDescuento * (1 - descuentoAdicionalCamiseta);

        // Calcular el precio total
        double precioTotal = precioCamisetaDescuento + precioPantalonDescuento + precioSegundaCamisetaDescuento;

        // Imprimir el resultado
        System.out.println("El precio total de ambas prendas después de aplicar los descuentos es: $" + precioTotal);
    }
}
