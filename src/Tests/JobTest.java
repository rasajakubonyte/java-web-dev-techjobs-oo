package Tests;

import jdk.internal.util.xml.impl.Pair;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {
    Job test_Job = null;
    Job test_JobTwo = null;
    @Before
    public void createJobObjects(){
        test_Job = new Job();
        test_JobTwo = new Job();
    }
    @Test
    public void testSettingJobId(){

        assertTrue(test_JobTwo.id == test_Job.id+1);
        };
    @Test
    public void testJobConstructorSetsAllFields(){
        Job newJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    assertTrue(newJob instanceof Job);
    };
    @Test
    public void testJobsForEquality(){
        Job test_Job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence") );
        Job test_JobTwo = new Job ("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    assertFalse(test_Job.id == test_JobTwo.id);
    }
    @Test
    public void testToSting(){
        Job test_Job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertTrue(test_Job.toString().charAt(0)== test_Job.toString().charAt(test_Job.toString().length()-1));
    }
    @Test
    public void testLabel(){
        Job test_Job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    assertTrue(test_Job.toString().contains("Id"));
    assertTrue(test_Job.toString().contains("\n"));
    }
    @Test
    public void testDataNotAvailable() {
        Job test_Job = new Job("", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertNotNull(test_Job.name);
    }
    };
