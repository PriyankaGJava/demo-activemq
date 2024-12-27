package com.example.demoactivemq.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class QueueMessage {
    private String name;
    private List<Item> itemList;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Item> getItemList() {
		return itemList;
	}
	public void setItemList(List<Item> itemList) {
		this.itemList = itemList;
	}
}
