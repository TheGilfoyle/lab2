package moves;

import ru.ifmo.se.pokemon.*;

public class Screech extends StatusMove {
    //    Lowers the target's Defense by two stages.
    public Screech() {
        super(Type.NORMAL, 0, 0.85);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect Screech = new Effect().stat(Stat.DEFENSE, -2).turns(1);
        pokemon.addEffect(Screech);
    }

    @Override
    protected String describe() {
        return "атакует атакой Screech";
    }
}
