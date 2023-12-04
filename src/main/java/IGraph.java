package main.java;

public interface IGraph {
    
    // Returns the array of vertices in the graph
    public Vertex[] getVerteces();

    // Returns the array of edges in the graph
    public Edge[] getEdges();

    // Given a new vertex, adds it to the graph
    public void addVertex(Vertex v);

    // Given a new edge, adds it to the graph
    public void addEdge(Edge e);

    // Returns the number of vertices in the graph
    public int getSizeV();

    // Returns the number of edges in the graph
    public int getSizeE();
}
