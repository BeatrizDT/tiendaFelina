/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyVetoException;
import java.sql.SQLException;
import javax.swing.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.modelo;
import vista.BuscarProducto;
import vista.login;
import vista.principal;

/**
 *
 * @author Ardilla Jedi
 */
public class controlador implements ActionListener{

    private login view;
    private modelo model;    
    //formularios hijos
    principal frmprincipal = new principal();
    BuscarProducto frmBuscarProducto = new BuscarProducto();
    
    
    
    public controlador(login vista , modelo modelo){
       this.view = vista;
       this.model = modelo;
       iniciar();
   }
   
    private void iniciar(){
        view.setTitle( "Tienda Felina" );
        view.setLocationRelativeTo(null);//centrado en pantalla
        //se añade las acciones a los controles del formulario padre
        this.view.btEntrar.setActionCommand("Entrar");
        this.view.btAdmin.setActionCommand("Admin");
        //Acciones para los controladores de principal
        frmprincipal.jmArticulo.setActionCommand("Articulo");
        frmprincipal.jmFactura.setActionCommand("Factura");
        //Acciones para los controladores de BuscarProducto
        frmBuscarProducto.btnBuscarPro.setActionCommand("Buscar");
        //Se pone a escuchar las acciones del usuario
        view.btEntrar.addActionListener(this);
        view.btAdmin.addActionListener(this);
        //escucha principal
        frmprincipal.jmArticulo.addActionListener(this);
        frmprincipal.jmFactura.addActionListener(this);
        //escucha buscar articulo
        frmBuscarProducto.btnBuscarPro.addActionListener(this);
        
        

   }
    public void go()
    {
        this.view.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();
        if(comando.equals("Entrar"))
        {            
            if( this.model.ingresar(this.view.txtUsuario.getText(), this.view.txtContraseña.getText()) )
            {//si los datos de acceso son correctos
                this.view.setVisible(false);
                //saca ventanas segun corresponda
                frmprincipal.setBounds(500,200,500,400);
                frmprincipal.setVisible(true);
                frmprincipal.jMenu3.setVisible(false);
                JOptionPane.showMessageDialog(this.view,"Bienvenido");
                
            }
            else
                JOptionPane.showMessageDialog(this.view,"Error: Los datos son incorrectos");
        }
        if(comando.equals("Admin"))
        {            
            if( this.model.admin(this.view.txtUsuario.getText(), this.view.txtContraseña.getText()) )
            {//si los datos de acceso son correctos
                this.view.setVisible(false);
                frmprincipal.setBounds(500,200,500,400);
                frmprincipal.setVisible(true);
                frmprincipal.setVisible(true);
                JOptionPane.showMessageDialog(this.view,"Correcto");
                
                }
            else
                JOptionPane.showMessageDialog(this.view,"Error: Los datos son incorrectos o no tienes permisos de administrado");
        }
        if(comando.equals("Articulo"))
        {
            frmBuscarProducto.setVisible(true);
            frmBuscarProducto.setLocationRelativeTo(null);
        }
        if(comando.equals("Buscar"))
        {
            String nombre = frmBuscarProducto.txtNombreBus.getText();
            String codigo = frmBuscarProducto.txtProductoBus.getText();
            //this.model.getArticulosTienda(codigo, nombre);            
            //mandamos datos a la tabla
            Object[][] datos = this.model.getArticulosTienda(codigo, nombre);
                if(datos!=null){
                int limite = (datos.length>=10)?10 : datos.length;
                
                    
                }      
            /*res.next();
            registros = res.getInt("total");
            res.close();*/
        }
            
    }
    
    


   
    
    
}
