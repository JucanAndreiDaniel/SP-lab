package lab2;

import java.util.ArrayList;

public class SubChapter {

    private String name;
    private ArrayList<Element> elements;

    //constructor
    public SubChapter(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }
    public void addElement(Element element) {
        elements.add(element);
    }

    public void print() {
        System.out.println("SubChapter: " + this.name);
        for (Element element : elements) {
            element.print();
        }
    }
}
