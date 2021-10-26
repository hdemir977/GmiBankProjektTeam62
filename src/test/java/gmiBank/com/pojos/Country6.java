package gmiBank.com.pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties (ignoreUnknown = true)
public class Country6 {
    //country icindeki verilerle calisacagimiz icin direkt olarak id den basliyoruz.
    private int id;
    private String name;
    private String states;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStates() {
        return states;
    }

    public void setStates(String states) {
        this.states = states;
    }

  /*
    "country": {
            "id": 3,
            "name": "USA",
            "states": null
        },
     */
}