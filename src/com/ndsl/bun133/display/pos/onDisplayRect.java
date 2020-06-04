package com.ndsl.bun133.display.pos;

public class onDisplayRect {
    public onDisplayPos left_up;
    public onDisplayPos right_down;
    public onDisplayRect(onDisplayPos left_up,onDisplayPos right_down){
        this.left_up=left_up;
        this.right_down=right_down;
    }

    public onDisplayRect(int left_up_x,int left_up_y,int right_down_x,int right_down_y){
        this(new onDisplayPos(left_up_x,left_up_y),new onDisplayPos(right_down_x,right_down_y));
    }

    public int getWidth(){return right_down.pos_x-left_up.pos_x;}

    public int getHeight(){return left_up.pos_y-right_down.pos_y;}
}
