/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajeroautomatico;

import java.util.ArrayList;
import java.io.*;
import javax.swing.JOptionPane;

public class Archivo {


    
    public void escribir(ArrayList<UsuarioCajero> arr){
        try {
            PrintWriter salida=new PrintWriter(new BufferedWriter(new FileWriter("Cajero_usuarios.txt")));
            for (int i = 0; i < arr.size(); i++) {
                salida.print(arr.get(i).getUsuario()+"-"+arr.get(i).getPasword()+"-"+arr.get(i).getDinero()+"\n");
            }
            salida.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "ERROR No se pudo abrir el archivo para escribir: "+e);
                
        }
    
    }
    
    public ArrayList<UsuarioCajero> leer(){
    ArrayList<UsuarioCajero> arlist=new ArrayList<>();
        try {
            BufferedReader lectura=new BufferedReader(new FileReader("Cajero_usuarios.txt"));
            String lec=new String();
            String usuario;
            String contraseña;
            int dinero;
            while ((lec=lectura.readLine())!=null) {
               String []vec=lec.split("-");
               usuario=vec[0];
               contraseña=vec[1];
               dinero=Integer.parseInt(vec[2]);
               arlist.add(new UsuarioCajero(usuario, contraseña, dinero));
                
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "ERROR al leer el archivo: "+e);
        }
        return arlist;
    }
}
