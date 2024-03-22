package BeingsOfTheEarth;

import SkyBeings.SkyBeing;

public class Human extends LivingBeing implements SkyBeing {


    @Override
    public void born() {
        System.out.println("Humano nacido en la tierra.");
    }

    @Override
    public void grow() {
        System.out.println("Humano creciendo en la tierra.");
    }

    @Override
    public void reproduce() {
        System.out.println("reproduce  en la tierra.");
    }

    @Override
    public void die() {
        System.out.println("Humano muriendo en la tierra.");
    }

    @Override
    public void fly() {
        System.out.println("Humano volando en el cielo.");
    }

    @Override
    public void changeDimension() {
        System.out.println("Cambiando de dimensión en el cielo.");
    }
}
