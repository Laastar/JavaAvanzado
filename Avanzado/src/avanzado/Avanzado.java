/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avanzado;

/**
 *
 * @author andrea
 */
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Avanzado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //-----------------------------------------CONECTANDONOS A LA BASE
        Connection con;
        cargar();
        con=conectar("jdbc:mysql://localhost:3306/ProyectoJava","root","Youngfolks");
        //----------------------------------------------------------------
        leerXMLF("/home/andrea/Descargas/Facturas.xml","factura",con);
        leerXMLV("/home/andrea/Descargas/Vehiculos.xml","vehiculo",con);
        leerXMLC("/home/andrea/Descargas/Clientes.xml","cliente",con);
        
    }
    //----------------------------------------------CREAR TABLA POLIZA
    public void crearTabla(Connection con){
        String query="CREATE TABLE Poliza(Cliente_id INT PRIMARY_KEY,Factura_id INT AS(Cliente_id),Total INT AS((SELECT Monto FROM Factura NATURAL JOIN Factura_id))*(6.67/12)";
        
    }
    
    //---------------------------------------------------------
//-----------------------------------------------------------------------------------------------PARA INSERTAR LOS VALORES
    public static void leerXMLV(String nom_arch,String etiqueta,Connection con){
            PreparedStatement ps;
            String query="INSERT INTO Vehiculo (Vehiculo_id,Placas,Modelo,Marca,Factura_id) VALUES(?,?,?,?,?)";      
            try{
                File archivo= new File(nom_arch);
                DocumentBuilderFactory dbf= DocumentBuilderFactory.newInstance();
                DocumentBuilder db= dbf.newDocumentBuilder();
                Document document=db.parse(archivo);
                NodeList lista= document.getElementsByTagName(etiqueta);
                for(int i=0; i<lista.getLength();i++){
                    Node nodo=lista.item(i);
                    System.out.println("Elemento: "+nodo.getNodeName());
                    if(nodo.getNodeType()== Node.ELEMENT_NODE){
                            Element element=(Element)nodo;
                            try{
      
                                    ps= con.prepareStatement(query);
                                    ps.setInt(1, i+1);
                                    ps.setString(2, element.getElementsByTagName("placas").item(0).getTextContent());
                                    ps.setString(3, element.getElementsByTagName("marca").item(0).getTextContent());
                                    ps.setString(4, element.getElementsByTagName("modelo").item(0).getTextContent());
                                    ps.setInt(5, Integer.parseInt(element.getElementsByTagName("id_factura").item(0).getTextContent()));
                                    System.out.println(ps.executeUpdate());
                            }catch(Exception e){
                                    e.printStackTrace();
                            }
                    }
                   
                }
                
            }catch(Exception e){
                System.out.println("Ocurrio un error :(");
            }
    }
 
    public static void leerXMLF(String nom_arch,String etiqueta,Connection con){
            PreparedStatement ps;
            String query="INSERT INTO Factura (Factura_id,Monto) VALUES(?,?)";      
            try{
                File archivo= new File(nom_arch);
                DocumentBuilderFactory dbf= DocumentBuilderFactory.newInstance();
                DocumentBuilder db= dbf.newDocumentBuilder();
                Document document=db.parse(archivo);
                NodeList lista= document.getElementsByTagName(etiqueta);
                for(int i=0; i<lista.getLength();i++){
                    Node nodo=lista.item(i);
                    System.out.println("Elemento: "+nodo.getNodeName());
                    if(nodo.getNodeType()== Node.ELEMENT_NODE){
                            Element element=(Element)nodo;
                            try{
                                    ps= con.prepareStatement(query);
                                    ps.setInt(1, i+1);
                                    ps.setInt(2, Integer.parseInt(element.getElementsByTagName("costo_total").item(0).getTextContent()));
                                    System.out.println(ps.executeUpdate());
                            }catch(Exception e){
                                    e.printStackTrace();
                            }
                    }
                   
                }
                
            }catch(Exception e){
                System.out.println("Ocurrio un error :(");
            }
    }
    
    public static void leerXMLC(String nom_arch,String etiqueta,Connection con){
            PreparedStatement ps;
            String query="INSERT INTO Cliente (Cliente_id,Nombre,Direccion) VALUES(?,?,?)";      
            try{
                File archivo= new File(nom_arch);
                DocumentBuilderFactory dbf= DocumentBuilderFactory.newInstance();
                DocumentBuilder db= dbf.newDocumentBuilder();
                Document document=db.parse(archivo);
                NodeList lista= document.getElementsByTagName(etiqueta);
                for(int i=0; i<lista.getLength();i++){
                    Node nodo=lista.item(i);
                    System.out.println("Elemento: "+nodo.getNodeName());
                    if(nodo.getNodeType()== Node.ELEMENT_NODE){
                            Element element=(Element)nodo;
                            try{
                                    ps= con.prepareStatement(query);
                                    ps.setInt(1, i+1);
                                    ps.setString(2, element.getElementsByTagName("nombre").item(0).getTextContent());
                                    ps.setString(3, element.getElementsByTagName("direccion").item(0).getTextContent());
                                    System.out.println(ps.executeUpdate());
           
                            }catch(Exception e){
                                    e.printStackTrace();
                            }
                    }
                   
                }
                
            }catch(Exception e){
                System.out.println("Ocurrio un error :(");
            }
    }
    
//--------------------------------------------------------------------------------------------------------------------    
    
    //------------------------------------------------------------------------PARA LA CONEXION A LA BASE
    public static void cargar(){
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            System.out.println("Driver cargado");
        }catch(ClassNotFoundException | IllegalAccessException | InstantiationException e){
            System.out.println(e.getMessage());
        }
    
    }
    
    public static Connection conectar(String url, String username, String passwd){
        Connection con= null;
        try{
            con= DriverManager.getConnection(url,username,passwd);
            System.out.println("Conexion a base realizada");
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return con;
        
    }
    //--------------------------------------------------------------------------------------------------
}
