package seminar3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Делаем лекарство Pharmacy итерируемым объектом - по Components, которые являются составляющими
// Pharmacy
public class Pharmacy implements Iterable <Component>, Comparable<Pharmacy> {
    private List<Component> components;
    private int index;

    public Pharmacy() {
        this.components = new ArrayList<>();
        this.index = 0;
    }
    // Метод добавления компонента в Pharmacy
    public Pharmacy addComponent(Component component){
        if (component == null) throw new NullPointerException("Component couldn't be null");
        components.add(component);
        return this;
    }

    public int getPharmacyPower(){
        int count = 0;
        for (Component component : components){
            count += component.getPower();
        }
        // Вариант записи через stream
        // int count = components.stream().mapToInt(Component::getPower).sum();
        return count;
    }

    /*// Пока индекс меньше длины components - true
    @Override
    public boolean hasNext() {
        return index < components.size();
    }
    // Для понимания работы Iterator - Описываем как получить следующий элемент в списке.
    При вызове метода получаем следующий элемент и увеличиваем значение индекса на 1
    @Override
    public Component next() {
        return components.get(index++);
    }*/

    @Override
    public String toString() {
        return "Pharmacy{" +
                "components=" + components +
                ", index=" + index +
                '}';
    }
// Реализация итерации через инкапсуляцию логики в отдельном классе Pharmacyiterator - каждый класс где нужно
// может использовать, чтобы не повторять много раз анонимный класс

    /*@Override
    public Iterator<Component> iterator() {
        return new PharmacyIterator();
    }*/
// Реализация итерации через анонимный класс, если не требуется реализация в нескольких классах.
    @Override
    public Iterator<Component> iterator() {
        return new Iterator<Component>() {
            @Override
            public boolean hasNext() {
                return index < components.size();
            }

            @Override
            public Component next() {
                return components.get(index++);
            }
        };
    }
// Объясняет компилятору как сравнить 2 объекта (Pharmacy)
    @Override
    public int compareTo(Pharmacy o) {
        int fullPower = getPharmacyPower();
        if (this.getPharmacyPower() > o.getPharmacyPower()) {
            return 1;
        }
        if (this.getPharmacyPower() < o.getPharmacyPower()) {
            return -1;
        }
        return 0;
    }
}
