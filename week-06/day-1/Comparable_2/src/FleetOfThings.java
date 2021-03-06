import java.util.Collections;

public class FleetOfThings {
  public static void main(String[] args) {
    Fleet fleet = new Fleet();

    Thing thing1 = new Thing("Get milk");
    fleet.add(thing1);
    Thing thing2 = new Thing("Remove the obstacles");
    fleet.add(thing2);
    Thing thing3 = new Thing("Stand up");
    fleet.add(thing3);
    thing3.complete();
    Thing thing4 = new Thing("Eat lunch");
    fleet.add(thing4);
    thing4.complete();

    Collections.sort(fleet.getThing());
    System.out.println(fleet.toString());
  }
}
