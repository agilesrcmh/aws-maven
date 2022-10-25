package org.martingilday;

//import static org.junit.Assert.assertTrue;

//import org.junit.Test;
import org.testng.annotations.*;



/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    /*@Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }*/

    @BeforeClass
    public void setUp() {
      // code that will be invoked when this test is instantiated
      System.out.println("setup");
    }
   
    @Test(groups = { "fast" })
    public void aFastTest() {
      System.out.println("Fast test");
    }
   
    @Test(groups = { "slow" })
    public void aSlowTest() {
       System.out.println("Slow test");
    }

    @Test(groups = { "functest"})
    public void aFuncTest() {
      System.out.println("aFuncTest");
    }

    @Parameters ({ "first-name" })
    @Test(groups = { "dktest"})
    public void aDKTest(String firstName) {
      System.out.println("Invoked testString" + firstName );
      assert "David".equals(firstName);
    }
}
