package negociosDigitales;

public class MainProducto {
    static void main() {
        Producto producto1 = new Producto("mouse", 20, "tecnología");
        Producto producto2 = new Producto();

        /*producto1.setNombre("Mouse");
        producto1.setPrecio(20);
        producto1.setCategoria("Tecnología");*/

        producto2.setNombre("Curso Java");
        producto2.setPrecio(75);
        producto2.setCategoria("Educación");

        /*producto1.nombre = "Mouse";
        producto1.precio = 20;
        producto1.categoria = "Tecnología";

        producto2.nombre = "Curso Java";
        producto2.precio = 75;
        producto2.categoria = "Educación";*/

        producto1.mostrarInformacion();
        producto1.mostrarCategoria();
        System.out.println();
        producto2.mostrarInformacion();
        producto2.mostrarCategoria();
        System.out.println();

        producto1.setPrecio(-100);

        producto1.mostrarInformacion();
        producto1.mostrarCategoria();
        System.out.println();
        producto2.mostrarInformacion();
        producto2.mostrarCategoria();

        System.out.println();
        producto1.mostrarPrecio();

        System.out.println("El total de productos creados es de "+ Producto.getTotalCreados());


    }
}

