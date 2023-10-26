import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Lista numeros= new Lista();
        int op=0;
        Scanner tc = new Scanner(System.in);
        do{
            System.out.println("Digite a opção");
            System.out.println("1. para add");
            System.out.println("2. para add fim");
            System.out.println("3. para exibir a lista");
            System.out.println("4. para exibir o primeiro elemento da lista");
            System.out.println("5. para exibir o ultimo elemento da lista");
            System.out.println("6. para remover no fim");
            System.out.println("7. para remover no inicio");

            //TDEEEEEEEEEE
            System.out.println("8. para remover uma posição");
            System.out.println("9. para remover um valor");
            System.out.println("10. para pesquisar um valor");


            System.out.println("99. para  sair");
            op=tc.nextInt();
            switch (op){
                case 1:{
                    System.out.println("Digite o valor");
                    int value= tc.nextInt();
                    Elemento e= new Elemento(value);
                    numeros.addInicio(e);
                    break;
                }
                case 2:{
                    System.out.println("Digite o valor");
                    int value= tc.nextInt();
                    Elemento e= new Elemento(value);
                    numeros.addFim(e);


                    break;
                }
                case 3:{
                    if (!numeros.exibir()){
                        System.out.println("Lista Vazia");
                    }

                    break;
                }
                case 4:{
                    if (!numeros.getInicio()){
                        System.out.println("Lista Vazia");
                    }
                    break;
                }
                case 5:{
                    if (!numeros.getFim()){
                        System.out.println("Lista Vazia");
                    }
                    break;
                }
                case 6:{
                    if(numeros.delFim()){
                        System.out.println("Elemento removido");
                    }
                    break;
                }
                case 7:{
                    if(numeros.delInicio()){
                        System.out.println("Elemento removido");
                    }
                    break;
                }
                case 8:{
                    System.out.println("Remover a posicao 3");
                    System.out.println(numeros.removerPosicao(3));
                    break;
                }

                case 9:{
                    System.out.println("Remover o valor 10");
                    System.out.println(numeros.removerValor(10));
                    break;
                }
                case 10:{
                    int posicao=numeros.find(8);
                    if(posicao!=-1){
                        System.out.println("O Elemento está na posição "+posicao);

                    }
                    break;
                }

            }

        }while (op!=99);




    }
}