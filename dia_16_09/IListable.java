package dia_16_09;

public interface IListable {

    boolean isFull();
    boolean isEmpty();
    void addValue(int value);
    void addValueAt(int index, int value);
    int getValueAt(int index);
    void setValueAt(int index);
}