package moves;

import ru.ifmo.se.pokemon.*;

public class DoubleTeam extends StatusMove {
    public DoubleTeam() {
        super(Type.NORMAL, 0, 0);
    }
//    Raises the user's evasion by one stage.
    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.EVASION,1);
    }

    @Override
    protected String describe() {
        return "атакует атакой Double Team";
    }
}

