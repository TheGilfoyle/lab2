package moves;

import ru.ifmo.se.pokemon.*;

public class Swagger extends StatusMove {
    public Swagger() {
        super(Type.NORMAL, 0, 0.85);
    }

    //    Raises the target's Attack by two stages and confuses the target.


    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect Swagger = new Effect().turns(1).stat(Stat.ATTACK, 2);
        pokemon.addEffect(Swagger);
        pokemon.confuse();
    }

    @Override
    protected String describe() {
        return "атакует атакой Swagger";
    }

}


