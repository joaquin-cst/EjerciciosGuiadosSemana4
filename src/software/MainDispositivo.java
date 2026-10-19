package software;

public class MainDispositivo {
    static void main() {
        Dispositivo di_1 = new Dispositivo("mouse", "periferico", false, 69);
        Dispositivo di_2 = new Dispositivo("teclado", "periferico", true, 67);
        Dispositivo di3 =new Dispositivo("monitor", "pantalla", false, 420);

        /*di_1.setNombre("mouse");
        di_1.setTipo("periferico");
        di_1.setActivo(false);
        di_1.setStock(67);*/

        /*di_2.setNombre("teclado");
        di_2.setTipo("periferico");
        di_2.setActivo(false);
        di_2.setStock(67);*/

        System.out.println("--- Datos D1 ---");
        di_1.mostrarInformacion();
        di_1.mostrarEstado();
        System.out.println();

        System.out.println("--- Datos D2 ---");
        di_2.mostrarInformacion();
        di_2.mostrarEstado();
        System.out.println();

        System.out.println("--- Datos D3 ---");
        di3.mostrarInformacion();
        di3.mostrarEstado();
        System.out.println();

        di_1.setActivo(true);
        System.out.println();
        di_1.mostrarEstado();

        System.out.println();
        di_1.activar();
        di_2.activar();


        System.out.println("Total de dsipositivos creados: " + Dispositivo.getTotalCreados());
    }
}
