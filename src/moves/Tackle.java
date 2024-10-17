package moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class Tackle extends PhysicalMove {
    public Tackle() {
        super(Type.NORMAL, 40, 1);
    }
    //Inflicts regular damage with no additional effect.

    @Override
    protected String describe() {
        return "атакует обычной атакой moves.Tackle";
    }
}

