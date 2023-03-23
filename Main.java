import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args)  throws SQLException {
        Connection connection = ConectandoBanco.getConnection();
        CriandoTabela criandoTabela = new CriandoTabela();
        criandoTabela.tabelaGeral();
    }
}