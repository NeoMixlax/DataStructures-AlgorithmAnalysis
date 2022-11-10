public abstract class AnimalVertebrado {
    private String color;
    private int numeroDePatas;

    public abstract String hacerMovimiento();
    public abstract String hacerSonido();
    public abstract boolean tienePatas();
    public abstract boolean tieneDientes();

    public AnimalVertebrado(String color, int numeroDePatas) {
        this.color = color;
        this.numeroDePatas = numeroDePatas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumeroDePatas() {
        return numeroDePatas;
    }

    public void setNumeroDePatas(int numeroDePatas) {
        this.numeroDePatas = numeroDePatas;
    }
}
