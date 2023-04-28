/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.shawu.japplet;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
/**
 *
 * @author carby
 */
public class JApplet extends Applet {    
    
    @Override
    public void paint(Graphics g) {
        g.drawString("Hometown - Portland, Jamaica", 20, 20);

    }
}
