package TheoryAssignments.Assignment1;

public class Movie {
    String title;
    String genre;
    int duration;
    String showTime;
    Movie(String title,String genre,int duration,String showTime){
        this.title=title;
        this.genre=genre;
        this.duration=duration;
        this.showTime=showTime;
    }
    public String toString(){
        return  title + " Genre: " + genre + " Duration: " + duration + "min" + " ShowTime: "+  showTime;
    }
}
