package c.types;

/**
 * Created by Michal Czarnecki on 11.07.2016.
 */
public enum UserStatus {
    AVAILABLE ("available"),
    AWAY ("away"),
    UNAVAILABLE ("unavailable");

    private String text;

    UserStatus(String text){
        this.text = text;
    }

    public String getText(){
        return this.text;
    }
}
