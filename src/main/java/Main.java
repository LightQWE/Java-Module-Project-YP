import java.util.Scanner;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Car> cars = new ArrayList<>();
        for(int i = 0; i <3;i++){
            Car car = new Car();
            boolean True = true;
            while(True) {
                System.out.println("Введите скорость " + (i + 1) + " машины: ");
                if(scanner.hasNextInt()) {
                    int speedCar = scanner.nextInt();
                    if (speedCar <= 250 && speedCar > 0) {
                        car.speed = speedCar;
                        System.out.println("Введите имя " + (i + 1) + " машины: ");
                        car.name = scanner.next();
                        cars.add(car);
                        True = false;
                    } else {
                        System.out.println("Скорость введена не верно");
                    }
                }
                else{
                    System.out.println("Некорректный ввод.Пожалуйста,введите целое число для скорости");
                    scanner.next();
                }
            }

        }
        Race race = new Race();
        race.Winner(cars);

        System.out.println("Самая быстрая машина: " + race.nameCar);

    }

}
class Car {
    Scanner scanner = new Scanner(System.in);
    String name;
    int speed;
    public void Car(String name,int speed){
        this.name = name;
        this.speed = speed;
    }
}
class Race {
    String nameCar ="";
    int dist = 0;
    public void Winner(ArrayList<Car> cars){
        for(Car car : cars) {
            int dist1 = 24 * car.speed;
            if (dist < dist1) {
                dist = dist1;
                nameCar = car.name;
            }
        }

    }
    public String name(){

        return nameCar;
    }
}