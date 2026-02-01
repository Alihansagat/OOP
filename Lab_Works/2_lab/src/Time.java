public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second){
        if(hour >= 0 && hour <= 23 && minute >= 0 && minute <= 59 && second >= 0 && second <= 59){
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        } else {
            this.hour = 0;
            this.minute = 0;
            this.second = 0;
        }
    }

    public String toUniversal(){
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public String toStandard(){
        int h = hour % 12;
        if(h == 0) {
            h = 12;
        }

        String amPm;
        if(hour < 12){
            amPm = "AM";
        } else {
            amPm = "PM";
        }

        return String.format("%02d:%02d:%02d %s", h, minute, second, amPm);
    }

    public void add(Time t){
        second += t.second;
        minute += second / 60;
        second %= 60;

        minute += t.minute;
        hour += minute / 60;
        minute %= 60;

        hour = (hour + t.hour) % 24;
    }
}
