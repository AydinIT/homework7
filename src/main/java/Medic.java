public class Medic extends Hero{

    private int healPoints;

    @Override
    public void applySuperAbility() {
        System.out.println("Medic применил супер способность HEAL");
    }

    public void increaseExperience(){
        healPoints += (healPoints / 100) * 10;
        System.out.println("Опыт лечения медика увеличился на 10%");
    }
}
