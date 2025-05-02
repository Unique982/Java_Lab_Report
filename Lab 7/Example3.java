/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
//write a java program to introspection of properties of java bean have created


import java.beans.*;

public class Example3 {
    public static void main(String[] args) {
        try {
            
            BeanInfo info = Introspector.getBeanInfo(Student.class);
            
            System.out.println("Properties of JavaBean:");
            PropertyDescriptor[] pds = info.getPropertyDescriptors();
            for (PropertyDescriptor pd : pds) {
                System.out.println("- " + pd.getName());
            }

        } catch (IntrospectionException e) {
            e.printStackTrace();
        }
    }
}
