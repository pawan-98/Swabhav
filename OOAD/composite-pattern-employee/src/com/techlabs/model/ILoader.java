package com.techlabs.model;

import java.net.MalformedURLException;
import java.util.List;

public interface ILoader {
	public List<String> getData() throws MalformedURLException;
}
