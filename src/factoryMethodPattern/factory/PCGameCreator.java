package factoryMethodPattern.factory;

import factoryMethodPattern.object.Game;
import factoryMethodPattern.object.PCGame;

public class PCGameCreator extends Creator{
    @Override
    protected Game createGame(String name) {
        return new PCGame(name);
    }
}
