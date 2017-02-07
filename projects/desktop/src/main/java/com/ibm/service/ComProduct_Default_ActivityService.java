package com.ibm.service;

import java.util.ArrayList;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.apache.log4j.*;



import com.ibm.domain.core.ComProduct;

import com.ibm.dao.mysql.ComProduct_Default_ActivityDao;

import com.ibm.domain.core.IBUser;



/**
 *
 * @author Geppetto Generated Code</br>
 * Date Created: </br>
 * @since  </br>
   build:   </p>
 *
 * code was generated by the Geppetto System </br>
 * Gepppetto system Copyright - Geppetto LLC 2014 - 2015</br>
 * The generated code is free to use by anyone</p>
 *
 *
 *
*/
@Service("ComProduct_Default_ActivityService")
public class ComProduct_Default_ActivityService extends IBBaseService  {
private static Logger log = Logger.getLogger(ComProduct_Default_ActivityService.class.getName());

	private ComProduct_Default_ActivityDao ComProduct_Default_Activity_dao;


	public ComProduct_Default_ActivityDao get_ComProduct_Default_Activity_dao() {
		return ComProduct_Default_Activity_dao;
	}


	@Resource(name="ComProduct_Default_ActivityDao")
	public void set_ComProduct_Default_Activity_dao(ComProduct_Default_ActivityDao ComProduct_Default_Activity_dao) {
		this.ComProduct_Default_Activity_dao = ComProduct_Default_Activity_dao;
	}



	//auths not ready at this time

	/**
	*
	*The purpose of this service method is to perform save operation of  ComProduct noun into database
	*@param ComProduct
	*@param user
	*@return the_ComProduct object will return
	*@throws Exception
	*/

	public ComProduct create_comproduct(ComProduct ComProduct, IBUser user) throws Exception {

 		  log.setLevel(Level.INFO);
	      log.info("create_comproduct service operation started !");

		try{
			ComProduct the_ComProduct;

			the_ComProduct = ComProduct_Default_Activity_dao.create_comproduct(ComProduct, user);

 			log.info(" Object returned from create_comproduct  service method !");
			return the_ComProduct;

		}catch(Exception e){

			System.out.println("ServiceException: " + e.toString());
			log.error("create_comproduct service throws exception : "+ e.toString());

		}
		return null;



	}

	//auths not ready at this time

	/**
	*
	*The purpose of this service method is to perform update operation of  ComProduct noun into database
	*@param ComProduct
	*@param user
	*@return the_ComProduct object will return
	*@throws Exception
	*/

	public ComProduct update_comproduct(ComProduct ComProduct, IBUser user) throws Exception {

 		  log.setLevel(Level.INFO);
	      log.info("update_comproduct service operation started !");

		try{
			ComProduct the_ComProduct;

			the_ComProduct = ComProduct_Default_Activity_dao.update_comproduct(ComProduct, user);

 			log.info(" Object returned from update_comproduct  service method !");
			return the_ComProduct;

		}catch(Exception e){

			System.out.println("ServiceException: " + e.toString());
			log.error("update_comproduct service throws exception : "+ e.toString());

		}
		return null;



	}

	//auths not ready at this time

	/**
	*
	*The purpose of this service method is to perform fetch operation of  ComProduct noun from  database based on given noun id
	*@param  id
	*@param user
	*@return the_ComProduct object will return
	*@throws Exception
	*/

	public ComProduct comproduct_search_for_update(long id, IBUser user) throws Exception {

 		  log.setLevel(Level.INFO);
	      log.info("comproduct_search_for_update service operation started !");

		try{
			ComProduct the_ComProduct;

			the_ComProduct = ComProduct_Default_Activity_dao.comproduct_search_for_update(id, user);

 			log.info(" Object returned from comproduct_search_for_update  service method !");
			return the_ComProduct;

		}catch(Exception e){

			System.out.println("ServiceException: " + e.toString());
			log.error("comproduct_search_for_update service throws exception : "+ e.toString());

		}
		return null;



	}

	//auths not ready at this time

	/**
	*
	*The purpose of this service method is to perform delete operation of  ComProduct noun from  database based on given noun id
	*@param  id
	*@param user
	*@return the_ComProduct id deleted based on id
	*@throws Exception
	*/

	public String  delete_comproduct(long id, IBUser user) throws Exception {

 		  log.setLevel(Level.INFO);
	      log.info("delete_comproduct service operation started !");

		try{
			String method_return_message;

			method_return_message = ComProduct_Default_Activity_dao.delete_comproduct(id, user);

 			log.info(" Object returned from delete_comproduct  service method !");
			return method_return_message;

		}catch(Exception e){

			System.out.println("ServiceException: " + e.toString());
			log.error("delete_comproduct service throws exception : "+ e.toString());

		}
		return null;



	}

	//auths not ready at this time

	/**
	*
	*The purpose of this service method is to get list of  ComProduct noun from  database
	*
	*
	*@return List of ComProduct object will return
	*@throws Exception
	*/

	public ArrayList<ComProduct> get_all_comproduct() throws Exception {

 		  log.setLevel(Level.INFO);
	      log.info(" service operation started !");

		try{
			ArrayList<ComProduct> ComProduct_list;

			ComProduct_list = ComProduct_Default_Activity_dao.get_all_comproduct();

 			log.info(" Object returned from   service method !");
			return ComProduct_list;

		}catch(Exception e){

			System.out.println("ServiceException: " + e.toString());
			log.error(" service throws exception : "+ e.toString());

		}
		return null;



	}




}