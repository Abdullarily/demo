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
        arraySorted.setCallbackData("ALGORITHMS_SORTED");
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
    public InlineKeyboardMarkup eeApi() {

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
        List<InlineKeyboardButton> rowInline9 = new ArrayList<>();
        List<InlineKeyboardButton> rowInline10 = new ArrayList<>();
        List<InlineKeyboardButton> rowInline11 = new ArrayList<>();
        List<InlineKeyboardButton> rowInline12 = new ArrayList<>();

        InlineKeyboardButton whatEe = new InlineKeyboardButton();
        whatEe.setText("Что такое Java EE?");
        whatEe.setCallbackData("WHAT_EE");
        rowInline.add(whatEe);
        rowsInline.add(rowInline);

        InlineKeyboardButton modules = new InlineKeyboardButton();
        modules.setText("Какие модули входят в Java EE");
        modules.setCallbackData("MODULES");
        rowInline1.add(modules);
        rowsInline.add(rowInline1);

        InlineKeyboardButton clientTypes = new InlineKeyboardButton();
        clientTypes.setText("Какие типы Java EE клиентов вы знаете?");
        clientTypes.setCallbackData("CLIENT_TYPES");
        rowInline2.add(clientTypes);
        rowsInline.add(rowInline2);

        InlineKeyboardButton ejb = new InlineKeyboardButton();
        ejb.setText("Что вы знаете о EJB");
        ejb.setCallbackData("EJB");
        rowInline3.add(ejb);
        rowsInline.add(rowInline3);

        InlineKeyboardButton jarWarEar = new InlineKeyboardButton();
        jarWarEar.setText("Какая разница между .jar, .war и .ear файлами?");
        jarWarEar.setCallbackData("JAR_WAR_EAR");
        rowInline4.add(jarWarEar);
        rowsInline.add(rowInline4);

        InlineKeyboardButton componentsWebModule = new InlineKeyboardButton();
        componentsWebModule.setText("Какие компоненты содержит веб модуль?");
        componentsWebModule.setCallbackData("COMPONENTS_WEB_MODULE");
        rowInline5.add(componentsWebModule);
        rowsInline.add(rowInline5);

        InlineKeyboardButton cdi = new InlineKeyboardButton();
        cdi.setText("Java CDI");
        cdi.setCallbackData("CDI");
        rowInline6.add(cdi);
        rowsInline.add(rowInline6);

        InlineKeyboardButton technologiesEe = new InlineKeyboardButton();
        technologiesEe.setText("Какие технологии поддерживает Java EE?");
        technologiesEe.setCallbackData("TECHNOLOGIES_EE");
        rowInline7.add(technologiesEe);
        rowsInline.add(rowInline7);

        InlineKeyboardButton persistenseApi = new InlineKeyboardButton();
        persistenseApi.setText("Расскажите о Java Persistense API.");
        persistenseApi.setCallbackData("PERSISTENSE_API");
        rowInline8.add(persistenseApi);
        rowsInline.add(rowInline8);

        InlineKeyboardButton webLvl = new InlineKeyboardButton();
        webLvl.setText("Что входит в web уровень JEE?");
        webLvl.setCallbackData("WEB_LVL");
        rowInline9.add(webLvl);
        rowsInline.add(rowInline9);

        InlineKeyboardButton beanValidation = new InlineKeyboardButton();
        beanValidation.setText("Java Bean Validation");
        beanValidation.setCallbackData("BEAN_VALIDATION");
        rowInline10.add(beanValidation);
        rowsInline.add(rowInline10);

        InlineKeyboardButton eeSecurity = new InlineKeyboardButton();
        eeSecurity.setText("Java EE Security");
        eeSecurity.setCallbackData("EE_SECURITY");
        rowInline11.add(eeSecurity);
        rowsInline.add(rowInline11);

        InlineKeyboardButton eeMessaging = new InlineKeyboardButton();
        eeMessaging.setText("Java EE Messaging");
        eeMessaging.setCallbackData("EE_MESSAGING");
        rowInline12.add(eeMessaging);
        rowsInline.add(rowInline12);

        inlineKeyboardMarkup.setKeyboard(rowsInline);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup eeWeb() {

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
        List<InlineKeyboardButton> rowInline9 = new ArrayList<>();
        List<InlineKeyboardButton> rowInline10 = new ArrayList<>();
        List<InlineKeyboardButton> rowInline11 = new ArrayList<>();
        List<InlineKeyboardButton> rowInline12 = new ArrayList<>();
        List<InlineKeyboardButton> rowInline13 = new ArrayList<>();

        InlineKeyboardButton www = new InlineKeyboardButton();
        www.setText("Что такое www?");
        www.setCallbackData("WWW");
        rowInline.add(www);

        InlineKeyboardButton w3c = new InlineKeyboardButton();
        w3c.setText("Что такое w3c?");
        w3c.setCallbackData("W3C");
        rowInline.add(w3c);
        rowsInline.add(rowInline);

        InlineKeyboardButton tcpIp = new InlineKeyboardButton();
        tcpIp.setText("Что такое TCP/IP?");
        tcpIp.setCallbackData("TCP/IP");
        rowInline1.add(tcpIp);

        InlineKeyboardButton ftp = new InlineKeyboardButton();
        ftp.setText("Что такое ftp?");
        ftp.setCallbackData("FTP");
        rowInline1.add(ftp);
        rowsInline.add(rowInline1);

        InlineKeyboardButton httpHttps = new InlineKeyboardButton();
        httpHttps.setCallbackData("HTTP/HTTPS");
        httpHttps.setText("Чем отличаются http и https?");
        rowInline2.add(httpHttps);

        InlineKeyboardButton dateTransfer = new InlineKeyboardButton();
        dateTransfer.setText("Что такое application server?");
        dateTransfer.setCallbackData("APPLICATION_SERVER");
        rowInline2.add(dateTransfer);
        rowsInline.add(rowInline2);

        InlineKeyboardButton webServer = new InlineKeyboardButton();
        webServer.setText("Что такое web server");
        webServer.setCallbackData("WEB_SERVER");
        rowInline3.add(webServer);

        InlineKeyboardButton webApplication = new InlineKeyboardButton();
        webApplication.setText("Что такое web приложение?");
        webApplication.setCallbackData("WEB_APPLICATION");
        rowInline3.add(webApplication);
        rowsInline.add(rowInline3);

        InlineKeyboardButton applicationServer = new InlineKeyboardButton();
        applicationServer.setText("Что такое протокол передачи данных, какие вы знаете?");
        applicationServer.setCallbackData("DATE_TRANSFER");
        rowInline4.add(applicationServer);
        rowsInline.add(rowInline4);

        InlineKeyboardButton differenceWebAndApplication = new InlineKeyboardButton();
        differenceWebAndApplication.setText("Чем отличаются web server и application server?");
        differenceWebAndApplication.setCallbackData("DIFFERENCE_WEB_AND_APPLICATION");
        rowInline5.add(differenceWebAndApplication);
        rowsInline.add(rowInline5);

        InlineKeyboardButton dataTransferMethods = new InlineKeyboardButton();
        dataTransferMethods.setText("Какие методы передачи данных вы знаете?");
        dataTransferMethods.setCallbackData("DATA_TRANSFER_METHODS");
        rowInline6.add(dataTransferMethods);
        rowsInline.add(rowInline6);

        InlineKeyboardButton getAndPost = new InlineKeyboardButton();
        getAndPost.setText("Чем отличаются методы get и post?");
        getAndPost.setCallbackData("GET_AND_POST");
        rowInline7.add(getAndPost);

        InlineKeyboardButton html = new InlineKeyboardButton();
        html.setText("Что такое html?");
        html.setCallbackData("WHAT_HTML");
        rowInline7.add(html);
        rowsInline.add(rowInline7);

        InlineKeyboardButton xml = new InlineKeyboardButton();
        xml.setText("Что такое xml?");
        xml.setCallbackData("WHAT_XML");
        rowInline8.add(xml);

        InlineKeyboardButton css = new InlineKeyboardButton();
        css.setText("Что такое css?");
        css.setCallbackData("WHAT_CSS");
        rowInline8.add(css);
        rowsInline.add(rowInline8);

        InlineKeyboardButton mimeType = new InlineKeyboardButton();
        mimeType.setText("Что такое MIME type?");
        mimeType.setCallbackData("MIME_TYPE");
        rowInline9.add(mimeType);

        InlineKeyboardButton cookies = new InlineKeyboardButton();
        cookies.setText("Что такое cookies?");
        cookies.setCallbackData("WHAT_COOKIES");
        rowInline9.add(cookies);
        rowsInline.add(rowInline9);

        InlineKeyboardButton session = new InlineKeyboardButton();
        session.setText("Что такое сессия?");
        session.setCallbackData("WHAT_SESSION");
        rowInline10.add(session);
        rowsInline.add(rowInline10);

        InlineKeyboardButton authorizationAndAuthentication = new InlineKeyboardButton();
        authorizationAndAuthentication.setText("Дайте определение понятиям “авторизация” и “аутентификация”, в чем их различия?");
        authorizationAndAuthentication.setCallbackData("AUTHORIZATION_AUTHENTICATION");
        rowInline11.add(authorizationAndAuthentication);
        rowsInline.add(rowInline11);

        InlineKeyboardButton ajax = new InlineKeyboardButton();
        ajax.setText("Что такое Ajax? Как принципиально устроена эта технология?");
        ajax.setCallbackData("WHAT_AJAX");
        rowInline12.add(ajax);
        rowsInline.add(rowInline12);

        InlineKeyboardButton orm = new InlineKeyboardButton();
        orm.setText("Что такое ORM, как это перевести и как это должно работать?");
        orm.setCallbackData("WHAT_ORM");
        rowInline13.add(orm);
        rowsInline.add(rowInline13);

        inlineKeyboardMarkup.setKeyboard(rowsInline);
        return inlineKeyboardMarkup;
    }
}
