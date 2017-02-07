package com.ibm.service;

import java.util.ArrayList;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.apache.log4j.*;



import com.ibm.domain.core.Partners;

import com.ibm.dao.mysql.Partners_Default_ActivityDao;

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
@Service("Partners_Default_ActivityService")
public class Partners_Default_ActivityService extends IBBaseService  {
private static Logger log = Logger.getLogger(Partners_Default_ActivityService.class.getName());

	private Partners_Default_ActivityDao Partners_Default_Activity_dao;


	public Partners_Default_ActivityDao get_Partners_Default_Activity_dao() {
		return Partners_Default_Activity_dao;
	}


	@Resource(name="Partners_Default_ActivityDao")
	public void set_Partners_Default_Activity_dao(Partners_Default_ActivityDao Partners_Default_Activity_dao) {
		this.Partners_Default_Activity_dao = Partners_Default_Activity_dao;
	}



	//auths not ready at this time

	/**
	*
	*The purpose of this service method is to perform save operation of  Partners noun into database
	*@param Partners
	*@param user
	*@return the_Partners object will return
	*@throws Exception
	*/

	public Partners create_partners(Partners Partners, IBUser user) throws Exception {

 		  log.setLevel(Level.INFO);
	      log.info("create_partners service operation started !");

		try{
			Partners the_Partners;

			the_Partners = Partners_Default_Activity_dao.create_partners(Partners, user);

 			log.info(" Object returned from create_partners  service method !");
			return the_Partners;

		}catch(Exception e){

			System.out.println("ServiceException: " + e.toString());
			log.error("create_partners service throws exception : "+ e.toString());

		}
		return null;



	}

	//auths not ready at this time

	/**
	*
	*The purpose of this service method is to perform update operation of  Partners noun into database
	*@param Partners
	*@param user
	*@return the_Partners object will return
	*@throws Exception
	*/

	public Partners update_partners(Partners Partners, IBUser user) throws Exception {

 		  log.setLevel(Level.INFO);
	      log.info("update_partners service operation started !");

		try{
			Partners the_Partners;

			the_Partners = Partners_Default_Activity_dao.update_partners(Partners, user);

 			log.info(" Object returned from update_partners  service method !");
			return the_Partners;

		}catch(Exception e){

			System.out.println("ServiceException: " + e.toString());
			log.error("update_partners service throws exception : "+ e.toString());

		}
		return null;



	}

	//auths not ready at this time

	/**
	*
	*The purpose of this service method is to perform fetch operation of  Partners noun from  database based on given noun id
	*@param  id
	*@param user
	*@return the_Partners object will return
	*@throws Exception
	*/

	public Partners partners_search_for_update(long id, IBUser user) throws Exception {

 		  log.setLevel(Level.INFO);
	      log.info("partners_search_for_update service operation started !");

		try{
			Partners the_Partners;

			the_Partners = Partners_Default_Activity_dao.partners_search_for_update(id, user);

 			log.info(" Object returned from partners_search_for_update  service method !");
			return the_Partners;

		}catch(Exception e){

			System.out.println("ServiceException: " + e.toString());
			log.error("partners_search_for_update service throws exception : "+ e.toString());

		}
		return null;



	}

	//auths not ready at this time

	/**
	*
	*The purpose of this service method is to perform delete operation of  Partners noun from  database based on given noun id
	*@param  id
	*@param user
	*@return the_Partners id deleted based on id
	*@throws Exception
	*/

	public String  delete_partners(long id, IBUser user) throws Exception {

 		  log.setLevel(Level.INFO);
	      log.info("delete_partners service operation started !");

		try{
			String method_return_message;

			method_return_message = Partners_Default_Activity_dao.delete_partners(id, user);

 			log.info(" Object returned from delete_partners  service method !");
			return method_return_message;

		}catch(Exception e){

			System.out.println("ServiceException: " + e.toString());
			log.error("delete_partners service throws exception : "+ e.toString());

		}
		return null;



	}

	//auths not ready at this time

	/**
	*
	*The purpose of this service method is to get list of  Partners noun from  database
	*
	*
	*@return List of Partners object will return
	*@throws Exception
	*/

	public ArrayList<Partners> get_all_partners() throws Exception {

 		  log.setLevel(Level.INFO);
	      log.info(" service operation started !");

		try{
			ArrayList<Partners> Partners_list;

			Partners_list = Partners_Default_Activity_dao.get_all_partners();

 			log.info(" Object returned from   service method !");
			return Partners_list;

		}catch(Exception e){

			System.out.println("ServiceException: " + e.toString());
			log.error(" service throws exception : "+ e.toString());

		}
		return null;



	}




}