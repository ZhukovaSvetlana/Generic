public abstract class VoterBase implements Voter{

    private AgeCategory ageCategory;

    public VoterBase(int age){
        ageCategory = AgeCategory.valueOf(age);
    }

    @Override
    public AgeCategory getAgeCategory() {
        return ageCategory;
    }
}
