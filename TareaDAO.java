import java.sql.*;
import java.util.*;

public class TareaDAO {

    public void insertar(String titulo) {
        try (Connection conn = DB.connect()) {
            String sql = "INSERT INTO tareas (titulo) VALUES (?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, titulo);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Tarea> listar() {
        List<Tarea> tareas = new ArrayList<>();
        try (Connection conn = DB.connect()) {
            String sql = "SELECT * FROM tareas";
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                tareas.add(new Tarea(rs.getInt("id"), rs.getString("titulo")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return tareas;
    }

    public void actualizar(int id, String nuevoTitulo) {
        try (Connection conn = DB.connect()) {
            String sql = "UPDATE tareas SET titulo = ? WHERE id = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, nuevoTitulo);
            stmt.setInt(2, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void eliminar(int id) {
        try (Connection conn = DB.connect()) {
            String sql = "DELETE FROM tareas WHERE id = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
