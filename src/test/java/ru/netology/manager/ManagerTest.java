package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ManagerTest {
    Manager manager = new Manager();
    @BeforeEach
    public void b4EachTest() {
        manager.add("Film1");
        manager.add("Film2");
        manager.add("Film3");
        manager.add("Film4");
        manager.add("Film5");
        manager.add("Film6");
        manager.add("Film7");
        manager.add("Film8");
        manager.add("Film9");
        manager.add("Film10");
        manager.add("Film11");
        manager.add("Film12");
    }
    @Test
    public void shouldFindAll() {
        String[] expected = {
                "Film1",
                "Film2",
                "Film3",
                "Film4",
                "Film5",
                "Film6",
                "Film7",
                "Film8",
                "Film9",
                "Film10",
                "Film11",
                "Film12"};
        assertArrayEquals(manager.findAll(), expected);
    }

    @Test
    public void shouldFindLast() {
        String[] expected = {
                "Film12",
                "Film11",
                "Film10",
                "Film9",
                "Film8",
                "Film7",
                "Film6",
                "Film5",
                "Film4",
                "Film3"};
        assertArrayEquals(manager.findLast(), expected);
    }
    @Test
    public void shouldFindLastNewLength() {
        Manager manager = new Manager(1);
        String[] actual = manager.findLast();
        String[] expected = {"Film12"};
        assertArrayEquals(actual, expected);
    }




    

}
