package sw;

import java.util.Stack;

public class DFS {
	public static void main(String[] args) {
		
		int [][]lineList = {{},{4,3},{3,5},{1,2},{1,6},{2},{4}};
		Stack<Integer> stack = new Stack<Integer>();
		boolean[] visited = new boolean[7];
		int result = dfs(lineList,stack,visited,1,6);
		System.out.printf("result : %d",result);
	}
	public static int dfs(int[][] numList, Stack<Integer> stack, boolean[]  visited, int s, int g) {
		if(s==g) return 1;
		visited[s] = true;
		do {
			int next = check(numList[s],visited);
			if(next!=0) stack.push(s);
			while(next!=0) {
				System.out.println(next);
				if (next==g) return 1;
				visited[next] = true;
				stack.push(next);
				s = next;
				next = check(numList[next],visited);
			}
			if(!stack.isEmpty()) s=stack.pop();
		}while(!stack.isEmpty());
		return 0;
	}
	
	public static int check(int[] list, boolean[] visited) {
		for(int i=0; i<list.length; i++) {
			if(!visited[list[i]]) return list[i]; 
		}
		return 0;
	}
	
	/*
	visited = {False}*7
	stack ={}
	def DFS(visited,s,g):
	    if s == g : return 1
	    visited{s} = True
	    while(s):
	        w= check(visited, lineList{s})
	        if w:
	            stack.append(s)
	        while(w):
	            if w == g : return 1
	            visited{w} = True
	            stack.append(w)
	            s= w
	            w = check(visited,list{s})
	        s = stack.pop()
	    return 0


	def check(visited, list):
	    for i in range(len(list)):
	        if visited{i} == False:
	            return list{i}
	    return

	DFS(visited,1,6)
*/

}
