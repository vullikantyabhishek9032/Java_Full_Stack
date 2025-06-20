package multithreading;

public class FileDownloader extends Thread {
    private String fileName;

    FileDownloader(String fileName) {
        this.fileName = fileName;
    }

    public void run() {
        System.out.println("Downloading: " + fileName);
        try {
            Thread.sleep(2000); // Simulate time delay
        } catch (InterruptedException e) {
            System.out.println("Download interrupted: " + fileName);
        }
        System.out.println("Downloaded: " + fileName);
    }

    public static void main(String[] args) {
        FileDownloader f1 = new FileDownloader("file1.pdf");
        FileDownloader f2 = new FileDownloader("file2.pdf");

        f1.start();
        f2.start();
    }
}
