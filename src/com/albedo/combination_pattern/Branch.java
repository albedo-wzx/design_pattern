package com.albedo.combination_pattern;

import java.util.ArrayList;
//树枝节点
public class Branch extends Corp{
    private ArrayList<Corp> suboridinateList=new ArrayList<>();

    public Branch(int id){
        super(id);
    }
    public Branch(String name, String position, int salary) {
        super(name, position, salary);
    }

    public Branch(String name, String position, int salary, int level, int id, int parentId) {
        super(name, position, salary, level, id, parentId);
    }

    //新增下属
    public void addSubordinate(Corp corp){
        this.suboridinateList.add(corp);
    }
    //获取下属
    public ArrayList<Corp> getSuboridinateList(){
        return this.suboridinateList;
    }

}
