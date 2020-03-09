package com.albedo.combination_pattern;
//树叶节点
public class Leaf extends Corp{
    public Leaf(String name, String position, int salary) {
        super(name, position, salary);
    }

    public Leaf(String name, String position, int salary, int level, int id, int parentId) {
        super(name, position, salary, level, id, parentId);
    }
}
