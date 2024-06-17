import Animais.Cachorro;
import Animais.Gato;
import Animais.Passaro;
import Lojas.Petshop;


public class App {
    public static void main(String[] args) throws Exception {
        
        Cachorro cachorro1 = new Cachorro("Puppy", "Marrom", 25, 5.5, 5);
        
        Gato gato1 = new Gato("Felix", "cinza", 25, 4.0, "");

        Passaro passaro = new Passaro("Frajola", "azul", 1, 0.3, "");

        Petshop petshop = new Petshop();

        petshop.darBanho(passaro);
        System.out.println(passaro.getEstadoDeEspirito());

        petshop.deixarNoHotel(gato1);
        System.out.println(gato1.getEstadoDeEspirito());

        petshop.tosar(cachorro1);
        System.out.println(cachorro1.getEstadoDeEspirito());

        cachorro1.soar();
        gato1.soar();
        passaro.soar();
    
    }
}
