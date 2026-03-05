package diego.proyecto_hospital;

public class doctor {
    private String DNI;
    private String nombre;
    private String apellido;
    private int edad;
    private String especialidad;
    private double salario;


    public doctor(String DNI, String nombre, String apellido, int edad, String especialidad, double salario){
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.especialidad = especialidad;
        this.salario = salario;
    }

    public String getDNI(){
        return DNI;
    }

    public String getNombre(){
        return nombre;
    }

    public String getApellido(){
        return apellido;
    }

    public int getEdad(){
        return edad;
    }

    public String getEspecialidad(){
        return especialidad;
    }

    public void setDolencia(String nuevaEspecialidad){
        especialidad = nuevaEspecialidad;
    }

    public void setsalario(double nuevoSalario){
        salario = nuevoSalario;
    }

    public double getsalario(){
        return salario;
    }

    public String toString(){
        return  " __________________________________________" +
                "|                                          |" +
                "|  Paciente: " + nombre + " " + apellido+ "|" +
                "|  DNI: " + DNI + "  n                      |" +
                "|  Edad: " + edad + "  n                      |" +
                "|  Salario: " + salario + "                 |" +
                "|  Especialidad: " + especialidad + "|" +
                "|__________________________________________|";
    }
}
