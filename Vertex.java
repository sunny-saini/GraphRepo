package com.test.GraphImpl.bean;

import java.util.ArrayList;

public class Vertex {
  private String data;
  private ArrayList<Edge> edges;

  public Vertex(String inputData) {
    this.data = inputData;
    this.edges = new ArrayList<Edge>();
  }

  public void addEdge(Vertex endVertex, Integer weight) {
    this.edges.add(new Edge(this, endVertex, weight));
  }

 
  public ArrayList<Edge> getEdges(){
    return this.edges;
  }

public String getData() {
	return data;
}

public void setData(String data) {
	this.data = data;
}

public void setEdges(ArrayList<Edge> edges) {
	this.edges = edges;
}
  
  
  
  
  
}




