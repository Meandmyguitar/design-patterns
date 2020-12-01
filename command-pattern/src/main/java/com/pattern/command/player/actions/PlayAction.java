package com.pattern.command.player.actions;

import com.pattern.command.player.GPlayer;
import com.pattern.command.player.IAction;

/**
 * Created by wangzhengpeng
 */
public class PlayAction implements IAction {
    private GPlayer gplayer;

    public PlayAction(GPlayer gplayer) {
        this.gplayer = gplayer;
    }

    public void execute() {
        gplayer.play();
    }
}
