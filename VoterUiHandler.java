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
        showMenu();
        switch (in.nextInt()) {
            case 1:
                vote(Candidate.FIRST);
                break;

            case 2:
                vote(Candidate.SECOND);
                break;

            case 3:
                vote(Candidate.THIRD);
                break;

            default:
                return;
        }

    }

    private void vote(Candidate candidate) {
        List<Voter> voters = map.get(candidate);
        System.out.println("Введите пол: ");
        System.out.print("> ");
        Gender gender = Gender.valueOf(in.next().toUpperCase());

        System.out.println("Введите возраст");
        System.out.print("> ");
        int age = in.nextInt();

        if (gender == Gender.MALE) {
            voters.add(new Man(age));
        } else {
            voters.add(new Woman(age));
        }
    }

    private void showMenu() {
        System.out.println("Выберите кандидата: ");
        System.out.println("1. " + Candidate.FIRST.getFio());
        System.out.println("2. " + Candidate.SECOND.getFio());
        System.out.println("3. " + Candidate.THIRD.getFio());
        System.out.print(">");
    }
}