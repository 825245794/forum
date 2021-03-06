package com.forum.model.dto

import com.forum.model.validationInterface.ForgotPasswordGroup
import com.forum.model.validationInterface.RegisterGroup
import com.forum.model.validationInterface.RegisterMailGroup
import com.forum.model.validationInterface.RestPasswordGroup
import org.springframework.context.annotation.Scope
import org.springframework.stereotype.Component

import javax.validation.constraints.*

@Component
@Scope(value = "prototype")
class RegisterInfo implements Serializable {
    @NotBlank(message = '{register.username.blank}', groups = [RegisterGroup.class, RegisterMailGroup.class, ForgotPasswordGroup.class])
    @Size(max = 70, message = '{register.username.blank}', groups = [RegisterGroup.class, RegisterMailGroup.class, ForgotPasswordGroup.class])
    @Email(message = '{register.username.blank}', groups = [RegisterGroup.class, RegisterMailGroup.class, ForgotPasswordGroup.class])
    private String username
    @NotBlank(message = '{register.password.blank}', groups = [RegisterGroup.class, RestPasswordGroup.class])
    @Size(min = 8, max = 255, message = '{register.password.blank}', groups = [RegisterGroup.class, RestPasswordGroup.class])
    private String password
    @NotBlank(message = '{register.password.blank}', groups = [RegisterGroup.class, RestPasswordGroup.class])
    @Size(min = 8, max = 255, message = '{register.password.blank}', groups = [RegisterGroup.class, RestPasswordGroup.class])
    private String confirmPassword
    @NotBlank(message = '{register.nickname.blank}', groups = [RegisterGroup.class])
    @Size(min = 1, max = 45, message = '{register.password.blank}', groups = [RegisterGroup.class])
    private String nickname
    @Max(value = 1L, message = '{register.sex.validate}', groups = [RegisterGroup.class])
    @Min(value = 0L, message = '{register.sex.validate}', groups = [RegisterGroup.class])
    Integer sex
    @NotBlank(message = '{register.city.blank}', groups = [RegisterGroup.class])
    private String city
    @NotBlank(message = '{register.code.blank}', groups = [RegisterGroup.class, RestPasswordGroup.class])
    private String code
    private MessageCodeInfo msg

    String getCode() {
        return code
    }

    void setCode(String code) {
        this.code = code
    }

    MessageCodeInfo getMsg() {
        return msg
    }

    void setMsg(MessageCodeInfo msg) {
        this.msg = msg
    }

    String getUsername() {
        return username
    }

    void setUsername(String username) {
        this.username = username
    }

    String getPassword() {
        return password
    }

    void setPassword(String password) {
        this.password = password
    }

    String getConfirmPassword() {
        return confirmPassword
    }

    void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword
    }

    String getNickname() {
        return nickname
    }

    void setNickname(String nickname) {
        this.nickname = nickname
    }

    Integer getSex() {
        return sex
    }

    void setSex(Integer sex) {
        this.sex = sex
    }

    String getCity() {
        return city
    }

    void setCity(String city) {
        this.city = city
    }
}
