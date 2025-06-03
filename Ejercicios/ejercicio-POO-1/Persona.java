public class Persona {
    private String nombre;
    private String apellido;
    private String numeroIdentificacion;
    private int edad;
    private String direccion;
    private String telefono;

    public Persona(String nombre, String apellido, String numeroIdentificacion,
                   int edad, String direccion, String telefono){
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setNumeroIdentificacion(numeroIdentificacion);
        this.setEdad(edad);
        this.setDireccion(direccion);
        this.setTelefono(telefono);

    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public int getEdad() {
        return edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()){
            this.nombre = nombre;
        } else {
            System.out.println("Error: El nombre no puede estar vacio");
        }
    }

    public void setApellido(String apellido) {
        if (apellido != null && !apellido.trim().isEmpty()){
            this.apellido = apellido;
        } else {
            System.out.println("Error: El apellido no puede estar vacio");
        }
    }

    public void setNumeroIdentificacion(String numeroIdentificacion) {
        if (numeroIdentificacion != null && !numeroIdentificacion.trim().isEmpty()){
            this.numeroIdentificacion = numeroIdentificacion;
        } else {
            System.out.println("Error: El numeroIdentificacion no puede estar vacio");
        }
    }

    public void setEdad(int edad) {
        if (edad > 0){
            this.edad = edad;
        } else {
            System.out.println("Error: La edad no puede estar vacia, ni ser menor a 0");
        }
    }

    public void setDireccion(String direccion) {
        if (direccion != null && !direccion.trim().isEmpty()){
            this.direccion = direccion;
        } else {
            System.out.println("Error: La direccion no puede estar vacio");
        }
    }

    public void setTelefono(String telefono) {
        if (telefono != null && !telefono.trim().isEmpty()){
            this.telefono = telefono;
        } else {
            System.out.println("Error: El telefono no puede estar vacio");
        }
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Apellido: " + this.getApellido());
        System.out.println("Numero de identificacion: " + this.getNumeroIdentificacion());
        System.out.println("Edad: " + this.getEdad());
        System.out.println("Direccion: " + this.getDireccion());
        System.out.println("Telefono: " + this.getTelefono());
    }

    public void saludar(){
        System.out.println("Hola, mi nombre es " + this.getNombre() + " " + this.getApellido());
    }



    }





