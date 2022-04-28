package com.technophiles.diaryapp.controllers.requests;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreateAccountRequest {
    private String email;
    private String password;
}
