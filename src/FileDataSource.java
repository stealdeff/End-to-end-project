import java.io.*;
public class FileDataSource implements DataSource {
    private String name;
    public FileDataSource(String name)
    {
        this.name = name;
    }

    @Override
    public void writeData(String data)
    {
        File file = new File(name);
        try (FileOutputStream fos = new FileOutputStream(file)) {
            fos.write(data.getBytes(), 0, data.length());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override

        public String readData() throws FileNotFoundException {

        File fin = new File(name);
        FileReader fr = new FileReader(fin);
        String line = null;
        try (BufferedReader reader = new BufferedReader(fr)) {

            line = reader.readLine();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return new String(line);

    }
}