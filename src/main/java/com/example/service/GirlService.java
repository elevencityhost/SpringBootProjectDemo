package com.example.service;

import com.example.domain.Girl;
import com.example.enums.ResultEnum;
import com.example.exception.GirlException;
import com.example.repository.GirlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;

/**
 * @author 十一城城主
 * @data 2018/1/15 18:26
 */
@Service
public class GirlService {
    @Autowired
    private GirlRepository girlRepository;

    public void getAge(Integer id) throws Exception{
        Girl girl = girlRepository.findOne(id);
        Integer age = girl.getAge();
        if(age < 10){
            //返回 你可能在上小学吧
            throw new GirlException(ResultEnum.PRIMARY_SCHOOL);
        }else if (age > 10 && age < 16){
            //返回 你可能在上初中吧
            throw new GirlException(ResultEnum.MIDDLE_SCHOOL);
        }
    }
    /**
    　　* @author 十一城城主
    　　* @date 2018/1/15 19:54
    　　*/
    public Girl findOne(Integer id){
        return girlRepository.findOne(id);
    }
}
