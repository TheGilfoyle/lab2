package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.Type;

public class Flygon extends Vibrava {
    public Flygon(String name, int level) {
        super(name, level);
        this.setType(Type.DRAGON, Type.GROUND);
        this.setStats(80,100,80,80,80,100);
        this.addMove(new Screech());
    }
}
