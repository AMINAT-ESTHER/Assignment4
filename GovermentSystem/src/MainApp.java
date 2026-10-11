import PassportService.Passports;
import BusinessService.RegisterCompany;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("   GOVERNMENT SYSTEM");

        new Passports().processPassport("UG40682");
        new RegisterCompany().register("MK stationary", "Anna Ruth", "CF2045973P67823");

    }
}
