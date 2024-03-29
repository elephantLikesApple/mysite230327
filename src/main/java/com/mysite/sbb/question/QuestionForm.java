package com.mysite.sbb.question;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class QuestionForm {
    @NotBlank(message = "제목은 필수항목입니다.")
    @Size(max=200, message = "제목은 200자를 넘지 마세요.")
    private String subject;

    @NotBlank(message = "내용은 필수항목입니다.")
    @Size(max=20_000, message = "내용은 20,000자를 넘지 마세요.")
    private String content;
}
