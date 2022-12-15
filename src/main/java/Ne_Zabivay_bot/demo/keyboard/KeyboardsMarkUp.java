package Ne_Zabivay_bot.demo.keyboard;

import com.vdurmont.emoji.EmojiParser;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.ArrayList;
import java.util.List;

public class KeyboardsMarkUp {

    ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
    public ReplyKeyboardMarkup keyboardStart() {
        String core = EmojiParser.parseToUnicode("Java core ☕");
        String spring = EmojiParser.parseToUnicode("Spring \uD83C\uDF43");
        String TgBot = EmojiParser.parseToUnicode("Телеграмм бот \uD83E\uDD16");
        String allCommands = EmojiParser.parseToUnicode("all commands \uD83E\uDE84");

        List<KeyboardRow> keyboardRows = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();

        row.add(core);
        row.add(spring);
        row.add(TgBot);

        keyboardRows.add(row);

        row = new KeyboardRow();

        row.add(allCommands);

        keyboardRows.add(row);

        replyKeyboardMarkup.setKeyboard(keyboardRows);
        replyKeyboardMarkup.setSelective(true);
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setOneTimeKeyboard(true);
        return replyKeyboardMarkup;
    }
    public ReplyKeyboardMarkup keyboardJavaCore() {
        String lists = "Коллекции \uD83D\uDCCB";
        String arrays = "Массивы \uD83C\uDFE2";
        String inOutPut = "Чтение и запись \uD83D\uDDD2";
        String date = "Дата и время \uD83D\uDCC5";


        List<KeyboardRow> keyboardRows = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        row.add(lists);
        row.add(arrays);
        keyboardRows.add(row);

        row = new KeyboardRow();
        row.add(inOutPut);
        row.add(date);
        keyboardRows.add(row);

        replyKeyboardMarkup.setKeyboard(keyboardRows);
        replyKeyboardMarkup.setSelective(true);
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setOneTimeKeyboard(true);
        return replyKeyboardMarkup;
    }
    public ReplyKeyboardMarkup keyboardLists() {
        String collection = "Интерфейс Collection - Родитель всех интерфейсов коллекций";
        String methods = "Основные методы коллекций";
        List<KeyboardRow> keyboardRows = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        row.add(collection);
        keyboardRows.add(row);

        replyKeyboardMarkup.setKeyboard(keyboardRows);
        replyKeyboardMarkup.setSelective(true);
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setOneTimeKeyboard(true);
        return replyKeyboardMarkup;
    }

    public ReplyKeyboardMarkup keyboardCollection() {
        String collectionExtends = "Интерфейсы наследники Collection";
        String abstractClassCollection = "Абстрактные классы коллекций";
        String collectionTypes = "Виды коллекций";
        List<KeyboardRow> keyboardRows = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        row.add(collectionExtends);
        keyboardRows.add(row);

        row = new KeyboardRow();
        row.add(abstractClassCollection);
        keyboardRows.add(row);

        row = new KeyboardRow();
        row.add(collectionTypes);
        keyboardRows.add(row);

        replyKeyboardMarkup.setKeyboard(keyboardRows);
        replyKeyboardMarkup.setSelective(true);
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setOneTimeKeyboard(true);
        return replyKeyboardMarkup;
    }
    public ReplyKeyboardMarkup keyboardSpring() {
        return new ReplyKeyboardMarkup();
    }
    public ReplyKeyboardMarkup keyboardTgBot() {
        return new ReplyKeyboardMarkup();
    }
    public ReplyKeyboardMarkup keyboardArray() {
        String methods = "Методы массивов";
        String initialize = "Примеры работы с массивами";
//        String arrayTypes = "Виды массивов";

        List<KeyboardRow> keyboardRows = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        row.add(methods);
        keyboardRows.add(row);

        row = new KeyboardRow();
        row.add(initialize);
        keyboardRows.add(row);

//        row = new KeyboardRow();
//        row.add(arrayTypes);
//        keyboardRows.add(row);

        replyKeyboardMarkup.setKeyboard(keyboardRows);
        replyKeyboardMarkup.setSelective(true);
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setOneTimeKeyboard(true);
        return replyKeyboardMarkup;
    }
}
