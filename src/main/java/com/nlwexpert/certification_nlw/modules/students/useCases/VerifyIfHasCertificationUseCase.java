package com.nlwexpert.certification_nlw.modules.students.useCases;

import com.nlwexpert.certification_nlw.modules.students.dto.VerifyHasCertificationDTO;
import org.springframework.stereotype.Service;

@Service
public class VerifyIfHasCertificationUseCase {

    public boolean execute(VerifyHasCertificationDTO dto) {
        if (dto.getEmail().equals("email@com.br") && dto.getTechnology().equals("Java")) {
            return true;
        }
        return false;
    }

}
