package Main_and_Calc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParserTest {
    @Test
    void Parse()
    {
        String[]line=new String[]{"2+2*2","3+12.5"};
        String[]res=new String[]{"6.0","15.5"};
        try {
            for(int i=0;i< line.length;i++) {
                assertEquals(Double.parseDouble(res[i]), Parser.Parse(line[i]));
            }
        } catch (Exception e){
                throw new RuntimeException(e);

        }
    }

}