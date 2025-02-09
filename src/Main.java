
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        var dog=8.0;
        System.out.println(dog);
        var cat=3.6;
        System.out.println(cat);
        var paper=763789;
        System.out.println(paper);
        var dogStep=dog+4;
        System.out.println(dogStep);
        var catStep=cat+4;
        System.out.println(catStep);
        var paperStep=paper+4;
        System.out.println(paperStep);
        var dogStep2=dogStep-3.5;
        var catStep2=catStep-1.6;
        var paperStep2=paperStep-7639;
        System.out.println(dogStep2);
        System.out.println(catStep2);
        System.out.println(paperStep2);
        var friend=19;
        System.out.println(friend);
        var friend1=friend+2;
        System.out.println(friend1);
        var friend2=friend1/7;
        System.out.println(friend2);
        var frog=3.5;
        System.out.println(frog);
        var frog1=frog*10;
        System.out.println(frog1);
        var frog2=(frog*10)/3.5;
        System.out.println(frog2);
        var frog3=((frog*10)/3.5)+4;
        System.out.println(frog3);
        var massBoxer1=78.2;
        var massBoxer2=82.7;
        System.out.println("Масса первого боксера "+massBoxer1+" кг");
        System.out.println("Масса второго боксера "+massBoxer2+("кг"));
        var generalMass=massBoxer1+massBoxer2;
        System.out.println("Общая масса боксеров "+generalMass+ "кг");
        var differenceMass=massBoxer1-massBoxer2;
        System.out.println("Разница между боксерами "+differenceMass+ "кг" );
        var remainsMass=massBoxer2%massBoxer1;
        System.out.println("Остаток "+remainsMass);
    }
}