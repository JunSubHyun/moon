package study.moon.bookPa;

public class HeyGoogle {

    private Time time;

    private Air air;

    private Weather weather;

    public HeyGoogle(Time time, Air air, Weather weather) {
        this.time = time;
        this.air = air;
        this.weather = weather;
    }

    public void morning(){
        time.nowTime();
        air.todayAir();
        weather.todayWeather();
    }

    public void tomorrow(){
        time.nowTime();
        air.tomorrowAir();
        weather.tomorrowWeather();
    }

}
