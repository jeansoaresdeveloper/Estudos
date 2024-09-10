public class Main {

    public static void main(String[] args) {

        ImageEditor png = new ImageEditor("/media/imagem.png", "png");
        ImageEditorBackup imageEditorBackup = new ImageEditorBackup(png);

        imageEditorBackup.backup();
        png.convertFormatTo("jpg");

        System.out.println(png);
        System.out.println(imageEditorBackup);

        imageEditorBackup.undo();
        System.out.println(png);

    }
}

