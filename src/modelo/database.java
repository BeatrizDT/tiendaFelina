/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import java.sql.*;



/**
 *
 * @author Ardilla Jedi
 */
public class database {
    /* DATOS PARA LA CONEXION */
    private String db = "TIENDAFELINA";
    private String user = "root";
    private String password = "1234";
    private String url = "jdbc:mysql://localhost/"+db;
    private Connection conn = null;

     /** Constructor de clase */
    public database(){
        try{
            //obtenemos el driver de para mysql
            Class.forName("com.mysql.jdbc.Driver");
            //obtenemos la conexión
            conn = DriverManager.getConnection(url,user,password);
            if (conn!=null){
                System.out.println("OK base de datos "+db+" listo");
            }
            }catch(SQLException | ClassNotFoundException e){
                System.out.println(e);
            }
        }

    public Connection getConexion()
       {
        return this.conn;
    }
    //___________________________________________________________________________________
    public Object [][] select(String table, String fields, String where){
        int registros = 0;   
        String colname[] = fields.split(",");

        //Consultas SQL
        String q ="SELECT " + fields + " FROM " + table;
        String q2 = "SELECT count(*) as total FROM " + table;
        if(where!=null)
        {
            q+= " WHERE " + where;
            q2+= " WHERE " + where;
        }
        //obtenemos la cantidad de registros existentes en la tabla
        try{
            PreparedStatement pstm = conn.prepareStatement(q2);
            ResultSet res = pstm.executeQuery();
            res.next();
            registros = res.getInt("total");
            res.close();
        }catch(SQLException e){
            System.out.println(e);
        }
        //se crea una matriz con tantas filas y columnas que necesite
        Object[][] data = new String[registros][fields.split(",").length];
        //realizamos la consulta sql y llenamos los datos en la matriz "Object"
        try{
            PreparedStatement pstm = conn.prepareStatement(q);
            ResultSet res = pstm.executeQuery();
            int i = 0;
            while(res.next()){
                for(int j=0; j<=fields.split(",").length-1;j++){
                    data[i][j] = res.getString( colname[j].trim() );
                }
                i++;
            }
            res.close();
        }catch(SQLException e){
            System.out.println(e);
        }
        return data;
    }
    
}
