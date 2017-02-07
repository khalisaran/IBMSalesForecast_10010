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


import com.ibm.domain.core.Forecast;

import com.ibm.config.IBMSalesForecastSwaggerUIConstants;

import com.ibm.service.Forecast_Default_ActivityService;



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

@Api(value = "/Forecast_Default_Activity", description = "Forecast_Default_Activity of Forecast_Default_Activity",produces = "application/json")
@CrossOrigin
@Controller("Forecast_Default_ActivityController")
@RequestMapping("/Forecast_Default_Activity")
public class Forecast_Default_ActivityController  extends IBBaseController implements IBMSalesForecastSwaggerUIConstants {

private static Logger log = Logger.getLogger(Forecast_Default_ActivityController.class.getName());

	private Forecast_Default_ActivityService Forecast_Default_Activity_service;


	public Forecast_Default_ActivityService get_Forecast_Default_Activity_service() {
		return Forecast_Default_Activity_service;
	}


	@Resource(name="Forecast_Default_ActivityService")
	public void set_Forecast_Default_Activity_service(Forecast_Default_ActivityService Forecast_Default_Activity_service) {
		this.Forecast_Default_Activity_service = Forecast_Default_Activity_service;
	}




	//auths not ready at this time
	/**
	*The purpose of this method is to perform save operation of  Forecast noun into database
	* @param the_Forecast
	*@return Forecast object will return
	*@throws Exception
	*
	*
	*/


	@ApiOperation(value = "/create_Forecast", httpMethod = "POST",notes = "creates a noun of Forecast",response = Forecast.class)
	@ApiResponses(value = {
		@ApiResponse(code = 200, message = IBMSalesForecastSwaggerUIConstants.SUCCESS),
	    @ApiResponse(code = 404, message = IBMSalesForecastSwaggerUIConstants.NOT_FOUND),
	    @ApiResponse(code = 500, message = IBMSalesForecastSwaggerUIConstants.INTERNAL_SERVER_ERROR),
	    @ApiResponse(code = 400, message = IBMSalesForecastSwaggerUIConstants.BAD_REQUEST),
	    @ApiResponse(code = 412, message = IBMSalesForecastSwaggerUIConstants.PRE_CONDITION_FAILED) })


	@RequestMapping(method = RequestMethod.POST,value = "/create_Forecast" ,headers="Accept=application/json")
    @ResponseBody
	public Forecast create_Forecast(@RequestBody Forecast the_Forecast) throws Exception {

		log.setLevel(Level.INFO);
	    log.info("create_Forecast controller started operation!");

		Forecast a_Forecast;

		a_Forecast = Forecast_Default_Activity_service.create_forecast(the_Forecast, super.getUser());

		log.info("Object returned from create_Forecast method !");

		return a_Forecast;


	}


	//auths not ready at this time
	/**
	*The purpose of this method is to perform update operation of  Forecast noun into database
	*@param the_Forecast
	*@return Forecastobject will return
	*@throws Exception
	*
	*
	*/


	@ApiOperation(value = "/update_Forecast", httpMethod = "PUT",notes = "updates a noun of Forecast",response = Forecast.class)
	@ApiResponses(value = {
		@ApiResponse(code = 200, message = IBMSalesForecastSwaggerUIConstants.SUCCESS),
	    @ApiResponse(code = 404, message = IBMSalesForecastSwaggerUIConstants.NOT_FOUND),
	    @ApiResponse(code = 500, message = IBMSalesForecastSwaggerUIConstants.INTERNAL_SERVER_ERROR),
	    @ApiResponse(code = 400, message = IBMSalesForecastSwaggerUIConstants.BAD_REQUEST),
	    @ApiResponse(code = 412, message = IBMSalesForecastSwaggerUIConstants.PRE_CONDITION_FAILED) })


	@RequestMapping(method = RequestMethod.PUT,value = "/update_Forecast" ,headers="Accept=application/json")
    @ResponseBody
	public Forecast update_Forecast(@RequestBody Forecast the_Forecast) throws Exception {

		log.setLevel(Level.INFO);
	    log.info("update_Forecast controller started operation!");

		Forecast a_Forecast;

		a_Forecast = Forecast_Default_Activity_service.update_forecast(the_Forecast, super.getUser());

		log.info("Object returned from update_Forecast method !");

		return a_Forecast;


	}


	//auths not ready at this time
	/**
	*The purpose of this method is to perform fetch operation of  Forecast noun from  database based on given noun id
	*@param Forecast_id
	*@return Forecastobject will return
	*@throws Exception
	*
	*
	*/


	@ApiOperation(value = "/search_for_update_Forecast/{Forecast_id}", httpMethod = "GET",notes = "updates a noun of Forecast",response = Forecast.class)
	@ApiResponses(value = {
		@ApiResponse(code = 200, message = IBMSalesForecastSwaggerUIConstants.SUCCESS),
	    @ApiResponse(code = 404, message = IBMSalesForecastSwaggerUIConstants.NOT_FOUND),
	    @ApiResponse(code = 500, message = IBMSalesForecastSwaggerUIConstants.INTERNAL_SERVER_ERROR),
	    @ApiResponse(code = 400, message = IBMSalesForecastSwaggerUIConstants.BAD_REQUEST),
	    @ApiResponse(code = 412, message = IBMSalesForecastSwaggerUIConstants.PRE_CONDITION_FAILED) })


	@RequestMapping(method = RequestMethod.GET,value = "/search_for_update_Forecast/{Forecast_id}" ,headers="Accept=application/json")
    @ResponseBody
	public Forecast search_for_update_Forecast(@PathVariable("Forecast_id")long Forecast_id) throws Exception {

		log.setLevel(Level.INFO);
	    log.info("search_for_update_Forecast controller started operation!");

		Forecast the_Forecast = new Forecast();

		the_Forecast = Forecast_Default_Activity_service.forecast_search_for_update(Forecast_id, super.getUser());

		log.info("Object returned from search_for_update_Forecast method !");

		return the_Forecast;


	}


	//auths not ready at this time
	/**
	*The purpose of this method is to perform delete operation of  Forecast noun from  database based on given noun id
	*@param Forecast_id
	*@return Forecastobject will return
	*@throws Exception
	*
	*
	*/


	@ApiOperation(value = "/delete_Forecast/{Forecast_id}", httpMethod = "DELETE",notes = "deletes a noun of Forecast",response = Forecast.class)
	@ApiResponses(value = {
		@ApiResponse(code = 200, message = IBMSalesForecastSwaggerUIConstants.SUCCESS),
	    @ApiResponse(code = 404, message = IBMSalesForecastSwaggerUIConstants.NOT_FOUND),
	    @ApiResponse(code = 500, message = IBMSalesForecastSwaggerUIConstants.INTERNAL_SERVER_ERROR),
	    @ApiResponse(code = 400, message = IBMSalesForecastSwaggerUIConstants.BAD_REQUEST),
	    @ApiResponse(code = 412, message = IBMSalesForecastSwaggerUIConstants.PRE_CONDITION_FAILED) })


	@RequestMapping(method = RequestMethod.DELETE,value = "/delete_Forecast/{Forecast_id}" ,headers="Accept=application/json")
    @ResponseBody
	public String  delete_Forecast(@PathVariable("Forecast_id")long Forecast_id) throws Exception {

		log.setLevel(Level.INFO);
	    log.info("delete_Forecast controller started operation!");

		String service_return_msg = "";

		service_return_msg = Forecast_Default_Activity_service.delete_forecast(Forecast_id, super.getUser());

		log.info("Object returned from delete_Forecast method !");

		return service_return_msg;


	}


	//auths not ready at this time
	/**
	*The purpose of this method is to get list of  Forecast noun from  database
	*
	*@return List of Forecast objects will return
	*@throws Exception
	*
	*
	*/


	@ApiOperation(value = "/get_all_Forecast", httpMethod = "GET",notes = "special search that gets all values of Forecast",response = Forecast.class)
	@ApiResponses(value = {
		@ApiResponse(code = 200, message = IBMSalesForecastSwaggerUIConstants.SUCCESS),
	    @ApiResponse(code = 404, message = IBMSalesForecastSwaggerUIConstants.NOT_FOUND),
	    @ApiResponse(code = 500, message = IBMSalesForecastSwaggerUIConstants.INTERNAL_SERVER_ERROR),
	    @ApiResponse(code = 400, message = IBMSalesForecastSwaggerUIConstants.BAD_REQUEST),
	    @ApiResponse(code = 412, message = IBMSalesForecastSwaggerUIConstants.PRE_CONDITION_FAILED) })


	@RequestMapping(method = RequestMethod.GET,value = "/get_all_Forecast" ,headers="Accept=application/json")
    @ResponseBody
	public List<Forecast> get_all_Forecast() throws Exception {

		log.setLevel(Level.INFO);
	    log.info("get_all_Forecast controller started operation!");

		List<Forecast> Forecast_list = new ArrayList<Forecast>();

		Forecast_list = Forecast_Default_Activity_service.get_all_forecast();

		log.info("Object returned from get_all_Forecast method !");

		return Forecast_list;


	}




}