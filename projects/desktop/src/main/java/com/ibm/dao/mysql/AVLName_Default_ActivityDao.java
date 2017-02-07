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



import com.ibm.domain.core.AVLName;
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
@Repository("AVLName_Default_ActivityDao")
public class AVLName_Default_ActivityDao   {

	//private Log log = LogFactory.getLog(getClass());
	private static Logger log = Logger.getLogger(AVLName_Default_ActivityDao.class.getName());

	@Value("${create_AVLName.sql}")
	private String create_AVLName;
	@Value("${search_for_update_AVLName.sql}")
	private String search_for_update_AVLName;
	@Value("${update_AVLName.sql}")
	private String update_AVLName;
	@Value("${delete_AVLName.sql}")
	private String delete_AVLName;
	@Value("${get_all_AVLName.sql}")
	private String get_all_AVLName;


    @PersistenceContext
	private EntityManager entityManager;



	// auths not ready at this time

	/**
	*
	*The purpose of Dao method is to perform fetch operation of  AVLName noun from  database based on given noun id
	*@param  id
	*@param user
	*@return the_AVLName object will return
	*@throws Exception
	*/

	public AVLName avlname_search_for_update(long id, IBUser user) throws Exception {
		  log.setLevel(Level.INFO);
	      log.info("avlname_search_for_update Dao started operation!");

		try{

			Query result =  entityManager.
			createNativeQuery(search_for_update_AVLName,AVLName.class)

			.setParameter("id", id);;

			ArrayList<AVLName> AVLName_list =	(ArrayList<AVLName>)result.getResultList();

			if(AVLName_list  == null){

			log.error("avlname_search_for_update Dao throws exception :" + "no AVLName found" );
			throw new Exception("no AVLName found");
			}
			log.info("Object returned from avlname_search_for_update  Dao method !");
			return (AVLName) AVLName_list.get(0);

		}catch(Exception e){

			//new Exception(e.toString());  // this needs to be changed
			log.error("avlname_search_for_update Dao throws exception : "+e.toString());

		}
		return null;


	}

	// auths not ready at this time

	/**
	*
	*The purpose of Dao method is to get list of  AVLName noun from  database
	*
	*
	*@return List of AVLName object will return
	*@throws Exception
	*/

	public ArrayList<AVLName> get_all_avlname() throws Exception {
		  log.setLevel(Level.INFO);
	      log.info("get_all_avlname Dao started operation!");

		try{

			Query result =  entityManager.
			createNativeQuery(get_all_AVLName,AVLName.class)

;

			ArrayList<AVLName> AVLName_list =	(ArrayList<AVLName>)result.getResultList();

			if(AVLName_list .size() < 1){

			log.error("get_all_avlname Dao throws exception :" + "no AVLName found" );
			throw new Exception("no AVLName found");
			}
			log.info("Object returned from get_all_avlname  Dao method !");
			return (ArrayList<AVLName>) AVLName_list;

		}catch(Exception e){

			//new Exception(e.toString());  // this needs to be changed
			log.error("get_all_avlname Dao throws exception : "+e.toString());

		}
		return null;


	}



	//auths not ready at this time

	/**
	*
	*The purpose of Dao method is to perform save operation of  AVLName noun into database
	*@param AVLName
	*@param user
	*@return AVLName object will return
	*@throws Exception
	*/

	@Transactional
	public AVLName create_avlname(AVLName AVLName, IBUser user) throws Exception {

	 	  log.setLevel(Level.INFO);
	      log.info("create_avlname Dao started operation!");

		try{
			Query query = entityManager
					.createNativeQuery(create_AVLName)
			.setParameter("avlname", AVLName.getAvlname())
			.setParameter("description", AVLName.getDescription())
			.setParameter("created_by", user == null ? 0:user.getId())
			.setParameter("updated_by", user == null ? 0:user.getId())
;

			int insertedId = query.executeUpdate();
					String lastIndex="select last_insert_id()";
					Query sql = entityManager.createNativeQuery(lastIndex);
					BigInteger new_id = (BigInteger) sql.getSingleResult();
					AVLName.setId(new_id.longValue());
					System.out.println("create data---"+insertedId);

			log.info("Object returned from create_avlname  Dao method !");

			return AVLName;

		}catch(Exception e){

			//System.out.println("DAOException: " + e.toString());
			log.error(" Dao method (create_avlname) throws Exception : "+e.toString());

		}
		return null;



	}

	//auths not ready at this time

	/**
	*
	*The purpose of Dao method is to perform update operation of  AVLName noun into database
	*@param AVLName
	*@param user
	*@return the_AVLName object will return
	*@throws Exception
	*/

	@Transactional
	public AVLName update_avlname(AVLName AVLName, IBUser user) throws Exception {

	 	  log.setLevel(Level.INFO);
	      log.info("update_avlname Dao started operation!");

		try{
			Query query = entityManager
					.createNativeQuery(update_AVLName)
			.setParameter("id", AVLName.getId())
			.setParameter("avlname", AVLName.getAvlname())
			.setParameter("description", AVLName.getDescription())
			.setParameter("updated_by", user == null ? 0:user.getId())
;

			query.executeUpdate();

			log.info("Object returned from update_avlname  Dao method !");

			return AVLName;

		}catch(Exception e){

			//System.out.println("DAOException: " + e.toString());
			log.error(" Dao method (update_avlname) throws Exception : "+e.toString());

		}
		return null;



	}

	//auths not ready at this time

	/**
	*
	*The purpose of Dao method is to perform delete operation of  AVLName noun from  database based on given noun id
	*@param  id
	*@param user
	*@return the_AVLName id deleted based on id
	*@throws Exception
	*/

	@Transactional
	public String  delete_avlname(long id, IBUser user) throws Exception {

	 	  log.setLevel(Level.INFO);
	      log.info("delete_avlname Dao started operation!");

		try{
			Query query = entityManager
					.createNativeQuery(delete_AVLName)
			.setParameter("id", id);

			query.executeUpdate();

			log.info("Object returned from delete_avlname  Dao method !");

			return "{\"status\":\"success\"}";

		}catch(Exception e){

			//System.out.println("DAOException: " + e.toString());
			log.error(" Dao method (delete_avlname) throws Exception : "+e.toString());

		}
		return null;



	}



}