package juridicsia;

public class Corretora {
    //Variaveis
    private String razaoSocial;
    private String cnpj;
    
    //Construtor
    Corretora(String razaoSocial, String cnpj){
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
    }
    
    //Getters
    public String getRazaoSocial(){
        return this.razaoSocial;
    }
    
    public String getCnpj(){
        return this.cnpj;
    }
    
    //Setters
    public void setRazaoSocial(String razaoSocial){
        this.razaoSocial = razaoSocial;
    }
    
    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }
}