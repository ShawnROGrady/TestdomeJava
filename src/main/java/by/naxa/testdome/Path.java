//  Created by Shawn O'Grady on 12/9/17.
//  Copyright © 2017 Shawn O'Grady. All rights reserved.
//
/*
 This code is a practice Java interview question from testdome.com
https://www.testdome.com/questions/java/path/12283?visibility=1&skillId=4
 
 Problem statement: Write a function that provides change directory (cd) function for an abstract file system.
   -additional notes:
       -root path is '/'
 `     -path separator is '/'
       -parent directory is addressable as ".."
       -directory names consist only of English alphabet letters (A-Z and a-z)
       -the function should support both realtive and absolute paths
       -the function will not be passed any invalid paths
       -do not use built-in path-related functions
 
 + Passes 4/4 tests
 */
package by.naxa.testdome;

import java.util.ArrayList;

public class Path {
    private String path;

    public Path(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    public void cd(String newPath) {
        int i=0;
        String[] newPathArray=newPath.split("/"); 
        String[] pathArray=this.path.split("/");
        int newPathLength=newPathArray.length;
        
        ArrayList pathList=new ArrayList(); //this cannot be an array, since it needs to have variable size
        for(int j=1; j<pathArray.length; j++){
        	pathList.add(pathArray[j]);
        }
        
        if(newPathArray[0].equals("")){
        	//absolute pathname
        	pathList.clear();
        	pathList.add(newPathArray[1]);
        	i=i+2;
        }
        
        while(i<newPathLength){
        	int k=pathList.size()-1;
        	if(newPathArray[i].equals("..")){
        		//parent directory
        		pathList.remove(k);
        	}
        	else{
        		//adding a child directory
        		pathList.add(newPathArray[i]);
        	}
        	i++;
        }
       
        StringBuilder updatedPath=new StringBuilder();
        for(int l=0; l<pathList.size(); l++){
        	updatedPath.append("/"+pathList.get(l));
        }
        
        //System.out.println(updatedPath);
        this.path=updatedPath.toString();
        
        
    }

    public static void main(String[] args) {
        Path path = new Path("/a/b/c/d");
        path.cd("x/../z");
        System.out.println(path.getPath());
    }
}
