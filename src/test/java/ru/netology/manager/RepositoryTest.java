package ru.netology.manager;

    import org.junit.jupiter.api.Test;
    import static org.junit.jupiter.api.Assertions.*;

public class RepositoryTest {
    Films film1 = new Films(1, "name1");
    Films film2 = new Films(2, "name2");
    Films film3 = new Films(3, "name3");
    Films[] films = {film1, film2, film3};
    @Test
    public void shouldFindAllIfOneFilm() {
        Repository repo = new Repository();
        repo.save(film1);

        Films[] expected = {film1};

        assertArrayEquals(expected, repo.findAll());
    }
    @Test
    public void shouldFindAllIfThreeFilms() {
        Repository repo = new Repository();
        repo.save(film1);
        repo.save(film2);
        repo.save(film3);

        Films[] expected = {film1, film2, film3};

        assertArrayEquals(expected, repo.findAll());
    }
    @Test
    public void shouldFindAllIfNoFilms() {
        Repository repo = new Repository();
        Films[] expected = {};

        assertArrayEquals(expected, repo.findAll());
    }

    @Test
    public void shouldFindById() {
        Repository repo = new Repository();
        repo.save(film1);
        repo.save(film2);
        repo.save(film3);
        int searchId = 2;
        String expected = "name2";

        assertEquals(expected, repo.findById(2));
    }

    @Test
    public void shouldRemoveById() {
        Repository repo = new Repository();
        repo.save(film1);
        repo.save(film2);
        repo.save(film3);
        int id = 2;
        Films[] expected = {film1, film3};
        Films[] actual = repo.removeById(2);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldRemoveAll() {
        Repository repo = new Repository();
        Films[] expected = {};

        assertArrayEquals(expected, repo.removeAll());
    }
}
