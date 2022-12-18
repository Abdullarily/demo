package Ne_Zabivay_bot.demo.service;

import Ne_Zabivay_bot.demo.keyboard.KeyBoardsInline;
import Ne_Zabivay_bot.demo.variables.Text;
import Ne_Zabivay_bot.demo.config.BotConfig;
import Ne_Zabivay_bot.demo.keyboard.KeyboardsMarkUp;
import com.vdurmont.emoji.EmojiParser;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.util.ResourceUtils;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.commands.SetMyCommands;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageText;
import org.telegram.telegrambots.meta.api.objects.InputFile;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.commands.BotCommand;
import org.telegram.telegrambots.meta.api.objects.commands.scope.BotCommandScopeDefault;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@Component
public class TelegramBot extends TelegramLongPollingBot {
    final BotConfig config;
    KeyboardsMarkUp keyboardsMarkUp = new KeyboardsMarkUp();
    KeyBoardsInline keyBoardsInline = new KeyBoardsInline();
    final static String HELP_TEXT = "Данный бот это сборник полезных сайтов, интересных каналов," +
            " и прочьего еще чего то там, для более подробного изучения всех команд отправьте команду " +
            "/all_commands и откройте полученный файл, с описанием всех комманд";


    public TelegramBot(BotConfig config) {
        this.config = config;
        List<BotCommand> listOfCommands = new ArrayList<>();
        listOfCommands.add(new BotCommand("/start", "старт"));
        listOfCommands.add(new BotCommand("/help", "Подробное описание возможностей бота"));
        listOfCommands.add(new BotCommand("/javacore", "java core"));
        try {
            this.execute(new SetMyCommands(listOfCommands, new BotCommandScopeDefault(), null));
        } catch (TelegramApiException e) {
            log.error("Ошибка настройки комманд бота: " + e.getMessage());
        }
    }

    @Override
    public String getBotUsername() {
        return config.getBotName();
    }

    @Override
    public String getBotToken() {
        return config.getToken();
    }

    @Override
    public void onUpdateReceived(Update update) {
        try {
        if (update.hasMessage() && update.getMessage().hasText()) {
            String messageText = update.getMessage().getText();
            long chatId = update.getMessage().getChatId();


            switch (messageText) {
                case "Java core ☕" -> messageText = "/javacore";
                case "Spring \uD83C\uDF43" -> messageText = "/spring";
                case "Телеграмм бот \uD83E\uDD16" -> messageText = "/tgbot";
                case "all commands \uD83E\uDE84" -> messageText = "/allcomands";
                case "Коллекции \uD83D\uDCCB" -> messageText = "/lists";
                case "Массивы \uD83C\uDFE2" -> messageText = "/arrays";
                case "Чтение и запись \uD83D\uDDD2" -> messageText = "/inoutput";
                case "Дата и время \uD83D\uDCC5" -> messageText = "/datenadtime";
                case "Интерфейс Collection - Родитель всех интерфейсов коллекций" ->
                        messageText = "/interfacecollection";
                case "Интерфейсы наследники Collection" -> messageText = "/extendscollections";
                case "Абстрактные классы коллекций" -> messageText = "/abstractcollectionclass";
                case "Виды коллекций" -> messageText = "/collectiontypes";
                case "Основные методы коллекций" -> messageText = "/collectionmethods";
                case "Методы массивов" -> messageText = "/arrayMethods";
                case "Примеры работы с массивами" -> messageText = "/initialize";
                case "Виды массивов" -> messageText = "/arraytypes";
                case "Ээ" -> messageText = "/joke";
            }
                switch (messageText) {
                    case"/test" -> sendPhoto(chatId, "Проверка удалась", "photo/0001.jpg");
                    case "/start" -> startCommandReceived(chatId, update.getMessage().getChat().getFirstName());

                    case "/help" -> sendMsg(chatId, HELP_TEXT);
                    case "/javacore" -> sendMsg(chatId, Text.javaCore(), keyboardsMarkUp.keyboardJavaCore());
                    case "/spring" -> sendMsg(chatId, Text.spring(), keyboardsMarkUp.keyboardSpring());
                    case "/tgbot" -> sendMsg(chatId, Text.tgBot(), keyboardsMarkUp.keyboardTgBot());
                    case "/lists" -> sendMsg(chatId, Text.lists(), keyboardsMarkUp.keyboardLists());
                    case "/interfacecollection" -> sendMsg(chatId, Text.interfaceCollection(), keyboardsMarkUp.keyboardCollection());
                    case "/extendscollections" -> sendMsg(chatId, Text.extendsCollection());
                    case "/abstractcollectionclass" -> sendMsg(chatId, Text.abstractCollectionClass());
                    case "/collectiontypes" -> sendMsg(chatId, Text.collectionTypes(), keyBoardsInline.keyboardLists());
                    case "/collectionmethods" -> sendMsg(chatId, Text.collectionMethods());
                    case "/arrays" -> sendMsg(chatId, Text.array(), keyboardsMarkUp.keyboardArray());
                    case "/arrayMethods" -> sendMsg(chatId, Text.arraysMethods());
                    case "/initialize" -> sendMsg(chatId, Text.initialize(), keyBoardsInline.keyboardArrayExample());
                    case "/arraytypes" -> sendPhoto(chatId, "Вот двумерные и зубчатые массивы", "photo/doubleArray.jpg");
                    case "/joke" -> sendMsg(chatId, "Иды ты на х..");
                    default -> sendMsg(chatId, "Неверная команда, выберите другую команду");

                }
        } else if (update.hasCallbackQuery()) {
            String callbackData = update.getCallbackQuery().getData();
            long messageId = update.getCallbackQuery().getMessage().getMessageId();
            long chatId = update.getCallbackQuery().getMessage().getChatId();
            EditMessageText message = new EditMessageText();

            switch (callbackData) {
                case "ARRAY_LIST" -> buttonAnswer(message, chatId, messageId, Text.arrayList());
                case "LINKED_LIST" -> buttonAnswer(message, chatId, messageId, Text.linkedList());
                case "ARRAY_DEQUE" -> buttonAnswer(message, chatId, messageId, Text.arrayDeque());
                case "HASH_SET" -> buttonAnswer(message, chatId, messageId, Text.hashSet());
                case "TREE_SET" -> buttonAnswer(message, chatId, messageId, Text.treeSet());
                case "LINKED_HASH_SET" -> buttonAnswer(message, chatId, messageId, Text.linkedHashSet());
                case "PRIORITY_QUEUE" -> buttonAnswer(message, chatId, messageId, Text.priorityQueue());
                case "HASH_MAP" -> buttonAnswer(message, chatId, messageId, Text.hashMap());
                case "TREE_MAP" -> buttonAnswer(message, chatId, messageId, Text.treeMap());
                case "CREATE_ARRAY" -> sendPhoto(chatId, "Примеры создания массивов", "photo/array.jpg");
                case "MULTIDIMENSIONAL_ARRAY" -> sendPhoto(chatId, Text.multidimensionalArray(), "photo/doubleArray.jpg");
                case "ARRAY_CYCLE" -> sendMsg(chatId, Text.arrayCycle(), keyBoardsInline.arrayCycle());
                case "ARRAY_INITIALIZATION" -> sendPhoto(chatId, Text.arrayInitialization(), "photo/arrayCycle.jpg");
                case "BUBBLE_SORTED" -> sendPhoto(chatId, Text.bubbleSorted(), "photo/bubbleSorted.jpg");
                case "ALGORITHMS_SORTED" -> sendMsg(chatId, Text.arraySorted(), keyBoardsInline.sortingAlgorithms());
                case "SHAKER_SORTED" -> sendPhoto(chatId, Text.shakerSorted(), "photo/shakerSorted.jpg");
                case "COMB_SORTED" -> sendPhoto(chatId, Text.combSorted(), "photo/combSorted.jpg");


            }
        }
        } catch (TelegramApiException | FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private void sendPhoto(long chatId, String imageCaption, String imagePath) throws FileNotFoundException, TelegramApiException {
        InputFile image = new InputFile(ResourceUtils.getFile("classpath:" + imagePath));

        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setPhoto(image);
        sendPhoto.setChatId(chatId);
        sendPhoto.setCaption(imageCaption);
        execute(sendPhoto);
    }

    private void sendMsg(long chatId, String textToSend, ReplyKeyboardMarkup replyKeyboardMarkup) {

        SendMessage message = new SendMessage();
        message.setChatId(String.valueOf(chatId));
        message.setText(textToSend);
        message.setReplyMarkup(replyKeyboardMarkup);

        executeMessage(message);
    }

    private void sendMsg(long chatId, String textToSend) {
        SendMessage message = new SendMessage();
        message.setChatId(String.valueOf(chatId));
        message.setText(textToSend);

        executeMessage(message);
    }

    private void sendMsg(long chatId, String textToSend, InlineKeyboardMarkup inlineKeyboardMarkup) {
        SendMessage message = new SendMessage();
        message.setChatId(String.valueOf(chatId));
        message.setText(textToSend);
        message.setReplyMarkup(inlineKeyboardMarkup);

        executeMessage(message);
    }

    private void startCommandReceived(long chatId, String name) {
        String answer = EmojiParser.parseToUnicode("Приветствую " + name + Text.start());
        log.info("Ответ пользователю: " + name);

        sendMsg(chatId, answer, keyboardsMarkUp.keyboardStart());
    }

    private void executeMessage(SendMessage message) {
        try {
            execute(message);
        } catch (TelegramApiException e) {
            log.error("Возникла ошибка: " + e.getMessage());
        }
    }

    private void buttonAnswer(EditMessageText message, long chatId, long messageId, String text) {
        message.setChatId(String.valueOf(chatId));
        message.setText(text);
        message.setMessageId((int) messageId);

        try {
            execute(message);
        } catch (TelegramApiException e) {
            log.error("Возникла ошибка: " + e.getMessage());
        }
    }
}
