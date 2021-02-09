package manager;


import domain.Film;

import java.util.Arrays;

class FilmManager {
    private Film[] films = new Film[0];
    private int limits = 10;


    FilmManager(int limits){
        this.limits=limits;
    }
    FilmManager(){

    }


    public Film[] add(Film film) {

        int length = films.length + 1;
        Film[] tmp = new Film[length];

        System.arraycopy(films, 0, tmp, 0, films.length);


        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = film;
        films = tmp;
        return tmp;
    }

    public Film[] getOnlyTenWithLastOne() {
        Film[] resultAll = new Film[films.length];


        for (int i = 0; i < resultAll.length; i++) {
            int index = films.length - i - 1;
            resultAll[i] = films[index];
        }

        Film[] onlyTenFilms = Arrays.copyOfRange(resultAll,0,10);

        if(films.length > 10) {
            return onlyTenFilms;
        } else {
            return resultAll;
        }

    }


}