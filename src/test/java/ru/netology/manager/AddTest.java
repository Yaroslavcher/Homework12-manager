package ru.netology.manager;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AddTest {
    Repository repo = new Repository();
    Manager manager = new Manager(repo);

/*    @Test
    public void shouldAddFilm() {
        manager.add("film1");

        String[] expected = {"film1"};
        assertArrayEquals(repo.findAll(), expected);
    }

    @Test
    public void shouldAddNone() {
        String[] expected = {};
        assertArrayEquals(manager.findAll(), expected);
    }*/


}
