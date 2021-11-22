import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatsServiceTests {
    @Test
    public void allSumSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long result = service.allSumSales(sales);
        long expected = 180;
        assertEquals(expected, result);
    }

    @Test
    public void meanSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        double result = service.meanSales(sales);
        double expected = 15.0;
        assertEquals(expected, result);
    }

    @Test
    public void maхSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int result = service.maхSales(sales);
        int expected = 8;
        assertEquals(expected, result);
    }

    @Test
    public void minSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 7, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int result = service.minSales(sales);
        int expected = 9;
        assertEquals(expected, result);
    }

    @Test
    public void lowerMeanSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int result = service.lowerMeanSales(sales);
        int expected = 5;
        assertEquals(expected, result);
    }

    @Test
    public void upperMeanSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int result = service.upperMeanSales(sales);
        int expected = 5;
        assertEquals(expected, result);
    }
}