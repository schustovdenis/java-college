package climber;

import java.util.ArrayList;

public class ClimbingGroup {
    private boolean isRecruitment;
    private int numOfAlpinists;
    private Alpinist[] alpinists;
    private Mountain mountain;
    private int i = 0;

    public ClimbingGroup(boolean isRecruitment, int numOfAlpinists, Mountain mountain) {
        this.isRecruitment = isRecruitment;
        this.numOfAlpinists = numOfAlpinists;
        this.alpinists = new Alpinist[3];
        this.mountain = mountain;
    }

    public void addAlpinist(Alpinist alpinist) {
        if (i != numOfAlpinists && isRecruitment) {
            alpinists[i] = alpinist;
            i++;
        } else {
            System.out.println("Набор в группу закрыт или группа полна.");
        }
    }
    public void getAlpinist() {
        int j = 0;
        for (Alpinist alpinists : alpinists) {
            if (j < i) {
                System.out.printf("%s - %s - %s\n", alpinists.getName(), alpinists.getAge(), alpinists.getAddress());
                j++;
            } else break;
        }
    }
}
