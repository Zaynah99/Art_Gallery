import org.example.Artwork;
import org.example.Customer;
import org.example.Gallery;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CustomerTest {

    Customer customer;
    Artwork monaLisa;

    @BeforeEach
    public void setUp(){
        customer = new Customer("Anna", 500.00);
        monaLisa = new Artwork("Mona Lisa", 100.00, 12345);
    }

    @Test
    public void hasName(){
        assertThat(customer.getName()).isEqualTo("Anna");
    }


    @Test
    public void hasWallet(){
        assertThat(customer.getWallet()).isEqualTo(500.00);
    }

    @Test
    public void canSetName(){
        customer.setName("Zsolt");
        assertThat(customer.getName()).isEqualTo("Zsolt");
    }

    @Test
    public void canSetWallet(){
        customer.setWallet(400.00);
        assertThat(customer.getWallet()).isEqualTo(400.00);
    }

    @Test
    public void canRemoveMoney(){
        customer.removeMoney(monaLisa);
        assertThat(customer.getWallet()).isEqualTo(400.00);
    }
}
