public enum Candidate {
    FIRST("Путин"),
    SECOND("Грудинин"),
    THIRD("Собчак");

    private final String fio;

    Candidate(String fio) {
        this.fio = fio;
    }

    public String getFio() {
        return fio;
    }
}