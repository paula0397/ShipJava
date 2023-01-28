import java.util.ArrayList;

public class Barco {

    private ArrayList<Cargable> cargas;

    public void agregarCarga(Cargable c) {
        if(this.cargas == null){
            this.cargas = new ArrayList<>();
        }
        this.cargas.add(c);
    }


    public void generarReporte(){
        for(Cargable c: this.cargas){
            System.out.println("El barco de carga " + c.getClass() + " tiene una carga de " + c.obtenerPeso());
        }
    }
}
