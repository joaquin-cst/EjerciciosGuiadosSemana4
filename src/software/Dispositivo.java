package software;

public class Dispositivo {
    private String nombre;
    private String tipo;
    private boolean activo;
    private int stock;
    private static int cont=0; //contador compartido
    private int id;

    public void mostrarInformacion () {
        System.out.println("ID: " + id);
        System.out.println("Nombre: "+nombre);
        System.out.println("Tipo: "+tipo);
        System.out.println("Estado: "+activo);
        System.out.println("Stock: " + stock);
    }

    void mostrarEstado () {
        //Operador ternario (?:): Es un if-else
        String estado = activo ? "está activo":"está inactivo";
        System.out.println(nombre + " " + estado);
    }

    void activar () {
        if (activo==false){
            activo=true;
            System.out.println(nombre+" Se ha activado");
        } else System.out.println(nombre+" ya estaba activo");
    }

    /*-------------------------------------------- MÉTODOS SET Y GET ------------------------------------------------*/

    public void setStock (int stock) {
        //si el valor es correcto asigne, sino ponga 0
        if (stock < 0)
            stock=0;
        this.stock=stock;
    }

    public int getStock () {
        return stock;
    }

    public void setNombre (String nombre) {
        if (nombre!=null)
            if (nombre.isBlank()==false)
                this.nombre=nombre;
    }

    public String getNombre () {
        return nombre;
    }

    public void setTipo (String tipo) {
        if (tipo!=null)
            if (tipo.isBlank()==false)
                this.tipo=tipo;
    }

    public String getTipo () {
        return tipo;
    }

    public void setActivo (boolean activo) {
        this.activo=activo;
    }

    public boolean isActivo () {
        return activo;
    }

    public static int getTotalCreados () {
        return cont;
    }



    /*-----------------------------------------CONSTRUCTORES---------------------------------------------------*/
    // -------------Constructor por parametro------------------
    // no hay tipo de retorno
    public Dispositivo (String nombre, String tipo, boolean activo, int stock) {
        //Se realiza la asignación
        this.nombre=nombre;
        this.tipo=tipo;
        this.activo=activo;
        setStock(stock);
        cont++;
        this.id=cont;

        //si los atributos tienen validaciones, se llama al metodo set

    }

    //--------------Constructor por defecto-----------------
    public Dispositivo () {
        //Java completa el resto, solo en los atributos no guarda basura y pone 0
    }
}
