package com.cryotunning.cryotunning.service.fastfailtemplate;

import com.cryotunning.cryotunning.entities.dbentities.User;
import org.springframework.http.ResponseEntity;

public interface BaseControllerServiceNotHaveRequestDto<RETURN,RETURN_FROM_OPERATE_METHOD>{
    ResponseEntity<RETURN> execute(User user);
    void validate(User user);
    RETURN_FROM_OPERATE_METHOD operate(User user);
    RETURN buildResponse(User user,RETURN_FROM_OPERATE_METHOD dbData);
}
