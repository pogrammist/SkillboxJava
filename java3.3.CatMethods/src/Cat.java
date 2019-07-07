
public class Cat
{
    private Double originWeight;
    private Double weight;
    private Double feed;
    private Double falseFeed;

    private Double minWeight;
    private Double maxWeight;

    //Как же без имени?! Скрыл свойство, как было рекомендовано
    private String name;

    //Теперь конструктор принимает аргумент
    public Cat(String name)
    {
        this.name = name;
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        feed = 0.0;
    }

    public void meow()
    {
        weight = weight - 1;
        System.out.println("Meow");
    }

    public void feed(Double amount)
    {
        weight = weight + amount;
        //Отдельный счетчик
        feed = feed + amount;
    }

    public void drink(Double amount)
    {
        weight = weight + amount;
    }

    public Double getWeight()
    {
        return weight;
    }

    /**Определяем съеденную массу еды через разницу оригинального веса и текущего веса
     * Но это не правильно, так как текущий вес может содержать операции с вычитанием 1-цы после каждого мяуканья
     * Логичне складывать вес съеденной еды в отдельную переменную!
     * Так и поступим создадим два метода getFeed и getFalseFeed,
     * а так же две переменные feed и falseFeed! чтобы одна не затерала другую!
     * Но придется изменить имеющийся метод feed!
     */
    public Double getFeed()
    {
        return feed;
    }

    public Double getFalseFeed()
    {
        falseFeed = weight - originWeight;
        return falseFeed;
    }

    public String getName() {
        return name;
    }

    public void toilet()
    {
        weight = weight - Math.random();
        System.out.println(this.getName() + ", you skunk! Getout and " + getStatus() + "!");
    }

    public String getStatus()
    {
        if(weight < minWeight) {
            return "Dead";
        }
        else if(weight > maxWeight) {
            return "Exploded";
        }
        else if(weight > originWeight) {
            return "Sleeping";
        }
        else {
            return "Playing";
        }
    }
}