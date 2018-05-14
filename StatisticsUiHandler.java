public class StatisticsUiHandler {

    public void start(){
        showMenu();
    }

    private void showMenu() {
        System.out.println("Выберите действие: ");
        System.out.println("1. Проголосовать");
        System.out.println("2. Вывести статистику");
        System.out.println("3. Выход");
        System.out.print(">");
    }
}