package com.dengyuecang.www.service;


import com.dengyuecang.www.entity.LxTest;
import com.dengyuecang.www.entity.LxUser;
import com.longinf.lxcommon.dao.params.PageModel;
import com.longinf.lxcommon.service.IBaseService;

import java.util.List;

/**
 * 用户相关接口
 * @author botao
 *
 */
public interface ITestService extends IBaseService<LxTest>{

    public String testHello();

    public List<LxTest> queryAllByPage(PageModel<LxTest> page);

}
