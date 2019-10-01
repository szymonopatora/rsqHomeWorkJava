package com.rsqtechnologies.rsqjava.converter;

import com.rsqtechnologies.rsqjava.dto.MedicDto;
import com.rsqtechnologies.rsqjava.model.Medic;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.lang.Nullable;

@Component
public class MedicDtotoMedic implements Converter<MedicDto, Medic> {

    @Synchronized
    @Nullable
    @Override
    public Medic convert(MedicDto source) {
        if (source == null) {
            return null;
        }

        final Medic medic = new Medic();
        medic.setFirstName(source.getFirstName());
        medic.setLastName(source.getLastName());
        return medic;
    }
}
