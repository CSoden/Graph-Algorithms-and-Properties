package main.java;

public interface IEdge {
    
    // Returns the colour of the edge
    public int getColour();

    // Given a new colour c, sets the colour of the edge
    public void setColour(int colour);

    // Returns the 'name' of the edge
    public String getName();

    // Sets the 'name' of the edge
    public void setName(String name);

    // Returns an array containing the two endpoints of the edge
    public Vertex[] getEndpoints();

    // Returns the weight of the edge
    public int getWeight();

    // Sets the weight of the edge
    public void setWeight(int weight);

    // If the edge is directed, returns the from endpoint of the edge
    public Vertex getFrom();

    // If the edge is directed, returns the to endpoint of the edge
    public Vertex getTo();
}
