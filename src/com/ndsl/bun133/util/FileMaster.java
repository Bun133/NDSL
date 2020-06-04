package com.ndsl.bun133.util;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class FileMaster {
    public static Image getImage(String path){
        return getImage(new File(path));
    }

    public static Image getImage(File file){
        Image image = null;
        try {
            image = ImageIO.read(file);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return image;
    }

    public static final String RESOURCE_ROCATION="resources\\";
}
