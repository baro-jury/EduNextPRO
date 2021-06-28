public interface IPet<E> {
    public void listAll();
    public void addPet(E dog);
    public void removePet(String id);
    public void saveFile();
    public void updateById(String id);
}