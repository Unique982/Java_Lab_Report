/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
// Q.N 3 ref write a java program to introspection of properties of java bean have created

import java.io.Serializable;
public class Student implements Serializable{
    
    private int id;
    private String name;
    private String sem;
    
    public Student()
    {
        
    }
    
    public void setId(int id)
    {
        this.id=id;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public void setSem(String sem)
    {
        this.sem=sem;
    }
    
    public int getId()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }
    public String getSem()
    {
        return sem;
    }
   
}
