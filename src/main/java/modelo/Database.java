/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author darv
 */
public class Database {

    String url;
    String uss;
    String pwd;
    String driver;

    public Database() {
        this.url = "jdbc:mysql://localhost:3306/funcionarios_iudigital?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=America/Bogota";
        this.uss = "root";
        this.pwd = "bdFront26*";
        this.driver = "com.mysql.cj.jdbc.Driver";
    }

    public String getUrl() {
        return url;
    }

    public String getUss() {
        return uss;
    }

    public String getPwd() {
        return pwd;
    }

    public String getDriver() {
        return driver;
    }

}
