package com.ndsl.bun133.game;

import com.ndsl.bun133.display.Display;
import com.ndsl.bun133.display.drawable.Drawable;
import com.ndsl.bun133.game.map.pos.Point;
import com.ndsl.bun133.game.register.Blocks;
import com.ndsl.bun133.logger.Logger;

public class GameMain {
    /** Blockの解像度 **/
    public static final int BLOCK_SIZE=64;
    /** 1チャンクの1辺のブロック数 **/
    public static final int CHUNK_SIZE=256;
    public static final Logger logger=new Logger(true,false);

    public Display display=new Display("Test",100,100,500,500);


    public GameMain(){
        logger.debug("[GameMain]onStart");
        display.addDrawable(new Drawable(Blocks.TEST_BLOCK.BlockImage,new Point(100,100)));
    }

    public void run(){
    }
}
