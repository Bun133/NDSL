package com.ndsl.bun133.display;

import com.ndsl.bun133.display.drawable.Drawable;
import com.ndsl.bun133.game.GameMain;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferStrategy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Display extends JFrame {
    public BufferStrategy bfi;
    public long passing_time=0;

    public Display(String title,int x,int y,int width,int height){
        this.setTitle(title);
        this.setBounds(x,y,width,height);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.createBufferStrategy(2);
        bfi=getBufferStrategy();
    }

    public List<Drawable> drawableList = new ArrayList<>();

    public void addDrawable(Drawable... drawable){
        drawableList.addAll(Arrays.asList(drawable));
    }

    @Override
    public void update(Graphics g) {
        update();
    }

    public void update(){
        GameMain.logger.low_level_debug("[Display] Update");
        boolean isRepaint=false;
        for(Drawable drawable:drawableList){
            if(drawable.isNeedDraw()){
                if(drawable.isShowing(this)) {
                    isRepaint = true;
                    drawable.draw(this);
                }
            }
        }
        if(isRepaint) repaint();
    }

    @Override
    public void repaint() {
        GameMain.logger.low_level_debug("[Display]repaint");
        if (!bfi.contentsLost()) bfi.show();
        Toolkit.getDefaultToolkit().sync();
        getGraphics().dispose();
        passing_time++;
    }

    @Override
    public Graphics getGraphics() {
        return bfi.getDrawGraphics();
    }

//    public boolean isPreparing(){
//
//    }
}
