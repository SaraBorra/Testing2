import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Main {

    public static void main(String[] args) {
        try {
            // Creazione dell'oggetto Date
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
            dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            Date date = dateFormat.parse("2023-03-01T13:00:00Z");

            // Ottenimento di anno, mese, giorno e giorno della settimana
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);

            int year = calendar.get(Calendar.YEAR);
            int month = calendar.get(Calendar.MONTH) + 1; // +1 perché Calendar.MONTH parte da 0
            int day = calendar.get(Calendar.DAY_OF_MONTH);
            int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

            // Stampa dei risultati
            System.out.println("Anno: " + year);
            System.out.println("Mese: " + month);
            System.out.println("Giorno: " + day);
            System.out.println("Giorno della settimana: " + dayOfWeek);

            // Test
            assert year == 2023 : "Anno non corretto";
            assert month == 3 : "Mese non corretto";
            assert day == 1 : "Giorno non corretto";
            // Assicurarsi che il giorno della settimana corrisponda al valore atteso
            // 1 = Domenica, 2 = Lunedì, ..., 7 = Sabato
            assert dayOfWeek == 4 : "Giorno della settimana non corretto"; // 4 = Mercoledì

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


//poichè ho un problema con l'ide non riesco a creare il test in una classe test. Il comando ctrl+alt+t non mi
//funziona e con altri esercizi ho ricevuto degli errori ovunque anche se il codice era ben funzionante