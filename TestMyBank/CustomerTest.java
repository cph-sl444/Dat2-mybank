import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)

class CustomerTest {
    Customer testCustomer;
    String name;
    Status status;
    int id;

    @BeforeEach
    void setUpCustomer() {
        new Customer("signe",Status.ADULT,123);
    }



    @Test
    void testAddAccount() {
        assertEquals(name,testCustomer.getName());
        assertEquals(id,testCustomer.getId());
        assertEquals(status,testCustomer.getStatus());

    }

    @Test
    void remove() {


    }

    @Test
    void setName() {
        assertEquals(name,testCustomer.setName());

    }

    @Test
    void setStatus() {
        assertEquals(status,testCustomer.getStatus());
    }

    @Test
    void getName() {
        assertEquals(name,testCustomer.getName());
    }

    @Test
    void getStatus() {

    }

    @Test
    void getId() {
        assertEquals(id,testCustomer.getId());
    }
}