import java.io.*;
import java.util.Objects;
import java.util.Scanner;

public class DirectorySize {
    public static void main(String[] args) throws IOException {
            File oldFile = new File("C:/Users/a/Desktop/CP_homework");
            int openPosition = 0;
            int closePosition = 0;
            if (oldFile.isDirectory()) {
                File[] files = oldFile.listFiles();
                for (File f : files) {
                    if (f.isFile()) {
                        File newFile = new File("C:/Users/a/Desktop/CP_homework/result_" + f.getName());
                        FileWriter fileWriter = new FileWriter(newFile);
                        BufferedWriter newBufferedWriter = new BufferedWriter(fileWriter);
                        try (Scanner scanner = new Scanner(f)) {
                            if (scanner.hasNextLine()) {
                                String line = scanner.nextLine();
                                newBufferedWriter.write(line + "," + "Wynik");
                                newBufferedWriter.newLine();
                                String[] fields = line.split(",");
                                for (int i = 0; i < fields.length; i++) {
                                    if (fields[i].equals("Open")) {
                                        openPosition = i;
                                    }
                                    if (fields[i].equals("Close")) {
                                        closePosition = i;
                                    }
                                }
                            }
                            while (scanner.hasNextLine()) {
                                float wynik = 0;
                                String Open;
                                String Close;
                                String line = scanner.nextLine();
                                String[] fields = line.split(",");
                                Open = fields[openPosition];
                                Close = fields[closePosition];
                                float k = Float.parseFloat(Open);
                                float t = Float.parseFloat(Close);
                                wynik = (t - k) / 2;
                                newBufferedWriter.write(line + "," + wynik + "%");
                                newBufferedWriter.newLine();
                            }
                        } catch (FileNotFoundException e) {
                            e.printStackTrace();
                        }
                        newBufferedWriter.close();
                        fileWriter.close();
                    }
                }

            }

    }

}
