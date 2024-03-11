package com.nlwexpert.certification_nlw.modules.questions.dto;

import com.nlwexpert.certification_nlw.modules.questions.entities.AlternativesEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class QuestionResultDTO {

    private UUID id;

    private String technology;

    private String description;

    private List<AlternativesResultDTO> alternatives;

}