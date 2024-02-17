/**  
* @Author Shalom Lule - slule@dmacc.edu  
* CIS175 <Spring 2024>
* Feb 14, 2024 
*/ 
package model;

public class UserInfo {
    private String username;
    private String password;

    public UserInfo() {
        // Default constructor
    }

    public UserInfo(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Getters and setters for username
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    // Getters and setters for password
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
