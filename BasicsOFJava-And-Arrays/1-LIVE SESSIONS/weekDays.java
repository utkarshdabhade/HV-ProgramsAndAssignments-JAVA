import java.text.DateFormatSymbols;


public class weekDays {
   public static void main(String[] args) {
      String[] weekDays = new DateFormatSymbols().getWeekdays();
      System.out.println("Following are days in a week : ");
      for(String days: weekDays){
      System.out.println(days);
   }
}
}

