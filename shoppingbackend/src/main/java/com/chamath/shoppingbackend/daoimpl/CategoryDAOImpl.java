/**
 * 
 */
package com.chamath.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.chamath.shoppingbackend.dao.CategoryDAO;
import com.chamath.shoppingbackend.dto.Category;

/**
 *
 * Mar 19, 2018 4:32:28 PM	
 *
 * @author chamath
 *
 */

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	private static List<Category> categories = new ArrayList<>();
	
	
	static{
		
		Category category = new Category();
		
		category.setId(1);
		category.setName("TeliVision");
		category.setDescription("This is first description");
		category.setImageURL("Image1.jpg");
		categories.add(category);
		
		category = new Category();
		category.setId(2);
		category.setName("Mobile");
		category.setDescription("This is second description");
		category.setImageURL("Image2.jpg");
		categories.add(category);
		
		category = new Category();
		category.setId(3);
		category.setName("Laptop");
		category.setDescription("This is third description");
		category.setImageURL("Image3.jpg");
		categories.add(category);
	
	}
	
	
	
	@Override
	public List<Category> list() {
		return categories;
	}

}
