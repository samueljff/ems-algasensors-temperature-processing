package com.fonseca.algasensors.temperature.processing;

import com.fonseca.algasensors.temperature.processing.common.IdGenerator;
import com.fonseca.algasensors.temperature.processing.common.UUIDv7Utils;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.time.temporal.ChronoUnit;
import java.util.UUID;

public class UUIDV7Test {

    @Test
    void shouldGeneratedUUIDv7Test (){
//        UUID uuid1 = IdGenerator.generateTimeBasedUUID();
//        UUID uuid2 = IdGenerator.generateTimeBasedUUID();
//        UUID uuid3 = IdGenerator.generateTimeBasedUUID();
//        UUID uuid4 = IdGenerator.generateTimeBasedUUID();
//
//        System.out.println(UUIDv7Utils.extractOffsetDateTime(uuid1));
//        System.out.println(UUIDv7Utils.extractOffsetDateTime(uuid2));
//        System.out.println(UUIDv7Utils.extractOffsetDateTime(uuid3));
//        System.out.println(UUIDv7Utils.extractOffsetDateTime(uuid4));

        UUID uuid = IdGenerator.generateTimeBasedUUID();

        OffsetDateTime offsetDateTime = UUIDv7Utils.extractOffsetDateTime(uuid).truncatedTo(ChronoUnit.MINUTES);
        OffsetDateTime curentDateTime = OffsetDateTime.now().truncatedTo(ChronoUnit.MINUTES);

        Assertions.assertThat(offsetDateTime).isEqualTo(curentDateTime);
    }
}
