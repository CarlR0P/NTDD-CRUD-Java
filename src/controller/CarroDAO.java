package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Carro;
import utils.Conexion;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CarroDAO {
    
    private Connection conecta = null;
    
    public Carro buscarCarro (int idCarro) {
        
        Carro carro = null;
        try {
            if (conecta == null) {
                conecta = Conexion.getConnection();
            }
            String sql = "SELECT * FROM carros WHERE id = ?;";
            PreparedStatement statement = conecta.prepareStatement(sql);
            statement.setInt(1, idCarro);

            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                carro = new Carro(
                    resultSet.getString("marca"),
                    resultSet.getString("modelo"),
                    resultSet.getInt("anio"),
                    resultSet.getString("color"),
                    resultSet.getString("tipo_combustible"),
                    resultSet.getString("tipo_carroceria"),
                    resultSet.getLong("precio")
                );
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : " + ex.getErrorCode()
                + "\nError :" + ex.getMessage());
        }
        return carro;
          
    }
    
    public void editarCarro(Carro carro, int idCarro) {
        
        try {
            if (conecta == null) {
                conecta = Conexion.getConnection();
            }
            
            String sql = "UPDATE carros SET marca = ?, modelo = ?, anio = ?, color = ?, tipo_combustible = ?, tipo_carroceria = ?, precio = ? WHERE id = ?;";
            PreparedStatement statement = conecta.prepareStatement(sql);
            statement.setString(1, carro.getMarca());
            statement.setString(2, carro.getModelo());
            statement.setInt(3, carro.getAnio());
            statement.setString(4, carro.getColor());
            statement.setString(5, carro.getTipoCombustible());
            statement.setString(6, carro.getTipoCarroceria());
            statement.setDouble(7, carro.getPrecio());
            statement.setInt(8, idCarro);

            int rowsUpdated = statement.executeUpdate();
            
            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(null, "¡El registro fue actualizado exitosamente!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : " + ex.getErrorCode()
                + "\nError :" + ex.getMessage());
        }       
    }   
    
    public void nuevoCarro(Carro carro) {
        try {
            if (conecta == null) {
                conecta = Conexion.getConnection();
            }
            String sql = "INSERT INTO carros(marca, modelo, anio, color, tipo_combustible, tipo_carroceria, precio) VALUES (?, ?, ?, ?, ?, ?, ?);";
            PreparedStatement statement = conecta.prepareStatement(sql);
            
            statement.setString(1, carro.getMarca());
            statement.setString(2, carro.getModelo());
            statement.setInt(3, carro.getAnio());
            statement.setString(4, carro.getColor());
            statement.setString(5, carro.getTipoCombustible());
            statement.setString(6, carro.getTipoCarroceria());
            statement.setDouble(7, carro.getPrecio());

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(null, "¡El registro fue agregado exitosamente!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : " + ex.getErrorCode()
                + "\nError :" + ex.getMessage());
        }
    }
    
     public void eliminarCarro (int idCarro) {
        
            try {
            if (conecta == null) {
                conecta = Conexion.getConnection();
            }
            String sql = "DELETE FROM carros WHERE id = ?;";
            PreparedStatement statement = conecta.prepareStatement(sql);
            statement.setInt(1, idCarro);

            int rowsDeleted = statement.executeUpdate();
            if (rowsDeleted > 0) {
                JOptionPane.showMessageDialog(null, "¡El registro fue eliminado exitosamente!");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró un carro con el ID proporcionado.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : " + ex.getErrorCode()
                + "\nError :" + ex.getMessage());
        }
        
    }

    public List<Carro> buscarPorCategoria(String categoria, String valor) {
 
        List<Carro> carros = new ArrayList<>();

        try {
            if (conecta == null) {
                conecta = Conexion.getConnection();
            }

            String sql = "";

            switch (categoria) {
                case "Id":
                    sql = "SELECT * FROM carros WHERE id = ?";
                    break;
                case "Marca":
                    sql = "SELECT * FROM carros WHERE marca LIKE ?";
                    valor = "%" + valor + "%";
                    break;
                case "Modelo":
                    sql = "SELECT * FROM carros WHERE modelo LIKE ?";
                    valor = "%" + valor + "%";
                    break;
                case "Color":
                    sql = "SELECT * FROM carros WHERE color LIKE ?";
                    valor = "%" + valor + "%";
                    break;
                case "Precio":
                    sql = "SELECT * FROM carros WHERE precio = ?";
                    break;   
                default:
                    throw new IllegalArgumentException("Criterio de búsqueda no válido");
            }

            PreparedStatement statement = conecta.prepareStatement(sql);

            if (categoria.equals("Id") || categoria.equals("Precio")) {
                statement.setLong(1, Long.parseLong(valor)); // Convertir a número
            } else {
                statement.setString(1, valor);
            }

            ResultSet resultado = statement.executeQuery();

            // Recorrer los resultados y agregarlos a la lista
            while (resultado.next()) {
                Carro carro = new Carro(
                    resultado.getInt("id"),
                    resultado.getString("marca"),
                    resultado.getString("modelo"),
                    resultado.getInt("anio"),
                    resultado.getString("color"),
                    resultado.getString("tipo_combustible"),
                    resultado.getString("tipo_carroceria"),
                    resultado.getLong("precio")
                );
                carros.add(carro);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : " + ex.getErrorCode()
                + "\nError :" + ex.getMessage());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "El valor ingresado no es un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
        }

    return carros;
        
    }

}
