package com.akhilesh.learnspringaws;

public class GameRunner {
    GameCartiage _game;
    public GameRunner(GameCartiage marioGame) {
        this._game=marioGame;
    }

    public void run() {
        this._game.run();
    }
}
