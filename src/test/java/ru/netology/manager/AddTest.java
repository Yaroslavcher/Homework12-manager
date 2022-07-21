package ru.netology.manager;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AddTest {
    Repository repo = new Repository();
    Manager manager = new Manager(repo);
    Films film1 = new Films(1, "name1");
    Films film2 = new Films(2, "name2");
    Films film3 = new Films(3, "name3");

    @Test
    public void shouldAddFilm() {
        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        Films film4 = new Films(4, "name4");
        manager.add(film4);
        Films[] films = {film1, film2, film3, film4};
        Films[] expected = {film1, film2, film3, film4};
        assertArrayEquals(expected, repo.findAll());
    }

    @Test
    public void shouldAddNone() {
        String[] expected = {};
        assertArrayEquals(repo.findAll(), expected);
    }


}
