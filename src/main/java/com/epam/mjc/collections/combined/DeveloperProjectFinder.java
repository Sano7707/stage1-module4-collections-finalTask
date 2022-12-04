package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        Set<String> set = new HashSet<>();
        List<String> list = new ArrayList<>();
        for (String s: projects.keySet()) {
            if(projects.get(s).contains(developer)){
                list.add(s);
            }
        }

         list.sort(new Comparator());
        return list;
    }

}

class Comparator implements java.util.Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        if(o1.length() > o2.length()){
            return -1;
        }
        else if(o1.length() < o2.length()){
            return 1;
        }
        else {
            if(o1.compareTo(o2) >0){
                return -1;
            }
            else if(o1.compareTo(o2) <0)
                return 1;
        }
        return 0;
    }
}
