import java.util.ArrayList;
import java.util.Scanner;

interface activityCar
{
    void toPark(); //đậu xe
    void toRevert(); //lùi xe
    void toBrake(); //phanh xe
}
interface driveCar {
    void toDrive (); //tự lái
}
interface autoCar extends driveCar{
    void toSteer(); // lái tự động

    @Override
    default void toDrive() {

    }
}
class petrolCar implements activityCar, driveCar {
    public void petrolEngine ()
    {
        System.out.println("Xe chạy bằng động cơ xăng");
    }
    @Override
    public void toDrive() {
        System.out.println("Xe chạy động cơ xăng chỉ có chế độ lái thủ công");

    }
    @Override
    public void toPark() {

    }

    @Override
    public void toRevert() {

    }

    @Override
    public void toBrake() {

    }
}

class hydroCar implements activityCar, driveCar {
    public void hydroEngine ()
    {
        System.out.println("Xe chạy bằng động cơ hydro");
    }
    @Override
    public void toDrive() {
        System.out.println("Xe chạy động vơ hydro chỉ có chế độ lái thủ công");
    }

    @Override
    public void toPark() {

    }

    @Override
    public void toRevert() {

    }

    @Override
    public void toBrake() {

    }
}

class electricCar implements activityCar,autoCar {
    public void electricEngine ()
    {

        System.out.println("Xe chạy bằng động cơ điện");
    }
    @Override
    public void toDrive() {

        System.out.println("Xe động cơ điện có cả chế độ lái thủ công");
    }
    @Override
    public void toSteer()
    {
        System.out.println("Xe điện còn có cả chế độ lái tự động");
    }

    @Override
    public void toPark() {

    }

    @Override
    public void toRevert() {

    }

    @Override
    public void toBrake() {

    }
}

class dieselCar implements activityCar, driveCar {
    public void dieselEngine ()
    {
        System.out.println("Xe chạy bằng động cơ diesel");
    }
    @Override
    public void toDrive() {
        System.out.println("Xe động cơ diesel chỉ có chế độ lái thủ công");
    }


    @Override
    public void toPark() {

    }

    @Override
    public void toRevert() {

    }

    @Override
    public void toBrake() {

    }
}
public class Car {
    dieselCar diesel = new dieselCar();
    petrolCar petrol = new petrolCar();
    electricCar electric = new electricCar();
    hydroCar hydro = new hydroCar();
    ArrayList<autoCar> AutoCar = new ArrayList<>();
    ArrayList<driveCar> DriveCar = new ArrayList<>();

    public void car() {
        DriveCar.add(diesel);
        DriveCar.add(petrol);
        DriveCar.add(hydro);
        AutoCar.add(electric);
    }

    public void printCar() {
        System.out.println("Loại xe lái tự động: ");
        for (autoCar car : AutoCar) {
            car.toSteer();
        }

        System.out.println("Loại xe tự lái: ");
        for (driveCar car : DriveCar) {
            car.toDrive();
        }
    }
}