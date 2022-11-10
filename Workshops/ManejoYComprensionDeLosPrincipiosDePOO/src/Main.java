import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Mamifero> mamals = new ArrayList();
        ArrayList<Ave> birds = new ArrayList();
        ArrayList<Pez> fishes = new ArrayList();
        mamals.add(new Gato("Pale", "Persian"));
        mamals.add(new Perro("White", "Bulldog"));
        birds.add(new Gallo("BlackAndRed"));
        birds.add(new Pato("White"));
        fishes.add(new Tiburon("Blue"));
        fishes.add(new Bocachico("Silver"));

        for(Mamifero mamal : mamals){
            printGenerals(mamal);
            System.out.println("===================");
        }
        for(Ave bird : birds){
            printGenerals(bird);
            System.out.println("Vuela: "+bird.puedeVolar());
            System.out.println("===================");
        }
        for(Pez fish : fishes){
            printGenerals(fish);
            System.out.println("Vive en el mar: "+fish.viveEnElMar());
        }
    }

    public static void printGenerals(AnimalVertebrado animal){
        System.out.println("Especie : "+animal.getClass().getName());
        System.out.println("Forma de moverse : "+animal.hacerMovimiento());
        System.out.println("Sonido: "+animal.hacerSonido());
        System.out.println("Color: "+animal.getColor());
        System.out.println("Número de patas: "+animal.getNumeroDePatas());
        System.out.println("Dientes: "+animal.tieneDientes());
    }
}
