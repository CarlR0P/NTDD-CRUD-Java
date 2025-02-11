package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Carro;
import utils.Conexion;

public class CarroDAO {
    
    private Connection conecta = null;

    public void insertLibro(Carro carro) {
        try {
            if (conecta == null) {
                conecta = Conexion.getConnection();
            }

            String sql = "INSERT INTO carros(marca, modelo, anio, color, tipo_combustible, tipo_carroceria, precio) VALUES (?, ?, ?, ?, ?, ?, ?);";
            PreparedStatement statement = conecta.prepareStatement(sql);
            statement.setString(1, carro.getMarca());
            statement.setString(2, carro.getModelo());
            statement.setInt(3, carro.getAnio());
            statement.setString(5, carro.getColor());
            statement.setString(5, carro.getTipoCombustible());
            statement.setString(6, carro.getTipoCarroceria());
            statement.setDouble(4, carro.getPrecio());

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(null, "¡El registro fue agregado exitosamente!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : " + ex.getErrorCode()
                    + "\nError :" + ex.getMessage());
        }
    }

}
