// PROGRAMA DESTINADO A CRIAÇAO DE SENHAS AUTOMATICAS;
// CRIADO: 17/08/23
// MODIFICAÇAO: 17/08/23
// CRIADOR MIKE DE OLIVEIRA SILVA;

import java.util.Scanner;
import java.util.Calendar;
import java.util.Random;

public class Main{
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        while(true){
            
            long digitos = scan.nextInt();
            System.out.println((parGeneration(digitos)));
            
        }
        
    }
    
    public static String parGeneration(long digitos){
        
        Calendar calendario = Calendar.getInstance();
        Random random = new Random();
        
        String c1 = "A1a@B2b%C3c$D4d#E5e!F6f@G7g%H8h$I9i#J0j!Kk@L1l%M2m$N3n#O4o!P5p@Q6q%R7r$S8s#T9t!Uu@V1v%W2w$X3x#Y4y!Z5z@";
        String m = calendario.get(Calendar.MINUTE) + "";    // DEFINIÇAO DE VARIAVEIS E CONTROLE DO TEMPO DO DISPOSITIVO PARA GERAR SENHA;
        String senha = "";
        int pos = 0;
        int minuto = m.charAt((m.length()-1)) - 'O';
        int randomico;

        if((m.charAt(0) - 'O') <= 0){
           randomico = random.nextInt(10);
        }else{
            randomico = random.nextInt(m.charAt(0) - 'O');
        }
        
        while(senha.length() != digitos){
            
            if(randomico*minuto+pos > c1.length()){
                senha += c1.charAt(randomico*minuto+pos);
            }else{
                senha += c1.charAt(random.nextInt(101));
                pos = 0;
            }
                pos += random.nextInt(10);
                    
        }
        
        return senha;
        
    }
    
}