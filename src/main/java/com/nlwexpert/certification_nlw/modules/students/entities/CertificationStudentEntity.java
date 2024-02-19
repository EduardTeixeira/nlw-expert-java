package com.nlwexpert.certification_nlw.modules.students.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class CertificationStudentEntity {

    private UUID id;
    private UUID studentId;
    private String tech;
    private int grate;
    private List<AnswersCertificationsEntity> answersCertificationsEntities;
}
