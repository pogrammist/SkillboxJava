import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cities
{
    public static String[] cities = {
            "Abakan", "Belgorod", "Chelyabinsk", "Dzerzhinsk", "Ekaterinburg",
            "Gelendzhik", "Irkutsk", "Krasnoyarsk", "Lipetsk", "Moscow",
            "Novgorod", "Omsk", "Petrozavodsk", "Ryazan", "Samara", "Tomsk",
            "Ufa", "Volgograd", "Yakutsk", "Zvenigorod"
    };

    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String previousCity = "";
        for(;;)
        {
            try {
                System.out.println(previousCity.length() == 0 ? "Please, type first city:" : "Please, type next city name:");
            } catch (NullPointerException e) {
                System.out.println(e.toString());
            }
            String city = reader.readLine();

            try {
                //Судя по всему алгоритм игры недоработан
                if(previousCity.length() > 0 && isNextCity(previousCity, city)) {
                    System.out.println("This city is wrong! Try again!");
                    continue;
                }
            } catch (NullPointerException e) {
                System.out.println(e.toString());
            }

            String nextCity = null;
            try {
                nextCity = searchNextCity(city);
            } catch (StringIndexOutOfBoundsException e) {
                System.out.println(e.toString());
            }
            System.out.println("My city is: " + nextCity);
            previousCity = nextCity;
        }
    }

    //=========================================================================

    private static String searchNextCity(String currentCity)
    {
        String foundCity = null;
        for(String city : cities) {
            if(isNextCity(currentCity, city)) {
                foundCity = city;
            }
        }
        return foundCity;
    }

    private static boolean isNextCity(String currentCity, String nextCity)
    {
        int currentCityLastChar = currentCity.length() - 1;
        return currentCity.charAt(currentCityLastChar) ==
            nextCity.toLowerCase().charAt(0);
    }
}
