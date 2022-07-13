package com.ruoyi.yblog.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tree {
    private String label;
    private Integer id;
    private List<Tree> children;
    private Integer pid;

    public static void dealWithTree(List<Tree> dataList, List<Tree> treeList, Integer pid) {
        for (Tree tree : dataList) {
            if (tree.getPid().equals(pid)) {
                treeList.add(tree);
                if (tree.children == null) {
                    tree.children = new ArrayList<>();
                }
                dealWithTree(dataList, tree.getChildren(), tree.getId());
            }
        }
    }
}

