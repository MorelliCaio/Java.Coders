import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

import javax.xml.transform.sax.SAXSource;

public class App {
    public static void main(String[] args) throws Exception {
        
        String nome = "Caio";

        LocalDate hoje = LocalDate.now();
        Locale Brasil = Locale.of("pt", "BR");
        String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, Brasil);
        String saudacao;
        LocalDateTime agora = LocalDateTime.now();
        if (agora.getHour() >= 0 && agora.getHour() < 11) {
            saudacao = "bom dia";
        } else if (agora.getHour() >= 12 && agora.getHour() < 18) {
            saudacao = "boa tarde";
        }else if (agora.getHour() >= 19 && agora.getHour() < 24){
            saudacao = "Boa noite";
        } else {
            saudacao = "Deviamos estar dormindo, não?";
        }

        System.out.printf("Ola, %s. Hoje é %s. %s.%n", nome, diaSemana, saudacao.toUpperCase());
    }

}
