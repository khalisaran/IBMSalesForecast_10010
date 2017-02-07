package com.ibm.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.*;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestBody;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;
import com.wordnik.swagger.annotations.ApiResponse;
import com.wordnik.swagger.annotations.ApiResponses;


import com.ibm.domain.core.Probability;

import com.ibm.config.IBMSalesForecastSwaggerUIConstants;

import com.ibm.service.Probability_Default_ActivityService;



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

@Api(value = "/Probability_Default_Activity", description = "Probability_Default_Activity of Probability_Default_Activity",produces = "application/json")
@CrossOrigin
@Controller("Probability_Default_ActivityController")
@RequestMapping("/Probability_Default_Activity")
public class Probability_Default_ActivityController  extends IBBaseController implements IBMSalesForecastSwaggerUIConstants {

private static Logger log = Logger.getLogger(Probability_Default_ActivityController.class.getName());

	private Probability_Default_ActivityService Probability_Default_Activity_service;


	public Probability_Default_ActivityService get_Probability_Default_Activity_service() {
		return Probability_Default_Activity_service;
	}


	@Resource(name="Probability_Default_ActivityService")
	public void set_Probability_Default_Activity_service(Probability_Default_ActivityService Probability_Default_Activity_service) {
		this.Probability_Default_Activity_service = Probability_Default_Activity_service;
	}




	//auths not ready at this time
	/**
	*The purpose of this method is to perform save operation of  Probability noun into database
	* @param the_Probability
	*@return Probability object will return
	*@throws Exception
	*
	*
	*/


	@ApiOperation(value = "/create_Probability", httpMethod = "POST",notes = "creates a noun of Probability",response = Probability.class)
	@ApiResponses(value = {
		@ApiResponse(code = 200, message = IBMSalesForecastSwaggerUIConstants.SUCCESS),
	    @ApiResponse(code = 404, message = IBMSalesForecastSwaggerUIConstants.NOT_FOUND),
	    @ApiResponse(code = 500, message = IBMSalesForecastSwaggerUIConstants.INTERNAL_SERVER_ERROR),
	    @ApiResponse(code = 400, message = IBMSalesForecastSwaggerUIConstants.BAD_REQUEST),
	    @ApiResponse(code = 412, message = IBMSalesForecastSwaggerUIConstants.PRE_CONDITION_FAILED) })


	@RequestMapping(method = RequestMethod.POST,value = "/create_Probability" ,headers="Accept=application/json")
    @ResponseBody
	public Probability create_Probability(@RequestBody Probability the_Probability) throws Exception {

		log.setLevel(Level.INFO);
	    log.info("create_Probability controller started operation!");

		Probability a_Probability;

		a_Probability = Probability_Default_Activity_service.create_probability(the_Probability, super.getUser());

		log.info("Object returned from create_Probability method !");

		return a_Probability;


	}


	//auths not ready at this time
	/**
	*The purpose of this method is to perform update operation of  Probability noun into database
	*@param the_Probability
	*@return Probabilityobject will return
	*@throws Exception
	*
	*
	*/


	@ApiOperation(value = "/update_Probability", httpMethod = "PUT",notes = "updates a noun of Probability",response = Probability.class)
	@ApiResponses(value = {
		@ApiResponse(code = 200, message = IBMSalesForecastSwaggerUIConstants.SUCCESS),
	    @ApiResponse(code = 404, message = IBMSalesForecastSwaggerUIConstants.NOT_FOUND),
	    @ApiResponse(code = 500, message = IBMSalesForecastSwaggerUIConstants.INTERNAL_SERVER_ERROR),
	    @ApiResponse(code = 400, message = IBMSalesForecastSwaggerUIConstants.BAD_REQUEST),
	    @ApiResponse(code = 412, message = IBMSalesForecastSwaggerUIConstants.PRE_CONDITION_FAILED) })


	@RequestMapping(method = RequestMethod.PUT,value = "/update_Probability" ,headers="Accept=application/json")
    @ResponseBody
	public Probability update_Probability(@RequestBody Probability the_Probability) throws Exception {

		log.setLevel(Level.INFO);
	    log.info("update_Probability controller started operation!");

		Probability a_Probability;

		a_Probability = Probability_Default_Activity_service.update_probability(the_Probability, super.getUser());

		log.info("Object returned from update_Probability method !");

		return a_Probability;


	}


	//auths not ready at this time
	/**
	*The purpose of this method is to perform fetch operation of  Probability noun from  database based on given noun id
	*@param Probability_id
	*@return Probabilityobject will return
	*@throws Exception
	*
	*
	*/


	@ApiOperation(value = "/search_for_update_Probability/{Probability_id}", httpMethod = "GET",notes = "updates a noun of Probability",response = Probability.class)
	@ApiResponses(value = {
		@ApiResponse(code = 200, message = IBMSalesForecastSwaggerUIConstants.SUCCESS),
	    @ApiResponse(code = 404, message = IBMSalesForecastSwaggerUIConstants.NOT_FOUND),
	    @ApiResponse(code = 500, message = IBMSalesForecastSwaggerUIConstants.INTERNAL_SERVER_ERROR),
	    @ApiResponse(code = 400, message = IBMSalesForecastSwaggerUIConstants.BAD_REQUEST),
	    @ApiResponse(code = 412, message = IBMSalesForecastSwaggerUIConstants.PRE_CONDITION_FAILED) })


	@RequestMapping(method = RequestMethod.GET,value = "/search_for_update_Probability/{Probability_id}" ,headers="Accept=application/json")
    @ResponseBody
	public Probability search_for_update_Probability(@PathVariable("Probability_id")long Probability_id) throws Exception {

		log.setLevel(Level.INFO);
	    log.info("search_for_update_Probability controller started operation!");

		Probability the_Probability = new Probability();

		the_Probability = Probability_Default_Activity_service.probability_search_for_update(Probability_id, super.getUser());

		log.info("Object returned from search_for_update_Probability method !");

		return the_Probability;


	}


	//auths not ready at this time
	/**
	*The purpose of this method is to perform delete operation of  Probability noun from  database based on given noun id
	*@param Probability_id
	*@return Probabilityobject will return
	*@throws Exception
	*
	*
	*/


	@ApiOperation(value = "/delete_Probability/{Probability_id}", httpMethod = "DELETE",notes = "deletes a noun of Probability",response = Probability.class)
	@ApiResponses(value = {
		@ApiResponse(code = 200, message = IBMSalesForecastSwaggerUIConstants.SUCCESS),
	    @ApiResponse(code = 404, message = IBMSalesForecastSwaggerUIConstants.NOT_FOUND),
	    @ApiResponse(code = 500, message = IBMSalesForecastSwaggerUIConstants.INTERNAL_SERVER_ERROR),
	    @ApiResponse(code = 400, message = IBMSalesForecastSwaggerUIConstants.BAD_REQUEST),
	    @ApiResponse(code = 412, message = IBMSalesForecastSwaggerUIConstants.PRE_CONDITION_FAILED) })


	@RequestMapping(method = RequestMethod.DELETE,value = "/delete_Probability/{Probability_id}" ,headers="Accept=application/json")
    @ResponseBody
	public String  delete_Probability(@PathVariable("Probability_id")long Probability_id) throws Exception {

		log.setLevel(Level.INFO);
	    log.info("delete_Probability controller started operation!");

		String service_return_msg = "";

		service_return_msg = Probability_Default_Activity_service.delete_probability(Probability_id, super.getUser());

		log.info("Object returned from delete_Probability method !");

		return service_return_msg;


	}


	//auths not ready at this time
	/**
	*The purpose of this method is to get list of  Probability noun from  database
	*
	*@return List of Probability objects will return
	*@throws Exception
	*
	*
	*/


	@ApiOperation(value = "/get_all_Probability", httpMethod = "GET",notes = "special search that gets all values of Probability",response = Probability.class)
	@ApiResponses(value = {
		@ApiResponse(code = 200, message = IBMSalesForecastSwaggerUIConstants.SUCCESS),
	    @ApiResponse(code = 404, message = IBMSalesForecastSwaggerUIConstants.NOT_FOUND),
	    @ApiResponse(code = 500, message = IBMSalesForecastSwaggerUIConstants.INTERNAL_SERVER_ERROR),
	    @ApiResponse(code = 400, message = IBMSalesForecastSwaggerUIConstants.BAD_REQUEST),
	    @ApiResponse(code = 412, message = IBMSalesForecastSwaggerUIConstants.PRE_CONDITION_FAILED) })


	@RequestMapping(method = RequestMethod.GET,value = "/get_all_Probability" ,headers="Accept=application/json")
    @ResponseBody
	public List<Probability> get_all_Probability() throws Exception {

		log.setLevel(Level.INFO);
	    log.info("get_all_Probability controller started operation!");

		List<Probability> Probability_list = new ArrayList<Probability>();

		Probability_list = Probability_Default_Activity_service.get_all_probability();

		log.info("Object returned from get_all_Probability method !");

		return Probability_list;


	}




}