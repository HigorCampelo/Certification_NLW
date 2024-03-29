package com.rocketseat.certification_nlw.modules.students.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rocketseat.certification_nlw.modules.students.UseCases.VerifyIfHasCertificationUseCase;
import com.rocketseat.certification_nlw.modules.students.dto.VerifyIfHasCertificationDTO;


@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private VerifyIfHasCertificationUseCase verifyIfHasCertificationUseCase;
    
    @PostMapping("/verifyIfHasCertification")
    public String verifyIfHasCertification(@RequestBody VerifyIfHasCertificationDTO entity) {
        // Email
        // Tecnologia
        var result = this.verifyIfHasCertificationUseCase.execute(entity);

        if (result) {
            return "Usuário já fez a prova";
        }

        return "Pode fazer a prova";
    }

}
