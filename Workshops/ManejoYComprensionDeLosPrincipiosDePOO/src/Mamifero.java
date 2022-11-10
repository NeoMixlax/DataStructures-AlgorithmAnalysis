public abstract class Mamifero extends AnimalVertebrado{
    private String raza;

    public Mamifero(String color, String raza) {
        super(color, 4);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }


    @Override
    public boolean tienePatas(){
        return true;
    }

    @Override
    public boolean tieneDientes(){
        return true;
    }
}
