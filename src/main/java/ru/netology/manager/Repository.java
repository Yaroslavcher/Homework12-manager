package ru.netology.manager;

public class Repository {

/*    protected int id;
    protected String name;*/
    protected Films[] films = new Films[0];

    Repository repo = new Repository();

    public Films[] findAll() {
        return films;
    }

    public void save(Films film) {
        Films[] tmp = new Films[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }
    public String findById(int searchId) {
 /*       Films[] result = new Films[0];*/
        for (Films film : films) {
            if (film.getId() == searchId) {
                return film.getName();
            }
        }
        System.out.println("Фильмов с id = " + searchId + " не найдено");
        return null;
    }
    public Films[] removeById(int id) {
        Films[] tmp = new Films[films.length - 1];
        int copyToIndex = 0;
        for (Films film : films) {
            if (film.getId() != id) {
                tmp[copyToIndex] = film;
                copyToIndex++;
            }
        }
        films = tmp;
        return films;
    }
    public Films[] removeAll() {
        Films[] film = new Films[0];
        return film;
    }
}
