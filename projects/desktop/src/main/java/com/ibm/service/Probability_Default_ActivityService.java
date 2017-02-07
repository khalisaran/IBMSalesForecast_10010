package com.ibm.service;

import java.util.ArrayList;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.apache.log4j.*;



import com.ibm.domain.core.Probability;

import com.ibm.dao.mysql.Probability_Default_ActivityDao;

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
@Service("Probability_Default_ActivityService")
public class Probability_Default_ActivityService extends IBBaseService  {
private static Logger log = Logger.getLogger(Probability_Default_ActivityService.class.getName());

	private Probability_Default_ActivityDao Probability_Default_Activity_dao;


	public Probability_Default_ActivityDao get_Probability_Default_Activity_dao() {
		return Probability_Default_Activity_dao;
	}


	@Resource(name="Probability_Default_ActivityDao")
	public void set_Probability_Default_Activity_dao(Probability_Default_ActivityDao Probability_Default_Activity_dao) {
		this.Probability_Default_Activity_dao = Probability_Default_Activity_dao;
	}



	//auths not ready at this time

	/**
	*
	*The purpose of this service method is to perform save operation of  Probability noun into database
	*@param Probability
	*@param user
	*@return the_Probability object will return
	*@throws Exception
	*/

	public Probability create_probability(Probability Probability, IBUser user) throws Exception {

 		  log.setLevel(Level.INFO);
	      log.info("create_probability service operation started !");

		try{
			Probability the_Probability;

			the_Probability = Probability_Default_Activity_dao.create_probability(Probability, user);

 			log.info(" Object returned from create_probability  service method !");
			return the_Probability;

		}catch(Exception e){

			System.out.println("ServiceException: " + e.toString());
			log.error("create_probability service throws exception : "+ e.toString());

		}
		return null;



	}

	//auths not ready at this time

	/**
	*
	*The purpose of this service method is to perform update operation of  Probability noun into database
	*@param Probability
	*@param user
	*@return the_Probability object will return
	*@throws Exception
	*/

	public Probability update_probability(Probability Probability, IBUser user) throws Exception {

 		  log.setLevel(Level.INFO);
	      log.info("update_probability service operation started !");

		try{
			Probability the_Probability;

			the_Probability = Probability_Default_Activity_dao.update_probability(Probability, user);

 			log.info(" Object returned from update_probability  service method !");
			return the_Probability;

		}catch(Exception e){

			System.out.println("ServiceException: " + e.toString());
			log.error("update_probability service throws exception : "+ e.toString());

		}
		return null;



	}

	//auths not ready at this time

	/**
	*
	*The purpose of this service method is to perform fetch operation of  Probability noun from  database based on given noun id
	*@param  id
	*@param user
	*@return the_Probability object will return
	*@throws Exception
	*/

	public Probability probability_search_for_update(long id, IBUser user) throws Exception {

 		  log.setLevel(Level.INFO);
	      log.info("probability_search_for_update service operation started !");

		try{
			Probability the_Probability;

			the_Probability = Probability_Default_Activity_dao.probability_search_for_update(id, user);

 			log.info(" Object returned from probability_search_for_update  service method !");
			return the_Probability;

		}catch(Exception e){

			System.out.println("ServiceException: " + e.toString());
			log.error("probability_search_for_update service throws exception : "+ e.toString());

		}
		return null;



	}

	//auths not ready at this time

	/**
	*
	*The purpose of this service method is to perform delete operation of  Probability noun from  database based on given noun id
	*@param  id
	*@param user
	*@return the_Probability id deleted based on id
	*@throws Exception
	*/

	public String  delete_probability(long id, IBUser user) throws Exception {

 		  log.setLevel(Level.INFO);
	      log.info("delete_probability service operation started !");

		try{
			String method_return_message;

			method_return_message = Probability_Default_Activity_dao.delete_probability(id, user);

 			log.info(" Object returned from delete_probability  service method !");
			return method_return_message;

		}catch(Exception e){

			System.out.println("ServiceException: " + e.toString());
			log.error("delete_probability service throws exception : "+ e.toString());

		}
		return null;



	}

	//auths not ready at this time

	/**
	*
	*The purpose of this service method is to get list of  Probability noun from  database
	*
	*
	*@return List of Probability object will return
	*@throws Exception
	*/

	public ArrayList<Probability> get_all_probability() throws Exception {

 		  log.setLevel(Level.INFO);
	      log.info(" service operation started !");

		try{
			ArrayList<Probability> Probability_list;

			Probability_list = Probability_Default_Activity_dao.get_all_probability();

 			log.info(" Object returned from   service method !");
			return Probability_list;

		}catch(Exception e){

			System.out.println("ServiceException: " + e.toString());
			log.error(" service throws exception : "+ e.toString());

		}
		return null;



	}




}