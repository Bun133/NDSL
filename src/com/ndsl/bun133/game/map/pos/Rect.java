package com.ndsl.bun133.game.map.pos;

import com.ndsl.bun133.display.pos.onDisplayRect;

public class Rect {
    public Point left_up;
    public Point right_down;
    public Rect(Point left_up,Point right_down){
        this.left_up=left_up;
        this.right_down=right_down;
    }

    public Rect(int left_up_x,int left_up_y,int right_down_x,int right_down_y){
        this(new Point(left_up_x,left_up_y),new Point(right_down_x,right_down_y));
    }

    public Point[] getPoints(){
        Point[] points=new Point[4];
        points[0]=left_up;
        points[1]=new Point(left_up.x,right_down.y);
        points[2]=new Point(right_down.x,left_up.y);
        points[3]=right_down;
        return points;
    }

    public boolean isContain(Point point){
        return left_up.x<=point.x && left_up.y<=point.y && point.x<=right_down.x && point.y<=right_down.y;
    }

    public boolean isContain(Rect rect){
        for(Point point:getPoints()){
            if(isContain(point)) return true;
        }
        for(Point point:rect.getPoints()){
            if(isContain(point)) return true;
        }
        return false;
    }

    public boolean isContain(onDisplayRect rect){
        for(Point point:getPoints()){
            if(isContain(point)) return true;
        }
        for(Point point:rect.getPoints()){
            if(isContain(point)) return true;
        }
        return false;
    }
}
