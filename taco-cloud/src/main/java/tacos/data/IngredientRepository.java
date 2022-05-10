package tacos.data;

import tacos.Ingredient;

public interface IngredientRepository extends CrudRepository<Ingredient, String>{
	Iterable <Ingredient> findAll();
	Ingredient findById (String id);
	Ingredient save(Ingredient ingredient);
}
