package pokemons;

import moves.Rest;
import moves.RockTomb;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Trapinch extends Pokemon {
    public Trapinch(String name, int level) {
        super(name, level);
        this.setType(Type.GROUND);
        this.setStats(45,100,45,45,45,10);
        this.setMove(new RockTomb(), new Rest());
    }
}
