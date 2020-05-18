import javax.swing.*;
import java.awt.*;


public class CrudEmpleado extends JFrame
{   
  //Definición de Colores
   Color white = new Color(255,255,255);
   Color red = new Color(255,0,0);
   
    //Definición de Etiquetas
   JLabel ldatosPersonales = new JLabel();
   JLabel lnombre = new JLabel();
   JLabel ldireccion = new JLabel();
   JLabel lapellido = new JLabel();
   JLabel lcorreo = new JLabel();
   JLabel ltipo= new JLabel();
   JLabel lid = new JLabel();
   JLabel ltel = new JLabel();
   JLabel ldatosEducativos = new JLabel();
   JLabel lba= new JLabel();
   JLabel lu= new JLabel();
   JLabel laf= new JLabel();
   JLabel laf2= new JLabel();
   JLabel lins= new JLabel();
   JLabel lins2= new JLabel();
   JLabel lreferenciasfamiliares= new JLabel();
   JLabel lnombre2 = new JLabel();
   JLabel lnombre3 = new JLabel();
   JLabel lpa = new JLabel();
   JLabel lpa2 = new JLabel();
   JLabel ltel2 = new JLabel();
   JLabel ltel3 = new JLabel();
   
   //Definicion de los Inputs
   JTextField flnombre = new JTextField();
   JTextField fldireccion = new JTextField();
   JTextField flapellido = new JTextField();
   JTextField flcorreo = new JTextField();
   JTextField flid = new JTextField();
   JTextField fltel = new JTextField();
   JTextField flba = new JTextField();
   JTextField flu = new JTextField();
   JTextField flins = new JTextField();
   JTextField flins2 = new JTextField();
   JTextField flnombre2 = new JTextField();
   JTextField flnombre3 = new JTextField();
   JTextField fltel2 = new JTextField();
   JTextField fltel3 = new JTextField();
   
   //Definición de las listas desplegables
   JComboBox list1 = new JComboBox();
   JComboBox list2 = new JComboBox();
   JComboBox list3 = new JComboBox();
   JComboBox list4 = new JComboBox();
   JComboBox list5 = new JComboBox();
   JComboBox list6 = new JComboBox();
   
   //Definición de los Botones
   JButton save = new JButton(); 
   JButton out = new JButton();
   JButton first = new JButton();
   JButton previous  = new JButton();
   JButton next = new JButton();
   JButton last= new JButton();
   //
   JPanel container = new JPanel();
   
    public CrudEmpleado()
    { 
      configWindows();
    }
    // Creamos un método para configurar el aspecto de la ventana
    public void configWindows(){
      setBackground(white);
      setTitle("FORMULARIO DE EMPLEADOS");
      setSize(2000,1000);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setVisible(true);   
      add(container);
      container.setLayout(null);
      container.setBackground(white);
      
      //Llamar a la configuración de los Labels
      configLabels();
      container.add(ldatosPersonales);
      container.add(lnombre);
      container.add(ldireccion);
      container.add(lapellido);
      container.add(lcorreo);
      container.add(ltipo);
      container.add(lid);
      container.add(ltel);
      container.add(ldatosEducativos);
      container.add(lba);
      container.add(lu);
      container.add(laf);
      container.add(laf2);
      container.add(lins);
      container.add(lins2);
      container.add(lreferenciasfamiliares);
      container.add(lnombre2);
      container.add(lnombre3);
      container.add(lpa);
      container.add(lpa2);
      container.add(ltel2);
      container.add(ltel3);
      //Llamar a la configuración de los Inputs
      configInputText();
      container.add(flnombre);
      container.add(fldireccion);
      container.add(flapellido);
      container.add(flcorreo);
      container.add(flid);
      container.add(fltel);
      container.add(flba);
      container.add(flu);
      container.add(flins);
      container.add(flins2);
      container.add(flnombre2);
      container.add(flnombre3);
      container.add(fltel2);
      container.add(fltel3);
      //Llamar a las listas desplegables
      configList();
      container.add(list1);
      container.add(list2);
      container.add(list3);
      container.add(list4);
      container.add(list5);
      //Llamar a los Botones
      configButton();
      container.add(save);
      container.add(out);
      container.add(first);
      container.add(previous);
      container.add(next);
      container.add(last);
    }
    
    //Configurando los Labels del formulario
    public void configLabels(){
      ldatosPersonales.setText("DATOS PERSONALES");   
      ldatosPersonales.setBounds(100,1,200,90);
      ldatosPersonales.setFont(new Font("arial", Font.PLAIN, 18));
      ldatosPersonales.setForeground(red);
     
      lnombre.setText("Nombre:");
      lnombre.setBounds(100, 70, 165, 25);
      ldireccion.setText("Dirección:");
      ldireccion.setBounds(100, 110, 165, 25);
      lapellido.setText("Apellido:");
      lapellido.setBounds(400, 70, 165, 25);
      lcorreo.setText("Correo electrónico:");
      lcorreo.setBounds(400, 110, 165, 25);
      ltipo.setText("Tipo:");
      ltipo.setBounds(700, 70, 165, 25);
      lid.setText("Identificación:");
      lid.setBounds(920, 70, 165, 25);
      ltel.setText("Teléfono:");
      ltel.setBounds(800, 110, 170, 25);
      ///
      ldatosEducativos.setText("DATOS EDUCATIVOS");
      ldatosEducativos.setBounds(100, 100, 200, 150);
      ldatosEducativos.setFont(new Font("arial",Font.PLAIN,18));
      ldatosEducativos.setForeground(red);
      
      lba.setText("Bachillerato:");
      lba.setBounds(100, 200, 165, 25);
      lu.setText("Universitario:");
      lu.setBounds(100, 240, 165, 25); 
      laf.setText("Año de finalización:");
      laf.setBounds(400, 200, 200, 25);
      laf2.setText("Año de finalización:");
      laf2.setBounds(400, 240, 165, 25);
      lins.setText("Instituto:");
      lins.setBounds(720, 200, 165, 25);
      lins2.setText("Instituto:");
      lins2.setBounds(720, 240, 165, 25);
      ///
      lreferenciasfamiliares.setText("REFERENCIAS FAMILIARES");
      lreferenciasfamiliares.setBounds(100, 230, 270, 150);
      lreferenciasfamiliares.setFont(new Font("arial",Font.PLAIN,18));
      lreferenciasfamiliares.setForeground(red);
      
      lnombre2.setText("Nombre:");
      lnombre2.setBounds(100, 330, 165, 25);
      lnombre3.setText("Nombre:");
      lnombre3.setBounds(100, 370, 165, 25);
      lpa.setText("Parentesco");
      lpa.setBounds(400, 330, 165, 25);
      lpa2.setText("Parentesco");
      lpa2.setBounds(400, 370, 165, 25);
      ltel2.setText("Telefono");
      ltel2.setBounds(720, 330, 170, 25);
      ltel3.setText("Telefono");
      ltel3.setBounds(720, 370, 170, 25);
    }
    
    //Configurando los Inputs del formulario
    public void configInputText(){
      flnombre.setBounds(170, 70, 165, 25);   
      fldireccion.setBounds(170, 110, 165, 25);
      flapellido.setBounds(470, 70, 165, 25);
      flcorreo.setBounds(520, 110, 165, 25);
      flid.setBounds(1010, 70, 165, 25);
      fltel.setBounds(860, 110, 170, 25);
      flba.setBounds(190, 200, 165, 25);
      flu.setBounds(190, 240, 165, 25);
      flins.setBounds(780, 200, 165, 25);
      flins2.setBounds(780, 240, 165, 25);
      flnombre2.setBounds(170, 330, 165, 25);
      flnombre3.setBounds(170, 370, 165, 25);
      fltel2.setBounds(780, 330, 170, 25);
      fltel3.setBounds(780, 370, 170, 25);
    }
    
    //Configurando las listas desplegables
    public void configList(){
     list1.setBounds(740, 70, 150, 30);
     list1.addItem("Cédula");
     list1.addItem("Pasaporte");
     list1.addItem("Cédula de extranjeria");
     //
     list2.setBounds(520,200,165, 25);
     list2.addItem("1990");
     list2.addItem("1991");
     list2.addItem("1992");
     list2.addItem("1993");
     list2.addItem("1994");
     list2.addItem("1995");
     list2.addItem("1996");
     list2.addItem("1995");
     list2.addItem("1996");
     list2.addItem("1997");
     list2.addItem("1998");
     list2.addItem("1999");
     list2.addItem("2000");
     list2.addItem("2001");
     list2.addItem("2002");
     list2.addItem("2003");
     list2.addItem("2004");
     list2.addItem("2005");
     list2.addItem("2006");
     list2.addItem("2007");
     list2.addItem("2008");
     list2.addItem("2009");
     //
     list3.setBounds(520,240,165, 25);
     list3.addItem("1990");
     list3.addItem("1991");
     list3.addItem("1992");
     list3.addItem("1993");
     list3.addItem("1994");
     list3.addItem("1995");
     list3.addItem("1996");
     list3.addItem("1995");
     list3.addItem("1996");
     list3.addItem("1997");
     list3.addItem("1998");
     list3.addItem("1999");
     list3.addItem("2000");
     list3.addItem("2001");
     list3.addItem("2002");
     list3.addItem("2003");
     list3.addItem("2004");
     list3.addItem("2005");
     list3.addItem("2006");
     list3.addItem("2007");
     list3.addItem("2008");
     list3.addItem("2009");
     list3.addItem("2010");
     list3.addItem("2011");
     list3.addItem("2012");
     list3.addItem("2013");
     list3.addItem("2014");
     //
     list4.setBounds(480,330,165, 25);
     list4.addItem("Esposa");
     list4.addItem("Esposo");
     list4.addItem("Padre");
     list4.addItem("Madre");
     list4.addItem("Tio");
     list4.addItem("Tia");
     list4.addItem("Hermana");
     list4.addItem("Hermano");
     //
     list5.setBounds(480,370,165, 25);
     list5.addItem("Esposa");
     list5.addItem("Esposo");
     list5.addItem("Padre");
     list5.addItem("Madre");
     list5.addItem("Tio");
     list5.addItem("Tia");
     list5.addItem("Hermana");
     list5.addItem("Hermano");
    }   
    
    //Configurando los Botones del formulario
    public void configButton(){
     save.setText("Guardar");
     save.setBounds(720, 450, 170, 25);
     out.setText("Salir");
     out.setBounds(899, 450, 100, 25);
     first.setText("Primero");
     first.setBounds(180, 450, 100, 25);
     previous.setText("Anterior");
     previous.setBounds(280, 450, 100, 25); 
     next.setText("Siguiente");
     next.setBounds(380, 450, 100, 25); 
     last.setText("Última");
     last.setBounds(480, 450, 100, 25);   
    }    
}   

