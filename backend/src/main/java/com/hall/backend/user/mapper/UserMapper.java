package com.hall.backend.user.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.hall.backend.user.dto.UserDto;
import com.hall.backend.user.models.UserModel;

@Mapper
public interface UserMapper {
    
    UserMapper userMapper = Mappers.getMapper(UserMapper.class);

    @Mapping(source = "userName", target = "userName")
    UserDto toDto(UserModel userModel);
}
