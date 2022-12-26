import java.util.Scanner;
public class TextUserInterface {
    private Scanner reader;
    private Dictionary dictionary;
    public TextUserInterface(Scanner reader, Dictionary dictionary){
        this.reader = reader;
        this.dictionary= dictionary;

    }

    public void start(){
        while(true){
            System.out.println("q-to quit\nadd-to add\nt-to translate.");
            System.out.println("");
            System.out.println(":");
            String command=reader.nextLine();
            if(command.equals("q")){
                System.out.println("Good Bye!");
                break;
            } else {
                handleCommand(command);
            }

        }

    }
    public void handleCommand(String command){
        if(command.equals("add")){
            System.out.println("in english:");
            String word1 = reader.nextLine();
            System.out.println("in finnish:");
            String word2 = reader.nextLine();
            add(word1,word2);
        }
        else if(command.equals("t")){
            System.out.println("Give a word:");
            String word=reader.nextLine();
            System.out.println("Translation is:"+translate(word));

        }
        else{
            System.out.println("Uknown statement");
        }

    }

    public void add(String word1, String word2){
        dictionary.add(word1, word2);
    }
    public String translate(String word){
        return dictionary.translate(word);
    }
}
