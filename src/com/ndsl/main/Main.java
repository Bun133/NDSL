package com.ndsl.main;

import com.ndsl.bun133.display.drawable.Drawable;
import com.ndsl.bun133.game.GameMain;
import com.ndsl.bun133.game.map.pos.Point;
import com.ndsl.bun133.game.register.Blocks;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        GameMain gamemain = new GameMain();
        while(true){
            gamemain.run();
//            GameMain.logger.println("Test");
            Thread.sleep(1);
            gamemain.display.update();
        }
    }
}
