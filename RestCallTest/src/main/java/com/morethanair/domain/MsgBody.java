package com.morethanair.domain;

import java.util.List;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MsgBody {
	@SerializedName("itemList")
	List<Detail> detail;
}
