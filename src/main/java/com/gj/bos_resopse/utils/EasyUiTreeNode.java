package com.gj.bos_resopse.utils;

/**
 * @Author: GJ
 * @CreateDate: 2018/6/19 17:27
 * @Description: EasyUiTreeNode
 * <p>
 * [{
 * "id": 1,
 * "text": "Node 1",
 * "state": "closed"
 * },{
 * @UpdateDate: 2018/6/19 17:27
 * @UpdateRemark: 跟新备注
 * @Version: 1.0
 */
public class EasyUiTreeNode {
    private Long id;
    private String text;
    private String state;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
