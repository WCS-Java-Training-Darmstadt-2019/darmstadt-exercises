package quiz;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Scanner;

public class ConsoleQuiz {
	
	private static final String INTRO_TEXT1 = "\nQuiz Checkpoint %d\n";
    private static final String INTRO_TEXT2 = "\nUse only your memory to answer the %d questions. Do not check the internet please.";
    private static final String INTRO_TEXT3 = "\nDon't worry if you get a question wrong, you can edit the `%s` file at the end.\n";
    private static final String ANSWER_TEXT1 = "\nResponse : ";
    private static final String OUTRO_TEXT1 = "\nThe %s file has been generated, you can edit it manually if you want to correct it.\n";


    private final int checkPointNumber;
    private final String quizFile;;
    private final String answersFile;
    

    public ConsoleQuiz(int checkPointNumber, String quizFile) {
		super();
		this.checkPointNumber = checkPointNumber;
		this.quizFile = quizFile;
		String user = System.getProperty("user.name");
		this.answersFile = quizFile.replace(".txt","") + "_" + user + "_answers.txt";
	}
    
    public void runQuiz() {

        Scanner scanner = new Scanner(System.in);
        Path path = Paths.get(answersFile);

        ArrayList<String> questions = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(quizFile))) {
            while (br.ready()) {
                questions.add(br.readLine());
            }

            System.out.printf(INTRO_TEXT1, checkPointNumber);
            System.out.printf(INTRO_TEXT2, questions.size());
            System.out.printf(INTRO_TEXT3, answersFile);

            try (BufferedWriter init = Files.newBufferedWriter(path, StandardCharsets.UTF_8)) {
                init.close();

                for (int i = 0; i < questions.size(); i++) {
                    try (BufferedWriter writer = Files.newBufferedWriter(path, StandardCharsets.UTF_8,
                            StandardOpenOption.APPEND)
                    ) {
                        String question = String.format("%d. %s", i + 1, questions.get(i));
                        System.out.print("\n" + question);
                        System.out.print(ANSWER_TEXT1);
                        String answer = scanner.nextLine();

                        writer.write(question + "\n" + answer + "\n\n");
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }

            System.out.printf(OUTRO_TEXT1, answersFile);
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
        	//scanner.close();
        }
    }
}