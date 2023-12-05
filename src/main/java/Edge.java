package main.java;

public class Edge implements IEdge{
    
    private int[] colour;
    private String name;
    private Vertex[] endpoints;
    private int weight;
    private boolean directed;
    private Vertex from;
    private Vertex to;

    public Edge(String name, boolean isDirected, Vertex v1, Vertex v2)
    {
        this.setName(name);
        this.setColour(new int[]{0,0,0});
        this.setWeight(0);
        this.endpoints = new Vertex[2];
        this.endpoints[0] = v1;
        this.endpoints[1] = v2;
        this.directed = isDirected;
        this.from = v1;
        this.to = v2;
    }

    public int[] getColour()
    {
        return this.colour;
    }

    public void setColour(int[] newColour)
    {
        this.colour = newColour;
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String newName)
    {
        this.name = newName;
    }

    public Vertex[] getEndPoints()
    {
        return this.endpoints;
    }

    public int getWeight()
    {
        return this.weight;
    }

    public void setWeight(int newWeight)
    {
        this.weight = newWeight;
    }

    public Vertex getFrom()
    {
        return this.from;
    }

    public Vertex getTo()
    {
        return this.to;
    }

}
