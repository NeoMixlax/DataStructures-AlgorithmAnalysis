public class Gallo extends Ave {
    public Gallo(String color) {
        super(color);
    }

    @Override
    public String hacerMovimiento(){
        return "Picotear";
    }

    @Override
    public String hacerSonido(){
        return "Kikiriki";
    }

    @Override
    public boolean puedeVolar(){
        return false;
    }
}
