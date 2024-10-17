package moves;

import ru.ifmo.se.pokemon.*;

public class Screech extends StatusMove {
//    Lowers the target's Defense by two stages.
    public Screech() {
        super(Type.NORMAL, 0, 0.85);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.DEFENSE, -2);
    }

    @Override
    protected String describe() {
        return "атакует атакой Screech";
    }
}
