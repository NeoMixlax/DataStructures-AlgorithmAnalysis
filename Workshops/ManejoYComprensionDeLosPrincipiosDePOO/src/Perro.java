public class Perro extends Mamifero{
    public Perro(String color, String raza) {
        super(color, raza);
    }

    @Override
    public String hacerMovimiento(){
        return "Correr";
    }

    @Override
    public String hacerSonido(){
        return "Guau guau";
    }
}
