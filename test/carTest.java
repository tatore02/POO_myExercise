import org.junit.Test;
import org.junit.Assert;

public class carTest(){
    @Test
    public autonomiaTest(){
        Car car1 = new Car(Twingo,Renault,200,2.5);
        Car car2 = new Car(Captur,Renault,250,2.2);

        Assert.assertEquals(car1.autonomia,200 * 2.5);
        Assert.assertEquals(car2.autonomia,250 * 2.2);
    }
}
