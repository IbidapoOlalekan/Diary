package com.technophiles.diaryapp.services;

import com.technophiles.diaryapp.controllers.requests.CreateAccountRequest;

public interface UserService {
    String createAccount(CreateAccountRequest accountRequestDTO);  //dto : Data Transfer Object
}
