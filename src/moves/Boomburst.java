package moves;

import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class Boomburst extends SpecialMove {
    public Boomburst() {
        super(Type.NORMAL, 140, 1);
    }

    //Inflicts regular damage.
    @Override
    protected String describe() {
        return "атакует атакой Boomburst";
    }
}
