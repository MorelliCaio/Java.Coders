package Animais;

public class Cachorro {

        private String nome;
        private String cor;
        private int altura;
        private double peso;
        private int tamanhoDoRabo;
        private String estadoDeEspirito;

        public Cachorro(){

        }
        public Cachorro(String nome, String cor, int altura, double peso, int tamanhoDoRabo ){
            this.nome = nome;
            this.cor = cor;
            this.altura = altura;
            this.peso = peso;
            this.tamanhoDoRabo = tamanhoDoRabo;
        }

        public String getNome(){
            return this.nome;
        }
        public void setNome(String nome){
            this.nome = nome;
        }

        public String getCor(){
            return this.cor;
        }
        public void setCor(String cor){
            this.cor = cor;
        }

        public int getAltura(){
            return this.altura;
        }
        public void setAltura(int altura){
            this.altura = altura;
        }

        public double getPeso(){
            return this.peso;
        }
        public void setPeso(double peso){
            this.peso = peso;
        }

        public int getTamanhoDoRabo(){
            return this.tamanhoDoRabo;
        }
        public void setTamanhoDoRabo(int tamanhoDoRabo){
            this.tamanhoDoRabo = tamanhoDoRabo;
        }


        public void comer(){}

        public void latir(){
            System.out.println("AU AU");
        }
        public String pegar(){
            return "Bolinha";
        }

        public String getEstadoDeEspirito(){
            return this.estadoDeEspirito;
        }

        public String interagir(String acao){
           
           switch (acao) {
            case "carinho": 
                this.estadoDeEspirito = "Feliz";
                break;
            case "pisar na patinha": 
                this.estadoDeEspirito = "Bravo";
                break;
            case "vai dormir!": 
                this.estadoDeEspirito = "Triste";
                break;
            default: 
                this.estadoDeEspirito = "neutro";
                break;     
            }

        return this.estadoDeEspirito;
        }

}
