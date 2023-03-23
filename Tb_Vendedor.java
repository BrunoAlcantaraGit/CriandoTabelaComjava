public class Tb_Vendedor {
    private  String nome;
    private  String cpf;
    private int idProduto;
    private int idCliente;
    public Tb_Vendedor (String nome,String cpf,int idProduto, int idCliente){
        this.nome = nome;
        this.cpf = cpf;
        this.idProduto = idProduto;
        this.idCliente = idCliente;
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

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
}
