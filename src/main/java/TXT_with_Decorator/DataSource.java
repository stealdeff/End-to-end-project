package TXT_with_Decorator;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface DataSource
{
    void writeData(String data);
    String readData() throws IOException;
}