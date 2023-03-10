package Ne_Zabivay_bot.demo.service;

import DB.MethodDB;
import Ne_Zabivay_bot.demo.keyboard.KeyBoardsInline;
import Ne_Zabivay_bot.demo.parsers.ParserGit;
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
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@Component
public class TelegramBot extends TelegramLongPollingBot {
    final BotConfig config;
    KeyboardsMarkUp keyboardsMarkUp = new KeyboardsMarkUp();
    KeyBoardsInline keyBoardsInline = new KeyBoardsInline();
    ParserGit parserGit = new ParserGit();
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
                    case "Интерфейс Collection - Родитель всех интерфейсов коллекций" -> messageText = "/interfacecollection";
                    case "Интерфейсы наследники Collection" -> messageText = "/extendscollections";
                    case "Абстрактные классы коллекций" -> messageText = "/abstractcollectionclass";
                    case "Виды коллекций" -> messageText = "/collectiontypes";
                    case "Основные методы коллекций" -> messageText = "/collectionmethods";
                    case "Методы массивов" -> messageText = "/arrayMethods";
                    case "Примеры работы с массивами" -> messageText = "/initialize";
                    case "Виды массивов" -> messageText = "/arraytypes";
                    case "Вопросы с собеседований JAVA EE" -> messageText = "/interviewquestionsee";
                    case "Java EE API" -> messageText = "/eeapi";
                    case "Web" -> messageText = "/web";
                    case "Servlet" -> messageText = "/servlet";
                    case "SQL, JDBC" -> messageText = "/sqljdbc";
                    case "JPA" -> messageText = "/jpa";
                    case "Web Services" -> messageText = "/webservices";
                    case "JSF" -> messageText = "/jsf";
                    case "JSP" -> messageText = "/jsp";
                    case "Spring" -> messageText = "/springquestions";
                    case "Hibernate" -> messageText = "/hibernate";
                    case "Ээ" -> messageText = "/joke";
                }
                switch (messageText) {
                    case "/test" -> sendPhoto(chatId, "Проверка удалась", "photo/0001.jpg");
                    case "/start" -> startCommandReceived(chatId, update.getMessage().getChat().getFirstName());
                    case "/help" -> sendMsg(chatId, HELP_TEXT);
                    case "/javacore" -> sendMsg(chatId, MethodDB.returnTextDB("javaCore"), keyboardsMarkUp.keyboardJavaCore());
                    case "/spring" -> sendMsg(chatId, MethodDB.returnTextDB("spring"));
                    case "/tgbot" -> sendMsg(chatId, MethodDB.returnTextDB("tgBot"));

                    //Коллекции
                    case "/lists" -> sendMsg(chatId, MethodDB.returnTextDB("lists"), keyboardsMarkUp.keyboardLists());
                    case "/interfacecollection" -> sendMsg(chatId, MethodDB.returnTextDB("interfacecollection"), keyboardsMarkUp.keyboardCollection());
                    case "/extendscollections" -> sendMsg(chatId, MethodDB.returnTextDB("extendscollections"));
                    case "/abstractcollectionclass" -> sendMsg(chatId, MethodDB.returnTextDB("abstractcollectionclass"));
                    case "/collectiontypes" -> sendMsg(chatId, MethodDB.returnTextDB("collectiontypes"), keyBoardsInline.keyboardLists());
                    case "/collectionmethods" -> sendMsg(chatId, Text.collectionMethods());

                    //Массивы
                    case "/arrays" -> sendMsg(chatId, MethodDB.returnTextDB("arrays"), keyboardsMarkUp.keyboardArray());
                    case "/arrayMethods" -> sendMsg(chatId, MethodDB.returnTextDB("arrayMethods"));
                    case "/initialize" -> sendMsg(chatId, MethodDB.returnTextDB("initialize"), keyBoardsInline.keyboardArrayExample());
                    case "/arraytypes" -> sendPhoto(chatId, "Вот двумерные и зубчатые массивы", "photo/array/doubleArray.jpg");


                    //https://javastudy.ru/interview/list-of-questions-javaee-interview Вопросы с собеседований javaEE
                    case "/rilyabdulla" -> sendPhoto(chatId, "Учись, стремись и развивайся, ради них!!!", "photo/МоиМотивашки.jpg", keyboardsMarkUp.myKeyboard());
                    case "/interviewquestionsee" -> sendMsg(chatId, MethodDB.returnTextDB("interviewQuestionsEe"), keyboardsMarkUp.questionsEe());
                    case "/web" -> sendMsg(chatId, "Выберите вопрос", keyBoardsInline.eeWeb());
                    case "/joke" -> sendMsg(chatId, "Иды ты на х..");

                    //docker
                    case "/docker" -> sendMsg(chatId, "test functionality", keyboardsMarkUp.docker());


                    default -> sendMsg(chatId, "Неверная команда, выберите другую команду");

                }
            } else if (update.hasCallbackQuery()) {
                String callbackData = update.getCallbackQuery().getData();
                long messageId = update.getCallbackQuery().getMessage().getMessageId();
                long chatId = update.getCallbackQuery().getMessage().getChatId();
                EditMessageText message = new EditMessageText();

                switch (callbackData) {
                    case "ARRAY_LIST" -> buttonAnswer(message, chatId, messageId, MethodDB.returnTextDB("arrayList"));
                    case "LINKED_LIST" -> buttonAnswer(message, chatId, messageId, MethodDB.returnTextDB("linkedList"));
                    case "ARRAY_DEQUE" -> buttonAnswer(message, chatId, messageId, MethodDB.returnTextDB("arrayDeque"));
                    case "HASH_SET" -> buttonAnswer(message, chatId, messageId, MethodDB.returnTextDB("hashSet"));
                    case "TREE_SET" -> buttonAnswer(message, chatId, messageId, MethodDB.returnTextDB("treeSet"));
                    case "LINKED_HASH_SET" -> buttonAnswer(message, chatId, messageId, MethodDB.returnTextDB("linkedHashSet"));
                    case "PRIORITY_QUEUE" -> buttonAnswer(message, chatId, messageId, MethodDB.returnTextDB("priorityQueue"));
                    case "HASH_MAP" -> buttonAnswer(message, chatId, messageId, MethodDB.returnTextDB("hashMap"));
                    case "TREE_MAP" -> buttonAnswer(message, chatId, messageId, MethodDB.returnTextDB("treeMap"));
                    case "CREATE_ARRAY" -> sendPhoto(chatId, "Примеры создания массивов", "photo/array/array.jpg");
                    case "MULTIDIMENSIONAL_ARRAY" -> sendPhoto(chatId, MethodDB.returnTextDB("multidimensionalArray"), "photo/array/doubleArray.jpg");
                    case "ARRAY_CYCLE" -> sendMsg(chatId, MethodDB.returnTextDB("arrayCycle"), keyBoardsInline.arrayCycle());
                    case "ARRAY_INITIALIZATION" -> sendPhoto(chatId, MethodDB.returnTextDB("arrayInitialization"), "photo/array/arrayCycle.jpg");
                    case "BUBBLE_SORTED" -> sendPhoto(chatId, MethodDB.returnTextDB("bubbleSorted"), "photo/array/bubbleSorted.jpg");
                    case "ALGORITHMS_SORTED" -> sendMsg(chatId, MethodDB.returnTextDB("arraySorted"), keyBoardsInline.sortingAlgorithms());
                    case "SHAKER_SORTED" -> sendPhoto(chatId, MethodDB.returnTextDB("shakerSorted"), "photo/array/shakerSorted.jpg");
                    case "COMB_SORTED" -> sendPhoto(chatId, MethodDB.returnTextDB("comboSorted"), "photo/array/combSorted.jpg");
                    case "WWW" -> sendMsg(chatId, MethodDB.returnTextDB("www"));
                    case "W3C" -> sendMsg(chatId, MethodDB.returnTextDB("w3c"));
                    case "TCP/IP" -> sendMsg(chatId, MethodDB.returnTextDB("tcpIp"));
                    case "FTP" -> sendMsg(chatId, MethodDB.returnTextDB("ftp"));
                    case "HTTP/HTTPS" -> sendMsg(chatId, MethodDB.returnTextDB("http/https"));
                    case "APPLICATION_SERVER" -> sendMsg(chatId, MethodDB.returnTextDB("applicationServer"));
                    case "WEB_SERVER" -> sendMsg(chatId, MethodDB.returnTextDB("webServer"));
                    case "WEB_APPLICATION" -> sendMsg(chatId, MethodDB.returnTextDB("webApplication"));
                    case "DATE_TRANSFER" -> sendMsg(chatId, MethodDB.returnTextDB("dateTransfer"));
                    case "DIFFERENCE_WEB_AND_APPLICATION" -> sendMsg(chatId, MethodDB.returnTextDB("differenceWebAndApplication"));
                    case "DATA_TRANSFER_METHODS" -> sendMsg(chatId, MethodDB.returnTextDB("dataTransferMethods"));
                    case "GET_AND_POST" -> {
                        sendMsg(chatId, MethodDB.returnTextDB("getAndPostPhoto"));
                        sendPhoto(chatId, MethodDB.returnTextDB("getAndPostText"), "photo/questions/getAndPost.jpg");
                    }
                    case "WHAT_HTML" -> sendMsg(chatId, MethodDB.returnTextDB("html"));
                    case "WHAT_XML" -> sendMsg(chatId, MethodDB.returnTextDB("xml"));
                    case "WHAT_CSS" -> sendMsg(chatId, MethodDB.returnTextDB("css"));
                    case "MIME_TYPE" -> sendMsg(chatId, MethodDB.returnTextDB("mimeType"));
                    case "WHAT_COOKIES" -> sendMsg(chatId, MethodDB.returnTextDB("cookies"));
                    case "WHAT_SESSION" -> sendMsg(chatId, MethodDB.returnTextDB("session"));
                    case "AUTHORIZATION_AUTHENTICATION" -> sendMsg(chatId, MethodDB.returnTextDB("authorizationAuthentication"));
                    case "WHAT_AJAX" -> sendMsg(chatId, MethodDB.returnTextDB("ajax"));
                    case "WHAT_ORM" -> sendMsg(chatId, MethodDB.returnTextDB("orm"));
                }
            }
        } catch (TelegramApiException | FileNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void sendPhoto(long chatId, String imageCaption, String imagePath) throws FileNotFoundException, TelegramApiException {
        InputFile image = new InputFile(ResourceUtils.getFile("classpath:" + imagePath));

        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setPhoto(image);
        sendPhoto.setChatId(chatId);
        sendPhoto.setCaption(imageCaption);
        execute(sendPhoto);
    }

    public void sendPhoto(long chatId, String imageCaption, String imagePath, ReplyKeyboardMarkup replyKeyboardMarkup) throws FileNotFoundException, TelegramApiException {
        InputFile image = new InputFile(ResourceUtils.getFile("classpath:" + imagePath));

        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setPhoto(image);
        sendPhoto.setChatId(chatId);
        sendPhoto.setCaption(imageCaption);
        sendPhoto.setReplyMarkup(replyKeyboardMarkup);
        execute(sendPhoto);
    }

    public void sendMsg(long chatId, String textToSend, ReplyKeyboardMarkup replyKeyboardMarkup) {

        SendMessage message = new SendMessage();
        message.setChatId(String.valueOf(chatId));
        message.setText(textToSend);
        message.setReplyMarkup(replyKeyboardMarkup);

        executeMessage(message);
    }

    public void sendMsg(long chatId, String textToSend) {
        SendMessage message = new SendMessage();
        message.setChatId(String.valueOf(chatId));
        message.setText(textToSend);

        executeMessage(message);
    }

    public void sendMsg(long chatId, String textToSend, InlineKeyboardMarkup inlineKeyboardMarkup) {
        SendMessage message = new SendMessage();
        message.setChatId(String.valueOf(chatId));
        message.setText(textToSend);
        message.setReplyMarkup(inlineKeyboardMarkup);

        executeMessage(message);
    }

    private void startCommandReceived(long chatId, String name) throws SQLException {
        String answer = EmojiParser.parseToUnicode("Приветствую " + name + MethodDB.returnTextDB("start"));
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
