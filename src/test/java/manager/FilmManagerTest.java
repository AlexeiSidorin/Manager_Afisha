package manager;

import static org.junit.jupiter.api.Assertions.*;

import domain.Film;
import org.junit.jupiter.api.Test;


public class FilmManagerTest {
    private FilmManager manager = new FilmManager(10);

    Film item1 = new Film(1, "Film1", 100, 4);
    Film item2 = new Film(2, "Film2", 150, 6);
    Film item3 = new Film(3, "Film3", 150, 2);
    Film item4 = new Film(4, "Film4", 200, 4);
    Film item5 = new Film(5, "Film5", 100, 6);
    Film item6 = new Film(6, "Film6", 200, 2);
    Film item7 = new Film(7, "Film7", 300, 8);
    Film item8 = new Film(8, "Film8", 150, 9);
    Film item9 = new Film(9, "Film9", 100, 2);
    Film item10 = new Film(10, "Film10", 200, 1);
    Film item11 = new Film(11, "Film11", 200, 8);
    Film item12 = new Film(12, "Film12", 100, 3);

    @Test
    void shouldAdd() {

        manager.add(item1);
        manager.add(item5);
        manager.add(item9);

        Film[] actual = manager.getLastAddedItems();
        Film[] expected = new Film[]{item9, item5, item1};

        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldEmpty() {

        Film[] actual = manager.getLastAddedItems();
        Film[] expected = new Film[]{};

        assertArrayEquals(expected, actual);
    }


    @Test
    void shouldAddMoreThan10() {

        manager.add(item1);
        manager.add(item2);
        manager.add(item3);
        manager.add(item4);
        manager.add(item5);
        manager.add(item6);
        manager.add(item7);
        manager.add(item8);
        manager.add(item9);
        manager.add(item10);
        manager.add(item11);
        manager.add(item12);

        Film[] actual = manager.getLastAddedItems();
        Film[] expected = new Film[]{item12, item11, item10, item9, item8, item7, item6, item5, item4, item3};

        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldShowLessThan10() {
        FilmManager manager = new FilmManager(5);

        manager.add(item1);
        manager.add(item2);
        manager.add(item3);
        manager.add(item4);
        manager.add(item5);
        manager.add(item6);
        manager.add(item7);
        manager.add(item8);
        manager.add(item9);
        manager.add(item10);

        Film[] actual = manager.getLastAddedItems();
        Film[] expected = new Film[]{item10, item9, item8, item7, item6};

        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldShowMoreThan10() {
        FilmManager manager = new FilmManager(12);

        manager.add(item1);
        manager.add(item2);
        manager.add(item3);
        manager.add(item4);
        manager.add(item5);
        manager.add(item6);
        manager.add(item7);
        manager.add(item8);
        manager.add(item9);
        manager.add(item10);
        manager.add(item11);
        manager.add(item12);

        Film[] actual = manager.getLastAddedItems();
        Film[] expected = new Film[]{item12, item11, item10, item9, item8, item7, item6, item5, item4, item3, item2, item1};

        assertArrayEquals(expected, actual);
    }
}