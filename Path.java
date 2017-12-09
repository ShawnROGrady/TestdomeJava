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
 
 */
public class Path {
    private String path;

    public Path(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    public void cd(String newPath) {
        //int i=0;
        String[] newPathArray=newPath.split("/");
        int newPathLength=newPathArray.length;
        for(int i=0; i< newPathLength; i++){
        	System.out.println(newPathArray[i]);
        }
        
    }

    public static void main(String[] args) {
        Path path = new Path("/a/b/c/d");
        path.cd("/y/../x");
        System.out.println(path.getPath());
    }
}
