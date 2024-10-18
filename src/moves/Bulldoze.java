package moves;

import ru.ifmo.se.pokemon.*;

public class Bulldoze extends PhysicalMove {
    public Bulldoze() {
        super(Type.GROUND, 60, 1);
    }

    //Has a 100% chance to lower the target's Speed by one stage.
    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect Bulldoze = new Effect().stat(Stat.SPEED, -1).turns(1);
        pokemon.addEffect(Bulldoze);
    }

    @Override
    protected String describe() {
        return "атакует атакой Bulldoze";
    }
}
