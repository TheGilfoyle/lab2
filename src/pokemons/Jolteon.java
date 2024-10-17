package pokemons;

import moves.Swagger;
import moves.Tackle;
import moves.Thunder;
import moves.WorkUp;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Jolteon extends Pokemon {
    public Jolteon(String name, int level) {
        super(name, level);
        this.setType(Type.ELECTRIC);
        this.setStats(65,65,60,110,95,130);
        this.setMove(new Swagger(),new WorkUp(), new Tackle(), new Thunder());
    }
}