
/**
 *
 * @author ortiz
 */
public class Livro {
    private int identificacao;                
    private String titulo;
    private boolean situacao;
    private double valMultaDiaria;

    public Livro (int identificacao, String titulo){
        this.identificacao = identificacao;
        this.titulo = titulo;
        this.situacao = false; //false = Disponivel | True = emprestado.
    }
    
    public void setValMultaDiaria(double multa){
        this.valMultaDiaria = multa;
    }
    
    public int getIdentificacao(){
        return(identificacao);
    }    
    public String getTitulo(){
        return(titulo);
    }    
    public boolean getSituacao(){
        return(situacao);
    }
    
    //Emprestar Livro
    public void emprestar(){
        situacao = true; //Emprestado
    }
    
    //Devolver Livro
    public double devolver(int diasAtraso){
        situacao = false; //Disponivel
        return diasAtraso * valMultaDiaria;
        }
    }
    

