package com.ndsl.bun133.game.map.chunk.block;

import com.ndsl.bun133.display.drawable.Drawable;
import com.ndsl.bun133.game.map.Map;
import com.ndsl.bun133.game.map.chunk.block.status.BlockStatus;
import com.ndsl.bun133.game.map.graphics.BlockDrawable;
import com.ndsl.bun133.game.map.pos.onMapBlockPos;

public class onMapBlock {
    public Block block;
    public onMapBlockPos pos;
    public Map CurrentMap;
    public com.ndsl.bun133.game.map.chunk.block.status.BlockStatus BlockStatus;

    public onMapBlock(Block block,onMapBlockPos pos,Map map){
        this.block=block;
        this.pos=pos;
        this.CurrentMap=map;
        BlockStatus=new BlockStatus(this);
    }

    public BlockDrawable getDrawable(){
        return new BlockDrawable(block.BlockImage,pos,CurrentMap,BlockStatus);
    }
}
