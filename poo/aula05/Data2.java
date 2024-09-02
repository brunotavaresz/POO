package aula05;

public class Data2 {
    private int ano;
    private int weekdayear;
    private String[] weekDays = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
    private String[] monthDays = { "January", "February", "March", "April", "May", "June", "July", "August",
    "September", "October", "November", "December" };
    private int[][] events; // vetor bidimensional de inteiros para armazenar o número de eventos de cada dia

    public Data2(int ano, int weekdayear) {
        this.ano = ano;
        this.weekdayear = weekdayear;
        events = new int[12][];
        for (int i = 0; i < 12; i++) {
            events[i] = new int[Data.diasmes(i+1, ano)];
        }
    }
    
    public int getAno() {
        return ano;
    }
    
    public String getWeekdayear() {
        return weekDays[weekdayear - 1];
    }
    
    public int firstWeekdayOfMonth(int m) {
        int weekDay = weekdayear;
        for (int i = 1; i < m; i++) {
            weekDay += Data.diasmes(i, ano);
            weekDay %= 7;
            if (weekDay == 0) {
                weekDay = 7;
            }
        }
        return weekDay;
    }
    
    public void addEvent(int month, int day) {
        events[month-1][day-1]++;
    }
    
    public void removeEvent(int month, int day) {
        if (events[month-1][day-1] > 0) {
            events[month-1][day-1]--;
        }
    }
    
    public String printMonth(int m) {
        int maxWidth = 20;
        String mString = monthDays[m - 1];
        int paddingLeft;
        int changeLine = 1;
        paddingLeft = (maxWidth - (mString.length() + 3)) / 2;
        StringBuilder sb = new StringBuilder("");
        sb.append("\n");
        sb.append(String.format(" ".repeat(paddingLeft) + "%s %4d \n", mString, ano));
        sb.append("Su Mo Tu We Th Fr Sa \n");
        for (int i = 1 - (firstWeekdayOfMonth(m) - 1); i <= Data.diasmes(m, ano); i++) {
            if (i < 1) {
                sb.append("  ");
            } else {
                String dayString = (events[m-1][i-1] > 0) ? "*" + i : String.format("%2d ", i);
                sb.append(dayString);
            }
            if (changeLine++ % 7 == 0) {
                sb.append("\n");
            }
        }
        sb.append("\n");
        return sb.toString();
    }
    
    public static boolean validMonth(int m) {
        return m >= 1 && m <= 12;
    }
    
    public String toString() {
        StringBuilder sb = new StringBuilder("");
        for (int i = 1; i <= 12; i++) {
            sb.append(printMonth(i));
        }
        return sb.toString();
    }
}