package com.ndsl.bun133.game.map.graphics;

import com.ndsl.bun133.display.Display;
import com.ndsl.bun133.display.drawable.Drawable;
import com.ndsl.bun133.game.map.Map;
import com.ndsl.bun133.game.map.chunk.block.status.BlockStatus;
import com.ndsl.bun133.game.map.pos.onMapBlockPos;

import java.awt.*;

public class BlockDrawable extends Drawable {
    public onMapBlockPos pos;
    public Map CurrentMap;
    public BlockStatus BlockStatus;


    public BlockDrawable(Image image, onMapBlockPos pos, Map map, BlockStatus status){
        super();
//        super(status.animator.getImage(),pos.getLeft_UP());
        this.pos=pos;
        this.BlockStatus=status;
    }

    @Override
    public void draw(Display display) {
        BlockStatus.isUpdated=false;
        BlockStatus.animator.onDraw(display);
    }

    @Override
    public boolean isNeedDraw() {
        return BlockStatus.isUpdated;
    }

    @Override
    public boolean isShowing(Display display) {
        return CurrentMap.isShowing(pos);
    }
}
