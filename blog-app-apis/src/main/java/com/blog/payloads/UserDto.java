package com.blog.payloads;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class UserDto {
	private int id;
	@NotNull
	@Size(min = 4,message = "Username must be of minimum 4 characters")
	private String name;
	@Email(message = "Given email address is not valid")
	private String email;
	@NotEmpty
	@Size(min = 3,max = 3,message = "Password must be min of 33 chars and max of 10 chars!!")
	private String password;
	@NotEmpty
	private String about;
}
