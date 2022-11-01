package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {

    @Autowired
    @Qualifier("dog")
    private Animal animal;
    @Autowired
    private Timer timer;

    public Timer getTimer() {
        return timer;
    }

    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());
        System.out.println("At:");
        System.out.println(timer.getTime());
        System.out.println("________________________");
    }
}

//    @Autowired
//    public AnimalsCage(@Qualifier("cat") Animal animalCat,
//                       @Qualifier("dog") Animal animalDog) {
//        this.animalCat = animalCat;
//        this.animalDog = animalDog;
//    }

//Задание:
//1) Создайте бин Dog, унаследуйте его от Animal. Создайте на основе этого класса компонент.
//2) Запустите приложение и проверьте, что было выброшено исключение NoUniqueBeanDefinitionException.
// Это произошло из-за того, что существует 2 бина с типом Animal.
//3) Прочитайте о связывании бинов по имени и свяжите AnimalCage c бином Dog через абстрактный класс Animal.
//4) На основе класса Timer создайте бин. Свяжите с AnimalCage.
// Проверьте, что при выполнении метода main время, которое пишет таймер, одно и тоже.
//5) Раскоментировать тест из заготовки и проверить своё решение.
