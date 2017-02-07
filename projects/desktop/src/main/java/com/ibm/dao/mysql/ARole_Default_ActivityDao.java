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



import com.ibm.domain.core.ARole;
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
@Repository("ARole_Default_ActivityDao")
public class ARole_Default_ActivityDao   {

	//private Log log = LogFactory.getLog(getClass());
	private static Logger log = Logger.getLogger(ARole_Default_ActivityDao.class.getName());

	@Value("${create_ARole.sql}")
	private String create_ARole;
	@Value("${search_for_update_ARole.sql}")
	private String search_for_update_ARole;
	@Value("${update_ARole.sql}")
	private String update_ARole;
	@Value("${delete_ARole.sql}")
	private String delete_ARole;
	@Value("${get_all_ARole.sql}")
	private String get_all_ARole;


    @PersistenceContext
	private EntityManager entityManager;



	// auths not ready at this time

	/**
	*
	*The purpose of Dao method is to perform fetch operation of  ARole noun from  database based on given noun id
	*@param  id
	*@param user
	*@return the_ARole object will return
	*@throws Exception
	*/

	public ARole arole_search_for_update(long id, IBUser user) throws Exception {
		  log.setLevel(Level.INFO);
	      log.info("arole_search_for_update Dao started operation!");

		try{

			Query result =  entityManager.
			createNativeQuery(search_for_update_ARole,ARole.class)

			.setParameter("id", id);;

			ArrayList<ARole> ARole_list =	(ArrayList<ARole>)result.getResultList();

			if(ARole_list  == null){

			log.error("arole_search_for_update Dao throws exception :" + "no ARole found" );
			throw new Exception("no ARole found");
			}
			log.info("Object returned from arole_search_for_update  Dao method !");
			return (ARole) ARole_list.get(0);

		}catch(Exception e){

			//new Exception(e.toString());  // this needs to be changed
			log.error("arole_search_for_update Dao throws exception : "+e.toString());

		}
		return null;


	}

	// auths not ready at this time

	/**
	*
	*The purpose of Dao method is to get list of  ARole noun from  database
	*
	*
	*@return List of ARole object will return
	*@throws Exception
	*/

	public ArrayList<ARole> get_all_arole() throws Exception {
		  log.setLevel(Level.INFO);
	      log.info("get_all_arole Dao started operation!");

		try{

			Query result =  entityManager.
			createNativeQuery(get_all_ARole,ARole.class)

;

			ArrayList<ARole> ARole_list =	(ArrayList<ARole>)result.getResultList();

			if(ARole_list .size() < 1){

			log.error("get_all_arole Dao throws exception :" + "no ARole found" );
			throw new Exception("no ARole found");
			}
			log.info("Object returned from get_all_arole  Dao method !");
			return (ArrayList<ARole>) ARole_list;

		}catch(Exception e){

			//new Exception(e.toString());  // this needs to be changed
			log.error("get_all_arole Dao throws exception : "+e.toString());

		}
		return null;


	}



	//auths not ready at this time

	/**
	*
	*The purpose of Dao method is to perform save operation of  ARole noun into database
	*@param ARole
	*@param user
	*@return ARole object will return
	*@throws Exception
	*/

	@Transactional
	public ARole create_arole(ARole ARole, IBUser user) throws Exception {

	 	  log.setLevel(Level.INFO);
	      log.info("create_arole Dao started operation!");

		try{
			Query query = entityManager
					.createNativeQuery(create_ARole)
			.setParameter("arole", ARole.getArole())
			.setParameter("description", ARole.getDescription())
			.setParameter("created_by", user == null ? 0:user.getId())
			.setParameter("updated_by", user == null ? 0:user.getId())
;

			int insertedId = query.executeUpdate();
					String lastIndex="select last_insert_id()";
					Query sql = entityManager.createNativeQuery(lastIndex);
					BigInteger new_id = (BigInteger) sql.getSingleResult();
					ARole.setId(new_id.longValue());
					System.out.println("create data---"+insertedId);

			log.info("Object returned from create_arole  Dao method !");

			return ARole;

		}catch(Exception e){

			//System.out.println("DAOException: " + e.toString());
			log.error(" Dao method (create_arole) throws Exception : "+e.toString());

		}
		return null;



	}

	//auths not ready at this time

	/**
	*
	*The purpose of Dao method is to perform update operation of  ARole noun into database
	*@param ARole
	*@param user
	*@return the_ARole object will return
	*@throws Exception
	*/

	@Transactional
	public ARole update_arole(ARole ARole, IBUser user) throws Exception {

	 	  log.setLevel(Level.INFO);
	      log.info("update_arole Dao started operation!");

		try{
			Query query = entityManager
					.createNativeQuery(update_ARole)
			.setParameter("id", ARole.getId())
			.setParameter("arole", ARole.getArole())
			.setParameter("description", ARole.getDescription())
			.setParameter("updated_by", user == null ? 0:user.getId())
;

			query.executeUpdate();

			log.info("Object returned from update_arole  Dao method !");

			return ARole;

		}catch(Exception e){

			//System.out.println("DAOException: " + e.toString());
			log.error(" Dao method (update_arole) throws Exception : "+e.toString());

		}
		return null;



	}

	//auths not ready at this time

	/**
	*
	*The purpose of Dao method is to perform delete operation of  ARole noun from  database based on given noun id
	*@param  id
	*@param user
	*@return the_ARole id deleted based on id
	*@throws Exception
	*/

	@Transactional
	public String  delete_arole(long id, IBUser user) throws Exception {

	 	  log.setLevel(Level.INFO);
	      log.info("delete_arole Dao started operation!");

		try{
			Query query = entityManager
					.createNativeQuery(delete_ARole)
			.setParameter("id", id);

			query.executeUpdate();

			log.info("Object returned from delete_arole  Dao method !");

			return "{\"status\":\"success\"}";

		}catch(Exception e){

			//System.out.println("DAOException: " + e.toString());
			log.error(" Dao method (delete_arole) throws Exception : "+e.toString());

		}
		return null;



	}



}