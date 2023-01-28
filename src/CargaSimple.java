public class CargaSimple implements Cargable {

    private String nombre;
    private String descripcion;
    private Double pesoCarga;
    private Boolean refrigeracion;

    public CargaSimple(String nombre, String descripcion, Double pesoCarga, Boolean refrigeracion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.pesoCarga = pesoCarga;
        this.refrigeracion = refrigeracion;
    }


    @Override
    public Double obtenerPeso() {
        if (this.refrigeracion == true){
            this.pesoCarga *= 1.1;
        }
        return this.pesoCarga;
    }

    @Override
    public String getNombre() {
        return this.nombre;
    }
}