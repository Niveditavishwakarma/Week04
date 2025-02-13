package bufferedstreams;
    import java.io.*;

    public class FileCopyComparison {
        private static final int BUFFER_SIZE = 4096;

        public static void main(String[] args) {
            String sourceFile = "C:\\Users\\asus\\Downloads\\100mb-examplefile-com.txt";
            String destBuffered = "C:\\Users\\asus\\OneDrive\\Desktop\\Daily Learning notes\\destination_buffered.txt";
            String destUnbuffered = "C:\\Users\\asus\\OneDrive\\Desktop\\Daily Learning notes\\destination_unbuffered.txt";

            long startBuffered = System.nanoTime();
            copyWithBufferedStreams(sourceFile, destBuffered);
            long endBuffered = System.nanoTime();
            System.out.println("Buffered Stream Time: " + (endBuffered - startBuffered) / 1e6 + " ms");

            long startUnbuffered = System.nanoTime();
            copyWithUnbufferedStreams(sourceFile, destUnbuffered);
            long endUnbuffered = System.nanoTime();
            System.out.println("Unbuffered Stream Time: " + (endUnbuffered - startUnbuffered) / 1e6 + " ms");
        }

        public static void copyWithBufferedStreams(String source, String destination) {
            try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));
                 BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destination))) {
                byte[] buffer = new byte[BUFFER_SIZE];
                int bytesRead;
                while ((bytesRead = bis.read(buffer)) != -1) {
                    bos.write(buffer, 0, bytesRead);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public static void copyWithUnbufferedStreams(String source, String destination) {
            try (FileInputStream fis = new FileInputStream(source);
                 FileOutputStream fos = new FileOutputStream(destination)) {
                int byteData;
                while ((byteData = fis.read()) != -1) {
                    fos.write(byteData);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


