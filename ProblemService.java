package com.test.GraphImpl.Service;

import org.springframework.http.HttpHeaders;

import com.test.GraphImpl.bean.Graph;
import com.test.GraphImpl.bean.Vertex;

public interface ProblemService {

	public Graph addingInventorFundsHold(Graph  bean, HttpHeaders headers);

	public Vertex getInventorFundsHold(String investor);
	
	

}
