import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CriandoTabela {

public void tabelaGeral () throws SQLException{
    final String sql = "create table tb_imagens(" +
            "id_imagens serial primary key," +
            "id_produto int not null," +
            "foreign key (id_produto) references tb_produto (id_produto))";
    Connection connection = ConectandoBanco.getConnection();
    Statement statement = connection.createStatement();
    statement.execute(sql);
}
}




