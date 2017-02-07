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



import com.ibm.domain.core.RevenueType;
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
@Repository("RevenueType_Default_ActivityDao")
public class RevenueType_Default_ActivityDao   {

	//private Log log = LogFactory.getLog(getClass());
	private static Logger log = Logger.getLogger(RevenueType_Default_ActivityDao.class.getName());

	@Value("${create_RevenueType.sql}")
	private String create_RevenueType;
	@Value("${search_for_update_RevenueType.sql}")
	private String search_for_update_RevenueType;
	@Value("${update_RevenueType.sql}")
	private String update_RevenueType;
	@Value("${delete_RevenueType.sql}")
	private String delete_RevenueType;
	@Value("${get_all_RevenueType.sql}")
	private String get_all_RevenueType;


    @PersistenceContext
	private EntityManager entityManager;



	// auths not ready at this time

	/**
	*
	*The purpose of Dao method is to perform fetch operation of  RevenueType noun from  database based on given noun id
	*@param  id
	*@param user
	*@return the_RevenueType object will return
	*@throws Exception
	*/

	public RevenueType revenuetype_search_for_update(long id, IBUser user) throws Exception {
		  log.setLevel(Level.INFO);
	      log.info("revenuetype_search_for_update Dao started operation!");

		try{

			Query result =  entityManager.
			createNativeQuery(search_for_update_RevenueType,RevenueType.class)

			.setParameter("id", id);;

			ArrayList<RevenueType> RevenueType_list =	(ArrayList<RevenueType>)result.getResultList();

			if(RevenueType_list  == null){

			log.error("revenuetype_search_for_update Dao throws exception :" + "no RevenueType found" );
			throw new Exception("no RevenueType found");
			}
			log.info("Object returned from revenuetype_search_for_update  Dao method !");
			return (RevenueType) RevenueType_list.get(0);

		}catch(Exception e){

			//new Exception(e.toString());  // this needs to be changed
			log.error("revenuetype_search_for_update Dao throws exception : "+e.toString());

		}
		return null;


	}

	// auths not ready at this time

	/**
	*
	*The purpose of Dao method is to get list of  RevenueType noun from  database
	*
	*
	*@return List of RevenueType object will return
	*@throws Exception
	*/

	public ArrayList<RevenueType> get_all_revenuetype() throws Exception {
		  log.setLevel(Level.INFO);
	      log.info("get_all_revenuetype Dao started operation!");

		try{

			Query result =  entityManager.
			createNativeQuery(get_all_RevenueType,RevenueType.class)

;

			ArrayList<RevenueType> RevenueType_list =	(ArrayList<RevenueType>)result.getResultList();

			if(RevenueType_list .size() < 1){

			log.error("get_all_revenuetype Dao throws exception :" + "no RevenueType found" );
			throw new Exception("no RevenueType found");
			}
			log.info("Object returned from get_all_revenuetype  Dao method !");
			return (ArrayList<RevenueType>) RevenueType_list;

		}catch(Exception e){

			//new Exception(e.toString());  // this needs to be changed
			log.error("get_all_revenuetype Dao throws exception : "+e.toString());

		}
		return null;


	}



	//auths not ready at this time

	/**
	*
	*The purpose of Dao method is to perform save operation of  RevenueType noun into database
	*@param RevenueType
	*@param user
	*@return RevenueType object will return
	*@throws Exception
	*/

	@Transactional
	public RevenueType create_revenuetype(RevenueType RevenueType, IBUser user) throws Exception {

	 	  log.setLevel(Level.INFO);
	      log.info("create_revenuetype Dao started operation!");

		try{
			Query query = entityManager
					.createNativeQuery(create_RevenueType)
			.setParameter("revtype", RevenueType.getRevtype())
			.setParameter("description", RevenueType.getDescription())
			.setParameter("created_by", user == null ? 0:user.getId())
			.setParameter("updated_by", user == null ? 0:user.getId())
;

			int insertedId = query.executeUpdate();
					String lastIndex="select last_insert_id()";
					Query sql = entityManager.createNativeQuery(lastIndex);
					BigInteger new_id = (BigInteger) sql.getSingleResult();
					RevenueType.setId(new_id.longValue());
					System.out.println("create data---"+insertedId);

			log.info("Object returned from create_revenuetype  Dao method !");

			return RevenueType;

		}catch(Exception e){

			//System.out.println("DAOException: " + e.toString());
			log.error(" Dao method (create_revenuetype) throws Exception : "+e.toString());

		}
		return null;



	}

	//auths not ready at this time

	/**
	*
	*The purpose of Dao method is to perform update operation of  RevenueType noun into database
	*@param RevenueType
	*@param user
	*@return the_RevenueType object will return
	*@throws Exception
	*/

	@Transactional
	public RevenueType update_revenuetype(RevenueType RevenueType, IBUser user) throws Exception {

	 	  log.setLevel(Level.INFO);
	      log.info("update_revenuetype Dao started operation!");

		try{
			Query query = entityManager
					.createNativeQuery(update_RevenueType)
			.setParameter("id", RevenueType.getId())
			.setParameter("revtype", RevenueType.getRevtype())
			.setParameter("description", RevenueType.getDescription())
			.setParameter("updated_by", user == null ? 0:user.getId())
;

			query.executeUpdate();

			log.info("Object returned from update_revenuetype  Dao method !");

			return RevenueType;

		}catch(Exception e){

			//System.out.println("DAOException: " + e.toString());
			log.error(" Dao method (update_revenuetype) throws Exception : "+e.toString());

		}
		return null;



	}

	//auths not ready at this time

	/**
	*
	*The purpose of Dao method is to perform delete operation of  RevenueType noun from  database based on given noun id
	*@param  id
	*@param user
	*@return the_RevenueType id deleted based on id
	*@throws Exception
	*/

	@Transactional
	public String  delete_revenuetype(long id, IBUser user) throws Exception {

	 	  log.setLevel(Level.INFO);
	      log.info("delete_revenuetype Dao started operation!");

		try{
			Query query = entityManager
					.createNativeQuery(delete_RevenueType)
			.setParameter("id", id);

			query.executeUpdate();

			log.info("Object returned from delete_revenuetype  Dao method !");

			return "{\"status\":\"success\"}";

		}catch(Exception e){

			//System.out.println("DAOException: " + e.toString());
			log.error(" Dao method (delete_revenuetype) throws Exception : "+e.toString());

		}
		return null;



	}



}