package v3;

import java.io.Serializable;

public class User implements Serializable {
    private int uid;
    private String username;
    private String gender;

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", username='" + username + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    public User(int uid, String username, String gender) {
        this.uid = uid;
        this.username = username;
        this.gender = gender;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
