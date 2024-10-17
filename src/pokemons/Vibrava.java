package pokemons;

import moves.RockTomb;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Vibrava extends Pokemon {
    public Vibrava(String name, int level) {
        super(name, level);
        this.setType(Type.DRAGON, Type.GROUND);
        this.setStats(50,70,50,50,50,70);
        this.setMove(new RockTomb());
    }
}
