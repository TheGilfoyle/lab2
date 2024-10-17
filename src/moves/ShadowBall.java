package moves;

import ru.ifmo.se.pokemon.*;

public class ShadowBall extends SpecialMove {
    public ShadowBall() {
        super(Type.GHOST, 80, 1);
    }

    //Has a 20% chance to lower the target's Special Defense by one stage.
    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect shadowBall = new Effect().chance(0.2).stat(Stat.SPECIAL_DEFENSE, -1);
        pokemon.addEffect(shadowBall);
    }


    @Override
    protected String describe() {
        return "использует Shadow Ball";
    }
}
