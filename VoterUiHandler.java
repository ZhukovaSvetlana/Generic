import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class VoterUiHandler {
    private final Scanner in = new Scanner(System.in);
    private final Map<Candidate, List<Voter>> map;

    public VoterUiHandler(Map<Candidate, List<Voter>> map) {
        this.map = map;
    }

    public void start() {
        while (true) {
            showMenu();
            switch (in.nextInt()) {
                case 1:
                    vote(Candidate.FIRST);
                    break;

                default:
                    return;
            }
        }
    }

    private void vote(Candidate candidate) {
        candidate.getFio();
    }

    private void showMenu() {
        System.out.println("Выберите кандидата: ");
        System.out.println("1. " + Candidate.FIRST.getFio());
        System.out.println("2. Михаил");
        System.out.println("3. Пётр");
        System.out.print(">");
    }
}