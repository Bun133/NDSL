package com.ndsl.bun133.game.map.pos;

import com.ndsl.bun133.game.map.Map;

import java.util.ArrayList;
import java.util.List;

public class onMapRect {
    public onMapBlockPos left_up;
    public onMapBlockPos right_down;

    public onMapRect(onMapBlockPos left_up,onMapBlockPos right_down){
        this.left_up=left_up;
        this.right_down=right_down;
    }

    public List<onMapBlockPos> getAll(Map map){
        List<onMapBlockPos> list=new ArrayList<>();
        for (int x = 0; x < right_down.pos_x - left_up.pos_x; x++) {
            for (int y = 0; y < left_up.pos_y - right_down.pos_y; y++) {
                list.add(new onMapBlockPos(left_up.pos_x+x,right_down.pos_y+y,map));
            }
        }
        return list;
    }
}
