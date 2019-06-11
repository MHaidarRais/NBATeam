package com.rais.haidar.nbateam;

import java.util.ArrayList;

public class NbaTeamData {
    public static String [][] data = new String[][] {
            {
                "Atlanta Hawks","Southeast","http://www.nbateamslist.com/wp-content/themes/almost-spring-adsense-seo-02/images/logo_history/hawks.png"
            },{
                "Boston Celtics","Atlantic","http://www.nbateamslist.com/wp-content/themes/almost-spring-adsense-seo-02/images/logo_history/celtics.png"
            },{
                "Brooklyn Nets","Atlantic","http://www.nbateamslist.com/wp-content/themes/almost-spring-adsense-seo-02/images/logo_history/nets.png"
            },{
                "Charlotte Hornets","Southwest","http://www.nbateamslist.com/wp-content/themes/almost-spring-adsense-seo-02/images/logo_history/charlotte-hornets.png"
            },{
                "Chicago Bulls","Central","http://www.nbateamslist.com/wp-content/themes/almost-spring-adsense-seo-02/images/logo_history/bulls.png"
            },{
                "Cleveland Cavaliers","Central","http://www.nbateamslist.com/wp-content/themes/almost-spring-adsense-seo-02/images/logo_history/cavaliers.png"
            },{
                "Dallas Maverick","Southwest","http://www.nbateamslist.com/wp-content/themes/almost-spring-adsense-seo-02/images/logo_history/mavericks.gif"
            },{
                "Denver Nuggets","Northwest","http://www.nbateamslist.com/wp-content/themes/almost-spring-adsense-seo-02/images/logo_history/nuggets.gif"
            },{
                "Detroit Piston","Central","http://www.nbateamslist.com/wp-content/themes/almost-spring-adsense-seo-02/images/logo_history/pistons.png"
            },{
                "Golden State Warrior","Pacific","http://www.nbateamslist.com/wp-content/themes/almost-spring-adsense-seo-02/images/logo_history/warriors.gif"
            }, {
            "Houston Rocket", "Southwest", "http://www.nbateamslist.com/wp-content/themes/almost-spring-adsense-seo-02/images/logo_history/rockets.gif"
            }
    };

    public static ArrayList<NbaTeam> getListData(){
        NbaTeam president = null;
        ArrayList<NbaTeam> list = new ArrayList<>();
        for (String[] aData : data) {
            president = new NbaTeam();
            president.setName(aData[0]);
            president.setLocation(aData[1]);
            president.setPhoto(aData[2]);

            list.add(president);
        }

        return list;
    }
}

