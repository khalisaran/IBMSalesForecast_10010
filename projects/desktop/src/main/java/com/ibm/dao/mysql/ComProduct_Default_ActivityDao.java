package com.ibm.dao.mysql;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.persistence.Column;
import javax.persistence.Query;
import javax.persistence.Transient;
import javax.sound.midi.SysexMessage;
import javax.sql.DataSource;
import javax.transaction.Transactional;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.FlushModeType;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnitUtil;
import javax.transaction.Transactional;
import javax.persistence.Query;


import javax.annotation.Resource;
import javax.sql.DataSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import org.apache.log4j.*;



import com.ibm.domain.core.ComProduct;
import com.ibm.domain.core.IBUser;


/**
 *
 * @author Geppetto Generated Code</br>
 * Date Created: </br>
 * @since  </br>
 * build:   </p>
 *
 * code was generated by the Geppetto System </br>
 * Gepppetto system Copyright - Geppetto LLC 2014 - 2015</br>
 * The generated code is free to use by anyone</p>
 *
 *
 *
*/
@Transactional
@Repository("ComProduct_Default_ActivityDao")
public class ComProduct_Default_ActivityDao   {

	//private Log log = LogFactory.getLog(getClass());
	private static Logger log = Logger.getLogger(ComProduct_Default_ActivityDao.class.getName());

	@Value("${create_ComProduct.sql}")
	private String create_ComProduct;
	@Value("${search_for_update_ComProduct.sql}")
	private String search_for_update_ComProduct;
	@Value("${update_ComProduct.sql}")
	private String update_ComProduct;
	@Value("${delete_ComProduct.sql}")
	private String delete_ComProduct;
	@Value("${get_all_ComProduct.sql}")
	private String get_all_ComProduct;


    @PersistenceContext
	private EntityManager entityManager;



	// auths not ready at this time

	/**
	*
	*The purpose of Dao method is to perform fetch operation of  ComProduct noun from  database based on given noun id
	*@param  id
	*@param user
	*@return the_ComProduct object will return
	*@throws Exception
	*/

	public ComProduct comproduct_search_for_update(long id, IBUser user) throws Exception {
		  log.setLevel(Level.INFO);
	      log.info("comproduct_search_for_update Dao started operation!");

		try{

			Query result =  entityManager.
			createNativeQuery(search_for_update_ComProduct,ComProduct.class)

			.setParameter("id", id);;

			ArrayList<ComProduct> ComProduct_list =	(ArrayList<ComProduct>)result.getResultList();

			if(ComProduct_list  == null){

			log.error("comproduct_search_for_update Dao throws exception :" + "no ComProduct found" );
			throw new Exception("no ComProduct found");
			}
			log.info("Object returned from comproduct_search_for_update  Dao method !");
			return (ComProduct) ComProduct_list.get(0);

		}catch(Exception e){

			//new Exception(e.toString());  // this needs to be changed
			log.error("comproduct_search_for_update Dao throws exception : "+e.toString());

		}
		return null;


	}

	// auths not ready at this time

	/**
	*
	*The purpose of Dao method is to get list of  ComProduct noun from  database
	*
	*
	*@return List of ComProduct object will return
	*@throws Exception
	*/

	public ArrayList<ComProduct> get_all_comproduct() throws Exception {
		  log.setLevel(Level.INFO);
	      log.info("get_all_comproduct Dao started operation!");

		try{

			Query result =  entityManager.
			createNativeQuery(get_all_ComProduct,ComProduct.class)

;

			ArrayList<ComProduct> ComProduct_list =	(ArrayList<ComProduct>)result.getResultList();

			if(ComProduct_list .size() < 1){

			log.error("get_all_comproduct Dao throws exception :" + "no ComProduct found" );
			throw new Exception("no ComProduct found");
			}
			log.info("Object returned from get_all_comproduct  Dao method !");
			return (ArrayList<ComProduct>) ComProduct_list;

		}catch(Exception e){

			//new Exception(e.toString());  // this needs to be changed
			log.error("get_all_comproduct Dao throws exception : "+e.toString());

		}
		return null;


	}



	//auths not ready at this time

	/**
	*
	*The purpose of Dao method is to perform save operation of  ComProduct noun into database
	*@param ComProduct
	*@param user
	*@return ComProduct object will return
	*@throws Exception
	*/

	@Transactional
	public ComProduct create_comproduct(ComProduct ComProduct, IBUser user) throws Exception {

	 	  log.setLevel(Level.INFO);
	      log.info("create_comproduct Dao started operation!");

		try{
			Query query = entityManager
					.createNativeQuery(create_ComProduct)
			.setParameter("comproduct", ComProduct.getComproduct())
			.setParameter("description", ComProduct.getDescription())
			.setParameter("created_by", user == null ? 0:user.getId())
			.setParameter("updated_by", user == null ? 0:user.getId())
;

			int insertedId = query.executeUpdate();
					String lastIndex="select last_insert_id()";
					Query sql = entityManager.createNativeQuery(lastIndex);
					BigInteger new_id = (BigInteger) sql.getSingleResult();
					ComProduct.setId(new_id.longValue());
					System.out.println("create data---"+insertedId);

			log.info("Object returned from create_comproduct  Dao method !");

			return ComProduct;

		}catch(Exception e){

			//System.out.println("DAOException: " + e.toString());
			log.error(" Dao method (create_comproduct) throws Exception : "+e.toString());

		}
		return null;



	}

	//auths not ready at this time

	/**
	*
	*The purpose of Dao method is to perform update operation of  ComProduct noun into database
	*@param ComProduct
	*@param user
	*@return the_ComProduct object will return
	*@throws Exception
	*/

	@Transactional
	public ComProduct update_comproduct(ComProduct ComProduct, IBUser user) throws Exception {

	 	  log.setLevel(Level.INFO);
	      log.info("update_comproduct Dao started operation!");

		try{
			Query query = entityManager
					.createNativeQuery(update_ComProduct)
			.setParameter("id", ComProduct.getId())
			.setParameter("comproduct", ComProduct.getComproduct())
			.setParameter("description", ComProduct.getDescription())
			.setParameter("updated_by", user == null ? 0:user.getId())
;

			query.executeUpdate();

			log.info("Object returned from update_comproduct  Dao method !");

			return ComProduct;

		}catch(Exception e){

			//System.out.println("DAOException: " + e.toString());
			log.error(" Dao method (update_comproduct) throws Exception : "+e.toString());

		}
		return null;



	}

	//auths not ready at this time

	/**
	*
	*The purpose of Dao method is to perform delete operation of  ComProduct noun from  database based on given noun id
	*@param  id
	*@param user
	*@return the_ComProduct id deleted based on id
	*@throws Exception
	*/

	@Transactional
	public String  delete_comproduct(long id, IBUser user) throws Exception {

	 	  log.setLevel(Level.INFO);
	      log.info("delete_comproduct Dao started operation!");

		try{
			Query query = entityManager
					.createNativeQuery(delete_ComProduct)
			.setParameter("id", id);

			query.executeUpdate();

			log.info("Object returned from delete_comproduct  Dao method !");

			return "{\"status\":\"success\"}";

		}catch(Exception e){

			//System.out.println("DAOException: " + e.toString());
			log.error(" Dao method (delete_comproduct) throws Exception : "+e.toString());

		}
		return null;



	}



}