package SkyBeings;

import BeingsOfTheEarth.LivingBeing;

public class Bird extends LivingBeing implements SkyBeing{

    @Override
    public void born() {
        System.out.println("Pajaro nacido en el cielo.");
    }

    @Override
    public void grow() {
        System.out.println("Los Pajaros no crecen en el cielo.");
    }

    @Override
    public void reproduce() {
        System.out.println("Pajaro reproduciendose en el cielo.");
    }

    @Override
    public void die() {
        System.out.println("Pajaro muriendo en el cielo.");
    }

    @Override
    public void fly() {
        System.out.println("Pajaro volando en el cielo.");
    }

    @Override
    public void changeDimension() {
        System.out.println("Pajaro Cambiando de dimensión en el cielo.");
    }
}
