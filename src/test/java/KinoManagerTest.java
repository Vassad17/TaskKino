import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.kino.KinoManager;

public class KinoManagerTest {

    @Test
    public void shouldAddMovie() {
        KinoManager manager = new KinoManager();

        manager.addFilms("Дедпул");

        String[] expected = {"Дедпул"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddSeveralMovies() {
        KinoManager manager = new KinoManager();

        manager.addFilms("Мстители");
        manager.addFilms("Бэтмен");
        manager.addFilms("Стражи Галактики");

        String[] expected = {"Мстители", "Бэтмен", "Стражи Галактики"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReturnAllMoviesInOrder() {
        KinoManager manager = new KinoManager();

        manager.addFilms("Мстители");
        manager.addFilms("Бэтмен");
        manager.addFilms("Стражи Галактики");

        String[] expected = {"Мстители", "Бэтмен", "Стражи Галактики"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReturnLastFilmsWhenLimitIsLessThanTotal() {
        KinoManager manager = new KinoManager(3);

        manager.addFilms("Страх и ненависть в Лас Вегасе");
        manager.addFilms("Снитч");
        manager.addFilms("Властелин колец: Братсво кольца");
        manager.addFilms("Властелин колец: Две крепости");
        manager.addFilms("Властелин колец: Возвращение Короля");

        String[] expected = {"Властелин колец: Возвращение Короля", "Властелин колец: Две крепости", "Властелин колец: Братсво кольца"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReturnLastFilmsWhenLimitExceedsTotal() {
        KinoManager manager = new KinoManager(10);

        manager.addFilms("Однажды в Голливуде");
        manager.addFilms("Омерзительная восьмерка");
        manager.addFilms("Бешеные псы");

        String[] expected = {"Бешеные псы", "Омерзительная восьмерка", "Однажды в Голливуде"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReturnLastMoviesWithDefaultLimit() {
        KinoManager manager = new KinoManager();

        manager.addFilms("Быстрее пули");
        manager.addFilms("Криминальное чтиво");
        manager.addFilms("Гнев человеческий");
        manager.addFilms("Залечь на дно в Брюге");
        manager.addFilms("Однажды в Ирландии");
        manager.addFilms("Револьвер");

        String[] expected = {"Револьвер", "Однажды в Ирландии", "Залечь на дно в Брюге", "Гнев человеческий", "Криминальное чтиво"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReturnEmptyWhenNoMovies() {
        KinoManager manager = new KinoManager();
        ;

        String[] expected = {};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }
}

