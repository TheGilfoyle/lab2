package moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class RockTomb extends PhysicalMove {
    public RockTomb() {
        super(Type.ROCK, 60,0.95);
    }
    //Has a 100% chance to lower the target's Speed by one stage.
    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.SPEED, -1);
    }
    @Override
    protected String describe() {
        return "атакует атакой Rock Tomb";
    }
}



