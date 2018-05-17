import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class StatisticsUiHandler {
    private final Scanner in = new Scanner(System.in);
    private final Map<Candidate, List<Voter>> map;

    public StatisticsUiHandler(Map<Candidate, List<Voter>> map) {
        this.map = map;
    }

    public void start() {
        showMenu();
        switch (in.nextInt()) {
            case 1:
                statisticByGender();
                break;

            case 2:
                statisticByAge();
                break;

            default:
                return;
        }
    }

    private void statisticByGender() {

        for (Map.Entry<Candidate, List<Voter>> entry : map.entrySet()) {
            int countMale = 0;
            int countFemale = 0;

            for (Voter voter : entry.getValue()) {
                if (voter.getGender() == Gender.MALE) {
                    countMale++;
                } else
                    countFemale++;
            }
            System.out.println(entry.getKey().getFio());
            System.out.println("Male: " + countMale);
            System.out.println("Female: " + countFemale + "\n");

        }

    }

    private void statisticByAge() {
        for (Map.Entry<Candidate, List<Voter>> entry : map.entrySet()) {
            int countYoung = 0;
            int countAverage = 0;
            int countElderly = 0;
            int countSenile = 0;

            for (Voter voter : entry.getValue()) {
                switch (voter.getAgeCategory()) {
                    case YOUNG:
                        countYoung++;
                        break;

                    case AVERAGE:
                        countAverage++;
                        break;

                    case ELDERLY:
                        countElderly++;
                        break;

                    case SENILE:
                        countSenile++;
                        break;
                }

            }
            System.out.println(entry.getKey().getFio());
            System.out.println("Young: " + countYoung);
            System.out.println("Average: " + countAverage);
            System.out.println("Elderly: " + countElderly);
            System.out.println("Senile: " + countSenile + "\n");

        }
    }

    private void showMenu() {
        System.out.println("Показать стастику: ");
        System.out.println("1. По полу");
        System.out.println("2. По возрасту");
        System.out.println("3. Выход");
        System.out.print(">");
    }
}