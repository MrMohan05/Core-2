package practice;

import java.util.function.Predicate;
import java.util.function.Supplier;

class SubscriptionChecker {

    private static User generateUser() 
    {
        Supplier<User> s = () -> new User("JohnDoe", true);
        return s.get();
    }

    private static boolean checkSubscriptionStatus(User user)
    {
        Predicate<User> p = u -> u.isSubscribed();
        return p.test(user);
    }

    private static void printUserInformation(User user) 
    {
        System.out.println("User Information: " + user);
    }

    private static void printSubscriptionStatus(User user) 
    {
        if (checkSubscriptionStatus(user)) {
            System.out.println("The user is subscribed.");
        } else {
            System.out.println("The user is not subscribed.");
        }
    }

    public static void main(String[] args)
    {
        User u = generateUser();

        printUserInformation(u);

        printSubscriptionStatus(u);
    }
}
