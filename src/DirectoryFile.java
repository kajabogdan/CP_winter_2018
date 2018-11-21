import java.io.File;

public class DirectoryFile {

    public static long CheckDirectorySize(File newFile) {
        long licznikDanych = 0;
        if (newFile.isDirectory()) {
            File[] files = newFile.listFiles();
            System.out.println("W folderze " + newFile.getName() + "sa " + files.length + " pliki");
            for (File f : files) {
                if (f.isFile()) {
                    System.out.println("Plik " + f.getName() + "rozmiar " + f.length());
                    licznikDanych += f.length();
                } else if (f.isDirectory()) {
                    long subfoldersSize = CheckDirectorySize(f);
                    System.out.println("Podfolder " + f.getName() + " size " + subfoldersSize);
                    licznikDanych += subfoldersSize;
                }

            }
        }

        return licznikDanych;
    }

    public static void main(String[] args) {
        File newFile = new File("c:/Temp");

    }

}
