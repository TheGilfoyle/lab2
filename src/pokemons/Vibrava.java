package pokemons;

import moves.Boomburst;
import moves.RockTomb;
import ru.ifmo.se.pokemon.Type;

public class Vibrava extends Trapinch {
    public Vibrava(String name, int level) {
        super(name, level);
        this.setType(Type.DRAGON, Type.GROUND);
        this.setStats(50,70,50,50,50,70);
        this.addMove(new Boomburst());
    }
}
