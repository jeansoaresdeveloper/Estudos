import intefaces.Memento;

import java.util.ArrayList;
import java.util.List;

public class ImageEditorBackup {

    private final ImageEditor imageEditor;

    private final List<Memento> mementos = new ArrayList<>();

    public ImageEditorBackup(ImageEditor imageEditor) {
        this.imageEditor = imageEditor;
    }

    public void backup() {
        this.mementos.add(this.imageEditor.save());
    }

    public void undo() {
        int size = mementos.size();

        if (size == 0) {
            System.out.println("No mementos.");
            return;
        }

        Memento remove = mementos.remove(size - 1);
        this.imageEditor.restore(remove);
        System.out.println("Backup: foi restaurado com sucesso");
    }

    public void showMementos() {
        mementos.forEach(System.out::println);
    }

    @Override
    public String toString() {
        return "ImageEditorBackup{" +
                "imageEditor=" + imageEditor +
                ", mementos=" + mementos +
                '}';
    }
}
