/**
 * 
 */
package com.chamath.shoppingbacked.dao;

import java.util.List;

import com.chamath.shoppingbackend.dto.Cateogry;

/**
 * @author chamath
 *
 */
public interface CategoryDAO {
	List<Cateogry> list();
	
	Cateogry get(int id);
	
	
}
