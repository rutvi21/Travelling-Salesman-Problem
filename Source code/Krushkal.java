 public class Krushkal{
     CreateGraph krugra=new CreateGraph();
     public final static int MAX = 20;
     int V = krugra.getNodes();
     
     
int parent[] = new int[V+1]; 
  
// Find set of vertex i 
int find(int i) 
{ 
    while (parent[i] != i) 
        i = parent[i]; 
    return i; 
} 
  
// Does union of i and j. It returns 
// false if i and j are already in same 
// set. 
void union1(int i, int j) 
{ 
    int a = find(i); 
    int b = find(j); 
    parent[a] = b; 
} 
  
// Finds MST using Kruskal's algorithm 
void kruskalMST(int cost[][]) 
{
   System.out.println("the total no of nodes "+V);
        // cost = new int[V][V];
    int mincost = 0; // Cost of min MST. 
  
    // Initialize sets of disjoint sets. 
    for (int i = 1; i <= V; i++) 
        parent[i] = i; 
  
    // Include minimum weight edges one by one 
    int edge_count = 0; 
    while (edge_count < V-1 ) { 
        int min = 2147483647, a = -1, b = -1; 
        for (int i = 1; i <= V; i++) { 
            for (int j = 1; j <=V; j++) { 
                if (find(i) != find(j) && cost[i][j] < min) { 
                    min = cost[i][j]; 
                    a = i; 
                    b = j; 
                }
           //     System.out.println("the minimum value is "+min);
            } 
        } 
  
        union1(a, b); 
        System.out.println( "Edge is"+ (edge_count++)  + " cost is " +a +"to "+ b+ " :"+ min); 
         System.out.println("the minimum cost is"+mincost);    
        mincost += min; 
    } 
    System.out.println("\n Minimum cost=  \n"+ mincost); 
} 
  
 }