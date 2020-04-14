package com.project.discount.rest.resource.categories;

import com.project.discount.business.contract.manager.CategoriesManager;
import com.project.discount.model.bean.categories.Categories;
import com.project.discount.model.exception.NotFoundException;
import com.project.discount.rest.resource.AbstractResource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Resource REST for the {@link Categories}
 */
@Path("/categories")
@Produces(MediaType.APPLICATION_JSON)
public class CategoriesResource extends AbstractResource {
    /**
     * Return the {@link Categories} id {@code pId}
     * @param pId id of {@link Categories}
     * @return the {@link Categories}
     * @throws NotFoundException if the {@link Categories} isn't found
     */
    @GET
    @Path("{id}")
    public Categories get(@PathParam("id") Integer pId) throws NotFoundException{
        CategoriesManager vCategoriesManager = getManagerFactory().getCategoriesManager();
        Categories vCategories = vCategoriesManager.getCategories(pId);
        return vCategories;
    }

    /**
     * Return all {@link Categories}
     * @return list
     */
    @GET
    public List<Categories> get(){
        CategoriesManager vCategoriesManager = getManagerFactory().getCategoriesManager();
        List<Categories> vListCategories = vCategoriesManager.getListCategories();
        return vListCategories;
    }
}
