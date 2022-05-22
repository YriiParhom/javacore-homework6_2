import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class TestEmployee {

    @Test
    public void testGetId() {
        Employee employee = new Employee();
        employee.setId(12);

        assertThat(12L, equalTo(employee.getId()));
    }

    @Test
    public void testGetFirstName() {
        Employee employee = new Employee();
        employee.setFirstName("Max");

        assertThat("Max", equalTo(employee.getFirstName()));
    }

    @Test
    public void testSetLastName() {
        Employee employee = new Employee();
        employee.setLastName("Voronov");

        assertThat("Voronov", equalTo(employee.lastName));
    }

    @Test
    public void testLastNameHamcrestFeature() {
        Employee employee = new Employee();
        employee.setLastName("Petrov");

        assertThat("Petrov", anyOf(containsString("Pet"), endsWith("rov")));
    }

    @Test
    public void testGetIdHamcrestFeature() {
        Employee employee = new Employee();
        employee.setId(125);

        assertThat(125, allOf(greaterThan(68), lessThan(250), not(equalTo(100))));
    }
}
