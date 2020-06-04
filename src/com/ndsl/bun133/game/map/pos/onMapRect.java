package com.ndsl.bun133.game.map.pos;

public class onMapRect {
    public onMapBlockPos left_up;
    public onMapBlockPos right_down;

    public onMapRect(onMapBlockPos left_up,onMapBlockPos right_down){
        this.left_up=left_up;
        this.right_down=right_down;
    }
}
