import java.util.*;

public class Main {
    private final Scanner in = new Scanner(System.in);
    private final Map<Candidate, List<Voter>> map = buildMap();
    private VoterUiHandler voterUiHandler = new VoterUiHandler(map);
    private StatisticsUiHandler statisticsUiHandler = new StatisticsUiHandler(map);

    private Map<Candidate, List<Voter>> buildMap() {
        Map<Candidate, List<Voter>> result = new HashMap<>();
        for (Candidate candidate : Candidate.values()) {
            result.put(candidate, new ArrayList<>());
        }
        return result;
    }

    public static void main(String[] args) {
        new Main().start();
    }

    private void start() {
        while (true) {

            showMenu();
            switch (in.nextInt()) {
                case 1:
                    voterUiHandler.start();
                    break;

                case 2:
                    statisticsUiHandler.start();
                    break;

                default:
                    return;
            }
        }
    }


    private void showMenu() {
        System.out.println("Выберите действие: ");
        System.out.println("1. Проголосовать");
        System.out.println("2. Вывести статистику");
        System.out.println("3. Выход");
        System.out.print(">");
    }

}