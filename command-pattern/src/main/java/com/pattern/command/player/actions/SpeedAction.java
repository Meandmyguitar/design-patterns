package com.pattern.command.player.actions;

import com.pattern.command.player.GPlayer;
import com.pattern.command.player.IAction;

/**
 * Created by wangzhengpeng
 */
public class SpeedAction implements IAction {
    private GPlayer gplayer;

    public SpeedAction(GPlayer gplayer) {
        this.gplayer = gplayer;
    }

    public void execute() {
        gplayer.speed();
    }
}
