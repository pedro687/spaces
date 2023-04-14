package com.bleiny.domain.service.mapper;

import com.bleiny.domain.core.entity.User;
import com.bleiny.domain.service.dto.create.CreateUserCommand;
import org.springframework.stereotype.Component;

@Component
public class UserDataMapper {

    public User userCommandToUser(CreateUserCommand createUserCommand) {
        return User.builder()
                .geolocalizationUser(createUserCommand.getGeolocalizationUser())
                .bio(createUserCommand.getBio())
                .birthdayDate(createUserCommand.getBirthdayDate())
                .lastName(createUserCommand.getLastName())
                .tellphone(createUserCommand.getTellphone())
                .age(createUserCommand.getAge())
                .address(createUserCommand.getAddress())
                .gender(createUserCommand.getGender())
                .isActive(Boolean.TRUE)
                .firstName(createUserCommand.getFirstName())
                .build();
    }
}
