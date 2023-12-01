package main.java;

public interface IVertex {

    // Returns the colour of the current vertex. Used for vertex/total graph colourings
    public int getColour();

    // Given a colour, given as a integer (or potential 3d RGB vector in future (for visualisation)), sets the colour of that given vertex to the color
    public void setColour(int newColour);

    // Returns the 'name' or label of the vertex
    public String getName();

    // Given a string, sets the 'name' or label of the vertex
    public void setName(String newName);

    // Returns the degree of a given vertex, i.e., the number of edges that have an endpoint in the vertex
    public int getDegree();

    // Returns an array of the edges that have an endpoint in the vertex
    public Edge[] getEdges();

    // Given an edge, adds that edge to the list of edges with an endpoint in the vertex, also increments the degree of the vertex
    public void addEdge(Edge newEdge);

    // Given an edge, removes that edge from the list of edges with an endpoint in the vertex, also decrements the degree of the vertex
    public void removeEdge(Edge toRemove);

    // Returns an array of vertices that the current vertex is adjacent to
    public Vertex[] adjacentTo();

    // Given a vertex v, returns where the vertex is adjacent to v
    public Boolean isAdjacentTo(Vertex v);
}
