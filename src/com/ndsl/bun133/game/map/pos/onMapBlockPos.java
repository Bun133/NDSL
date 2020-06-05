package com.ndsl.bun133.game.map.pos;

import com.ndsl.bun133.game.GameMain;
import com.ndsl.bun133.game.map.Map;
import com.ndsl.bun133.game.map.chunk.block.Block;

public class onMapBlockPos {
    public int pos_x;
    public int pos_y;
    public Map map;
    public onMapBlockPos(int x, int y, Map map){
        this.pos_x=x;
        this.pos_y=y;
        this.map=map;
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
        return new Point(pos_x*GameMain.BLOCK_SIZE + map.shift_x,pos_y*GameMain.BLOCK_SIZE + map.shift_y);
    }
}
