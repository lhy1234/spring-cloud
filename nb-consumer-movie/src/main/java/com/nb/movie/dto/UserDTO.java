package com.nb.movie.dto;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author 李浩洋
 * @since 2020-04-03
 */
@Data
public class UserDTO implements Serializable {

    private static final long serialVersionUID = 1L;


    private Integer id;

    private String username;

    private String cnName;

    private Integer age;

    private Integer balance;


}
