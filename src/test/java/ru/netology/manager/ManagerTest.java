package ru.netology.manager;

import org.mockito.Mockito;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class ManagerTest {
/*    Repository repo = Mockito.mock(Repository.class);*/
    Repository repo = new Repository();
    Manager manager = new Manager(repo);
    Films film1 = new Films(1, "name1");
    Films film2 = new Films(2, "name2");
    Films film3 = new Films(3, "name3");

    Films[] films = {film1, film2, film3};

    @Test
    public void shouldAddFilm() {
        Films[] films = {film1, film2, film3};
        Films film4 = new Films(4, "name4");
        manager.add(film4);
/*        doReturn(films).when(repo).findAll();*/
        Films[] expected = {film1, film2, film3, film4};
        assertArrayEquals(expected, repo.findAll());
    }

    @Test
    public void shouldFindLastTwoFilms() {
        Manager manager = new Manager(2);
        doReturn(films).when(repo).findAll();
        Films[] expected = {
                film3,
                film2};
        assertArrayEquals(expected, manager.findLast());
    }

    @Test
    public void shouldFindLastOneFilm() {
        Manager manager = new Manager(1);
        doReturn(films).when(repo).findAll();
/*        repo.save(film1);
        repo.save(film2);
        repo.save(film3);*/

        Films[] expected = {film3};
        assertArrayEquals(expected, manager.findLast());
    }


}
