package moves;

import ru.ifmo.se.pokemon.*;

public class Thunder extends SpecialMove {
    public Thunder() {
        super(Type.ELECTRIC, 110, 0.7);
    }
//     Has a 30% chance to paralyze the target.

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect thunder = new Effect().chance(0.3).condition(Status.PARALYZE).turns(1);
        pokemon.addEffect(thunder);
    }

    @Override
    protected String describe() {
        return "атакует атакой Thunder";
    }
}