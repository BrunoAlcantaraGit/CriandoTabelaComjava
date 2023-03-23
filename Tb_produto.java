public class Tb_produto {
String desProduto = "";
double valor  = 0;

public Tb_produto(String desProduto, double valor){
    this.desProduto = desProduto;
    this.valor = valor;
}
    public String getDesProduto() {
        return desProduto;
    }

    public void setDesProduto(String desProduto) {
        this.desProduto = desProduto;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
