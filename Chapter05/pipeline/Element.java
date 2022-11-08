sealed interface Element permits SystemElement {
    void addLog(String log);
    String logSummary();
}
