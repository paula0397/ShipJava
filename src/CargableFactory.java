public class CargableFactory {

    private static CargableFactory instancia;

    private CargableFactory(){

    }

    public static CargableFactory getInstance(){
        if(instancia == null){
            instancia = new CargableFactory();
        }
        return instancia;
    }

    public Cargable crearCargable(String s){
            switch (s) {
                case "cargaSimple1":
                    return new CargaSimple("TV", "TV 32' LCD", 3.0, false);
                case "cargaSimple2":
                    return new CargaSimple("Medicamento", "Caja de medicamentos", 2.0, true);
                case "contenedor1":
                    CargaSimple tv = new CargaSimple("TV", "TV 32' LCD", 3.0, false);
                    CargaSimple med = new CargaSimple("Medicamento", "Caja de medicamentos", 2.0, true);
                    CompositeContenedor CargaSYC = new CompositeContenedor("Contenedor", "Tv y medicamentos", 100.0);
                    CargaSYC.agregarCarga(tv);
                    CargaSYC.agregarCarga(med);

                    return CargaSYC;
                default:
                    return null;
    }

    }
}
