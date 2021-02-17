package manager;

import domain.Film;


public class FilmManager {

    private Film[] items = new Film[0];
    private int limits;

    public FilmManager(int limits) {
        this.limits = limits;
    }

    public void add(Film item) {
        int length = items.length + 1;
        Film[] tmp = new Film[length];

        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];
        }

        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }


    public Film[] getLastAddedItems() {

        int length = limits;

        if (length > items.length) {
            length = items.length;
        }

        Film[] result = new Film[length];

        for (int i = 0; i < length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }
}



