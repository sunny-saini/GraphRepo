package com.test.GraphImpl.Controller;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.GraphImpl.Service.ProblemService;
import com.test.GraphImpl.bean.Graph;
import com.test.GraphImpl.bean.Vertex;

@RestController
public class ProblemController {
	private static final Logger LOGGER =Logger.getLogger(ProblemController.class.getName());
	
	
	
	@Autowired
	private ProblemService problemService;
	
	
	@PostMapping(value = "/inventorFundsHold")
	public ResponseEntity<?>  addingInventorFundsHold(@RequestBody Graph  bean, HttpHeaders headers) throws Exception{
		LOGGER.info("addingInventorFundsHold has called");
		Graph response = problemService.addingInventorFundsHold(bean, headers);
		
		return new ResponseEntity<>(response,HttpStatus.OK);
		
		
	}
	
	@GetMapping(value = "/inventorFundsHold")
	public ResponseEntity<?> getInventorFundsHold(@PathVariable String investor)throws Exception{
		LOGGER.info("getInventorFundsHold has called");
		Vertex vertex = problemService.getInventorFundsHold(investor);
		
		return new ResponseEntity<>(vertex,HttpStatus.OK);
		
	}

}
