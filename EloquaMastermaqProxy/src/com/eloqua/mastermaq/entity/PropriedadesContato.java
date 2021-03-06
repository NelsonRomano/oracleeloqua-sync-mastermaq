package com.eloqua.mastermaq.entity;

import java.util.List;

public class PropriedadesContato {
    private List<ContatoEloqua> elements;
    private int page;
    private int pageSize;
    private int total;
    private String type;
    
    public List<ContatoEloqua> getElements() {
        return elements;
    }
    
    public void setElements(List<ContatoEloqua> elements) {
        this.elements = elements;
    }
    
    public int getPage() {
        return page;
    }
    
    public void setPage(int page) {
        this.page = page;
    }
    
    public int getPageSize() {
        return pageSize;
    }
    
    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
    
    public int getTotal() {
        return total;
    }
    
    public void setTotal(int total) {
        this.total = total;
    }
    
    public String getType() {
        return type;
    }
    
    public void setType(String type) {
        this.type = type;
    }    
    
}