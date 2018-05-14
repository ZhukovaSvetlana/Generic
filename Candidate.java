public enum Candidate {
    FIRST("Петч Васильевич"),
    SECOND(""),
    THIRD("");

    private final String fio;

    Candidate(String fio) {
        this.fio = fio;
    }

    public String getFio() {
        return fio;
    }
}