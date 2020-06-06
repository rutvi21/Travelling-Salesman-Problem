import java.util.Scanner;

public class CreateGraph {
	public final static int MAX = 20;
        public final static int[][] adj = new int[MAX][MAX];
        public static int n;
      
         static int E ;//for krushkal algorithm
        public final static Scanner input = new Scanner(System.in);      
  
public static void createGraph() // for dijkstra
        {
	       int maxEdges, origin, destin,length;
           System.out.print("Enter number of nodes : ");
	       n = input.nextInt();
		 
		   maxEdges = n * (n - 1); /* Taking directed graph */
           for(int i = 1; i <= maxEdges; i++) {
		   System.out.print("Enter edge " + i + " and ( 0 0 0 ) to quit : ");
           System.out.println("For that enter origin and destination");
           System.out.println("enter the length of this edge");
                    
                         E=i-1;
			origin = input.nextInt();
			destin = input.nextInt();
                        length = input.nextInt();
			if(origin == 0 && destin == 0) {
				break;
			}
			if(origin > n || destin > n || origin <= 0 || destin <= 0) {
				System.out.println("Invalid edge!");
				i--;
			} else {
                           
				adj[origin][destin] = length;
			}
		} /*End of for*/
             
        }

static void display_dijkstra()
{
    System.out.println("The adjacency matrix for given graph is");
          
        int i,j;
	
        for ( i = 1; i <= n; i++)
        {
            for ( j = 1; j <= n; j++)
            {
                System.out.print(adj[i][j]+"\t");
                
            }
           
            System.out.println();
        }
        
             ShortestPath t2 = new ShortestPath(); 
             t2.dijkstra(adj,1);
}

static void display_krushkal()
{
    System.out.println("The adjacency matrix for given graph is");
          
        int i,j;
	
        for ( i = 1; i <= n; i++)
        {
            for ( j = 1; j <= n; j++)
            {
                System.out.print(adj[i][j]+"\t");
                
            }
           
            System.out.println();
        }
        Krushkal krushkal=new Krushkal();
        krushkal.kruskalMST(adj);
}

static void display_DFS()
{
    System.out.println("The adjacency matrix for given graph is");
          
        int i,j;
	
        for ( i = 1; i <= n; i++)
        {
            for ( j = 1; j <= n; j++)
            {
                System.out.print(adj[i][j]+"\t");
                
            }
           
            System.out.println();
        }
        System.out.println("\nDFS for the above graph is:");
        DFS dfs = new DFS();
        dfs.dfs(adj, 1);
        System.out.println("\nBFS for the above graph is:");
        BFS bfs = new BFS();
        bfs.bfs(adj, 1);
        System.out.println("\n ");
}

            

static void insert_node()
{
	int i;
	n++;    /*Increase number of nodes in the graph*/
	System.out.println("The inserted node is  n"+n);
	for(i=1;i<=n;i++)
	{
		adj[i][n]=0;
		adj[n][i]=0;
	}
}

static void delete_node(int u)
{
	int i,j;
	if(n==0)
	{
		System.out.println("Graph is empty\n");
		return;
	}
	if( u>n )
	{
		System.out.println("This node is not present in the graph\n");
		return;
	}
	for(i=u;i<=n-1;i++)
	   for(j=1;j<=n;j++)
	   {
		adj[j][i]=adj[j][i+1];  /* Shift columns left */
		adj[i][j]=adj[i+1][j];  /* Shift rows up */
	   }
	n--; /*Decrease the number of nodes in the graph */
}
       
        //End of delete_node
static void insert_edge(int u,int v,int w)
{
	if(u > n)
	{
		System.out.println("Source node does not exist\n");
		return;
	}
	if(v > n)
	{
		System.out.println("Destination node does not exist\n");
		return;
	}
	adj[u][v]=w;
}/*End of insert_edge()*/
       // End of insert_node
static void del_edge(int u,int v)
{
     if(u>n || v>n || adj[u][v]==0)
     {
	System.out.println("This edge does not exist\n");
	return;
     }
     adj[u][v]=0;
}/*End of del_edge()*/
       // End of del_edge
public  int  getNodes(){
               
           return n;
 }  
  
public static void createGraphKrushkal()  //for creating krushkal graph
{
	       int maxEdges, origin, destin,length;
               System.out.print("Enter number of nodes : ");
	       n = input.nextInt();
               for(int i=1;i<=n;i++)
             {
                 for(int j =1;j<=n;j++)
                   {
                   adj[i][j]= 2147483647;
                   }
             }
		 
		maxEdges = n * (n - 1); /* Taking directed graph */
        for(int i = 1; i <= maxEdges; i++) {
	    System.out.print("Enter edge " + i + " and ( 0 0 0) to quit : ");
        System.out.println("For that enter origin and destination");
        System.out.println("Enter the length of this edge");
                    
        E=i-1;
	        origin = input.nextInt();
			destin = input.nextInt();
            length = input.nextInt();
            
			if(origin == 0 && destin == 0) {
                           
				break;
			}
			if(origin > n || destin > n || origin <= 0 || destin <= 0) {
				System.out.println("Invalid edge!");
				i--;
			} else {
                           
				adj[origin][destin] = length;
			
                                   }
		} /*End of for*/
              
              
        }

  public static void createGraphDFS() {
	       int maxEdges, origin, destin,length;
               System.out.print("Enter number of nodes : ");
	      
               n = input.nextInt();
               maxEdges = n * (n - 1); /* Taking directed graph */
               
               for(int i = 1; i <= maxEdges; i++) {
			            System.out.print("Enter edge " + i + "and ( 0 0 ) to quit : ");
                        System.out.println("For that enter origin and destination");
                       // System.out.println("enter the length of this edge");
                    
                         E=i-1;
			origin = input.nextInt();
			destin = input.nextInt();
                       // length = input.nextInt();
			if(origin == 0 && destin == 0) {
                           
				break;
			}
			if(origin > n || destin > n || origin <= 0 || destin <= 0) {
				System.out.println("Invalid edge!");
				i--;
			} else {
                           
				adj[origin][destin] = 1;
			
                                   }
		} /*End of for*/
              
              
        }
}