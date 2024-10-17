package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Flygon extends Pokemon {
    public Flygon(String name, int level) {
        super(name, level);
        this.setType(Type.DRAGON, Type.GROUND);
        this.setStats(80,100,80,80,80,100);
//        this.set
        this.setMove(new Rest(), new RockTomb(), new Boomburst(), new Screech());
        //new RockTomb(),        this.setMove(  new Facade());
    }
}
