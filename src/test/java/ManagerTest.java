import org.junit.Before;
import org.junit.Test;
import staff.Employee;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    private Manager manager;

    @Before
    public void before(){
        manager = new Manager("Max", "ST145896", 23000, "DevOps");
    }

    @Test
    public void hasName(){
        assertEquals("Max", manager.getName());
    }

    @Test
    public void hasNINumbers(){
        assertEquals("ST145896", manager.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(23000, manager.getSalary(), 0.0);
    }

    @Test
    public void hasDepartment(){
        assertEquals("DevOps", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(10000);
        assertEquals(33000, manager.getSalary(), 0.0);
    }

    @Test
    public void canPayBonus(){
        double bonus = manager.payBonus();
        assertEquals(230, bonus , 0.0);
    }

}
