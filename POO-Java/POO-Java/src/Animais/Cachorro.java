package Animais;

public class Cachorro extends Animal{
        static int numeroDeCachorros;
        private int tamanhoDoRabo;

        public Cachorro(String nome, String cor, int altura, double peso, int tamanhoDoRabo ){
            super(nome, cor, altura, peso, cor);
            this.tamanhoDoRabo = tamanhoDoRabo;

            numeroDeCachorros++;
        }
        
        public static int getNumeroDeCachorros(){
            return numeroDeCachorros;
        }

        public static void setNumeroDeCachorros (int numeroDeCachorros){
            Cachorro.numeroDeCachorros = numeroDeCachorros;
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
        
        public void setEstadoDeEspirito(String estadoDeEspirito) {
            this.estadoDeEspirito = estadoDeEspirito;
        }

        @Override
        public void soar() {
            System.out.println("AU AU!!");
        }

}
