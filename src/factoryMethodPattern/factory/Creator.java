package factoryMethodPattern.factory;

import factoryMethodPattern.object.Game;

public abstract class Creator {
    public final Game playGame(String name){
        Game game = createGame(name);
        runGame(name);
        return game;
    }

    abstract protected Game createGame(String name);

    private void runGame(String name){
        System.out.println(name +"을 시작합니다.");
    }
}
