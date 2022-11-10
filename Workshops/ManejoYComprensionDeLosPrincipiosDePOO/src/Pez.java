public abstract class Pez extends AnimalVertebrado{
    public Pez(String color) {
        super(color, 0);
    }

    public abstract boolean viveEnElMar();

    @Override
    public boolean tienePatas(){
        return false;
    }

    @Override
    public boolean tieneDientes(){
        return true;
    }

    @Override
    public String hacerMovimiento(){
        return "Nadar";
    }

    @Override
    public String hacerSonido(){
        return "Glu glu";
    }
}
