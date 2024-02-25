package com.akhilesh.using.components;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
    GameCartiage _game;
    //game Cartiage should be auto-injected here
    public GameRunner(@Qualifier("marioGame") GameCartiage game) {
        this._game=game;
    }
    public void run() {
        this._game.run();
    }
}
