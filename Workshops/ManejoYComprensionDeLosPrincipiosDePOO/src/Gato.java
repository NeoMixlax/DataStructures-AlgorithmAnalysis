public class Gato extends Mamifero{

    public Gato(String color, String raza) {
        super(color, raza);
    }

    @Override
    public String hacerMovimiento(){
        return "Trepar";
    }

    @Override
    public String hacerSonido(){
        return "Miau miau";
    }
}
