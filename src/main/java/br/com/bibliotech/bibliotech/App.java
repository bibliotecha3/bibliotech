/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.bibliotech.bibliotech;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

/**
 *
 * @author unity
 */
public class App {
    import.java.util.Properties;
    import.java.io.FileInputStream;
    import.java.io.File;
    public static void main(String[] argos) throws Exception{
    Properties properties = new Properties();
    properties.load(new FileInputStream(new File("conf.properties")));
    System.out.println(properties.getProperty("HOST"));
       }
  }
