public abstract class Ave extends AnimalVertebrado{
    public Ave(String color) {
        super(color, 2);
    }

    @Override
    public boolean tienePatas(){
        return true;
    }

    @Override
    public boolean tieneDientes(){
        return false;
    }

    public abstract boolean puedeVolar();
}
