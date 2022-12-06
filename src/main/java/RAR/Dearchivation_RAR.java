package RAR;

import JSON.JSON_writing;
import TXT_with_Decorator.Reading;
import XML.Result_in_XML;
import XML.XML_reading;
import XML.XML_writing;
import com.github.junrar.Archive;
import com.github.junrar.exception.RarException;
import com.github.junrar.rarfile.FileHeader;

import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Dearchivation_RAR {
    public String unarchivate_rar(String FileName) throws RarException, IOException, ParserConfigurationException {
        String text = "";
        String name = "";
        File f = new File(FileName);
        Archive archive = new Archive(f);
        archive.getMainHeader().print();
        FileHeader fh = archive.nextFileHeader();
        while (fh != null) {
            File fileEntry = new File(fh.getFileNameString().trim());
            name = fileEntry.toString();
            FileOutputStream os = new FileOutputStream(fileEntry);
            archive.extractFile(fh, os);
            os.close();
            fh = archive.nextFileHeader();
        }
        Pattern pattern = Pattern.compile("\\.\\w+");
        Matcher matcher = pattern.matcher(name);
        String format = "";
        if (matcher.find()) {
            format = matcher.group();
        }
        Reading reader = new Reading();
        if (format.trim().equalsIgnoreCase("txt")) {
            text = reader.readData(name);
        }
        if (format.trim().equalsIgnoreCase("xml")) {
            XML_reading k = new XML_reading();
            XML_reading xml_reading;
            XML_reading.main();
            XML_writing.main();
            Result_in_XML.main();
        }
        if (format.trim().equalsIgnoreCase("json")) {
            JSON_writing.main();
        }


        return text;
    }
}
