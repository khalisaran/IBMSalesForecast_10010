package com.ibm.service;

import java.util.ArrayList;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.apache.log4j.*;



import com.ibm.domain.core.Role;

import com.ibm.dao.mysql.Role_Default_ActivityDao;

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
@Service("Role_Default_ActivityService")
public class Role_Default_ActivityService extends IBBaseService  {
private static Logger log = Logger.getLogger(Role_Default_ActivityService.class.getName());

	private Role_Default_ActivityDao Role_Default_Activity_dao;


	public Role_Default_ActivityDao get_Role_Default_Activity_dao() {
		return Role_Default_Activity_dao;
	}


	@Resource(name="Role_Default_ActivityDao")
	public void set_Role_Default_Activity_dao(Role_Default_ActivityDao Role_Default_Activity_dao) {
		this.Role_Default_Activity_dao = Role_Default_Activity_dao;
	}



	//auths not ready at this time

	/**
	*
	*The purpose of this service method is to perform save operation of  Role noun into database
	*@param Role
	*@param user
	*@return the_Role object will return
	*@throws Exception
	*/

	public Role create_role(Role Role, IBUser user) throws Exception {

 		  log.setLevel(Level.INFO);
	      log.info("create_role service operation started !");

		try{
			Role the_Role;

			the_Role = Role_Default_Activity_dao.create_role(Role, user);

 			log.info(" Object returned from create_role  service method !");
			return the_Role;

		}catch(Exception e){

			System.out.println("ServiceException: " + e.toString());
			log.error("create_role service throws exception : "+ e.toString());

		}
		return null;



	}

	//auths not ready at this time

	/**
	*
	*The purpose of this service method is to perform update operation of  Role noun into database
	*@param Role
	*@param user
	*@return the_Role object will return
	*@throws Exception
	*/

	public Role update_role(Role Role, IBUser user) throws Exception {

 		  log.setLevel(Level.INFO);
	      log.info("update_role service operation started !");

		try{
			Role the_Role;

			the_Role = Role_Default_Activity_dao.update_role(Role, user);

 			log.info(" Object returned from update_role  service method !");
			return the_Role;

		}catch(Exception e){

			System.out.println("ServiceException: " + e.toString());
			log.error("update_role service throws exception : "+ e.toString());

		}
		return null;



	}

	//auths not ready at this time

	/**
	*
	*The purpose of this service method is to perform fetch operation of  Role noun from  database based on given noun id
	*@param  id
	*@param user
	*@return the_Role object will return
	*@throws Exception
	*/

	public Role role_search_for_update(long id, IBUser user) throws Exception {

 		  log.setLevel(Level.INFO);
	      log.info("role_search_for_update service operation started !");

		try{
			Role the_Role;

			the_Role = Role_Default_Activity_dao.role_search_for_update(id, user);

 			log.info(" Object returned from role_search_for_update  service method !");
			return the_Role;

		}catch(Exception e){

			System.out.println("ServiceException: " + e.toString());
			log.error("role_search_for_update service throws exception : "+ e.toString());

		}
		return null;



	}

	//auths not ready at this time

	/**
	*
	*The purpose of this service method is to perform delete operation of  Role noun from  database based on given noun id
	*@param  id
	*@param user
	*@return the_Role id deleted based on id
	*@throws Exception
	*/

	public String  delete_role(long id, IBUser user) throws Exception {

 		  log.setLevel(Level.INFO);
	      log.info("delete_role service operation started !");

		try{
			String method_return_message;

			method_return_message = Role_Default_Activity_dao.delete_role(id, user);

 			log.info(" Object returned from delete_role  service method !");
			return method_return_message;

		}catch(Exception e){

			System.out.println("ServiceException: " + e.toString());
			log.error("delete_role service throws exception : "+ e.toString());

		}
		return null;



	}

	//auths not ready at this time

	/**
	*
	*The purpose of this service method is to get list of  Role noun from  database
	*
	*
	*@return List of Role object will return
	*@throws Exception
	*/

	public ArrayList<Role> get_all_role() throws Exception {

 		  log.setLevel(Level.INFO);
	      log.info(" service operation started !");

		try{
			ArrayList<Role> Role_list;

			Role_list = Role_Default_Activity_dao.get_all_role();

 			log.info(" Object returned from   service method !");
			return Role_list;

		}catch(Exception e){

			System.out.println("ServiceException: " + e.toString());
			log.error(" service throws exception : "+ e.toString());

		}
		return null;



	}




}