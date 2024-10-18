package moves;

import ru.ifmo.se.pokemon.*;

public class RockTomb extends PhysicalMove {
    public RockTomb() {
        super(Type.ROCK, 60, 0.95);
    }

    //Has a 100% chance to lower the target's Speed by one stage.
    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect RockTomb = new Effect().stat(Stat.SPEED, -1).turns(1);
        pokemon.addEffect(RockTomb);
    }

    @Override
    protected String describe() {
        return "атакует атакой Rock Tomb";
    }
}



