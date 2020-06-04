package com.ndsl.bun133.game.map.pos;

import com.ndsl.bun133.game.GameMain;
import com.ndsl.bun133.game.map.chunk.block.Block;

public class onMapBlockPos {
    public int pos_x;
    public int pos_y;
    public onMapBlockPos(int x,int y){
        this.pos_x=x;
        this.pos_y=y;
    }

    public Rect getRect(){
        return new Rect(getLeft_UP(),getRight_Down());
    }

    public Point getLeft_UP(){
        return getCenter().add(-GameMain.BLOCK_SIZE/2,-GameMain.BLOCK_SIZE/2);
    }

    public Point getRight_Down(){
        return getCenter().add(GameMain.BLOCK_SIZE/2,GameMain.BLOCK_SIZE/2);
    }

    public Point getCenter(){
        return new Point(pos_x*GameMain.BLOCK_SIZE,pos_y*GameMain.BLOCK_SIZE);
    }
}
