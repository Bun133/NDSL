package com.ndsl.bun133.game.map.graphics;

import com.ndsl.bun133.display.drawable.Drawable;
import com.ndsl.bun133.game.map.Map;
import com.ndsl.bun133.game.map.pos.onMapBlockPos;

import java.awt.*;

public class BlockDrawable extends Drawable {
    public onMapBlockPos pos;
    public Map CurrentMap;
    public BlockDrawable(Image image, onMapBlockPos pos, Map map){
        super(image);
        this.pos=pos;
    }

    @Override
    public boolean isNeedDraw() {
        return CurrentMap.isShowing(pos);
    }
}
