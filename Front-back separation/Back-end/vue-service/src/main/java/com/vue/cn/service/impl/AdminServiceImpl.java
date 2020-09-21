package com.vue.cn.service.impl;

import com.vue.cn.domin.Admin;
import com.vue.cn.domin.AdminExample;
import com.vue.cn.mapper.AdminMapper;
import com.vue.cn.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminMapper adminMapper;

    @Override
    public Admin selectByPhone(String phone) {
        AdminExample example =new AdminExample();
        AdminExample.Criteria criteria = example.createCriteria();
        criteria.andAdminPhoneEqualTo(phone);
        List<Admin> admins = adminMapper.selectByExample(example);
        if (admins.size()>0){
            return admins.get(0);
        }
        return null;
    }
}
