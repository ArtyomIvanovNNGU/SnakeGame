package com.mysnake.app.model;

import java.awt.*;
import java.awt.geom.Rectangle2D;

public class Food {
    private double x, y;
    private int size = 10;

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Rectangle2D.Double getFd() {
        return fd;
    }

    public void setFd(Rectangle2D.Double fd) {
        this.fd = fd;
    }

    public Color getFoodColor() {
        return foodColor;
    }

    private Rectangle2D.Double fd;
    private final Color foodColor = Color.blue;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Rectangle2D.Double getFoodRect() {
        return fd;
    }

    Food(int widthPanel, int heightPanel) {
        fd = new Rectangle2D.Double();
        this.relocate(widthPanel, heightPanel);
    }

    public void relocate(int widthPanel, int heightPanel) {
        x = Math.random() * widthPanel;
        y = Math.random() * heightPanel;

        x = Math.floor(x / 10) * 10;
        y = Math.floor(y / 10) * 10;

        if (x < Snake.snakeWidth)
            x = Snake.snakeWidth;
        else if (x > widthPanel - Snake.snakeWidth)
            x = widthPanel - Snake.snakeWidth;

        if (y < Snake.snakeWidth)
            y = Snake.snakeWidth;
        else if (y > heightPanel - Snake.snakeWidth)
            y = heightPanel - Snake.snakeWidth;

        fd.setRect(x, y, size, size);
    }
}