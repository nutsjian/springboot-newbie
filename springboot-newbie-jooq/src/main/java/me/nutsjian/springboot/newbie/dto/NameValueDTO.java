package me.nutsjian.springboot.newbie.dto;

public class NameValueDTO<N, V> {
    private N name;
    private V value;

    public NameValueDTO(N name, V value) {
        this.name = name;
        this.value = value;
    }

    public N getName() {
        return name;
    }

    public void setName(N name) {
        this.name = name;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}
