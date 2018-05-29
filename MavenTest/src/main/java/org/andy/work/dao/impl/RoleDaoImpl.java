package org.andy.work.dao.impl;

import java.util.List;

import org.andy.work.dao.RoleDao;
import org.andy.work.entity.AcctRole;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * 创建时间：2015-2-6 下午2:45:14
 * 
 * @author andy
 * @version 2.2
 */
@Repository("roleDao")
public class RoleDaoImpl implements RoleDao {

	@Autowired
	private SessionFactory sessionFactory;

	private Session getCurrentSession() {
		return this.sessionFactory.getCurrentSession();
	}

	@Override
	public AcctRole load(String id) {
		return (AcctRole) this.getCurrentSession().load(AcctRole.class, id);
	}
	
	@Override
	public AcctRole get(String id) {
		return (AcctRole) this.getCurrentSession().get(AcctRole.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<AcctRole> findAll() {
		Query query = this.getCurrentSession().createQuery("from AcctRole");
		return query.list();
	}

	@Override
	public void persist(AcctRole entity) {
		this.getCurrentSession().persist(entity);

	}

	@Override
	public String save(AcctRole entity) {
		return (String) this.getCurrentSession().save(entity);
	}

	@Override
	public void saveOrUpdate(AcctRole entity) {
		this.getCurrentSession().saveOrUpdate(entity);
	}

	@Override
	public void delete(String id) {
		AcctRole entity = this.load(id);
		this.getCurrentSession().delete(entity);
	}

	@Override
	public void flush() {
		this.getCurrentSession().flush();

	}

}
