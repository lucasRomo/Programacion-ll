public class Estudiante extends Persona{

    private String matricula;
    private String carrera;
    private double promedio;

    public Estudiante(String nombre, String apellido, String numeroIdentificacion,
                   int edad, String direccion, String telefono,
                   String matricula, String carrera, double promedio){

        super(nombre,apellido,numeroIdentificacion,edad,direccion,telefono);

        this.setMatricula(matricula);
        this.setCarrera(carrera);
        this.setPromedio(promedio);


    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        if (matricula != null && !matricula.trim().isEmpty()){
            this.matricula = matricula;
        } else {
            System.out.println("Error: La matricula no puede estar vacia");
        }
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        if (carrera != null && !carrera.trim().isEmpty()){
            this.carrera = carrera;
        } else {
            System.out.println("Error: La carrera no puede estar vacia");
        }
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        if (promedio > 0){
            this.promedio = promedio;
        } else {
            System.out.println("Error: El promedio no puede estar vacio, ni ser menor a 0");
        }
    }

    public void estudiar(){
        System.out.println("El estudiante " + getNombre() + " " + getApellido() + " esta estudiando " + getCarrera());
    }

    @Override
    public void mostrarInformacion(){

        super.mostrarInformacion();

        System.out.println("--- Información de Estudiante ---"); // Separador opcional
        System.out.println("Matrícula: " + this.getMatricula());
        System.out.println("Carrera: " + this.getCarrera());
        System.out.println("Promedio: " + this.getPromedio());

    }


}