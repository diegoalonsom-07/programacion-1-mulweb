import java.util.ArrayList;

class Punto {
    double x;
    double y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public boolean esIgual(Punto otro) {
        return this.x == otro.x && this.y == otro.y;
    }
}

public class GraficoLineas2D {
    private ArrayList<Punto> puntos;

    public GraficoLineas2D() {
        this.puntos = new ArrayList<>();
    }

public void añadirPunto(Punto p) {
    if (p.x < 0 || p.y < 0) {
        System.out.println("Error: Las coordenadas deben ser positivas.");
        return;
    }

    int posicionInsercion = 0;
    
    for (int i = 0; i < puntos.size(); i++) {
        Punto actual = puntos.get(i);

        if (actual.x == p.x) {
            System.out.println("Error: Ya existe un punto con la coordenada X = " + p.x);
        } else if (actual.x < p.x) {
            posicionInsercion = i + 1;
        } else {
            if (actual.y == p.y) {
                System.out.println("Error: Ya existe un punto con la coordenada Y = " + p.y);
                return;
            } else if (actual.y < p.y) {
                posicionInsercion = i + 1;
            }
        }
    }
    puntos.add(posicionInsercion, p);
    System.out.println("Punto añadido correctamente en la posición " + posicionInsercion);
}

    public void eliminarUltimoPunto() {
        if (!puntos.isEmpty()) {
            puntos.remove(puntos.size() - 1);
            System.out.println("Último punto eliminado.");
        } else {
            System.out.println("Error: El gráfico ya está vacío.");
        }
    }
}