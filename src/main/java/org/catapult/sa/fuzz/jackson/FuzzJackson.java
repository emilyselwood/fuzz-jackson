package org.catapult.sa.fuzz.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.catapult.sa.tribble.FuzzResult;
import org.catapult.sa.tribble.FuzzTest;

import java.io.IOException;

public class FuzzJackson implements FuzzTest {
    @Override
    public FuzzResult test(byte[] data) throws Exception {

        ObjectMapper om = new ObjectMapper();
        try {
            om.readTree(data);
        } catch (IOException e) {
            return FuzzResult.OK;
        }

        return FuzzResult.OK;
    }
}
