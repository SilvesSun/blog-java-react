package com.sksun.blog.common.result;

import com.sksun.blog.common.enums.ResultCode;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Result implements Serializable {
    private static final long serialVersionUID = -4762928619495260423L;
    private Integer code;
    private String msg;
    private Object result;

    public static Result success(Object data) {
        Result res = new Result();
        res.setCode(ResultCode.SUCCESS);
        res.setResult(data);
        return res;
    }

    public void setCode(ResultCode code) {
        this.code = code.code();
        this.msg = code.msg();
    }
}
