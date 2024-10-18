package moves;

import ru.ifmo.se.pokemon.*;

public class DoubleTeam extends StatusMove {
    public DoubleTeam() {
        super(Type.NORMAL, 0, 1);
    }

    //    Raises the user's evasion by one stage.
    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        Effect DoubleTeam = new Effect().stat(Stat.EVASION, 1).turns(1);
        pokemon.addEffect(DoubleTeam);

    }

    @Override
    protected String describe() {
        return "атакует атакой Double Team";
    }
}

