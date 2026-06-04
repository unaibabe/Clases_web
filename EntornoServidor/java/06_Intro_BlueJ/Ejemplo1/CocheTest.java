import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class CocheTest
{
    private Coche coche1;
    private Coche coche3;

    /**
     * Default constructor for test class CocheTest
     */
    public CocheTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        coche1 = new Coche(5);
        coche3 = new Coche(7);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }

    @Test
    public void mirarPuertas()
    {
        assertEquals(7, coche3.getPuertas());
    }

    @Test
    public void asignarPuertasDecimales()
    {
        coche1.setPuertas(1/6);
        assertEquals(0.6, coche1.getPuertas());
    }
}

