package observer;

public class LoggingSystem implements Observer {
  private String name;
  private String surname;
  private Subject userData;

  public LoggingSystem(Subject userData) {
    this.userData = userData;
    userData.registerObserver(this);
  }

  @Override
  public void update(String name, String surname) {
    this.name = name;
    this.surname = surname;
    display();
  }

  private void display() {
    System.out.println(String.format("Current data: name is %s, surname is %s", name, surname));
  }
}
