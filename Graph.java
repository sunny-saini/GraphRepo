package com.test.GraphImpl.bean;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component
public class Graph {
  private ArrayList<Vertex> vertices;
  private boolean isWeighted;
  private boolean isDirected;
  
  public String getMarKetValue;

  

public String getGetMarKetValue() {
	return getMarKetValue;
}

public void setGetMarKetValue(String getMarKetValue) {
	this.getMarKetValue = getMarKetValue;
}

public Graph(boolean inputIsWeighted, boolean inputIsDirected) {
    this.vertices = new ArrayList<Vertex>();
    this.isWeighted = inputIsWeighted;
    this.isDirected = inputIsDirected;
  }

  public Graph() {
	// TODO Auto-generated constructor stub
}

public Vertex addVertex(String data) {
    Vertex newVertex = new Vertex(data);
    this.vertices.add(newVertex);
    return newVertex;
  }

  public void addEdge(Vertex vertex1, Vertex vertex2, Integer weight) {
    if (!this.isWeighted) {
      weight = null;
    }
    vertex1.addEdge(vertex2, weight);
    if (!this.isDirected) {
      vertex2.addEdge(vertex1, weight);
    }
  }


  public void removeVertex(Vertex vertex) {
    this.vertices.remove(vertex);
  }

  public ArrayList<Vertex> getVertices() {
    return this.vertices;
  }

  public boolean isWeighted() {
    return this.isWeighted;
  }

  public boolean isDirected() {
    return this.isDirected;
  }

 
	
}