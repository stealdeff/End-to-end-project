package Interfaces;

import java.io.IOException;

public interface Factory
{
    Button createButton() throws IOException;
    TextField createTextField() throws IOException;
    Select createSelect() throws IOException;
}
