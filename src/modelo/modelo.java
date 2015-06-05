package modelo;
/** @author Ardilla Jedi*/

public class modelo extends database{
    
    public usuario user = new usuario();

    public modelo(){}
    
    //METODOS PARA CONSULTAR EN LA BASE DE DATOS LOS DATOS DE USUARIO Y ASI LOGEARNOS EN EL SISTEMA.
    public boolean ingresar(String DNI, String clave)
    {        
        Object[][] res = this.select("usuarios", " dni , nomusuario, apellido1, apellido2", " dni='"+DNI+"' AND clave='"+clave+"' ");
        if( res.length > 0)
        {
            user.setDNI( res[0][0].toString() );
            user.setNombre( res[0][1].toString() );
            user.setApellido1( res[0][2].toString() );
            user.setApellido2( res[0][3].toString() );
            return true;
        }        
        else
            return false;
    }
    public boolean admin (String DNI, String clave)
    {
        Object[][] res = this.select("usuarios", " dni , nomusuario, apellido1, apellido2", " dni='"+DNI+"' AND clave='"+clave+"' AND usuarios.admin='1'");
        if( res.length > 0)
        {
            user.setDNI( res[0][0].toString() );
            user.setNombre( res[0][1].toString() );
            user.setApellido1( res[0][2].toString() );
            user.setApellido2( res[0][3].toString() );
            return true;
        }
        return false;
        
    }  
    
    //METODO PARA BUSCAR ARTICULO EN LA BASE DE DATOS.
    public Object[][] getArticulosTienda(String codigo, String nombre){
        Object[][] res = this.select("marcas, productos, son",
                                     "nomproducto, color, tipo, nommarca, stock, precio",
                                     " marcas.idmarcas=son.idmarcas AND "
                                       + "productos.idproductos = son.idproductos AND "
                                             + "productos.idproductos='"+codigo+"' OR producto.nomproducto='"+nombre+"' ");
        if( res.length > 0)
            return res;
        else
            return null;       
    }
    
}
