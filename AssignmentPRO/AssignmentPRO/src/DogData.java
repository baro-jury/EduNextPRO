public class DogData {
    private String ID;
    private String PetID;
    private String DogName;
    String DogColor;
    private boolean DogGender; //true-cai false-duc
    double Price;
    private String Desc;

    @Override
    public String toString() {
        return ID + "; " + PetID + "; " + DogName + "; " + DogColor + "; " + (DogGender ? "cai" : "duc") + "; " + Price + "; " + Desc;
    }
    public DogData() {}
    
    public DogData(String ID, String PetID, String DogName, String DogColor, boolean DogGender, double Price, String Desc) {
        this.ID = ID;
        this.PetID = PetID;
        this.DogName = DogName;
        this.DogColor = DogColor;
        this.DogGender = DogGender;
        this.Price = Price;
        this.Desc = Desc;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getPetID() {
        return PetID;
    }

    public void setPetID(String PetID) {
        this.PetID = PetID;
    } 

    public String getDogName() {
        return DogName;
    }

    public void setDogName(String DogName) {
        this.DogName = DogName;
    }

    public String getDogColor() {
        return DogColor;
    }

    public void setDogColor(String DogColor) {
        this.DogColor = DogColor;
    }

    public String isDogGender() {
        return DogGender ? "cái" : "đực";
    }

    public void setDogGender(boolean isFemale) {
        this.DogGender = isFemale;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(int Price) {
        this.Price = Price;
    }

    public String getDesc() {
        return Desc;
    }

    public void setDesc(String Desc) {
        this.Desc = Desc;
    }
}