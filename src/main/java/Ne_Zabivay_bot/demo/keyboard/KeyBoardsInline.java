package Ne_Zabivay_bot.demo.keyboard;

import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;

import java.util.ArrayList;
import java.util.List;

public class KeyBoardsInline {
    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
    public InlineKeyboardMarkup keyboardLists() {

                            //список рядов
        List<List<InlineKeyboardButton>> rowsInline = new ArrayList<>();

                                //один ряд
        List<InlineKeyboardButton> rowInline = new ArrayList<>();
        List<InlineKeyboardButton> rowInline1 = new ArrayList<>();
        List<InlineKeyboardButton> rowInline2 = new ArrayList<>();
        List<InlineKeyboardButton> rowInline3 = new ArrayList<>();
        List<InlineKeyboardButton> rowInline4 = new ArrayList<>();
        List<InlineKeyboardButton> rowInline5 = new ArrayList<>();
        List<InlineKeyboardButton> rowInline6 = new ArrayList<>();
        List<InlineKeyboardButton> rowInline7 = new ArrayList<>();
        List<InlineKeyboardButton> rowInline8 = new ArrayList<>();


        InlineKeyboardButton arrayList = new InlineKeyboardButton();
        arrayList.setText("ArrayList");
        arrayList.setCallbackData("ARRAY_LIST");
        rowInline.add(arrayList);
        rowsInline.add(rowInline);

        InlineKeyboardButton linkedList = new InlineKeyboardButton();
        linkedList.setText("LinkedList");
        linkedList.setCallbackData("LINKED_LIST");
        rowInline1.add(linkedList);
        rowsInline.add(rowInline1);

        InlineKeyboardButton arrayDeque = new InlineKeyboardButton();
        arrayDeque.setText("ArrayDeque");
        arrayDeque.setCallbackData("ARRAY_DEQUE");
        rowInline2.add(arrayDeque);
        rowsInline.add(rowInline2);

        InlineKeyboardButton hashSet = new InlineKeyboardButton();
        hashSet.setText("HashSet");
        hashSet.setCallbackData("HASH_SET");
        rowInline3.add(hashSet);
        rowsInline.add(rowInline3);

        InlineKeyboardButton treeSet = new InlineKeyboardButton();
        treeSet.setText("TreeSet");
        treeSet.setCallbackData("TREE_SET");
        rowInline4.add(treeSet);
        rowsInline.add(rowInline4);

        InlineKeyboardButton linkedHashSet = new InlineKeyboardButton();
        linkedHashSet.setText("LinkedHashSet");
        linkedHashSet.setCallbackData("LINKED_HASH_SET");
        rowInline5.add(linkedHashSet);
        rowsInline.add(rowInline5);

        InlineKeyboardButton priorityQueue = new InlineKeyboardButton();
        priorityQueue.setText("PriorityQueue");
        priorityQueue.setCallbackData("PRIORITY_QUEUE");
        rowInline6.add(priorityQueue);
        rowsInline.add(rowInline6);

        InlineKeyboardButton hashMap = new InlineKeyboardButton();
        hashMap.setText("HashMap");
        hashMap.setCallbackData("HASH_MAP");
        rowInline7.add(hashMap);
        rowsInline.add(rowInline7);

        InlineKeyboardButton treeMap = new InlineKeyboardButton();
        treeMap.setText("TreeMap");
        treeMap.setCallbackData("TREE_MAP");
        rowInline8.add(treeMap);
        rowsInline.add(rowInline8);

        inlineKeyboardMarkup.setKeyboard(rowsInline);

        return inlineKeyboardMarkup;

    }
    public InlineKeyboardMarkup keyboardArrayExample() {
        //список рядов
        List<List<InlineKeyboardButton>> rowsInline = new ArrayList<>();

        //один ряд
        List<InlineKeyboardButton> rowInline = new ArrayList<>();
        List<InlineKeyboardButton> rowInline1 = new ArrayList<>();
        List<InlineKeyboardButton> rowInline2 = new ArrayList<>();


        InlineKeyboardButton array = new InlineKeyboardButton();
        array.setText("Создание массива");
        array.setCallbackData("CREATE_ARRAY");
        rowInline.add(array);
        rowsInline.add(rowInline);

        InlineKeyboardButton multidimensionalArray = new InlineKeyboardButton();
        multidimensionalArray.setText("Многомерные и зубчатые массивы");
        multidimensionalArray.setCallbackData("MULTIDIMENSIONAL_ARRAY");
        rowInline1.add(multidimensionalArray);
        rowsInline.add(rowInline1);

        InlineKeyboardButton arrayCycle = new InlineKeyboardButton();
        arrayCycle.setText("Примеры циклов для массивов");
        arrayCycle.setCallbackData("ARRAY_CYCLE");
        rowInline2.add(arrayCycle);
        rowsInline.add(rowInline2);

        inlineKeyboardMarkup.setKeyboard(rowsInline);

        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup arrayCycle() {

        List<List<InlineKeyboardButton>> rowsInline = new ArrayList<>();

        //один ряд
        List<InlineKeyboardButton> rowInline = new ArrayList<>();
        List<InlineKeyboardButton> rowInline1 = new ArrayList<>();
        List<InlineKeyboardButton> rowInline2 = new ArrayList<>();

        InlineKeyboardButton arrayInitialization = new InlineKeyboardButton();
        arrayInitialization.setText("Инициализация массивов");
        arrayInitialization.setCallbackData("ARRAY_INITIALIZATION");
        rowInline.add(arrayInitialization);
        rowsInline.add(rowInline);

        InlineKeyboardButton arraySorted = new InlineKeyboardButton();
        arraySorted.setText("Алгоритмы сортировки");
        arraySorted.setCallbackData("ARRAY_SORTED");
        rowInline1.add(arraySorted);
        rowsInline.add(rowInline1);

        inlineKeyboardMarkup.setKeyboard(rowsInline);

        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup sortingAlgorithms() {
        List<List<InlineKeyboardButton>> rowsInline = new ArrayList<>();

        //один ряд
        List<InlineKeyboardButton> rowInline = new ArrayList<>();
        List<InlineKeyboardButton> rowInline1 = new ArrayList<>();
        List<InlineKeyboardButton> rowInline2 = new ArrayList<>();

        InlineKeyboardButton bubbleSorted = new InlineKeyboardButton();
        bubbleSorted.setText("Сортировка пузырьком");
        bubbleSorted.setCallbackData("BUBBLE_SORTED");
        rowInline.add(bubbleSorted);
        rowsInline.add(rowInline);

        InlineKeyboardButton shakerSorted = new InlineKeyboardButton();
        shakerSorted.setText("Шейкерная сортировка (сортировка перемешиванием)");
        shakerSorted.setCallbackData("SHAKER_SORTED");
        rowInline1.add(shakerSorted);
        rowsInline.add(rowInline1);

        InlineKeyboardButton combSorted = new InlineKeyboardButton();
        combSorted.setText("Сортировка расческой");
        combSorted.setCallbackData("COMB_SORTED");
        rowInline2.add(combSorted);
        rowsInline.add(rowInline2);

        inlineKeyboardMarkup.setKeyboard(rowsInline);
        return inlineKeyboardMarkup;
    }
}
