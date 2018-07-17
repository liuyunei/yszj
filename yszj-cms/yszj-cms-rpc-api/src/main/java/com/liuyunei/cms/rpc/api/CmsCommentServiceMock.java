package com.liuyunei.cms.rpc.api;

import com.liuyunei.common.base.BaseServiceMock;
import com.liuyunei.cms.dao.mapper.CmsCommentMapper;
import com.liuyunei.cms.dao.model.CmsComment;
import com.liuyunei.cms.dao.model.CmsCommentExample;

/**
* 降级实现CmsCommentService接口
* Created by liuyunei on 2018/4/26.
*/
public class CmsCommentServiceMock extends BaseServiceMock<CmsCommentMapper, CmsComment, CmsCommentExample> implements CmsCommentService {

}
