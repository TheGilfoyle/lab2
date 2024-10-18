package moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.PhysicalMove;

public class Facade extends PhysicalMove {
    public Facade() {
        super(Type.NORMAL, 70, 1);
    }

    //Power doubles if user is burned, paralyzed, or poisoned.
    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        switch (pokemon.getCondition()) {
            case BURN, POISON, PARALYZE -> {
                this.power = 140;
            }
            default -> this.power = 70;
        }
    }

    @Override
    protected String describe() {
        return "атакует атакой Facade";
    }
}

