import javax.swing.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CrudContratistas 
{
   Color blanco = new Color(255,255,255);
   Color azul = new   Color(0, 0, 255);
   Color rojo = new Color(255,0,0);
   String [] tipo = {};
   String [] af = {};
   String [] af2 = {};
   String [] pa = {};
   String [] pa2 = {};
   static Choice lista;
   static Choice lista2;
   static Choice lista3;
   static Choice lista4;
   static Choice lista5;
    public CrudContratistas(String title)
    { 
     JFrame ventana1 = new JFrame(title);
     ventana1.setBackground(blanco);
     ventana1.setTitle("FORMULARIO DE EMPLEADOS");
     ventana1.setSize(2000,1000);
     ventana1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
     JPanel panel1 = new JPanel();
     panel1.setBackground(blanco);
     
     panel1.setLayout(null);
     ventana1.add(panel1);
     ventana1.setVisible(true);
     
     JLabel labelDp= new JLabel("DATOS PERSONALES");
     labelDp.setBounds(100,1, 200, 90);
     labelDp.setFont(new Font("arial",Font.PLAIN,18));
     labelDp.setForeground(rojo);
     
     JLabel labelNombre = new JLabel("Nombre:");
     labelNombre.setBounds(100, 70, 165, 25);
     JTextField fieldNombre = new JTextField();
     fieldNombre.setBounds(170, 70, 165, 25);
     
     
     JLabel labelDireccion = new JLabel("Dirección:");
     labelDireccion.setBounds(100, 110, 165, 25);
     JTextField fieldDireccion = new JTextField();
     fieldDireccion.setBounds(170, 110, 165, 25);
     
     JLabel labelApellido = new JLabel("Apellido:");
     labelApellido.setBounds(400, 70, 165, 25);
     JTextField fieldApellido = new JTextField();
     fieldApellido.setBounds(470, 70, 165, 25);
     
     JLabel labelCorreo = new JLabel("Correo electrónico:");
     labelCorreo.setBounds(400, 110, 165, 25);
     JTextField fieldCorreo = new JTextField();
     fieldCorreo.setBounds(520, 110, 165, 25);
     
     JLabel labelTipo= new JLabel("Tipo:");
     labelTipo.setBounds(700, 70, 165, 25);
     JComboBox lista = new JComboBox(tipo);
     lista.setBounds(740, 70, 150, 30);
     lista.addItem("Cédula");
     lista.addItem("Pasaporte");
     lista.addItem("Cédula de extranjeria");
     panel1.add(lista);
     
     
     JLabel labelIdentificacion = new JLabel("Identificación:");
     labelIdentificacion.setBounds(920, 70, 165, 25);
     JTextField fieldIdentificacion = new JTextField();
     fieldIdentificacion.setBounds(1010, 70, 165, 25);
     
     JLabel labelTelefono = new JLabel("Teléfono:");
     labelTelefono.setBounds(800, 110, 170, 25);
     JTextField fieldTelefono = new JTextField();
     fieldTelefono.setBounds(860, 110, 170, 25);
     ///
     JLabel labelDp2= new JLabel("DATOS EDUCATIVOS");
     labelDp2.setBounds(100, 100, 200, 150);
     labelDp2.setFont(new Font("arial",Font.PLAIN,18));
     labelDp2.setForeground(rojo);
     
     JLabel labelBa= new JLabel("Bachillerato:");
     labelBa.setBounds(100, 200, 165, 25);
     JTextField fieldBa = new JTextField();
     fieldBa.setBounds(190, 200, 165, 25);
     
     JLabel labelU= new JLabel("Universitario:");
     labelU.setBounds(100, 240, 165, 25);
     JTextField fieldU = new JTextField();
     fieldU.setBounds(190, 240, 165, 25);
     
     JLabel labelAf= new JLabel("Año de finalización:");
     labelAf.setBounds(400, 200, 200, 25);
     JComboBox lista2 = new JComboBox(af);
     lista2.setBounds(520,200,165, 25);
     lista2.addItem("1990");
     lista2.addItem("1991");
     lista2.addItem("1992");
     lista2.addItem("1993");
     lista2.addItem("1994");
     lista2.addItem("1995");
     lista2.addItem("1996");
     lista2.addItem("1995");
     lista2.addItem("1996");
     lista2.addItem("1997");
     lista2.addItem("1998");
     lista2.addItem("1999");
     lista2.addItem("2000");
     lista2.addItem("2001");
     lista2.addItem("2002");
     lista2.addItem("2003");
     lista2.addItem("2004");
     lista2.addItem("2005");
     lista2.addItem("2006");
     lista2.addItem("2007");
     lista2.addItem("2008");
     lista2.addItem("2009");
     panel1.add(lista2);
     
     JLabel labelAf2= new JLabel("Año de finalización:");
     labelAf2.setBounds(400, 240, 165, 25);
     JComboBox lista3 = new JComboBox(af2);
     lista3.setBounds(520,240,165, 25);
     lista3.addItem("1990");
     lista3.addItem("1991");
     lista3.addItem("1992");
     lista3.addItem("1993");
     lista3.addItem("1994");
     lista3.addItem("1995");
     lista3.addItem("1996");
     lista3.addItem("1995");
     lista3.addItem("1996");
     lista3.addItem("1997");
     lista3.addItem("1998");
     lista3.addItem("1999");
     lista3.addItem("2000");
     lista3.addItem("2001");
     lista3.addItem("2002");
     lista3.addItem("2003");
     lista3.addItem("2004");
     lista3.addItem("2005");
     lista3.addItem("2006");
     lista3.addItem("2007");
     lista3.addItem("2008");
     lista3.addItem("2009");
     lista3.addItem("2010");
     lista3.addItem("2011");
     lista3.addItem("2012");
     lista3.addItem("2013");
     lista3.addItem("2014");
     panel1.add(lista3);                                  
     
     JLabel labelIns= new JLabel("Instituto:");
     labelIns.setBounds(720, 200, 165, 25);
     JTextField fieldIns = new JTextField();
     fieldIns.setBounds(780, 200, 165, 25);
     
     JLabel labelIns2= new JLabel("Instituto:");
     labelIns2.setBounds(720, 240, 165, 25);
     JTextField fieldIns2 = new JTextField();
     fieldIns2.setBounds(780, 240, 165, 25);
     
     JLabel labelDp3= new JLabel("REFERENCIAS FAMILIARES");
     labelDp3.setBounds(100, 230, 270, 150);
     labelDp3.setFont(new Font("arial",Font.PLAIN,18));
     labelDp3.setForeground(rojo);
     
     JLabel labelNombre2 = new JLabel("Nombre:");
     labelNombre2.setBounds(100, 330, 165, 25);
     JTextField fieldNombre2 = new JTextField();
     fieldNombre2.setBounds(170, 330, 165, 25);
     
     JLabel labelNombre3 = new JLabel("Nombre:");
     labelNombre3.setBounds(100, 370, 165, 25);
     JTextField fieldNombre3 = new JTextField();
     fieldNombre3.setBounds(170, 370, 165, 25);
     
     JLabel labelPa = new JLabel("Parentesco:");
     labelPa.setBounds(400, 330, 165, 25);
     JComboBox lista4 = new JComboBox(pa);
     lista4.setBounds(480,330,165, 25);
     lista4.addItem("Esposa");
     lista4.addItem("Esposo");
     lista4.addItem("Padre");
     lista4.addItem("Madre");
     lista4.addItem("Tio");
     lista4.addItem("Tia");
     lista4.addItem("Hermana");
     lista4.addItem("Hermano");
     panel1.add(lista4);
     
     JLabel labelPa2 = new JLabel("Parentesco:");
     labelPa2.setBounds(400, 370, 165, 25);
     JComboBox lista5 = new JComboBox(pa2);
     lista5.setBounds(480,370,165, 25);
     lista5.addItem("Esposa");
     lista5.addItem("Esposo");
     lista5.addItem("Padre");
     lista5.addItem("Madre");
     lista5.addItem("Tio");
     lista5.addItem("Tia");
     lista5.addItem("Hermana");
     lista5.addItem("Hermano");
     panel1.add(lista5);
     
     
     JLabel labelTelefono2 = new JLabel("Teléfono:");
     labelTelefono2.setBounds(720, 330, 170, 25);
     JTextField fieldTelefono2 = new JTextField();
     fieldTelefono2.setBounds(780, 330, 170, 25);
     
     JLabel labelTelefono3 = new JLabel("Teléfono:");
     labelTelefono3.setBounds(720, 370, 170, 25);
     JTextField fieldTelefono3 = new JTextField();
     fieldTelefono3.setBounds(780, 370, 170, 25);
     
     JButton guardar = new JButton("Guardar y agregar");
     guardar.setBounds(720, 450, 170, 25);
     panel1.add(guardar);
     
     JButton salir = new JButton("Salir");
     salir.setBounds(899, 450, 100, 25);
     panel1.add(salir);
     
     
     JButton primero = new JButton("Primero");
     primero.setBounds(180, 450, 100, 25);
     panel1.add(primero);
     
     JButton anterior = new JButton("Anterior");
     anterior.setBounds(280, 450, 100, 25);
     panel1.add(anterior);
     
     JButton siguiente = new JButton("Siguiente");
     siguiente.setBounds(380, 450, 100, 25);
     panel1.add(siguiente);
     
     JButton ultimo= new JButton("Último");
     ultimo.setBounds(480, 450, 100, 25);
     panel1.add(ultimo);
    
     panel1.add(labelNombre);
     panel1.add(fieldNombre);
     panel1.add(labelDireccion);
     panel1.add(fieldDireccion);
     panel1.add(labelApellido);
     panel1.add(fieldApellido);
     panel1.add(labelCorreo);
     panel1.add(fieldCorreo);
     panel1.add(labelTipo);
     
     panel1.add(fieldIdentificacion);
     panel1.add(labelIdentificacion);
     panel1.add(fieldTelefono);
     panel1.add(labelTelefono);
     panel1.add(labelDp);
     panel1.add(labelDp2);
     panel1.add(labelDp3);
     
  
     panel1.add(fieldBa);
     panel1.add(labelBa);
     panel1.add(fieldU);
     panel1.add(labelU);
     panel1.add(labelAf);
     panel1.add(labelAf2);
     panel1.add(fieldIns);
     panel1.add(labelIns);
     panel1.add(fieldIns2);
     panel1.add(labelIns2); 
     panel1.add(labelNombre2);
     panel1.add(fieldNombre2);
     panel1.add(labelNombre3);
     panel1.add(fieldNombre3);
     panel1.add(labelPa);
     panel1.add(labelPa2);
     panel1.add(fieldTelefono2);
     panel1.add(labelTelefono2);
     panel1.add(fieldTelefono3);
     panel1.add(labelTelefono3);
        
        
        
        
        
    }

}
