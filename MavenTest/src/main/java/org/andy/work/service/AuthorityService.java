package org.andy.work.service;

import java.util.List;

import org.andy.work.entity.AcctAuthority;

/**
 * 创建时间：2015-2-6 下午3:18:57
 * 
 * @author andy
 * @version 2.2
 *  接口
 */

public interface AuthorityService {
	AcctAuthority load(String id);

	AcctAuthority get(String id);

	List<AcctAuthority> findAll();

	void persist(AcctAuthority entity);

	String save(AcctAuthority entity);

	void saveOrUpdate(AcctAuthority entity);

	void delete(String id);

	void flush();
	
}
