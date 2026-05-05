
/**
 *
 * @author ortiz
 */
import java.util.Scanner;

public class Aplic {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int id, opcao, qtdeDias;
        String titulo;
        double valMultaDiaria, valPagar;
        
        System.out.println("Digite o código do Livro: ");
        id = entrada.nextInt();
        entrada.nextLine();
        
        System.out.println("Digite o Título do Livro: ");
        titulo = entrada.nextLine();
        
        
        //Instanciação do objeto Livro.
        //Chamada do método Construto.
        Livro objLivro = new Livro(id, titulo);
        System.out.println("Digite a Multa diária do Livro: ");
        valMultaDiaria = entrada.nextDouble();
        objLivro.setValMultaDiaria(valMultaDiaria);
        
        
        do {
            System.out.println("\n\n1 - Consultar Livro.");
            System.out.println("2 - Emprestar Livro.");
            System.out.println("3 - Devolver Livro.");
            System.out.println("4 - SAIR.\n");
            System.out.println("\n\tOpção: ");
            opcao = entrada.nextInt();
            
            switch(opcao){
                
                case 1:
                    System.out.println("\nIdentificação: " + objLivro.getIdentificacao());
                    System.out.println("Título: " + objLivro.getTitulo());
                        if(objLivro.getSituacao()){
                            System.out.println("Situação: Emprestado!");
                        }else{
                            System.out.println("Situação: Disponivel");
                        } 
                        break;
                        
                case 2:
                    if(objLivro.getSituacao()){
                        System.out.println("\nO Livro está Emprestado!");
                    } else {
                        objLivro.emprestar();
                        System.out.println("\nOperação de Empréstimo realizado com sucesso!");
                    }
                    break;
                    
                    
                case 3:
                    if(objLivro.getSituacao()){
                        System.out.println("\nDigite a Quantidade de Dias em que ficou Emprestado: ");
                        qtdeDias = entrada.nextInt();
                        valPagar = objLivro.devolver(qtdeDias);
                        System.out.println("\nOperação de Devolução realizada com Sucesso!");
                        if(valPagar > 0){
                            System.out.println("\nValor da multa é: " + valPagar);
                        }    
                    } else {
                            System.out.println("\nO Livro já está Disponivel");
                        }
                         break; 
                    }     
           }while (opcao != 4);            
    }                    
}              
    
    

