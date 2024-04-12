package fitnessclub;

import java.time.LocalDate;

public class Subscription {
    private Customer customer;
    private LocalDate startDate;
    private LocalDate endDate;
    private Zone zone;
    private Type type;
    private boolean isRegister;

    public Subscription(Customer customer,
                        LocalDate registrationDate, LocalDate expirationDate
            , Zone zone, Type type) {
        this.customer = customer;
        this.startDate = registrationDate;
        this.endDate = expirationDate;
        this.zone = zone;
        this.type = type;
        this.isRegister = false;
    }

    public String getName() {
        return customer.getName();
    }
    public void setRegister(boolean bool) {
        this.isRegister = bool;
    }

    public boolean getRegister() {
        return this.isRegister;
    }
    public LocalDate getStartDate() {
        return startDate;
    }
    public LocalDate getEndDate() {
        return endDate;
    }
    public void setEndDate(LocalDate date) {
        this.endDate = date;
    }
    public Zone getZone() {
        return zone;
    }
    public Type getType() {
        return type;
    }
    public enum Type {
        SINGLE, DAILY, FULL
    }
    public enum Zone {
        GYM, POOL, GROUP_CLASSES
    }
}
