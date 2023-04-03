package ru.netology.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTests {
    @Test
    public void shouldAddNewMovies() {
        MovieManager manager = new MovieManager();

        manager.add("Bloodshot");
        manager.add("Onward");
        manager.add("Belgrade Hotel");
        manager.add("The Gentlemen");
        manager.add("The Invisible Man");
        manager.add("Trolls World Tour");
        manager.add("Number one");


        String[] expected = {"Bloodshot", "Onward", "Belgrade Hotel", "The Gentlemen", "The Invisible Man", "Trolls World Tour", "Number one"};
        String[] actual = manager.getAllMovies();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldFindAllMovies() {
        MovieManager manager = new MovieManager();
        manager.add("Bloodshot");
        manager.add("Onward");
        manager.add("Belgrade Hotel");
        manager.add("The Gentlemen");
        manager.add("The Invisible Man");
        manager.add("Trolls World Tour");
        manager.add("Number one");


        String[] expected = {"Bloodshot", "Onward", "Belgrade Hotel", "The Gentlemen", "The Invisible Man", "Trolls World Tour", "Number one"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldGetLastMovies() {
        MovieManager manager = new MovieManager();

        manager.add("Bloodshot");
        manager.add("Onward");
        manager.add("Belgrade Hotel");
        manager.add("The Gentlemen");
        manager.add("The Invisible Man");
        manager.add("Trolls World Tour");
        manager.add("Number one");


        String[] expected = {"Number one", "Trolls World Tour", "The Invisible Man", "The Gentlemen", "Belgrade Hotel", "Onward", "Bloodshot"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGetLastMoviesOverLimit() {
        MovieManager manager = new MovieManager();

        manager.add("1");
        manager.add("2");
        manager.add("3");
        manager.add("4");
        manager.add("5");
        manager.add("6");
        manager.add("7");
        manager.add("8");
        manager.add("9");
        manager.add("10");
        manager.add("11");

        String[] expected = {"11", "10", "9", "8", "7", "6", "5", "4", "3", "2"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldGetLastMoviesNewLimit() {
        MovieManager manager = new MovieManager(5);

        manager.add("1");
        manager.add("2");
        manager.add("3");
        manager.add("4");
        manager.add("5");
        manager.add("6");
        manager.add("7");
        manager.add("8");
        manager.add("9");
        manager.add("10");
        manager.add("11");

        String[] expected = {"11", "10", "9", "8", "7"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }

}

