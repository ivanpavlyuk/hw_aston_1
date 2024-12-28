package ru.ivanpavlyuk.hw4;

import java.util.Arrays;
import java.util.Collection;

public class ArrList<T> {
    private Object[] elements;
    private int size;

    public ArrList() {
        elements = new Object[10]; // начальный размер массива
        size = 0;
    }

    // Метод добавления элемента
    public ArrList<T> add(T element) {
        ensureCapacity();
        elements[size++] = element;
        return this;
    }

    public void replace(int index, T element) {
        checkIndex(index);
        elements[index] = element;
    }

    // Метод получения элемента по индексу
    @SuppressWarnings("unchecked")
    public T get(int index) {
        checkIndex(index);
        return (T) elements[index];
    }

    // Метод удаления элемента по индексу
    public T remove(int index) {
        checkIndex(index);
        @SuppressWarnings("unchecked")
        T removedElement = (T) elements[index];
        System.arraycopy(elements, index + 1, elements, index, size - index - 1);
        elements[--size] = null; // Убираем ссылку для очистки памяти
        return removedElement;
    }

    // Метод добавления всех элементов другой коллекции
    public void addAll(Collection<? extends T> collection) {
        for (T element : collection) {
            add(element);
        }
    }

    // Получение размера коллекции
    public int size() {
        return size;
    }

    // Проверка индекса
    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }

    // Увеличение размера массива при необходимости
    private void ensureCapacity() {
        if (size == elements.length) {
            Object[] newElements = new Object[elements.length * 2];
            System.arraycopy(elements, 0, newElements, 0, elements.length);
            elements = newElements;
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Object element : elements) {
            if (element == null) continue;
            result.append(element.toString()).append(", ");
        }
        return result.substring(0, result.length() - 2);
    }
}
