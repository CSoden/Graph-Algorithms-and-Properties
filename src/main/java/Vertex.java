package main.java;
import java.util.ArrayList;

public class Vertex implements IVertex{

    private int degree;
    private String name;
    private int weight;
    private int[] colour;
    private ArrayList<Edge> edges;
    private ArrayList<Vertex> adjacentVertices;
    
    public Vertex(String name)
    {
        this.setName(name);
        this.setWeight(0);
        this.setColour(new int[]{0,0,0});
        this.degree = 0;
        this.edges = new ArrayList<Edge>();
        this.adjacentVertices = new ArrayList<Vertex>();
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

    public int getDegree()
    {
        return this.degree;
    }

    public Edge[] getEdges()
    {
        Edge[] toReturn = new Edge[this.edges.size()];
        for (int i=0; i<toReturn.length; i++)
        {
            toReturn[i] = this.edges.get(i);
        }
        return toReturn;
    }

    public void addEdge(Edge newEdge)
    {
        this.edges.add(newEdge);
        this.degree += 1;
        Vertex[] toAdd = newEdge.getEndpoints();
        for (int i=0; i<toAdd.length; i++)
        {
            if (!toAdd[i].equals(this))
            {
                adjacentVertices.add(toAdd[i]);
            }
        }
    }

    public void removeEdge(Edge toRemove)
    {
        this.edges.remove(toRemove);
        this.degree -= 1;
    }

    public Vertex[] adjacentTo()
    {
        Vertex[] toReturn = new Vertex[this.adjacentVertices.size()];
        for (int i=0; i<toReturn.length; i++)
        {
            toReturn[i] = this.adjacentVertices.get(i);
        }
        return toReturn;
    }

    public Boolean isAdjacentTo(Vertex v)
    {
        return this.adjacentVertices.contains(v);
    }

    public int getWeight()
    {
        return this.weight;
    }

    public void setWeight(int newWeight)
    {
        this.weight = newWeight;
    }

}