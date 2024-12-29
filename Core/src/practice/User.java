package practice;


class User {
    private String username;
    private boolean isSubscribed;

    public User(String username, boolean isSubscribed)
    {
        this.username = username;
        this.isSubscribed = isSubscribed;
    }

    public String getUsername() 
    {
        return username;
    }

    public boolean isSubscribed()
    {
        return isSubscribed;
    }

    @Override
    public String toString() 
    {
        return "User username=" + username + ", isSubscribed=" + isSubscribed;
    }
}
