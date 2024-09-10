import intefaces.Memento;

import java.time.LocalDate;

public class ImageEditor {

    private String filePath;

    private String fileFormat;

    public ImageEditor(String filePath, String fileFormat) {
        this.filePath = filePath;
        this.fileFormat = fileFormat;
    }

    public void convertFormatTo(String format) {
        this.fileFormat = format;
        String[] split = this.filePath.split("\\.");
        this.filePath = split[0] + "." + format;
    }

    public Memento save() {
        LocalDate now = LocalDate.now();

        return new ConcreteMemento(now.toString(), now, filePath, fileFormat);
    }

    public void restore(Memento memento) {
        ConcreteMemento concreteMemento = (ConcreteMemento) memento;
        this.filePath = concreteMemento.getFilePath();
        this.fileFormat = concreteMemento.getFileFormat();
    }

    public String getFilePath() {
        return filePath;
    }

    public String getFileFormat() {
        return fileFormat;
    }

    @Override
    public String toString() {
        return "ImageEditor{" +
                "filePath='" + filePath + '\'' +
                ", fileFormat='" + fileFormat + '\'' +
                '}';
    }
}
