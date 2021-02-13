package manager;

import domain.Film;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class FilmManagerTest {

    FilmManager manager = new FilmManager(10);

    Film item1 = new Film(1, "Один дома", 200, 5);
    Film item2 = new Film(2, "Терминатор", 240, 3);
    Film item3 = new Film(3, "Тени", 210, 5);
    Film item4 = new Film(4, "Осенняя сонтана", 234, 8);
    Film item5 = new Film(5, "Наташа", 199, 1);
    Film item6 = new Film(6, "Манхэттен", 135, 3);
    Film item7 = new Film(7, "Любовь и смерть", 256, 7);
    Film item8 = new Film(8, "Мужья и жены", 293, 4);
    Film item9 = new Film(9, "Бертман", 212, 9);
    Film item10 = new Film(10, "Лица", 267, 12);
    Film item11 = new Film(11, "Корпорация святые моторы", 193, 5);
    Film item12 = new Film(12, "Психо", 256, 3);


    @Test
    void shouldAdd() {
        Film[] actual = manager.add(item1);
        Film[] expect = {item1};
        assertArrayEquals(expect, actual);

    }

    @Test
    void shouldGetAllTenItems() {

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

        Film[] actual = manager.getOnlyTenWithLastOne();
        Film[] expect = {item12, item11, item10, item9, item8, item7, item6, item5, item4, item3};

        assertArrayEquals(expect, actual);
    }

    @Test
    void shouldGetAllLessThenTen() {

        manager.add(item1);
        manager.add(item2);
        manager.add(item3);
        manager.add(item4);


        Film[] actual = manager.getOnlyTenWithLastOne();
        Film[] expect = {item4, item3, item2, item1};

        assertArrayEquals(expect, actual);
    }

}