package d;

import c.types.UserStatus;

/**
 * Created by Michal Czarnecki on 11.07.2016.
 */
public class User implements Comparable<User> {
    private long id;
    private UserStatus userStatus;
    private String nickname;

    public User(){

    }

    public User(long id, UserStatus userStatus, String nickname){
        this.id = id;
        this.userStatus = userStatus;
        this.nickname = nickname;
    }

    @Override
    public boolean equals(Object obj){
        if(getClass() != obj.getClass()){
            return false;
        }

        User comparedTo = (User) obj;
        if(this.id == comparedTo.getId()){
            return true;
        }

        return false;
    }

    @Override
    public int hashCode(){
        int hash = 3;

        hash = 53 * hash + (id == 0 ? 0 : (int)id);
        hash = 53 * hash + (userStatus == null ? 0 : userStatus.hashCode());
        hash = 53 * hash + (nickname == null ? 0 : nickname.hashCode());

        return hash;
    }

    public int compareTo(User user) {

        String userStringStatus = this.userStatus.getText();
        String comparedStringuserStatus = user.getUserStatus().getText();

        if(userStatus.equals(user.getUserStatus())){
            return nickname.compareTo(user.getNickname());
        }
        else{
            if(userStringStatus.equals("available")){
                return 1;
            }
            else if(userStringStatus.equals("away") && comparedStringuserStatus.equals("unavailable")){
                return 1;
            }
        }

        return -1;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public UserStatus getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(UserStatus userStatus) {
        this.userStatus = userStatus;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }


}
