package day35_Encapsulation.Tasks.credential;

public class Credentials {

    private String username;
    private String password;


    public boolean isStrongPassWord(String password) {
        boolean isStrong = false;
        if (password.length() >= 8 && (!password.contains(" "))) {
            int letterCounter = 0;
            int digitCounter = 0;
            int speacialCounter = 0;
            for (int i = 0; i < password.length(); i++) {
                char ch = password.charAt(i);
                if (Character.isLetter(ch)) {
                    letterCounter++;
                }
                if (Character.isDigit(ch)) {
                    digitCounter++;
                }
                if (!Character.isLetterOrDigit(ch)) {
                    speacialCounter++;
                }
            }
            if (letterCounter > 0 || digitCounter > 0 || speacialCounter > 0) {
                isStrong = true;
            }
        }
        return isStrong;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (!isStrongPassWord(password)){
            return;
        }
        this.password = password;
    }

    public String toString() {
        return "Credentials{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public Credentials(String username, String password) {
        setUsername(username);
        setPassword(password);
    }


}
