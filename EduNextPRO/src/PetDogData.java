public class PetDogData {
    public String ID;
    public String PetName;

    @Override
    public String toString() {
        return ID + "; " + PetName;
    }

    public PetDogData(String ID, String PetName) {
        this.ID = ID;
        this.PetName = PetName;
    }
    public PetDogData() {}

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getPetName() {
        return PetName;
    }

    public void setPetName(String PetName) {
        this.PetName = PetName;
    }
}