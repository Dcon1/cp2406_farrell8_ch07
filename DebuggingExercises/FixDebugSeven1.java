// Makes String comparisons
public class FixDebugSeven1
{
   public static void main(String[] args)
   {
      String name1 = "Roger";
      String name2 = "Roger";
      String name3 = "Stacy";

      if (name1 == name2)
        System.out.println(name1 + " and " + name2 +
          " are the same");
      else if(name1 == name3)
        System.out.println(name1 + " and " + name3 +
          " are the same");
      else if(name1 == "roger")
        System.out.println(name1 + " and 'roger' are the same");
      else if (name1 == "Roger")
        System.out.println(name1 + " and 'Roger' are the same");
   }
}
