import intefaces.Memento;

import java.time.LocalDate;

public class ConcreteMemento implements Memento {

    private final String filePath;

    private final String fileFormat;


    public ConcreteMemento(String name, LocalDate date, String filePath, String fileFormat) {
        this.filePath = filePath;
        this.fileFormat = fileFormat;
    }

    public String getFilePath() {
        return filePath;
    }

    public String getFileFormat() {
        return fileFormat;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public LocalDate getDate() {
        return null;
    }

    @Override
    public String toString() {
        return "ConcreteMemento{" +
                "filePath='" + filePath + '\'' +
                ", fileFormat='" + fileFormat + '\'' +
                '}';
    }
}
