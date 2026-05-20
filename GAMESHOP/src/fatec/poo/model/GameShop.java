package fatec.poo.model;

/**
 *
 * @author ortiz
 */
public class GameShop {
    private int codigo;
    private String nome;
    private int idade;
    private boolean tipoGamer;
    private int saldo;
    
    public GameShop(int codigo, String nome, boolean tipoGamer, int saldo){
        this.codigo = codigo;
        this.nome = nome; 
        this.tipoGamer = tipoGamer;
        this.saldo = saldo;
               
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public boolean isTipoGamer() {
        return tipoGamer;
    }

    public int getSaldo() {
        return saldo;
    }
    
    public boolean jogarHoras(int horas){
    if(horas <= saldo){
        saldo -= horas;
        return true;
    }
    return false;
}
    public void comprarHoras(int horas){
        saldo += horas;
        
    // gamer frequente ganha bônus
    if (tipoGamer) {
        int bonus = horas / 3;
        saldo += bonus;
        }
    }
    
    public void brinde() {
    saldo *= 2;
}
}
