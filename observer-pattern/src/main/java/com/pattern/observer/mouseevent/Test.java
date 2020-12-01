package com.pattern.observer.mouseevent;

import com.pattern.observer.mouseevent.handler.Mouse;
import com.pattern.observer.mouseevent.handler.MouseEventLisenter;
import com.pattern.observer.mouseevent.handler.MouseEventType;

/**
 * Created by wangzhengpeng
 */
public class Test {
    public static void main(String[] args) {
        MouseEventLisenter lisenter = new MouseEventLisenter();

        Mouse mouse = new Mouse();
        mouse.addLisenter(MouseEventType.ON_CLICK,lisenter);
        mouse.addLisenter(MouseEventType.ON_MOVE,lisenter);

        mouse.click();
        mouse.move();
    }
}
