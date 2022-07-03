package ru.netology.manager;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AddTest {
    Manager manager = new Manager();
    @Test
    public void shouldAddFilm() {
        manager.add("Film1");
        manager.add("Film2");

        String[] expected = {"Film1", "Film2"};

        assertArrayEquals(manager.findAll(), expected);
    }
    @Test
    public void shouldAddNone() {
        String[] expected = {};
        assertArrayEquals(manager.findAll(), expected);
    }
}
