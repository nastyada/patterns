package decorator.behavior.weapon;

public class SwordBehavior implements WeaponBehavior {
  @Override
  public void useWeapon() {
    System.out.println("Sword strike");
  }
}
