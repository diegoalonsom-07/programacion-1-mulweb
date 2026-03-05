package diego.proyecto_hospital;

public class patient {
    private String DNI;
    private int numSeg;
    private String nombre;
    private String apellido;
    private int edad;
    private String telefono;
    private String dolencia;

    public patient(String DNI, int numSeg, String nombre, String apellido, int edad, String telefono, String dolencia){
        this.DNI = DNI;
        this.numSeg = numSeg;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.telefono = telefono;
        this.dolencia = dolencia;
    }

    public String getDNI(){
        return DNI;
    }

    public int getNumSeg(){
        return numSeg;
    }

    public void setNumSeg(int nuevoNumSeg){
        numSeg = nuevoNumSeg;
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

    public String getTelefono(){
        return telefono;
    }

    public void setTelefono(String nuevoTelefono){
        telefono = nuevoTelefono;
    }

    public String getDolencia(){
        return dolencia;
    }

    public void setDolencia(String nuevaDolencia){
        dolencia = nuevaDolencia;
    }

    public String toString(){
        return  " __________________________________________" +
                "|                                          |" +
                "|  Paciente: " + nombre + " " + apellido+ "|" +
                "|  DNI: " + DNI + "  n                      |" +
                "|  Edad: " + edad + "  n                      |" +
                "|  Telefono: " + telefono + "   |" +
                "|  Numero de la S.S: " + numSeg + "|" +
                "|  Dolencia: " + dolencia + "|" +
                "|__________________________________________|";
    }
}
