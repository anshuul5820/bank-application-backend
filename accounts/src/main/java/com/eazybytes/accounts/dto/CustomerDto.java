package com.eazybytes.accounts.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class CustomerDto {

    @NotEmpty(message = "name cannot be empty")
    @Size(min = 5, max = 30, message = "name has to be 5<30")
    private String name;

    @Email(message = "Email should be a valid value")
    @NotEmpty(message = "email cannot be empty")
    private String email;

    @Pattern(regexp = "$|[0-9]{10}", message = "mobno must be 10 digits")
    private String mobileNumber;

    private AccountsDto accountsDto;

}
