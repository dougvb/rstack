package com.raywenderlich.camelot;

import org.researchstack.backbone.answerformat.AnswerFormat;
import org.researchstack.backbone.answerformat.ChoiceAnswerFormat;
import org.researchstack.backbone.model.Choice;

public class ImageChoiceAnswerFormat extends ChoiceAnswerFormat implements AnswerFormat.QuestionType
{
    public ImageChoiceAnswerFormat(ChoiceAnswerStyle answerStyle, Choice... choices) {
        super(answerStyle, choices);
    }

    @Override
    public QuestionType getQuestionType()
    {
        return this;
    }

    @Override
    public Class<?> getStepBodyClass() {
        return ImageChoiceQuestionBody.class;
    }
}
