import org.example.Artwork;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ArtworkTest {

    Artwork monaLisa;

    @BeforeEach
    public void setUP(){
        monaLisa = new Artwork("Mona Lisa", 100.00, 12345);
    }

    @Test
    public void hasTitle(){
        assertThat(monaLisa.getTitle()).isEqualTo("Mona Lisa");
    }


    @Test
    public void hasPrice(){
        assertThat(monaLisa.getPrice()).isEqualTo(100.00);
    }


    @Test
    public void hasNFT(){
        assertThat(monaLisa.getNFT()).isEqualTo(12345);
    }


    @Test
    public void canSetPrice(){
        monaLisa.setPrice(200.00);
        assertThat(monaLisa.getPrice()).isEqualTo(200.00);
    }

}
