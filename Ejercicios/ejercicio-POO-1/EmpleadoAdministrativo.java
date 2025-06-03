public class EmpleadoAdministrativo extends Persona{

    private String cargo;
    private String horarioTrabajo;
    private double salario;

    public EmpleadoAdministrativo(String nombre, String apellido, String numeroIdentificacion,
                   int edad, String direccion, String telefono,
                   String cargo, String horarioTrabajo, double salario){

        super(nombre,apellido,numeroIdentificacion,edad,direccion,telefono);

        this.setCargo(cargo);
        this.setHorarioTrabajo(horarioTrabajo);
        this.setSalario(salario);

    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        if (cargo != null && !cargo.trim().isEmpty()){
            this.cargo = cargo;
        } else {
            System.out.println("Error: El cargo no puede estar vacio");
        }
    }

    public String getHorarioTrabajo() {
        return horarioTrabajo;
    }

    public void setHorarioTrabajo(String horarioTrabajo) {
        if (horarioTrabajo != null && !horarioTrabajo.trim().isEmpty()){
            this.horarioTrabajo = horarioTrabajo;
        } else {
            System.out.println("Error: El horario de trabajo no puede estar vacio");
        }
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario > 0){
            this.salario = salario;
        } else {
            System.out.println("Error: El salario no puede estar vacio, ni ser menor a 0");
        }
    }

    public void administrar(){
        System.out.println("El empleado " + getNombre() + " " + getApellido() + " esta realizando tareas administrativas");
    }

    @Override
    public void mostrarInformacion(){

        super.mostrarInformacion();

        System.out.println("--- Información de Empleado ---"); // Separador opcional
        System.out.println("Cargo: " + this.getCargo());
        System.out.println("Horario de trabajo: " + this.getHorarioTrabajo());
        System.out.println("Salario: " + this.getSalario());

    }


}