/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package okienko;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;

/**
 *
 * @author kruczkowski
 */
public class ShapeInfo {
    enum ShapeType{OVAL, RECTANGLE, TRIANGLE, HEXAGON};
     ShapeType sType;
     int x, y;
    java.awt.Color color;
    int xsize, ysize;
    
    

    public ShapeInfo(ShapeType sType, int x, int y, Color color, int xsize, int ysize) {
        this.sType = sType;
        this.x = x;
        this.y = y;
        this.color = color;
        this.xsize = xsize;
        this.ysize = ysize;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getxSize() {
        return xsize;
    }

    public void setxSize(int xsize) {
        this.xsize = xsize;
    }
    
    public int getySize() {
        return ysize;
    }

    public void setySize(int ysize) {
        this.ysize = ysize;
    }
    
    

    public ShapeType getsType() {
        return sType;
    }

    public void setsType(ShapeType sType) {
        this.sType = sType;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    
    
}
