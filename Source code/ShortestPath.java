

import java.util.*; 
import java.lang.*; 
import java.io.*; 

  class ShortestPath 
{  
      CreateGraph g3=new CreateGraph();
       int V = g3.getNodes();
   
    int minDistance(int dist[], Boolean sptSet[]) 
    {  int min = Integer.MAX_VALUE, min_index=-1; 
       for (int v = 0; v < (V+1); v++) 
            if (sptSet[v] == false && dist[v] <= min) 
            {   min = dist[v]; 
                min_index = v; 
            } 
       return min_index; 
    } 
   void printSolution(int dist[], int n) 
    { 
         
        System.out.println("Vertex   Distance from Source"); 
        for (int i = 1; i < (V+1); i++) 
            System.out.println(i+" \t "+dist[i]); 
    } 
   void dijkstra(int adj[][], int src) 
    { 
        int dist[] = new int[V+1];
        Boolean sptSet[] = new Boolean[V+1];  
        for (int i = 0; i < V+1; i++) 
        { 
            dist[i] = Integer.MAX_VALUE; 
            sptSet[i] = false; 
        } 
        dist[src] = 0; 
        for (int count = 0; count < V-1; count++) 
        {  
            int u = minDistance(dist, sptSet); 
            sptSet[u] = true; 
            for (int v = 0; v < (V+1); v++) 
                if (!sptSet[v] && adj[u][v]!=0 && 
                        dist[u] != Integer.MAX_VALUE && 
                        dist[u]+adj[u][v] < dist[v]) 
                    dist[v] = dist[u] + adj[u][v]; 
        } 
        printSolution(dist, V); 
    } 
    public static void main (String[] args) 
    {   Scanner input=new Scanner(System.in);
   /*     int tn;
        System.out.println("enter total no of nodes");
        tn=input.nextInt();  
       int graph[][] = new int[tn][tn];
       System.out.println("enter the input graph");
       for(int i=0;i<tn;i++){
          for(int j=0;j<tn;j++){
          graph[i][j]=input.nextInt();
          }
       }
       System.out.println("the graph given is printed as follows");
        System.out.println("Your graph is : ");
        
        for (int i = 0; i < tn; i++)
        {
            for (int j = 0; j < tn; j++)
            {
                System.out.print(graph[i][j]+"\t");
            }
             
            System.out.println();
        }
        Krushkal k2 = new Krushkal();
        k2.kruskalMST(graph);*/
               //{{0, 4, 0, 0, 0, 0, 0, 8, 0}, 
                                 // {4, 0, 8, 0, 0, 0, 0, 11, 0}, 
                                  //{0, 8, 0, 7, 0, 4, 0, 0, 2}, 
                                  //{0, 0, 7, 0, 9, 14, 0, 0, 0}, 
                                  //{0, 0, 0, 9, 0, 10, 0, 0, 0}, 
                                  //{0, 0, 4, 14, 10, 0, 2, 0, 0}, 
                                  //{0, 0, 0, 0, 0, 2, 0, 1, 6}, 
                                  //{8, 11, 0, 0, 0, 0, 1, 0, 7}, 
                                  //{0, 0, 2, 0, 0, 0, 6, 7, 0} 
                                 //}; 
                                 
      ShortestPath t = new ShortestPath(); 
       // t.dijkstra(graph, 0);*/ 
        int choice;
	int node,origin,destin,length;
        int method;
       
        System.out.println("Select method to implement the travelling salesman problem !! \n Enter \n 1. For Dijkstra Method \n 2. For Krushkal Method \n 3. For DFS and BFS Method");
        method=input.nextInt(); 
        if(method==1){
        CreateGraph g = new CreateGraph();
	    g.createGraph();
       
        
	while(true)
	{
		System.out.println("1.Insert a node\n");
		System.out.println("2.Insert an edge\n");
		System.out.println("3.Delete a node\n");
		System.out.println("4.Delete an edge\n");
		System.out.println("5.Dispaly\n");
		System.out.println("6.Exit\n");
		System.out.println("Enter your choice : ");
		choice=input.nextInt();

		switch(choice)
		{
		 case 1:
			g.insert_node();
			break;
		 case 2:
			System.out.println("Enter an edge to be inserted : ");
			System.out.println("enter the origin ");
                        origin=input.nextInt();
                        System.out.println("enter the destination");
                        destin=input.nextInt();
                        System.out.println("enter the length");
                        length=input.nextInt();
                         g.insert_edge(origin,destin,length);
			break;
		 case 3:
			System.out.println("Enter a node to be deleted : ");
			node=input.nextInt();
			g.delete_node(node);
			break;
		 case 4:
			System.out.println("Enter an edge to be deleted : ");
			System.out.println("enter the origin ");
                        origin=input.nextInt();
                        System.out.println("enter the destination");
                        destin=input.nextInt();
			g.del_edge(origin,destin);
			break;
		 case 5:
			g.display_dijkstra();
			break;
		 case 6: 
  
            break;
		 default:
			System.out.println("Wrong choice\n");
			break;
		 }/*End of switch*/
	}/*End of while*/
    }
        else if(method==2){
        CreateGraph gk = new CreateGraph();
	gk.createGraphKrushkal();
      //  KrushkalMST k = new KrushkalMST();
        while(true)
	{
		System.out.println("1.Insert a node\n");
		System.out.println("2.Insert an edge\n");
		System.out.println("3.Delete a node\n");
		System.out.println("4.Delete an edge\n");
		System.out.println("5.Dispaly\n");
		System.out.println("6.Exit\n");
		System.out.println("Enter your choice : ");
		choice=input.nextInt();

		switch(choice)
		{
		 case 1:
			gk.insert_node();
			break;
		 case 2:
			System.out.println("Enter an edge to be inserted : ");
			System.out.println("enter the origin ");
                        origin=input.nextInt();
                        System.out.println("enter the destination");
                        destin=input.nextInt();
                        System.out.println("enter the length");
                        length=input.nextInt();
                         gk.insert_edge(origin,destin,length);
			break;
		 case 3:
			System.out.println("Enter a node to be deleted : ");
			node=input.nextInt();
			gk.delete_node(node);
			break;
		 case 4:
			System.out.println("Enter an edge to be deleted : ");
			System.out.println("enter the origin ");
                        origin=input.nextInt();
                        System.out.println("enter the destination");
                        destin=input.nextInt();
			gk.del_edge(origin,destin);
			break;
		 case 5:
			gk.display_krushkal();
			break;
		 case 6: 
  
            break;
		 default:
			System.out.println("Wrong choice\n");
			break;
		 }/*End of switch*/
	}
        }  
    
    else{
            CreateGraph gd = new CreateGraph();
	        gd.createGraphDFS();
      //  KrushkalMST k = new KrushkalMST();
        while(true)
	{
		System.out.println("1.Insert a node\n");
		System.out.println("2.Insert an edge\n");
		System.out.println("3.Delete a node\n");
		System.out.println("4.Delete an edge\n");
		System.out.println("5.Dispaly\n");
		System.out.println("6.Exit\n");
		System.out.println("Enter your choice : ");
		choice=input.nextInt();

		switch(choice)
		{
		 case 1:
			gd.insert_node();
			break;
		 case 2:
			System.out.println("Enter an edge to be inserted : ");
			System.out.println("enter the origin ");
                        origin=input.nextInt();
                        System.out.println("enter the destination");
                        destin=input.nextInt();
                        System.out.println("enter the length");
                        length=input.nextInt();
                         gd.insert_edge(origin,destin,length);
			break;
		 case 3:
			System.out.println("Enter a node to be deleted : ");
			node=input.nextInt();
			gd.delete_node(node);
			break;
		 case 4:
			System.out.println("Enter an edge to be deleted : ");
			System.out.println("enter the origin ");
                        origin=input.nextInt();
                        System.out.println("enter the destination");
                        destin=input.nextInt();
			gd.del_edge(origin,destin);
			break;
		 case 5:
			gd.display_DFS();
			
			break;
		 case 6: 
  
            break;
		 default:
			System.out.println("Wrong choice\n");
			break;
		 }
        }    
  
  
            
            
            }
  }


  }