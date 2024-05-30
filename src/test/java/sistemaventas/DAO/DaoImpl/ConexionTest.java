/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package sistemaventas.DAO.DaoImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author lfern
 */
public class ConexionTest {
    @Test
    void testgetConectar(){
        String dbUrl = "jdbc:mysql://localhost:3306/dbsistventas";
        String dbUser = "root";
        String dbPassword = "";
        try {
            //establecer la conexión
            Connection connection = DriverManager.getConnection(dbUrl, dbUser, dbPassword);
            assertNotNull(connection, "La conexión no debe ser nula");
            connection.close(); // Cierra la conexión
        } catch (SQLException e) {
            fail("Error al conectar a la base de datos: " + e.getMessage());
        }
    }
}
