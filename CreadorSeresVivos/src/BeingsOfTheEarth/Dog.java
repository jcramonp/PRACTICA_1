package BeingsOfTheEarth;

public class Dog extends LivingBeing implements EarthBeing {
    @Override
    public void born() {
        System.out.println("Perro nacido en la tierra");
    }

    @Override
    public void grow() {
        System.out.println("Perro creciendo en la tierra");
    }

    @Override
    public void reproduce() {
            System.out.println("Perro reproduciendose en la tierra");
    }

    @Override
    public void respawn() {
        System.out.println("Perro reapareciendo en la tierra");
    }

    @Override
    public void die() {
        System.out.println("Perro muriendo en la tierra");
    }
}

