package com.zodiacleo;

import com.zodiacleo.entities.*;

public class RunDemoWithoutSpring
{
    public static void main(String[] a)
    {
        Team redSox = new RedSox();
        Team cubs = new Cubs();
        Game game = new BaseballGame(redSox, cubs);
        System.out.println(game.playGame());
    }
}
