package moves;

import ru.ifmo.se.pokemon.*;

public class WorkUp extends StatusMove {
    public WorkUp() {
        super(Type.NORMAL, 0, 1);
    }
    //Raises the user's Attack and Special Attack by one stage each.

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        Effect effect = new Effect().turns(0).stat(Stat.ATTACK, 1).stat(Stat.SPECIAL_ATTACK, 1);
        pokemon.addEffect(effect);
    }


    @Override
    protected String describe() {
        return "атакуе атакой Work Up";
    }
}