public class Test {
    public static void main(String[] args) {

        CargableFactory cargas = CargableFactory.getInstance();
        Cargable carga1 = cargas.crearCargable("TV");
        Cargable carga2 = cargas.crearCargable("Medicamentos");
        Cargable carga3 = cargas.crearCargable("CargaCompleta");

        Barco barcoCargado = new Barco();
        barcoCargado.agregarCarga(carga1);
        barcoCargado.agregarCarga(carga2);
        barcoCargado.agregarCarga(carga3);

        barcoCargado.generarReporte();

    }

    }

