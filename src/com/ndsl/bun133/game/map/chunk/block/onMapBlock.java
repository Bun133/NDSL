package com.ndsl.bun133.game.map.chunk.block;

import com.ndsl.bun133.display.drawable.Drawable;
import com.ndsl.bun133.game.map.Map;
import com.ndsl.bun133.game.map.graphics.BlockDrawable;
import com.ndsl.bun133.game.map.pos.onMapBlockPos;

public class onMapBlock {
    public Block block;
    public onMapBlockPos pos;
    public Map CurrentMap;

    public BlockDrawable getDrawable(){
        return new BlockDrawable(block.BlockImage,pos,CurrentMap);
    }
}
