package com.ibm.service;

import java.util.ArrayList;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.apache.log4j.*;



import com.ibm.domain.core.AVPLeadSource;

import com.ibm.dao.mysql.AVPLeadSource_Default_ActivityDao;

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
@Service("AVPLeadSource_Default_ActivityService")
public class AVPLeadSource_Default_ActivityService extends IBBaseService  {
private static Logger log = Logger.getLogger(AVPLeadSource_Default_ActivityService.class.getName());

	private AVPLeadSource_Default_ActivityDao AVPLeadSource_Default_Activity_dao;


	public AVPLeadSource_Default_ActivityDao get_AVPLeadSource_Default_Activity_dao() {
		return AVPLeadSource_Default_Activity_dao;
	}


	@Resource(name="AVPLeadSource_Default_ActivityDao")
	public void set_AVPLeadSource_Default_Activity_dao(AVPLeadSource_Default_ActivityDao AVPLeadSource_Default_Activity_dao) {
		this.AVPLeadSource_Default_Activity_dao = AVPLeadSource_Default_Activity_dao;
	}



	//auths not ready at this time

	/**
	*
	*The purpose of this service method is to perform save operation of  AVPLeadSource noun into database
	*@param AVPLeadSource
	*@param user
	*@return the_AVPLeadSource object will return
	*@throws Exception
	*/

	public AVPLeadSource create_avpleadsource(AVPLeadSource AVPLeadSource, IBUser user) throws Exception {

 		  log.setLevel(Level.INFO);
	      log.info("create_avpleadsource service operation started !");

		try{
			AVPLeadSource the_AVPLeadSource;

			the_AVPLeadSource = AVPLeadSource_Default_Activity_dao.create_avpleadsource(AVPLeadSource, user);

 			log.info(" Object returned from create_avpleadsource  service method !");
			return the_AVPLeadSource;

		}catch(Exception e){

			System.out.println("ServiceException: " + e.toString());
			log.error("create_avpleadsource service throws exception : "+ e.toString());

		}
		return null;



	}

	//auths not ready at this time

	/**
	*
	*The purpose of this service method is to perform update operation of  AVPLeadSource noun into database
	*@param AVPLeadSource
	*@param user
	*@return the_AVPLeadSource object will return
	*@throws Exception
	*/

	public AVPLeadSource update_avpleadsource(AVPLeadSource AVPLeadSource, IBUser user) throws Exception {

 		  log.setLevel(Level.INFO);
	      log.info("update_avpleadsource service operation started !");

		try{
			AVPLeadSource the_AVPLeadSource;

			the_AVPLeadSource = AVPLeadSource_Default_Activity_dao.update_avpleadsource(AVPLeadSource, user);

 			log.info(" Object returned from update_avpleadsource  service method !");
			return the_AVPLeadSource;

		}catch(Exception e){

			System.out.println("ServiceException: " + e.toString());
			log.error("update_avpleadsource service throws exception : "+ e.toString());

		}
		return null;



	}

	//auths not ready at this time

	/**
	*
	*The purpose of this service method is to perform fetch operation of  AVPLeadSource noun from  database based on given noun id
	*@param  id
	*@param user
	*@return the_AVPLeadSource object will return
	*@throws Exception
	*/

	public AVPLeadSource avpleadsource_search_for_update(long id, IBUser user) throws Exception {

 		  log.setLevel(Level.INFO);
	      log.info("avpleadsource_search_for_update service operation started !");

		try{
			AVPLeadSource the_AVPLeadSource;

			the_AVPLeadSource = AVPLeadSource_Default_Activity_dao.avpleadsource_search_for_update(id, user);

 			log.info(" Object returned from avpleadsource_search_for_update  service method !");
			return the_AVPLeadSource;

		}catch(Exception e){

			System.out.println("ServiceException: " + e.toString());
			log.error("avpleadsource_search_for_update service throws exception : "+ e.toString());

		}
		return null;



	}

	//auths not ready at this time

	/**
	*
	*The purpose of this service method is to perform delete operation of  AVPLeadSource noun from  database based on given noun id
	*@param  id
	*@param user
	*@return the_AVPLeadSource id deleted based on id
	*@throws Exception
	*/

	public String  delete_avpleadsource(long id, IBUser user) throws Exception {

 		  log.setLevel(Level.INFO);
	      log.info("delete_avpleadsource service operation started !");

		try{
			String method_return_message;

			method_return_message = AVPLeadSource_Default_Activity_dao.delete_avpleadsource(id, user);

 			log.info(" Object returned from delete_avpleadsource  service method !");
			return method_return_message;

		}catch(Exception e){

			System.out.println("ServiceException: " + e.toString());
			log.error("delete_avpleadsource service throws exception : "+ e.toString());

		}
		return null;



	}

	//auths not ready at this time

	/**
	*
	*The purpose of this service method is to get list of  AVPLeadSource noun from  database
	*
	*
	*@return List of AVPLeadSource object will return
	*@throws Exception
	*/

	public ArrayList<AVPLeadSource> get_all_avpleadsource() throws Exception {

 		  log.setLevel(Level.INFO);
	      log.info(" service operation started !");

		try{
			ArrayList<AVPLeadSource> AVPLeadSource_list;

			AVPLeadSource_list = AVPLeadSource_Default_Activity_dao.get_all_avpleadsource();

 			log.info(" Object returned from   service method !");
			return AVPLeadSource_list;

		}catch(Exception e){

			System.out.println("ServiceException: " + e.toString());
			log.error(" service throws exception : "+ e.toString());

		}
		return null;



	}




}