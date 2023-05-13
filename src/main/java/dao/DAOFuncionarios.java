/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Database;
import modelo.Funcionarios;
import modelo.Operaciones;

/**
 *
 * @author darv
 */
public class DAOFuncionarios implements Operaciones {

    Database db = new Database();
    Funcionarios fun = new Funcionarios();

    @Override
    public boolean insertar(Object obj) {
        fun = (Funcionarios) obj;
        Connection con;
        PreparedStatement pst;
        String sql = "insert into funcionario values(?,?,?,?,?,?,?,?,?,?)";

        try {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(
                    db.getUrl(),
                    db.getUss(),
                    db.getPwd()
            );

            pst = con.prepareCall(sql);
            pst.setInt(1, fun.getId_funcionario());
            pst.setString(2, fun.getTipo_identificacion());
            pst.setString(3, fun.getNumero_identificacion());
            pst.setString(4, fun.getNombres());
            pst.setString(5, fun.getApellidos());
            pst.setString(6, fun.getEstado_civil());
            pst.setString(7, fun.getSexo());
            pst.setString(8, fun.getDireccion());
            pst.setString(9, fun.getTelefono());
            pst.setString(10, fun.getFecha_nacimiento());

            int filas = pst.executeUpdate();
            if (filas > 0) {
                con.close();
                return true;
            } else {
                con.close();
                return false;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrio el siguiente error" + e.getMessage());
            return false;
        }
    }

    @Override
    public boolean eliminar(Object obj) {
        fun = (Funcionarios) obj;
        Connection con;
        PreparedStatement pst;
        String sql = "delete from funcionario where id_funcionario = ?";

        try {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(
                    db.getUrl(),
                    db.getUss(),
                    db.getPwd()
            );

            pst = con.prepareCall(sql);
            pst.setInt(1, fun.getId_funcionario());

            int filas = pst.executeUpdate();
            if (filas > 0) {
                con.close();
                return true;
            } else {
                con.close();
                return false;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrio el siguiente error" + e.getMessage());
            return false;
        }
    }

    @Override
    public boolean modificar(Object obj) {
        fun = (Funcionarios) obj;
        Connection con;
        PreparedStatement pst;
        String sql = "update funcionario set update funcionario set id_tipo_identificacion = ?, numero_identificacion = ?, nombres = ?, apellidos = ?, estado_civil = ?, sexo = ?, direccion = ?, telefono = ?, fecha_nacimiento = ? where id_funcionario = ?";

        try {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(
                    db.getUrl(),
                    db.getUss(),
                    db.getPwd()
            );

            pst = con.prepareStatement(sql);

            pst.setString(1, fun.getTipo_identificacion());
            pst.setString(2, fun.getNumero_identificacion());
            pst.setString(3, fun.getNombres());
            pst.setString(4, fun.getApellidos());
            pst.setString(5, fun.getEstado_civil());
            pst.setString(6, fun.getSexo());
            pst.setString(7, fun.getDireccion());
            pst.setString(8, fun.getTelefono());
            pst.setString(9, fun.getFecha_nacimiento());
            pst.setInt(10, fun.getId_funcionario());

            int filas = pst.executeUpdate();
            if (filas > 0) {
                con.close();
                return true;
            } else {
                con.close();
                return false;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrio el siguiente error" + e.getMessage());
            return false;
        }
    }

    @Override
    public ArrayList<Object[]> consultar() {
        ArrayList<Object[]> data = new ArrayList<>();
        Connection con;
        PreparedStatement pst;
        ResultSet rs;
        String sql = "select * from funcionario";

        try {
            Class.forName(db.getDriver());
            con = DriverManager.getConnection(
                    db.getUrl(),
                    db.getUss(),
                    db.getPwd()
            );
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();

            while (rs.next()) {
                Object[] fila = new Object[10];
                for (int i = 0; i < 9; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                data.add(fila);
            }
            con.close();

        } catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Ocurrio el siguiente error" + e.getMessage());
        } finally {
            return data;
        }
    }

}
