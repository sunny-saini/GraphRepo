package com.test.GraphImpl.Service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;

import com.test.GraphImpl.Service.ProblemService;
import com.test.GraphImpl.bean.Graph;
import com.test.GraphImpl.bean.Vertex;

@Service
public class ProblemServiceImpl implements ProblemService{
	
	private static final Logger LOGGER =Logger.getLogger(ProblemServiceImpl.class.getName());

	
	@Autowired
	private Graph graph;

	@Override
	public Graph addingInventorFundsHold(Graph  bean, HttpHeaders headers) {
		LOGGER.info("addingInventorFundsHold has called");

		try {
		
		bean.getVertices().stream().forEach(vertex->{
			
			graph.addVertex(vertex.getData());
			
			
		});
		
		bean.getVertices().stream().forEach(edge->{
			
			edge.getEdges().stream().forEach(ed->{
				graph.addEdge(ed.getStart(), ed.getEnd(), ed.getWeight());
				
				int ans=100*ed.getWeight();
				bean.setGetMarKetValue(String.valueOf(ans));
			});
			
		});
		
		LOGGER.info("addingInventorFundsHold has Finish its Execution");
		
		
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return bean;
	}

	@Override
	public Vertex getInventorFundsHold(String investorId) {
		LOGGER.info("getInventorFundsHold has called");
		Vertex vertexList = null;
		try {
			vertexList = graph.getVertices().get(Integer.valueOf(investorId));
		} catch (Exception e) {
			e.printStackTrace();
		}

		LOGGER.info("getInventorFundsHold has Finish its Execution");
		return vertexList;
	}

}
