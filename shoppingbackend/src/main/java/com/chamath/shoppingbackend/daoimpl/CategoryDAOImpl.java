/**
 * 
 */
package com.chamath.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import com.chamath.shoppingbacked.dao.CategoryDAO;
import com.chamath.shoppingbackend.dto.Cateogry;
import org.springframework.stereotype.Repository;

/**
 * @author chamath
 *
 */

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	private static List<Cateogry> categories = new ArrayList<>();

	static {

		Cateogry category = new Cateogry();

		category.setId(1);
		category.setName("Telivision");
		category.setDescription("This is som description 1");
		category.setImageURL("cat_1.jpg");
		categories.add(category);
		//
		category = new Cateogry();
		category.setId(2);
		category.setName("Mobile");
		category.setDescription("This is som description 2");
		category.setImageURL("cat_2.jpg");
		categories.add(category);

		category = new Cateogry();
		category.setId(3);
		category.setName("Laptop");
		category.setDescription("This is som description 3");
		category.setImageURL("cat_3.jpg");
		categories.add(category);

	}

	@Override
	public List<Cateogry> list() {
		// TODO Auto-generated method stub
		return categories;
	}

	@Override
	public Cateogry get(int id) {
		// enhaced for loop
		// return a single category

		for (Cateogry cateogry : categories) {
			if (cateogry.getId() == id)
				return cateogry;
		}
		return null;
	}

}
