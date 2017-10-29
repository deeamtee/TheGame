package com.thegame.main;


import com.thegame.display.Display;
import com.thegame.game.Game;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class main {
    public static void main(String[] args) {
        Game theGame = new Game();
        theGame.start();

    }
}