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



import com.ibm.domain.core.Practice;
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
@Repository("Practice_Default_ActivityDao")
public class Practice_Default_ActivityDao   {

	//private Log log = LogFactory.getLog(getClass());
	private static Logger log = Logger.getLogger(Practice_Default_ActivityDao.class.getName());

	@Value("${create_Practice.sql}")
	private String create_Practice;
	@Value("${search_for_update_Practice.sql}")
	private String search_for_update_Practice;
	@Value("${update_Practice.sql}")
	private String update_Practice;
	@Value("${delete_Practice.sql}")
	private String delete_Practice;
	@Value("${get_all_Practice.sql}")
	private String get_all_Practice;


    @PersistenceContext
	private EntityManager entityManager;



	// auths not ready at this time

	/**
	*
	*The purpose of Dao method is to perform fetch operation of  Practice noun from  database based on given noun id
	*@param  id
	*@param user
	*@return the_Practice object will return
	*@throws Exception
	*/

	public Practice practice_search_for_update(long id, IBUser user) throws Exception {
		  log.setLevel(Level.INFO);
	      log.info("practice_search_for_update Dao started operation!");

		try{

			Query result =  entityManager.
			createNativeQuery(search_for_update_Practice,Practice.class)

			.setParameter("id", id);;

			ArrayList<Practice> Practice_list =	(ArrayList<Practice>)result.getResultList();

			if(Practice_list  == null){

			log.error("practice_search_for_update Dao throws exception :" + "no Practice found" );
			throw new Exception("no Practice found");
			}
			log.info("Object returned from practice_search_for_update  Dao method !");
			return (Practice) Practice_list.get(0);

		}catch(Exception e){

			//new Exception(e.toString());  // this needs to be changed
			log.error("practice_search_for_update Dao throws exception : "+e.toString());

		}
		return null;


	}

	// auths not ready at this time

	/**
	*
	*The purpose of Dao method is to get list of  Practice noun from  database
	*
	*
	*@return List of Practice object will return
	*@throws Exception
	*/

	public ArrayList<Practice> get_all_practice() throws Exception {
		  log.setLevel(Level.INFO);
	      log.info("get_all_practice Dao started operation!");

		try{

			Query result =  entityManager.
			createNativeQuery(get_all_Practice,Practice.class)

;

			ArrayList<Practice> Practice_list =	(ArrayList<Practice>)result.getResultList();

			if(Practice_list .size() < 1){

			log.error("get_all_practice Dao throws exception :" + "no Practice found" );
			throw new Exception("no Practice found");
			}
			log.info("Object returned from get_all_practice  Dao method !");
			return (ArrayList<Practice>) Practice_list;

		}catch(Exception e){

			//new Exception(e.toString());  // this needs to be changed
			log.error("get_all_practice Dao throws exception : "+e.toString());

		}
		return null;


	}



	//auths not ready at this time

	/**
	*
	*The purpose of Dao method is to perform save operation of  Practice noun into database
	*@param Practice
	*@param user
	*@return Practice object will return
	*@throws Exception
	*/

	@Transactional
	public Practice create_practice(Practice Practice, IBUser user) throws Exception {

	 	  log.setLevel(Level.INFO);
	      log.info("create_practice Dao started operation!");

		try{
			Query query = entityManager
					.createNativeQuery(create_Practice)
			.setParameter("practice", Practice.getPractice())
			.setParameter("description", Practice.getDescription())
			.setParameter("created_by", user == null ? 0:user.getId())
			.setParameter("updated_by", user == null ? 0:user.getId())
;

			int insertedId = query.executeUpdate();
					String lastIndex="select last_insert_id()";
					Query sql = entityManager.createNativeQuery(lastIndex);
					BigInteger new_id = (BigInteger) sql.getSingleResult();
					Practice.setId(new_id.longValue());
					System.out.println("create data---"+insertedId);

			log.info("Object returned from create_practice  Dao method !");

			return Practice;

		}catch(Exception e){

			//System.out.println("DAOException: " + e.toString());
			log.error(" Dao method (create_practice) throws Exception : "+e.toString());

		}
		return null;



	}

	//auths not ready at this time

	/**
	*
	*The purpose of Dao method is to perform update operation of  Practice noun into database
	*@param Practice
	*@param user
	*@return the_Practice object will return
	*@throws Exception
	*/

	@Transactional
	public Practice update_practice(Practice Practice, IBUser user) throws Exception {

	 	  log.setLevel(Level.INFO);
	      log.info("update_practice Dao started operation!");

		try{
			Query query = entityManager
					.createNativeQuery(update_Practice)
			.setParameter("id", Practice.getId())
			.setParameter("practice", Practice.getPractice())
			.setParameter("description", Practice.getDescription())
			.setParameter("updated_by", user == null ? 0:user.getId())
;

			query.executeUpdate();

			log.info("Object returned from update_practice  Dao method !");

			return Practice;

		}catch(Exception e){

			//System.out.println("DAOException: " + e.toString());
			log.error(" Dao method (update_practice) throws Exception : "+e.toString());

		}
		return null;



	}

	//auths not ready at this time

	/**
	*
	*The purpose of Dao method is to perform delete operation of  Practice noun from  database based on given noun id
	*@param  id
	*@param user
	*@return the_Practice id deleted based on id
	*@throws Exception
	*/

	@Transactional
	public String  delete_practice(long id, IBUser user) throws Exception {

	 	  log.setLevel(Level.INFO);
	      log.info("delete_practice Dao started operation!");

		try{
			Query query = entityManager
					.createNativeQuery(delete_Practice)
			.setParameter("id", id);

			query.executeUpdate();

			log.info("Object returned from delete_practice  Dao method !");

			return "{\"status\":\"success\"}";

		}catch(Exception e){

			//System.out.println("DAOException: " + e.toString());
			log.error(" Dao method (delete_practice) throws Exception : "+e.toString());

		}
		return null;



	}



}