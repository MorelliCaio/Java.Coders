import Animais.Cachorro;

public class App {
    public static void main(String[] args) throws Exception {
        
        Cachorro cachorro1 = new Cachorro();
        Cachorro cachorro2 = new Cachorro("Puppy", "Marrom", 25, 5.5, 5);

        System.out.println(cachorro2.getAltura());
        System.out.println(cachorro2.getNome());
        
        cachorro1.latir();
        System.out.println("O cachorro pegou uma " + cachorro1.pegar());

        System.err.println("O cachorro esta " + cachorro1.interagir("carinho"));
        System.err.println("O cachorro esta " + cachorro1.interagir("nada"));
        System.err.println("O cachorro esta " + cachorro1.interagir("vai dormir!"));
    }
}
