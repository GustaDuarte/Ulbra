/*Crie uma classe chamada Senha que contenha um método chamado
gerar que retorna uma senha contendo oito caracteres numéricos. Faça
também outra classe para testar o método.*/
import java.util.Random;
public class senha {
    public static String gerar(){
        Random random = new Random();
        String pass = "";
        int num = 0;
        for (int i=0; i<8; i++){
            num = random.nextInt(9);
            pass += num;
        }
        return pass;
    }
}
