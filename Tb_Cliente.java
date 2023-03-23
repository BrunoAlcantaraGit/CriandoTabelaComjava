import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Tb_Cliente {
private String nome;
private String cpf;
private int idProduto;

public  Tb_Cliente (String nome,String cpf,int idProduto){
    this.nome = nome;
    this.cpf = cpf;
    this.idProduto = idProduto;
}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
      this.cpf = cpf;


    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }
}
