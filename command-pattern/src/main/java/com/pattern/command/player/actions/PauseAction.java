package com.pattern.command.player.actions;

import com.pattern.command.player.GPlayer;
import com.pattern.command.player.IAction;

/**
 * Created by wangzhengpeng
 */
public class PauseAction implements IAction {
    private GPlayer gplayer;

    public PauseAction(GPlayer gplayer) {
        this.gplayer = gplayer;
    }

    public void execute() {
        gplayer.pause();
    }
}
