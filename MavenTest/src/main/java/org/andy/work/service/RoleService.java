package org.andy.work.service;

import java.util.List;

import org.andy.work.entity.AcctRole;

/**
 * 创建时间：2015-2-6 下午3:18:57
 * 
 * @author andy
 * @version 2.2
 *  RoleService接口
 */

public interface RoleService {
	AcctRole load(String id);

	AcctRole get(String id);

	List<AcctRole> findAll();

	void persist(AcctRole entity);

	String save(AcctRole entity);

	void saveOrUpdate(AcctRole entity);

	void delete(String id);

	void flush();
}
