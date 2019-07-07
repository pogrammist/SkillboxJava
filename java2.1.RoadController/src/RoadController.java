//Импорт пакетов, компонентов, зависимостей и т п.
import core.*;
import core.Camera;

//Создан класса RoadController
public class RoadController
{
    /**
     * Объявлены переменные класса RoadController, описывающие его свойства
     */
    public static Double passengerCarMaxWeight = 3500.0; // kg
    public static Integer passengerCarMaxHeight = 2000; // mm
    public static Integer controllerMaxHeight = 4000; // mm

    public static Integer passengerCarPrice = 100; // RUB
    public static Integer cargoCarPrice = 250; // RUB
    public static Integer vehicleAdditionalPrice = 200; // RUB

    public static Integer maxOncomingSpeed = 30; // km/h
    public static Integer speedFineGrade = 20; // km/h
    public static Integer finePerGrade = 500; // RUB
    public static Integer criminalSpeed = 160; // km/h

//    Создан метода main, точка старта приложения
    public static void main(String[] args)
    {
        /**
         * Создан цикл for, перебирающий значения от 0 до 10 с шагом 1
         * Цикл формируем отчет из десяти автомобилей и выводи информацию в консоль
         */
        for(Integer i = 0; i < 10; i++)
        {
            /**
             * В каждой итерации объявляется переменная car типа Car и присвоивается значение
             * метода getNextCar() класса Camera
             * Перебираем автомобили зафиксированные камерой
             */
            Car car = Camera.getNextCar();
            // Вывод в консоль переменной car
            System.out.println(car);
            // Вывол в консоль значение метода getCarSpeed класса Camera c аргументом car
            System.out.println("Скорость: " + Camera.getCarSpeed(car) + " км/ч");

            /**
             * Пропускаем автомобили спецтранспорта
             * Условная операция, если метод переменной car.isSpecial() возвращает true,
             * получаем подтверженеи, что автомобиль является спецтранспортом
             * переходим к следующей итерации цыкла
             */
            if(car.isSpecial()) {
                openWay();
                continue;
            }

            /**
             * Проверка на наличие номера в списке номеров нарушителей
             */
//            Объявлена булева переменная policeCalled, которая нигде не используется
            Boolean policeCalled = false;
            /**
             * Создан цикл for, перебирающий значения из метода класса Police.getCriminalNumbers()
             * и передающий полученное значение в переменную criminalNumber для каждой итерации цикла
             * Проверяем соответстве номеров автомобилей и номеров угнанных автомобилей
             */
            for(String criminalNumber : Police.getCriminalNumbers())
            {
                /**
                 * Объявлена переменна carNumber, которой присвоено значение метода
                 * переменной car.getNumber() для дальнейшего сравнения с переменной criminalNumber
                 * используя встроенный в язык java метод equals()
                 */
                String carNumber = car.getNumber();
                if(carNumber.equals(criminalNumber)) {
                    /**
                     * В случае совпадения, происходит вызов метода call() класса Police
                     * и метода blockWay с передаче аргументов в оба метода.
                     * Угнанный автомобиль выявлен, цикл принудительно завершается.
                     */
                    Police.call("автомобиль нарушителя с номером " + carNumber);
                    blockWay("не двигайтесь с места! За вами уже выехали!");
                    break;
                }
            }
            /**
             * Условная операция, если метод wasCalled() класса Police возвращает true,
             * Полиция была вызвана!
             * переходим к следующей итерации цыкла
             */
            if(Police.wasCalled()) {
                continue;
            }

            /**
             * Проверяем высоту и массу автомобиля, вычисляем стоимость проезда
             * Объявлена переменная carHeight и ей присвоено значение из метода
             * переменной car.getHeight() высота автомобиля
             * Объявлена переменная price и присвоено значение 0
             * Далее условие, если carHeight высота автомобился больше
             * controllerMaxHeight максимальной высоты контроллера
             * происходи вызов метода blockWay() закрытие шлакбаума
             * и завершение итерации цикла
             */
            Integer carHeight = car.getHeight();
            Integer price = 0;
            if(carHeight > controllerMaxHeight)
            {
                blockWay("высота вашего ТС превышает высоту пропускного пункта!");
                continue;
            }
            /**
             * Второе условие, если carHeight высота автомобился больше
             * passengerCarMaxHeight максимальной высоты легкового авто
             * Выявляется грузовой автомобиль, происходит вызов нового условия
             */
            else if(carHeight > passengerCarMaxHeight)
            {
                /**
                 * Если масса грузовой автомобился weight больше максимальной массы
                 * легкового автомобиля passengerCarMaxWeight начисляется плата
                 * за !грузовой автомобиль
                 */
                Double weight = WeightMeter.getWeight(car);
                //Грузовой автомобиль
                if(weight > passengerCarMaxWeight)
                {
                    /**
                     * Если грузовой автомобиль имеет прицеп
                     * начисляется плата за прицеп
                     */
                    price = passengerCarPrice;
                    if(car.hasVehicle()) {
                        price = price + vehicleAdditionalPrice;
                    }
                }
                /**
                 * Если условия не выполнились
                 * назначается плата за !легковой автомобиль
                 */
                //Легковой автомобиль
                else {
                    price = cargoCarPrice;
                }
            }
            /**
             * Если по условию высота автомобиля carHeight меньше
             * максимальной высоты легкового автомобился passengerCarMaxHeight
             * начисляется плата за легковой автомобиль
             */
            else {
                price = passengerCarPrice;
            }

            /**
             * Проверка скорости подъезда и выставление штрафа
             * Объявлена переменная carSpeed и присвоено значение метода Camera.getCarSpeed(car) с аргументом
             * Сравниваем скорость автомобился carSpeed и "криминальную" скорость, при превышении
             * вызываем полицию и закрываем шлакбаум
             */
            Integer carSpeed = Camera.getCarSpeed(car);
            if(carSpeed > criminalSpeed)
            {
                Police.call("cкорость автомобиля - " + carSpeed + " км/ч, номер - " + car.getNumber());
                blockWay("вы значительно превысили скорость. Ожидайте полицию!");
                continue;
            }
            /**
             * В случае простого превышения скорости происходит расчет превышения скорости,
             * штрафа, сумма штрафа и платы за проезд
             */
            else if(carSpeed > maxOncomingSpeed)
            {
                Integer overSpeed = carSpeed - maxOncomingSpeed;
                Integer totalFine = finePerGrade * (1 + overSpeed / speedFineGrade);
                System.out.println("Вы превысили скорость! Штраф: " + totalFine + " руб.");
                price = price + totalFine;
            }

            /**
             * Отображение суммы к оплате
             */
            System.out.println("Общая сумма к оплате: " + price + " руб.");
        }

    }

    /**
     * Открытие шлагбаума
     */
    public static void openWay()
    {
        System.out.println("Шлагбаум открывается... Счастливого пути!");
    }

    /**
     * Закрытие шлагбаума
     */
    public static void blockWay(String reason)
    {
        System.out.println("Проезд невозможен: " + reason);
    }
}