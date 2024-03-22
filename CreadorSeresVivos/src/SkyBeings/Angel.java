package SkyBeings;

import BeingsOfTheEarth.EarthBeing;
import BeingsOfTheEarth.LivingBeing;

public class Angel extends LivingBeing implements SkyBeing {

    @Override
    public void born() {
        System.out.println("Ángel nacido en el cielo.");
    }

    @Override
    public void grow() {
        System.out.println("Los ángeles crecen en el cielo.");
    }

    @Override
    public void reproduce() {
        System.out.println("Ángel reproduciendose en el cielo.");
    }


    @Override
    public void die() {
        System.out.println("Ángel muriendo en el cielo.");
    }

    @Override
    public void fly() {
        System.out.println("Ángel volando en el cielo.");
    }

    @Override
    public void changeDimension() {
        System.out.println("ÁngelCambiando de dimensión en el cielo.");
    }
}
