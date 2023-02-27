package BehavioralDP.ObserverDp;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency {

    private String news;

    private List<Chanel>   chanelList = new ArrayList<>();


    public  void  addObserver(Chanel chanel){
        chanelList.add(chanel);
    }

    public void  removeObserver(Chanel chanel){
        chanelList.remove(chanel);
    }

    public void sendNews(String news){
        this.news=news;
        for (Chanel chanel:chanelList){
            chanel.update(this.news);
        }

    }



}
