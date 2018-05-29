package org.andy.work.service.impl;

import java.util.List;

import org.andy.work.dao.RoleDao;
import org.andy.work.entity.AcctRole;
import org.andy.work.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 创建时间：2015-2-6 下午3:24:16
 * 
 * @author andy
 * @version 2.2 UserService 的实现
 */
@Service("roleService")
public class RoleServiceImpl implements RoleService {

	@Autowired
	private RoleDao roleDao;

	@Override
	public AcctRole load(String id) {
		return roleDao.load(id);
	}

	@Override
	public AcctRole get(String id) {
		return roleDao.get(id);
	}

	@Override
	public List<AcctRole> findAll() {
		return roleDao.findAll();
	}

	@Override
	public void persist(AcctRole entity) {
		roleDao.persist(entity);
	}

	@Override
	public String save(AcctRole entity) {
		return roleDao.save(entity);
	}

	@Override
	public void saveOrUpdate(AcctRole entity) {
		roleDao.saveOrUpdate(entity);
	}

	@Override
	public void delete(String id) {
		roleDao.delete(id);
	}

	@Override
	public void flush() {
		roleDao.flush();
	}

}
