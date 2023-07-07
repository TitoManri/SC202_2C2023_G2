/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.Avance_1;

import javax.swing.JOptionPane;

/**
 *
 * @author manri
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Registros_doctor user = new Registros_doctor();
        user.getContrasena_medico_1();
        user.getContrasena_medico_2();
        user.getContrasena_medico_3();
        user.getContrasena_medico_4();
        user.getContrasena_medico_5();
        
        Medico_1 medico_1 = new Medico_1();
        medico_1.nombre_medico_1 = "";
        medico_1.cedula_medico_1= "";
        medico_1.almuerzo_inicial_medico_1 = "";
        medico_1.almuerzo_final_medico_1 = "";
        
        Medico_2 medico_2 = new Medico_2();
        medico_2.nombre_medico_2 = "";
        medico_2.cedula_medico_2= "";
        medico_2.almuerzo_inicial_medico_2 = "";
        medico_2.almuerzo_final_medico_2 = "";
        
        Medico_3 medico_3 = new Medico_3();
        medico_3.nombre_medico_3 = "";
        medico_3.cedula_medico_3= "";
        medico_3.almuerzo_inicial_medico_3 = "";
        medico_3.almuerzo_final_medico_3 = "";
        
        Medico_4 medico_4 = new Medico_4();
        medico_4.nombre_medico_4 = "";
        medico_4.cedula_medico_4= "";
        medico_4.almuerzo_inicial_medico_4 = "";
        medico_4.almuerzo_final_medico_4 = "";
        
        Medico_5 medico_5 = new Medico_5();
        medico_5.nombre_medico_5 = "";
        medico_5.cedula_medico_5= "";
        medico_5.almuerzo_inicial_medico_5 = "";
        medico_5.almuerzo_final_medico_5 = "";
        
        
        
        
        
        JOptionPane.showMessageDialog(null, "Bienvenido al consultorio Las Alamedas, porfavor presione 'OK' para seguir al menu", "Consultorio Las Alamedas", JOptionPane.INFORMATION_MESSAGE);
        
        //Menu
        String[] options = { "Cerrar", "Medico", "Cliente" };
        int menu_doctor_paciente = JOptionPane.showOptionDialog(null, "Bienvenido", "Consultorio Las Alamedas", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
        
        if(menu_doctor_paciente == 1){
            String[] options2 = { "Cerrar", "Registro Medico", "Inicio Sesión Medico" };
        int menu = JOptionPane.showOptionDialog(null, "Menu", "Consultorio Las Alamedas", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options2, options[0]);
        //Respueta 3  Opcion[2] / Registro
        if (menu == 1){
            //username
            String contrasena = JOptionPane.showInputDialog(null, "Ingrese la contraseña para registrarse como doctor", "Consultorio Las Alamedas", JOptionPane.OK_CANCEL_OPTION);
            //Registro doctor
            //Medico_1
            if (contrasena.equals(user.getContrasena_medico_1())){ 
                String username_login_medico_1 = JOptionPane.showInputDialog(null, "Ingrese su nombre", "Consultorio Las Alamedas", JOptionPane.PLAIN_MESSAGE); 
                medico_1.nombre_medico_1 = username_login_medico_1;
                    String cedula_medico_1 = JOptionPane.showInputDialog(null, "Ingrese su cedula", "Consultorio Las Alamedas", JOptionPane.PLAIN_MESSAGE); 
                    medico_1.cedula_medico_1 = cedula_medico_1;
                        String especialidad_medico_1 = JOptionPane.showInputDialog(null, "Ingrese su Especialidad", "Consultorio Las Alamedas", JOptionPane.PLAIN_MESSAGE);
                            medico_1.especialidad_medico_1 = especialidad_medico_1;
                                String almuerzo_inicial_medico_1 = JOptionPane.showInputDialog(null, "Ingrese su hora Inicial de almuerzo", "Consultorio Las Alamedas", JOptionPane.PLAIN_MESSAGE);
                                    medico_1.almuerzo_inicial_medico_1 = almuerzo_inicial_medico_1;
                                    String almuerzo_final_medico_1 = JOptionPane.showInputDialog(null, "Ingrese su hora Final de almuerzo", "Consultorio Las Alamedas", JOptionPane.PLAIN_MESSAGE);
                                        medico_1.almuerzo_final_medico_1 = almuerzo_final_medico_1;
                                            JOptionPane.showMessageDialog(null, "Porfavor confirme su informacion \nNombre: "+medico_1.nombre_medico_1 +"\nCedula: "+medico_1.cedula_medico_1+"\nEspecialidad: "+medico_1.especialidad_medico_1+"\nHora Inicial: "+medico_1.almuerzo_inicial_medico_1+"\nHora Final: "+medico_1.almuerzo_final_medico_1, "Consultorio Las Alamedas", JOptionPane.PLAIN_MESSAGE);
        
                    
            //Medico_2
            }else if (contrasena.equals(user.getContrasena_medico_2())){
                String username_login_medico_2 = JOptionPane.showInputDialog(null, "Ingrese su nombre", "Consultorio Las Alamedas", JOptionPane.PLAIN_MESSAGE);
                medico_2.nombre_medico_2 = username_login_medico_2;
                    String cedula_medico_2 = JOptionPane.showInputDialog(null, "Ingrese su cedula", "Consultorio Las Alamedas", JOptionPane.PLAIN_MESSAGE); 
                    medico_2.cedula_medico_2 = cedula_medico_2;
                        String especialidad_medico_2 = JOptionPane.showInputDialog(null, "Ingrese su Especialidad", "Consultorio Las Alamedas", JOptionPane.PLAIN_MESSAGE);
                            medico_2.especialidad_medico_2 = especialidad_medico_2;
                                String almuerzo_inicial_medico_2 = JOptionPane.showInputDialog(null, "Ingrese su hora Inicial de almuerzo", "Consultorio Las Alamedas", JOptionPane.PLAIN_MESSAGE);
                                    medico_2.almuerzo_inicial_medico_2 = almuerzo_inicial_medico_2;
                                    String almuerzo_final_medico_2 = JOptionPane.showInputDialog(null, "Ingrese su hora Final de almuerzo", "Consultorio Las Alamedas", JOptionPane.PLAIN_MESSAGE);
                                        medico_2.almuerzo_final_medico_2 = almuerzo_final_medico_2;
                                            JOptionPane.showMessageDialog(null, "Porfavor confirme su informacion \nNombre: "+medico_2.nombre_medico_2 +"\nCedula: "+medico_2.cedula_medico_2+"\nEspecialidad: "+medico_2.especialidad_medico_2+"\nHora Inicial: "+medico_2.almuerzo_inicial_medico_2+"\nHora Final: "+medico_2.almuerzo_final_medico_2, "Consultorio Las Alamedas", JOptionPane.PLAIN_MESSAGE);
                    
            //Medico_3
            }else if (contrasena.equals(user.getContrasena_medico_3())){
                String username_login_medico_3 = JOptionPane.showInputDialog(null, "Ingrese su nombre", "Consultorio Las Alamedas", JOptionPane.PLAIN_MESSAGE);
                medico_3.nombre_medico_3 = username_login_medico_3;
                    String cedula_medico_3 = JOptionPane.showInputDialog(null, "Ingrese su cedula", "Consultorio Las Alamedas", JOptionPane.PLAIN_MESSAGE); 
                    medico_3.cedula_medico_3 = cedula_medico_3;
                        String especialidad_medico_3 = JOptionPane.showInputDialog(null, "Ingrese su Especialidad", "Consultorio Las Alamedas", JOptionPane.PLAIN_MESSAGE);
                            medico_3.especialidad_medico_3 = especialidad_medico_3;
                                String almuerzo_inicial_medico_3 = JOptionPane.showInputDialog(null, "Ingrese su hora Inicial de almuerzo", "Consultorio Las Alamedas", JOptionPane.PLAIN_MESSAGE);
                                    medico_3.almuerzo_inicial_medico_3 = almuerzo_inicial_medico_3;
                                    String almuerzo_final_medico_3 = JOptionPane.showInputDialog(null, "Ingrese su hora Final de almuerzo", "Consultorio Las Alamedas", JOptionPane.PLAIN_MESSAGE);
                                        medico_3.almuerzo_final_medico_3 = almuerzo_final_medico_3;
                                            JOptionPane.showMessageDialog(null, "Porfavor confirme su informacion \nNombre: "+medico_3.nombre_medico_3 +"\nCedula: "+medico_3.cedula_medico_3+"\nEspecialidad: "+medico_3.especialidad_medico_3+"\nHora Inicial: "+medico_3.almuerzo_inicial_medico_3+"\nHora Final: "+medico_3.almuerzo_final_medico_3, "Consultorio Las Alamedas", JOptionPane.PLAIN_MESSAGE);
                    
            //Medico_4
            }else if (contrasena.equals(user.getContrasena_medico_4())){
                String username_login_medico_4 = JOptionPane.showInputDialog(null, "Ingrese su nombre", "Consultorio Las Alamedas", JOptionPane.PLAIN_MESSAGE);
                medico_4.nombre_medico_4 = username_login_medico_4;
                    String cedula_medico_4 = JOptionPane.showInputDialog(null, "Ingrese su cedula", "Consultorio Las Alamedas", JOptionPane.PLAIN_MESSAGE); 
                    medico_4.cedula_medico_4 = cedula_medico_4;
                        String especialidad_medico_4 = JOptionPane.showInputDialog(null, "Ingrese su Especialidad", "Consultorio Las Alamedas", JOptionPane.PLAIN_MESSAGE);
                            medico_4.especialidad_medico_4 = especialidad_medico_4;
                                String almuerzo_inicial_medico_4 = JOptionPane.showInputDialog(null, "Ingrese su hora Inicial de almuerzo", "Consultorio Las Alamedas", JOptionPane.PLAIN_MESSAGE);
                                    medico_4.almuerzo_inicial_medico_4 = almuerzo_inicial_medico_4;
                                    String almuerzo_final_medico_4 = JOptionPane.showInputDialog(null, "Ingrese su hora Final de almuerzo", "Consultorio Las Alamedas", JOptionPane.PLAIN_MESSAGE);
                                        medico_4.almuerzo_final_medico_4 = almuerzo_final_medico_4;
                                            JOptionPane.showMessageDialog(null, "Porfavor confirme su informacion \nNombre"+medico_4.nombre_medico_4 +"\nCedula: "+medico_4.cedula_medico_4+"\nEspecialidad"+medico_4.especialidad_medico_4+"\nHora Inicial: "+medico_4.almuerzo_inicial_medico_4+"\nHora Final: "+medico_4.almuerzo_final_medico_4, "Consultorio Las Alamedas", JOptionPane.PLAIN_MESSAGE);
                    
            //Medico_5
            }else if (contrasena.equals(user.getContrasena_medico_5())){
                String username_login_medico_5 = JOptionPane.showInputDialog(null, "Ingrese su nombre", "Consultorio Las Alamedas", JOptionPane.PLAIN_MESSAGE);
                medico_5.nombre_medico_5 = username_login_medico_5;
                    String cedula_medico_5 = JOptionPane.showInputDialog(null, "Ingrese su cedula", "Consultorio Las Alamedas", JOptionPane.PLAIN_MESSAGE); 
                    medico_5.cedula_medico_5 = cedula_medico_5;
                        String especialidad_medico_5 = JOptionPane.showInputDialog(null, "Ingrese su Especialidad", "Consultorio Las Alamedas", JOptionPane.PLAIN_MESSAGE);
                            medico_5.especialidad_medico_5 = especialidad_medico_5;
                                String almuerzo_inicial_medico_5 = JOptionPane.showInputDialog(null, "Ingrese su hora Inicial de almuerzo", "Consultorio Las Alamedas", JOptionPane.PLAIN_MESSAGE);
                                    medico_5.almuerzo_inicial_medico_5 = almuerzo_inicial_medico_5;
                                    String almuerzo_final_medico_5 = JOptionPane.showInputDialog(null, "Ingrese su hora Final de almuerzo", "Consultorio Las Alamedas", JOptionPane.PLAIN_MESSAGE);
                                        medico_5.almuerzo_final_medico_5 = almuerzo_final_medico_5;
                                            JOptionPane.showMessageDialog(null, "Porfavor confirme su informacion \nNombre: "+medico_5.nombre_medico_5 +"\nCedula: "+medico_5.cedula_medico_5+"\nEspecialidad: "+medico_5.especialidad_medico_5+"\nHora Inicial: "+medico_5.almuerzo_inicial_medico_5+"\nHora Final: "+medico_5.almuerzo_final_medico_5, "Consultorio Las Alamedas", JOptionPane.PLAIN_MESSAGE);
                                            
            //Contrasena_incorrecta
            }else{
                JOptionPane.showMessageDialog(null, "Intente nuevamente su contraseña", "Consultorio Las Alamedas", JOptionPane.PLAIN_MESSAGE);
            }
            }
        }
        
        
        
            
        //Respuesta 2 Opcion[1] / Inicio sesion 
        if (menu_doctor_paciente == 2){
            String[] options2 = { "Cerrar", "Verificar Cita", "Agendar Cita" };
                int menu_clientes = JOptionPane.showOptionDialog(null, "Menu", "Consultorio Las Alamedas", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options2, options[0]);
                    if (menu_clientes == 1){
                        JOptionPane.showMessageDialog(null, "Adjuntar Verificacion de Cita", "Consultorio Las Alamedas", JOptionPane.PLAIN_MESSAGE);
                    }else if(menu_clientes == 2){
                            JOptionPane.showMessageDialog(null, "Adjuntar para Agendar la Cita", "Consultorio Las Alamedas", JOptionPane.PLAIN_MESSAGE);
                    }else{
                        JOptionPane.showMessageDialog(null, "Gracias por usar nuestro servicio", "Consultorio Las Alamedas", JOptionPane.PLAIN_MESSAGE);
                    }
        //Respuesta 1 Opcion [0] / Cerrar
        if (menu_doctor_paciente == 0){
            JOptionPane.showMessageDialog(null, "Gracias por usar nuestro servicio", "Consultorio Las Alamedas", JOptionPane.PLAIN_MESSAGE);
            
            
        //
        }
        }
    }
}
 