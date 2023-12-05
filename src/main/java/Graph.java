package main.java;
import java.util.ArrayList;

public class Graph implements IGraph{
    
    private ArrayList<Vertex> V;
    private ArrayList<Edge> E;
    private int chromaticNumber;
    private boolean hamiltonian;
    private boolean eulerian;
    private boolean acyclic;
    private boolean simple;
    private boolean directed;
    private boolean planar;

    public Graph()
    {
        this.V = new ArrayList<Vertex>();
        this.E = new ArrayList<Edge>();
    }

    public boolean isHamiltonian()
    {
        return this.hamiltonian;
    }

    public boolean isEulerian()
    {
        return this.eulerian;
    }

    public boolean isSimple()
    {
        return this.simple;
    }

    public boolean isDirected()
    {
        return this.directed;
    }

    public boolean isPlanar()
    {
        return this.planar;
    }

    public boolean isAcyclic()
    {
        return this.acyclic;
    }

    public int getChromaticNumber()
    {
        return this.chromaticNumber;
    }

    public Vertex[] getVertices()
    {
        Vertex[] toReturn = new Vertex[this.V.size()];
        for (int i = 0; i < toReturn.length; i++)
        {
            toReturn[i] = this.V.get(i);
        }
        return toReturn;
    }

    public Edge[] getEdges()
    {
        Edge[] toReturn = new Edge[this.E.size()];
        for (int i = 0; i < toReturn.length; i++)
        {
            toReturn[i] = this.E.get(i);
        }
        return toReturn;
    }

    public int getSizeV()
    {
        return this.V.size();
    }

    public int getSizeE()
    {
        return this.E.size();
    }

    public void addVertex(String name)
    {
        Vertex newV = new Vertex(name);
        this.V.add(newV);
    }

    public void addEdge(Vertex v1, Vertex v2, String name)
    {
        Edge newE = new Edge(name, false, v1, v2);
        this.E.add(newE);
    }

}
