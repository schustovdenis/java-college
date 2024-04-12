package fitnessclub;

import java.time.LocalDate;

public class FitnessClub {
    private Subscription[] gymSubscription;
    private Subscription[] poolSubscription;
    private Subscription[] groupSubscription;
    private int countGym = 0;
    private int countPool = 0;
    private int countGroup = 0;
    public FitnessClub() {
        this.gymSubscription = new Subscription[20];
        this.poolSubscription = new Subscription[20];
        this.groupSubscription = new Subscription[20];
    }
    public boolean registerSubscription(Subscription subscription) {
        if (subscription.getEndDate().isBefore(LocalDate.now())) {
            System.out.println("Абонемент просрочен");
            return false;
        }
        if (subscription.getType() == Subscription.Type.SINGLE) {
            subscription.setEndDate(subscription.getStartDate().plusDays(1));
            if (!(subscription.getZone() == Subscription.Zone.POOL ||
                    subscription.getZone() == Subscription.Zone.GYM)) {
                System.out.println("Абонемент не дает право на посещение этой зоны");
                return false;
            }

        }
        if (subscription.getType() == Subscription.Type.DAILY) {
            if (!(subscription.getZone() == Subscription.Zone.GYM ||
                    subscription.getZone() == Subscription.Zone.GROUP_CLASSES)) {
                System.out.println("Абонемент не дает право на посещение этой зоны");
                return false;
            }
        }

        if (subscription.getRegister()) {
            System.out.println("Абонемент уже зарегистрирован");
            return false;
        }

        switch (subscription.getZone()) {
            case GYM:
                if (countGym > 20) {
                    System.out.println("В зоне нет свободных мест");
                    return false;
                }
                gymSubscription[countGym] = subscription;
                subscription.setRegister(true);
                countGym++;
                break;
            case POOL:
                if (countPool > 20) {
                    System.out.println("В зоне нет свободных мест");
                    return false;
                }
                poolSubscription[countPool] = subscription;
                subscription.setRegister(true);
                countPool++;
                break;
            case GROUP_CLASSES:
                if (countGroup > 20) {
                    System.out.println("В зоне нет свободных мест");
                    return false;
                }
                groupSubscription[countGroup] = subscription;
                subscription.setRegister(true);
                countGroup++;
                break;
        }
        return true;
    }
    public void getSubscriptions() {
        int j = 0;
        for (Subscription subscription : gymSubscription) {
            if (j < countGym) {
                System.out.printf("GYM - %s\n", subscription.getName());
                j++;
            } else {
                j = 0;
                break;
            }
        }
        for (Subscription subscription : poolSubscription) {
            if (j < countPool) {
                System.out.printf("POOL - %s\n", subscription.getName());
                j++;
            } else {
                j = 0;
                break;
            }
        }
        for (Subscription subscription : groupSubscription) {
            if (j < countGroup) {
                System.out.printf("GROUP - %s\n", subscription.getName());
                j++;
            } else break;
        }
    }
}
