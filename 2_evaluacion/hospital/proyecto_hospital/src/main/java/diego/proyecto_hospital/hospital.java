package diego.proyecto_hospital;

import java.util.ArrayList;
import java.util.HashMap;

public class hospital {
    private String nombre;
    private ArrayList<String> especialidades;
    private ArrayList<patient> pacientesEnEspera;
    private ArrayList<doctor> doctores;

    public hospital(String nombre) {
        this.nombre = nombre;

        especialidades = new ArrayList<>();
        pacientesEnEspera = new ArrayList<>();
        doctores = new ArrayList<>();

        this.especialidades.add("dermatología");
        this.especialidades.add("cardiología");
        this.especialidades.add("neumología");
        this.especialidades.add("pediatría");
        this.especialidades.add("traumatología");
    }
}
