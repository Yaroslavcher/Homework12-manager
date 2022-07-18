package ru.netology.manager;

public class Manager {
    protected Films[] films = new Films[0];
    protected Repository repo;
    protected int newLength;

    public Manager() {
        newLength = 10;
    }

    public Manager(int newLength) {
        this.newLength = newLength;
    }

    public Manager(Repository repo) {
        this.repo = repo;
    }
    public void add(Films film) {
        repo.save(film);
    }
/*    public String[] getFilms() {
        return films;
    }*/

/*    public void add(String film) {
        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }*/

/*    public String[] findAll() {
        return films;
    }*/

    public Films[] findLast() {
        int resultLength;
        if (newLength > films.length) {
            resultLength = films.length;
        } else {
            resultLength = newLength;
        }
        Films[] result = new Films[resultLength];
        for (int i = 0; i < resultLength; i++) {
            result[i] = films[films.length - i - 1];
        }
        return result;
    }
}
