import ru.netology.homework.cycleshmw.services.VacationMonthsService;

public class Main {

    public static void main(String[] args) {
       /* int income = 10_000;
        int expenses = 101_000;
        int threshold = 5_000;
*/
        VacationMonthsService service = new VacationMonthsService();
        System.out.println(service.calcMonths(100_000, 60_000, 150_000));

    }
}
