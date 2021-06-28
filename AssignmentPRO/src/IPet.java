public interface IPet<E> {
    public void listAll();
    public void addPet();
    public void removePet(String id);
    public void saveFile();
    public void updateById(String id);
}