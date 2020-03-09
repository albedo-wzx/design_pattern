package com.albedo.combination_pattern;

import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class Client {

    public static String getTreeInfo(Branch root){
        ArrayList<Corp> corps=root.getSuboridinateList();
        String info="";
        return info;
    }

    public static void main(String[] args) {
        System.out.println(JSONObject.toJSONString(getCorpStructore()));

    }

    public static Branch getCorpStructore(){
        List<Branch> branches=getBranchs();
        //获取根节点
        Branch root=null;
        for (Branch b :branches) {
            if(b.getParentId()==0){
                root=b;
                branches.remove(b);
                break;
            }
        }
        Map<Integer,Branch> map=new HashMap<>();
        Set<Branch> firstBranch=new HashSet<>();
        for (Branch b:branches) {
            Branch tempbranch=map.get(b.getId());
            if(Objects.nonNull(tempbranch)){
                tempbranch.setLevel(b.getLevel());
                tempbranch.setName(b.getName());
                tempbranch.setParentId(b.getParentId());
                tempbranch.setSalary(b.getSalary());
                tempbranch.setPosition(b.getPosition());
                tempbranch.setIfLeaf(1);
            }else {
                tempbranch=b;
                map.put(b.getId(),tempbranch);
            }

            Branch parentBranches=map.get(b.getParentId());
            if(Objects.isNull(parentBranches)&&b.getLevel()>1){
                parentBranches=new Branch(b.getParentId());
                parentBranches.addSubordinate(tempbranch);
                map.put(b.getParentId(),parentBranches);
            }else {
                if(Objects.nonNull(parentBranches)){
                    parentBranches.addSubordinate(tempbranch);
                }
            }

            if(tempbranch.getLevel()==1){
                firstBranch.add(tempbranch);
            }
        }
        Iterator<Branch> iterator=firstBranch.iterator();
        while (iterator.hasNext()){
            root.addSubordinate(iterator.next());
        }
        return root;
    }

    public static List<Branch> getBranchs(){
        List<Branch> branchs=new ArrayList<>();
        //总经理
        Branch boss=new Branch("王大麻子","总经理",1000000,0,1,0);
        //开发组长
        Branch secondDevGroup=new Branch("吴大棒槌","开发二组组长",150000,2,5,13);
        Branch fristDevGroup=new Branch("杨三也斜","开发一组组长",150000,2,6,13);
        //3个部门经理
        Branch developDep=new Branch("刘大瘸子","研发部经理",500000,1,13,1);
        Branch financeDep=new Branch("赵三驼子","财务部经理",200000,1,15,1);
        Branch salesDep=new Branch("马二拐子","销售部经理",400000,1,24,1);


        //开发人员
        Branch aDev=new Branch("a","a开发人员",100000,3,7,5);
        Branch bDev=new Branch("b","b开发人员",100000,3,9,6);
        Branch cDev=new Branch("c","c开发人员",100000,3,8,6);
        Branch dDev=new Branch("d","d开发人员",100000,3,10,5);
        Branch eDev=new Branch("e","e开发人员",100000,2,11,13);
        //销售人员
        Branch fSalary=new Branch("f","f销售人员",60000,2,2,24);
        Branch gSalary=new Branch("g","g销售人员",60000,2,14,24);
        //财务人员
        Branch hFinance=new Branch("h","h财务人员",60000,2,3,15);
        Branch secretary=new Branch("张老六","CEO秘书",60000,1,4,1);
        Branch deputy=new Branch("张老七","研发部副经理",60000,1,16,1);
        branchs.add(aDev);
        branchs.add(fSalary);
        branchs.add(secondDevGroup);
        branchs.add(developDep);
        branchs.add(bDev);
        branchs.add(dDev);
        branchs.add(hFinance);
        branchs.add(gSalary);
        branchs.add(secretary);
        branchs.add(financeDep);
        branchs.add(eDev);
        branchs.add(boss);
        branchs.add(fristDevGroup);
        branchs.add(salesDep);
        branchs.add(deputy);
        branchs.add(cDev);

        return branchs;
    }
}
