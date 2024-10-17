package moves;

import ru.ifmo.se.pokemon.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.PhysicalMove;

public class Facade extends PhysicalMove {
    public Facade() {
        super(Type.NORMAL, 70, 1);
    }

    //boolean s = false;

    //Power doubles if user is burned, paralyzed, or poisoned.
    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        /*
        Effect a = new Effect().turns(0);
        a.burn(pokemon);
        if (s == true) {
            //power = power / 2;
            s = false;
        }//чтобы сила возвращалась в прежднее значение
        */
        if (pokemon.getCondition() == Status.BURN || pokemon.getCondition() == Status.PARALYZE || pokemon.getCondition() == Status.POISON) {
            //System.out.println(power);
            power *= 2;
            //System.out.println(power);
            //s = true;
        }
    }


    @Override
    protected String describe() {
        return "атакует атакой Facade";
    }
}

