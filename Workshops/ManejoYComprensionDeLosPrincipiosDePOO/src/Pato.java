public class Pato extends Ave{
    public Pato(String color) {
        super(color);
    }

    @Override
    public String hacerMovimiento(){
        return "Nadar";
    }

    @Override
    public String hacerSonido(){
        return "Kikiriki";
    }

    @Override
    public boolean puedeVolar(){
        return true;
    }
}
