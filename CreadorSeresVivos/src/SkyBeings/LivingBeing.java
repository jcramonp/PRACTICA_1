package SkyBeings;

import BeingsOfTheEarth.EarthBeing;

public abstract class LivingBeing implements EarthBeing,SkyBeing {
    public abstract void born();
    public abstract void grow();
    public abstract void reproduce();
    public abstract void die();
}
