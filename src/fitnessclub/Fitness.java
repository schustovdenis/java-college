package fitnessclub;

import java.time.LocalDate;

public class Fitness {
    public static void main(String[] args) {
        FitnessClub fitnessClub = new FitnessClub();

        Customer customer1 = new Customer("Denis", "Shustov", 2004);
        Subscription subscription1 = new Subscription(customer1, LocalDate.now(), LocalDate.now().plusDays(1),
                Subscription.Zone.GYM, Subscription.Type.SINGLE);

        Customer customer2 = new Customer("Maxim", "Vengerov", 2005);
        Subscription subscription2 = new Subscription(customer2, LocalDate.now(), LocalDate.now().plusDays(10),
                Subscription.Zone.GROUP_CLASSES, Subscription.Type.DAILY);

        fitnessClub.registerSubscription(subscription1);
        fitnessClub.registerSubscription(subscription2);
        fitnessClub.getSubscriptions();
    }
}
