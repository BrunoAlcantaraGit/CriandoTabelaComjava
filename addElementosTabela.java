import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class addElementosTabela {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        Connection connection = ConectandoBanco.getConnection();
        System.out.println("Informe o nome do Vendedo,cpf,idproduto e idvendedor");
        Tb_Vendedor tbVendedor = new Tb_Vendedor(scanner.nextLine(),scanner.nextLine(),scanner.nextInt(), scanner.nextInt());
        scanner.nextLine();

        String inserirValores = "insert into " +
                "tb_vendedor" +
                "(nome,cpf,id_produto,id_cliente)" +
                "values" +
                "(?,?,?,?)";
        PreparedStatement statement = connection.prepareStatement(inserirValores);
        statement.setString(1,tbVendedor.getNome());
        statement.setString(2,tbVendedor.getCpf());
        statement.setInt(3,tbVendedor.getIdProduto());
        statement.setInt(4,tbVendedor.getIdCliente());
        statement.execute();
    }
}
//porque não é possível adicionar uma quantidade de vendedor a cima do valor de id da tabela relacionada
//verificar como puxar com o inner join mais de uma tabela relacionada