import java.time.*;
import java.time.format.*;


public class dataHoraCidades {
    public static void main(String[] args){
      ZoneId sp = ZoneId.of("America/Sao_Paulo");
      ZoneId tyo = ZoneId.of("Asia/Tokyo");
      ZoneId lon = ZoneId.of("Europe/London");
      ZoneId NY = ZoneId.of("America/New_York");


      ZonedDateTime agoraSp = ZonedDateTime.now(sp);
      ZonedDateTime agoraTyo = ZonedDateTime.now(tyo);
      ZonedDateTime agoraLon = ZonedDateTime.now(lon);
      ZonedDateTime agoraNY = ZonedDateTime.now(NY);


      DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

      System.out.println("São Paulo: " + agoraSp.format(formato));
      System.out.println("Londres: " + agoraTyo.format(formato));
      System.out.println("Tóquio: " + agoraLon.format(formato));
      System.out.println("Nova York: " + agoraNY.format(formato));
    }
}
