package gmiBank.com.pojos;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties (ignoreUnknown = true)


public class Customer6 {
//Aldigimiz butun customer bilgilerini classin icine yapistiriyoruz.
// customer bilgileri icinden id yi aliyoruz ve saklamak icin private yapiyoruz.

    private int id;
    private String firstName;
    private String lastName;
    private String middleInitial;
    private String email;
    private String mobilePhoneNumber;
    private String phoneNumber;
    private String zipCode;
    private String address;
    private String city;
    private String ssn;
    private String createDate;
    private boolean zelleEnrolled;

    private Country6 country; //country bilgileri okutabilirim
    private String state;
    private User6 user; //user bilgileri cagriyorum
    private String accounts; //bu ayri json bilgi



    private Country6 country;//burada onceden String vardi(private String country). ancak string de bir class oldugundan ve
                            // ben Country6 classdeki datalara erisim istedigimiden String yerine Country6 classini yazabilirim.

    private String state;
    private User6 user;
    private String accounts;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleInitial() {
        return middleInitial;
    }

    public void setMiddleInitial(String middleInitial) {
        this.middleInitial = middleInitial;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobilePhoneNumber() {
        return mobilePhoneNumber;
    }

    public void setMobilePhoneNumber(String mobilePhoneNumber) {
        this.mobilePhoneNumber = mobilePhoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public boolean isZelleEnrolled() {
        return zelleEnrolled;
    }

    public void setZelleEnrolled(boolean zelleEnrolled) {
        this.zelleEnrolled = zelleEnrolled;
    }

    public Country6 getCountry() {
        return country;
    }

    public void setCountry(Country6 country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public User6 getUser() {
        return user;
    }

    public void setUser(User6 user) {
        this.user = user;
    }

    public String getAccounts() {
        return accounts;
    }

    public void setAccounts(String accounts) {
        this.accounts = accounts;
    }

/*
    {
        "id": 94774,
        "firstName": "Nikita",
        "lastName": "Ernser",
        "middleInitial": "S",
        "email": "nikitaernser@gmail.com",
        "mobilePhoneNumber": "479-124-5412489-121-8179",
        "phoneNumber": "1-036-189-7365",
        "zipCode": "73726-0455",
        "address": "05356 Cummerata Village",
        "city": "Fairfax",
        "ssn": "857-73-8822",
        "createDate": "2021-09-02T04:00:00Z",
        "zelleEnrolled": false,
        "country": {
            "id": 3,
            "name": "USA",
            "states": null
        },
        "state": "Virginia",
        "user": {
            "id": 94902,
            "login": "marc.weissnat",
            "firstName": "Nikita",
            "lastName": "Ernser",
            "email": "nikitaernser@gmail.com",
            "activated": true,
            "langKey": "en",
            "imageUrl": null,
            "resetDate": null
        },
        "accounts": null
    },
     */
}

