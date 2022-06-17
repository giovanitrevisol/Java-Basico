package dev.gt.testeestudos.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
class ConvertToLongTest {

    @Test
    @DisplayName("Given String with numbers whem converter to Long then return OK ")
    void convertStringToLongOK() {

        String valueString = "02830644411";

        var result = ConvertToLong.convertStringToLong(valueString);

        Assertions.assertNotNull(result);
        Assertions.assertTrue(result instanceof Long);
    }

    @Test
    @DisplayName("Given String with numbers whem converter to Long then return OK ")
    void convertStringToLongWhenStringIsEmpty() {

        String valueString = "";

        var result = ConvertToLong.convertStringToLong(valueString);

        Assertions.assertEquals(0L, result);
    }

    @Test
    @DisplayName("Given String with letters whem converter to Long then return error ")
    void convertStringToLongWhenString() {

        String valueString = "aaaa";

        var result = ConvertToLong.convertStringToLong(valueString);

        Assertions.assertEquals(0L, result);
    }
}