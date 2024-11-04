package factoryMethodPattern;

import factoryMethodPattern.factory.Creator;
import factoryMethodPattern.factory.MobileGameCreator;
import factoryMethodPattern.factory.PCGameCreator;
import factoryMethodPattern.object.Game;

public class Client {
    public static void main(String[] args) {
       Creator gameCreator = new MobileGameCreator();
       gameCreator.playGame("funfun Game");

       gameCreator = new PCGameCreator();
       gameCreator.playGame("fantastic Game");
    }
}
