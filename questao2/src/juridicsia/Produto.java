package juridicsia;

public class Produto {
    //Variaveis
    private String nome;
    
    //Construtor
    Produto(String nome){
        this.nome = nome;
    }
    
    //Getters
    public String getNome(){
        return this.nome;
    }
    
    //Setters
    public void setNome(String nome){
        this.nome = nome;
    }
}