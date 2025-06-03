public class Profesor extends Persona{

    private String departamento;
    private double salario;
    private int añosExperiencia;

    public Profesor(String nombre, String apellido, String numeroIdentificacion,
                   int edad, String direccion, String telefono,
                   String departamento, double salario, int añosExperiencia){

        super(nombre,apellido,numeroIdentificacion,edad,direccion,telefono);

        this.setDepartamento(departamento);
        this.setSalario(salario);
        this.setAñosExperiencia(añosExperiencia);


    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        if (departamento != null && !departamento.trim().isEmpty()){
            this.departamento = departamento;
        } else {
            System.out.println("Error: El departamento no puede estar vacio");
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

    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    public void setAñosExperiencia(int añosExperiencia) {
        if (añosExperiencia >= 0){
            this.añosExperiencia = añosExperiencia;
        } else {
            System.out.println("Error: Los años de experiencia no pueden ser menor a 0");
        }
    }

   public void enseñar(){
       System.out.println("El profesor " + getNombre() + " " + getApellido() + " esta enseñando en el departamento de " + getDepartamento());
   }


    @Override
    public void mostrarInformacion(){

        super.mostrarInformacion();

        System.out.println("--- Información de Profesor ---"); // Separador opcional
        System.out.println("Departamento: " + this.getDepartamento());
        System.out.println("Salario: " + this.getSalario());
        System.out.println("Años de experiencia: " + this.getAñosExperiencia());

    }




}