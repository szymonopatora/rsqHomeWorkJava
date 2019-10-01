package com.rsqtechnologies.rsqjava.converter;

import com.rsqtechnologies.rsqjava.dto.MedicDto;
import com.rsqtechnologies.rsqjava.model.Medic;
import lombok.Synchronized;
import org.springframework.stereotype.Component;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;


@Component
public class MedictoMedicDto implements Converter<Medic, MedicDto> {

    @Synchronized
    @Nullable
    @Override
    public MedicDto convert(Medic source) {
        if (source == null) {
            return null;
        }
        final MedicDto medicDto = new MedicDto();
        medicDto.setFirstName(source.getFirstName());
        medicDto.setLastName(source.getLastName());
        return medicDto;
    }
}
