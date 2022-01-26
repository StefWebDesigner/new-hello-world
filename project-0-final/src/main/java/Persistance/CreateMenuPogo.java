package Persistance;

public class CreateMenuPogo {
    //CREATE MENU VARIABLES
    private Integer id;
    private String username;
    private String permPassword;
    private String permFirstName;
    private String permLastName;
    private String permEmail;
    private String permCountry;
    private String permAddressStreet;
    private String permAddressState;
    private Integer permAddressZipCode;

    public CreateMenuPogo() {
    }

    public CreateMenuPogo( String username, String permPassword, String permFirstName, String permLastName, String permEmail, String permCountry, String permAddressStreet, String permAddressState, Integer permAddressZipCode) {
        this.username = username;
        this.permPassword = permPassword;
        this.permFirstName = permFirstName;
        this.permLastName = permLastName;
        this.permEmail = permEmail;
        this.permCountry = permCountry;
        this.permAddressStreet = permAddressStreet;
        this.permAddressState = permAddressState;
        this.permAddressZipCode = permAddressZipCode;
    }

//
//    public CreateMenuPogo(String permFirstName, String permLastName, String username, String permCountry, String permAddressStreet, String permAddressState, int permAddressZipCode) {
//    }

    public CreateMenuPogo(String username, String password) {
    }

//    public CreateMenuPogo getCreateMenuPogo() {
//        return createMenuPogo;
//    }

//    public void setCreateMenuPogo(CreateMenuPogo createMenuPogo) {
//        this.createMenuPogo = createMenuPogo;
//    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPermPassword() {
        return permPassword;
    }

    public void setPermPassword(String permPassword) {
        this.permPassword = permPassword;
    }

    public String getPermFirstName() {
        return permFirstName;
    }

    public void setPermFirstName(String permFirstName) {
        this.permFirstName = permFirstName;
    }

    public String getPermLastName() {
        return permLastName;
    }

    public void setPermLastName(String permLastName) {
        this.permLastName = permLastName;
    }

    public String getPermEmail() {
        return permEmail;
    }

    public void getPermEmail(String permEmail) {
        this.permEmail = permEmail;
    }

    public String getPermCountry() {
        return permCountry;
    }

    public void setPermCountry(String permCountry) {
        this.permCountry = permCountry;
    }

    public String getPermAddressStreet() {
        return permAddressStreet;
    }

    public void setPermAddressStreet(String permAddressStreet) {
        this.permAddressStreet = permAddressStreet;
    }

    public String getPermAddressState() {
        return permAddressState;
    }

    public void setPermAddressState(String permAddressState) {
        this.permAddressState = permAddressState;
    }

    public Integer getPermAddressZipCode() {
        return permAddressZipCode;
    }

    public void setPermAddressZipCode(Integer permAddressZipCode) {
        this.permAddressZipCode = permAddressZipCode;
    }

    public void create(CreateMenuPogo newUser) {
    }

    //SETTERS
    //WILL I NEED ALL OF THESE GETTER & TO BE CONTINUED
//
//
//    public Integer getId() {
//        return client_id;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//
//    public String getFirstName() {
//        return permFirstName;
//    }
//
//    public String getLastName() {
//        return permLastName;
//    }
//
//    public String getCountry() {
//        return permCountry;
//    }
//
//    public String getAddressStreet() {
//        return permAddressStreet;
//    }
//
//    public String getAddressState() {
//        return permAddressState;
//    }
//
//    public Integer getAddressZipCode() {
//        return permAddressZipCode;
//    }
//
//    //SETTERS
//
//    public void setId(Integer client_id) {
//        this.client_id = client_id;
//    }
//
//    public void setUsername() {
//        this.username = username;
//    }
//
//    public void setFirstName() {
//        this.permFirstName = permFirstName;
//    }
//
//    public void setLastName() {
//        this.permLastName = permLastName;
//    }
//
//    public void setCountry() {
//        this.permCountry = permCountry;
//    }
//
//    public void setAddressStreet() {
//        this.permAddressStreet = permAddressStreet;
//    }
//
//    public void setAddressState() {
//        this.permAddressState = permAddressState;
//    }
//
//    public void setAddressZipCode() {
//        this.permAddressZipCode = permAddressZipCode;
//
//    }


}


