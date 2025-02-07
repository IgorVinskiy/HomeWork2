public class Main {
    public static void main(String[] args) {

        var box=5;
        System.out.println(box);
        box=box+2;
        System.out.println(box);
        box=box-3;
        System.out.println("Можно купить "+box+" кг яблок");
        var x=700;
        var y=350;
        var result=x/y;
        System.out.println("Можно купить "+result+" кг гречки");
        System.out.println("Можно купить "+result+box+" кг гречки");
        var liftingCapacity=50;
        var stuffweight=20;
        var capacityleft=liftingCapacity-stuffweight;
        System.out.println("еше можно положить "+capacityleft+" кг вещей");
        var apples=2;
        var orange=3;
        var fruitPackage=apples+orange;
        System.out.println("Взяли с собой "+fruitPackage+" кг фруктов");
        var meetWeight=4;
        var waterWeghit=5;
        var tomatoesweight=2;
        var cucumbersweight=2;
        var peppersweight=2;
        var zucchiniweight=2;
        var vegetablesweight=tomatoesweight+cucumbersweight+peppersweight+zucchiniweight;
        var productsweight=meetWeight+waterWeghit+fruitPackage+vegetablesweight;
        System.out.println("Всего было закуплено "+productsweight+" кг продуктов");
        var freeWeight=capacityleft-productsweight;
        System.out.println("Свободного места в машине осталось "+freeWeight+" кг вещей");
        productsweight=productsweight*2;
        System.out.println("Теперь вес продуктов "+productsweight);
        capacityleft=liftingCapacity-stuffweight-productsweight;
        System.out.println("Теперь места осталось "+capacityleft+" кг");
        var overload=(stuffweight+productsweight)%liftingCapacity;
System.out.println("Перегруз на "+overload+" кг!");
        var productIn1car=productsweight/2;
        System.out.println("Количество продуктов на каждую машину "+productIn1car+" кг");


    }
}