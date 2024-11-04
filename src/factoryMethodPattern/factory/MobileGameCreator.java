package factoryMethodPattern.factory;

import factoryMethodPattern.object.Game;
import factoryMethodPattern.object.MobileGame;

public class MobileGameCreator extends Creator{
    @Override
    protected Game createGame(String name) {
        return new MobileGame(name);
    }
}
