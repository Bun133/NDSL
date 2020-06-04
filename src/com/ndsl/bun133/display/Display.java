package com.ndsl.bun133.display;

import com.ndsl.bun133.display.drawable.Drawable;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Display extends JFrame {
    public Display(String title){
        this.setTitle(title);
    }



    public List<Drawable> drawableList = new ArrayList<>();

    public void addDrawable(Drawable drawable){
        drawableList.add(drawable);
    }

    @Override
    public void update(Graphics g) {
        boolean isRepaint=false;
        for(Drawable drawable:drawableList){
            if(drawable.isNeedDraw()){
                isRepaint=true;
                drawable.draw(this);
            }
        }
        if(isRepaint) repaint();
    }

    @Override
    public void repaint(long time, int x, int y, int width, int height) {
        super.repaint(time, x, y, width, height);
    }
}
