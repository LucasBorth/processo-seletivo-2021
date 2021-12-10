package juridicsia;

import java.time.LocalDateTime;

public class Compra {
    //Variaveis
    private LocalDateTime dataHora;
    private float precoUnitario;
    private int quantidade;
    private float valorTotal;
    private Produto produto;
    private Corretora corretora;
    
    //Construtor
    Compra(LocalDateTime dataHora, float precoUnitario, int quantidade, float valorTotal, String nome, String razaoSocial, String cnpj){
        this.dataHora = dataHora;
        this.precoUnitario = precoUnitario;
        this.quantidade = quantidade;
        this.valorTotal = valorTotal;
        this.produto = new Produto(nome);
        this.corretora = new Corretora(razaoSocial, cnpj);
    }
    
    //Métodos
    public void Comprar(){
        
    }
    
    //Getters
    public LocalDateTime getDataHora(){
        return this.dataHora;
    }
    
    public float getPrecoUnitario(){
        return this.precoUnitario;
    }
    
    public int getQuantidade(){
        return this.quantidade;
    }
    
    public float getValorTotal(){
        return this.valorTotal;
    }
    
    public Produto getProduto(){
        return this.produto;
    }
    
    public Corretora getCorretora(){
        return this.corretora;
    }
    
    //Setters
    public void setDataHora(LocalDateTime dataHora){
        this.dataHora = dataHora;
    }
    
    public void set(float precoUnitario){
        this.precoUnitario = precoUnitario;
    }
    
    public void set(int quantidade){
        this.quantidade = quantidade;
    }
    
    public void setValorTotal(float valorTotal){
        this.valorTotal = valorTotal;
    }
    
    public void setProduto(Produto produto){
        this.produto = produto;
    }
    
    public void setCorretora(Corretora corretora){
        this.corretora = corretora;
    }
}