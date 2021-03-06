package com.example.bootdemo.bean;

import java.util.List;

public class Tree {
    private String tree_id;
    private String parent_id;
    private String title;
    private String url;
    private String isparent;

    public Tree() {
    }

    private List<Tree> ChildTrees;

    public Tree(String tree_id, String parent_id, String title, String url, String isparent, List<Tree> childTrees) {
        this.tree_id = tree_id;
        this.parent_id = parent_id;
        this.title = title;
        this.url = url;
        this.isparent = isparent;
        ChildTrees = childTrees;
    }

    public String getIsparent() {
        return isparent;
    }

    public void setIsparent(String isparent) {
        this.isparent = isparent;
    }

    public List<Tree> getChildTrees() {
        return ChildTrees;
    }

    public void setChildTrees(List<Tree> childTrees) {
        ChildTrees = childTrees;
    }

    public String getTree_id() {
        return tree_id;
    }

    public void setTree_id(String tree_id) {
        this.tree_id = tree_id;
    }

    public String getParent_id() {
        return parent_id;
    }

    public void setParent_id(String parent_id) {
        this.parent_id = parent_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
