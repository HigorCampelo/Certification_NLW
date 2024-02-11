package com.rocketseat.certification_nlw.modules.students.UseCases;

import org.springframework.stereotype.Service;

import com.rocketseat.certification_nlw.modules.students.dto.VerifyIfHasCertificationDTO;

@Service
public class VerifyIfHasCertificationUseCase {
    
    public boolean execute(VerifyIfHasCertificationDTO dto) {

        if(dto.getEmail().equals("hig@hotmail.com") 
          && (dto.getTechnology().equals("Java"))){
             return true;
        }
        return false;
    }
}
