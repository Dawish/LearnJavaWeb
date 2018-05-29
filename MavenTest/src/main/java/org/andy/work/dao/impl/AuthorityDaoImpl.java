package org.andy.work.dao.impl;

import java.util.List;

import org.andy.work.dao.AuthorityDao;
import org.andy.work.entity.AcctAuthority;
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
@Repository("authorityDao")
public class AuthorityDaoImpl implements AuthorityDao {

	@Autowired
	private SessionFactory sessionFactory;

	private Session getCurrentSession() {
		return this.sessionFactory.getCurrentSession();
	}

	@Override
	public AcctAuthority load(String id) {
		return (AcctAuthority) this.getCurrentSession().load(AcctAuthority.class, id);
	}
	
	@Override
	public AcctAuthority get(String id) {
		return (AcctAuthority) this.getCurrentSession().get(AcctAuthority.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<AcctAuthority> findAll() {
		Query query = this.getCurrentSession().createQuery("from AcctAuthority ");
		return query.list();
	}

	@Override
	public void persist(AcctAuthority entity) {
		this.getCurrentSession().persist(entity);

	}

	@Override
	public String save(AcctAuthority entity) {
		return (String) this.getCurrentSession().save(entity);
	}

	@Override
	public void saveOrUpdate(AcctAuthority entity) {
		this.getCurrentSession().saveOrUpdate(entity);
	}

	@Override
	public void delete(String id) {
		AcctAuthority entity = this.load(id);
		this.getCurrentSession().delete(entity);
	}

	@Override
	public void flush() {
		this.getCurrentSession().flush();

	}

}
