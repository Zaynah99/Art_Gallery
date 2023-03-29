import org.example.Gallery;
import org.example.Artwork;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GalleryTest {

    Gallery gallery;
    Artwork artwork;
    Artwork painting;

    @BeforeEach
    public void setUp() {
        gallery = new Gallery("Louvre");
        artwork = new Artwork("Mona Lisa", 100.00, 12345);
        painting = new Artwork("Painting", 50.00, 54321);
        gallery.addArtwork(artwork);
        gallery.addArtwork(painting);
    }

    @Test
    public void hasName() {
        assertThat(gallery.getName()).isEqualTo("Louvre");
    }

    @Test
    public void canSetName() {
        gallery.setName("Tate Modern");
        assertThat(gallery.getName()).isEqualTo("Tate Modern");
    }

    @Test
    public void hasTill () {
        assertThat(gallery.getTill()).isEqualTo(0.00);
    }

    @Test
    public void canSetTill(){
        gallery.setTill(100.00);
        assertThat(gallery.getTill()).isEqualTo(100.00);
    }

    @Test
    public void canAddMoneyToTill(){
        gallery.addMoneyToTill(painting);
        assertThat(gallery.getTill()).isEqualTo(50.00);
    }

    @Test
    public void canAddArtwork(){
        Artwork statue = new Artwork("Statue", 150.00, 56789);
        gallery.addArtwork(statue);
        assertThat(gallery.getStockSize()).isEqualTo(3);
    }

    @Test
    public void canRemoveArtwork(){
        gallery.removeArtwork(painting);
        assertThat(gallery.getStockSize()).isEqualTo(1);
    }



}

