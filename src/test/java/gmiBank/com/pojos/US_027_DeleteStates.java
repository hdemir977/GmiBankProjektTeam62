package gmiBank.com.pojos;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class US_027_DeleteStates {

    /*
     {
        "id": 21589,
        "name": "Istanbul",
        "tpcountry": null
    },
     */


    private int id;
    private String name;
    private String tpcountry;

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

    public String getTpcountry() {

        return tpcountry;
    }

    public void setTpcountry(String tpcountry) {

        this.tpcountry = tpcountry;
    }
}
