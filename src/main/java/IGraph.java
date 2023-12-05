package main.java;

public interface IGraph {
    
    // Returns the array of vertices in the graph
    public Vertex[] getVertices();

    // Returns the array of edges in the graph
    public Edge[] getEdges();

    // Given a new vertex, adds it to the graph
    public void addVertex(String name);

    // Given a new edge, adds it to the graph
    public void addEdge(Vertex v1, Vertex v2, String name);

    // Returns the number of vertices in the graph
    public int getSizeV();

    // Returns the number of edges in the graph
    public int getSizeE();
}
