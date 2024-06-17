package Animais;

public class Passaro extends Animal{
    
    static int numeroDePassaros;

    public Passaro(String nome, String cor, int altura, double peso, String estadoDeEspirito ) {
        super(nome, cor, altura, peso, estadoDeEspirito);
        numeroDePassaros++;
    }

    @Override
    public void soar() {
        // TODO Auto-generated method stub
        System.out.println("PIU PIU");
    }

}
