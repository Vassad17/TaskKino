package ru.netology.kino;

public class KinoManager {
    private String[] films = new String[0];
    private int limit;

    public KinoManager() {
        this.limit = 5;
    }

    public KinoManager(int limit) {
        this.limit = limit;
    }

    public void addFilms (String Films) {
        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = Films;
        films = tmp;
    }

    public String[] findAll() {
        return films;
    }

    public String[] findLast() {
        int limitFilmsSize = Math.min(films.length, limit);
        String[] limitFilms = new String[limitFilmsSize];
        for (int i = 0; i < limitFilmsSize; i++){
            limitFilms[i] = films[films.length - 1 - i];
        }
        return limitFilms;
    }


    }
