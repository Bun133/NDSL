package com.ndsl.bun133.display.drawable;

import com.ndsl.bun133.display.Display;
import com.ndsl.bun133.display.pos.onDisplayLine;
import com.ndsl.bun133.display.pos.onDisplayRect;
import com.ndsl.bun133.game.map.pos.Point;
import com.ndsl.bun133.game.map.pos.Rect;

import java.awt.*;

public class Drawable {
    public DrawableType Drawabletype;

    /**
     * @param image
     */
    public Drawable(Image image, Point left_up){
        this.image=image;
        Drawabletype=DrawableType.IMAGE;
        this.Image_rect=new onDisplayRect(left_up.x,left_up.y,left_up.x+image.getWidth(null),left_up.y+image.getHeight(null));
    }

    /**
     * for DrawableType.Image
     */
    public Image image;
    public onDisplayRect Image_rect;

    /**
     * @param rect
     */
    public Drawable(onDisplayRect rect){
        this(rect,new Color(0,0,0));
    }

    public Drawable(onDisplayRect rect,Color color){
        this.rect=rect;
        Drawabletype=DrawableType.RECT;
        rect_color=color;
    }

    /**
     * for DrawableType.Rect
     */
    public onDisplayRect rect;
    public Color rect_color;

    /**
     * @param line
     */
    public Drawable(onDisplayLine line){
        this(line,new Color(0,0,0));
    }

    public Drawable(onDisplayLine line,Color color){
        this.line=line;
        Drawabletype=DrawableType.LINE;
    }

    /**
     * for DrawableType.Line
     */
    public onDisplayLine line;
    public Color line_color;
    /**
     * @param r
     */
    public Drawable(Runnable r){
        this.runnable=r;
        Drawabletype=DrawableType.RUNNABLE;
    }

    public Runnable runnable;


    /**
     * Below is DrawSection
     */

    public void draw(Display display){
        switch (this.Drawabletype){
            case LINE:
                Graphics g=display.getGraphics();
                g.setColor(line_color);
                g.drawLine(line.left_up.pos_x,line.left_up.pos_y,line.right_down.pos_x,line.right_down.pos_y);
                break;
            case RECT:
                Graphics g=display.getGraphics();
                g.setColor(rect_color);
                g.fillRect(rect.left_up.pos_x,rect.left_up.pos_y,rect.getWidth(),rect.getHeight());
                break;
            case IMAGE:
                display.getGraphics().drawImage(image,Image_rect.left_up.pos_x,Image_rect.left_up.pos_y,null);
                break;
            case RUNNABLE:
                runnable.run();
                break;
        }
    }

    /**
     * @return is Need Repaint(or Draw)
     */
    public boolean isNeedDraw() {
        return true;
    }
}
