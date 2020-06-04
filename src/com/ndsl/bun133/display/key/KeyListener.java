package com.ndsl.bun133.display.key;

import com.ndsl.bun133.display.Display;

import java.awt.event.KeyEvent;

public class KeyListener implements java.awt.event.KeyListener {
    public KeyListener(Display display){
        display.addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    private void addAndSet(){

    }
}
