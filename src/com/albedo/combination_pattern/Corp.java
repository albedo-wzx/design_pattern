package com.albedo.combination_pattern;

/**
 * 员工类
 */
public class Corp {
    //员工姓名
    private String name;
    //员工职位
    private String position;
    //员工薪水
    private int salary;
    //级别
    private int level;
    //员工id
    private int id;
    //员工上级id
    private int parentId;
    //是否是叶子节点
    private int ifLeaf;

    public Corp(int id){
        this.id=id;
    }

    public Corp(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    //无限扩充下级构造函数
    public Corp(String name, String position, int salary, int level, int id, int parentId) {
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.level = level;
        this.id = id;
        this.parentId = parentId;
    }
    //定义叶子节点构造函数
    public Corp(String name, String position, int salary, int level, int id, int parentId, int ifLeaf) {
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.level = level;
        this.id = id;
        this.parentId = parentId;
        this.ifLeaf = ifLeaf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public int getIfLeaf() {
        return ifLeaf;
    }

    public void setIfLeaf(int ifLeaf) {
        this.ifLeaf = ifLeaf;
    }

    //获得员工信息
    public String genInfo() {
        StringBuffer info = new StringBuffer("姓名：" + this.name);
        info.append("\t职位：" + this.position).append("\t薪水" + this.salary);
        return info.toString();
    }
}
