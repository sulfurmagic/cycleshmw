import ru.netology.homework.cycleshmw.services.VacationMonthsService;

public class Main {

    public static void main(String[] args) {

        VacationMonthsService service = new VacationMonthsService();
        System.out.println(service.calcMonths(100_000, 60_000, 150_000));

    }
}
