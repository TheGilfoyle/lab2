package moves;

import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove {
    public Rest() {
        super(Type.PSYCHIC, 0, 1);
    }

    //User sleeps for two turns, completely healing itself.
    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        Effect Rest = new Effect().condition(Status.SLEEP).turns(2);
        pokemon.restore();
        pokemon.addEffect(Rest);
    }

    @Override
    protected String describe() {
        return "атакует атакой Rest";
    }
}


