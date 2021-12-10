package juridicsia;

import java.time.LocalDate;

public class Investidor {
    //Variaveis
    private String nome;
    private String cpf;
    private LocalDate dataNasc;
    private float valorInvestimento;
    private String email;
    private Compra compra[];
    
    //Construtor
    Investidor(String nome, String cpf, LocalDate dataNasc, float valorInvestimento, String email){
        this.nome = nome;
        this.cpf = cpf;
        this.dataNasc = dataNasc;
        this.valorInvestimento = valorInvestimento;
        this.email = email;
    }
    
    //Métodos
    public void inserir(){
        //Função 1
    }
    
    public void alterar(){
        //Função 2
    }
    
    public void excluir(){
        //Função 3
    }
    
    //Getters
    public String getNome(){
        return this.nome;
    }
    
    public String getCpf(){
        return this.cpf;
    }
    
    public LocalDate getDataNasc(){
        return this.dataNasc;
    }
    
    public float getValorInvestimento(){
        return this.valorInvestimento;
    }
    
    public String getEmail(){
        return this.email;
    }
    
    public Compra getCompra(int indice){
        return this.compra[indice];
    }
    
    //Setters
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    
    public void setDataNasc(LocalDate dataNasc){
        this.dataNasc = dataNasc;
    }
    
    public void setValorInvestimento(float valorInvestimento){
        this.valorInvestimento = valorInvestimento;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public void setCompra(int indice, Compra compra){
        this.compra[indice] = compra;
    }
}