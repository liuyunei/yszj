package com.liuyunei.upms.rpc.mapper;


import com.liuyunei.upms.dao.model.UpmsPermission;
import com.liuyunei.upms.dao.model.UpmsRole;

import java.util.List;

/**
 * 用户VOMapper
 * Created by liuyunei on 2018/04/07.
 */
public interface UpmsApiMapper {

	// 根据用户id获取所拥有的权限
	List<UpmsPermission> selectUpmsPermissionByUpmsUserId(Integer upmsUserId);

	// 根据用户id获取所属的角色
	List<UpmsRole> selectUpmsRoleByUpmsUserId(Integer upmsUserId);
	
}