import java.util.ArrayList;

public class CompositeContenedor implements Cargable {

    private ArrayList<Cargable> cargas = new ArrayList<>();
    private String nombre;
    private String descripcion;
    private Double pesoContenedor;

    public CompositeContenedor(String nombre, String descripcion, Double pesoContenedor) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.pesoContenedor = pesoContenedor;
    }

    public void agregarCarga(Cargable c){
        this.cargas.add(c);
    }



    @Override
    public Double obtenerPeso() {
        Double pesoTotal = 0.0;
        for (Cargable c: this.cargas){
            pesoTotal += c.obtenerPeso();
        }
        return pesoTotal + this.pesoContenedor;
    }


    @Override
    public String getNombre() {
        return this.nombre;
    }
}
