class Solution 
{

public void MAKE_SET(int[] parent,int[] rank,int n)
{
for(int i=0;i<n;i++)
{
parent[i] = i;
rank[i]   = 0;
}
return;
}
public int FIND_SET(int x,int[] parent)
{
if(x != parent[x])
{
parent[x] = FIND_SET(parent[x],parent);
}
return parent[x];
}
public boolean UNION(int x,int y,int[] parent,int[] rank)
{
//This function returns false on redudanct connection,otherwise returns true

x = FIND_SET(x,parent);
y = FIND_SET(y,parent);
if(x == y)return false;
if(rank[x] > rank[y])
{
parent[y] = x;
}
else
{
parent[x] = y;
}
if(rank[x] == rank[y])
{
++rank[y];
}
return true;
}
public int makeConnected(int n, int[][] connections) 
{
int[] parent = new int[n];
int[] rank   = new int[n];
MAKE_SET(parent,rank,n);
int i;
int redundant_connections = 0,connected_components = 0;
for(i=0;i<connections.length;i++)
{
int u = connections[i][0];
int v = connections[i][1];
if(UNION(u,v,parent,rank) == false)
{
++redundant_connections;
}
}

//Calculate the number of connected_components
for(i=0;i<n;i++)
{
connected_components += (i == parent[i])? 1 : 0;
}
return (redundant_connections >= connected_components-1)? connected_components-1 : -1;
}
}