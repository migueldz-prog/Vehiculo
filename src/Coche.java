public class Coche extends Vehiculo{
    private int numeroPuertas;

    public Coche(String marca, String modelo, int anio, int numeroPuertas) {
        super(marca, modelo, anio);
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "numeroPuertas=" + numeroPuertas +
                '}';
    }
    public void mostrarinformacion(){
        System.out.println(marca+ " " + modelo + " " + anio + " " + numeroPuertas + " puertas");
    }

}