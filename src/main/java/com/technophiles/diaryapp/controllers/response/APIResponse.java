package com.technophiles.diaryapp.controllers.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class APIResponse {
    private String message;
    private boolean isSuccessful;
}
