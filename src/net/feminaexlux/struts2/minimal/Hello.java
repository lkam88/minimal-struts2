package net.feminaexlux.struts2.minimal;

import org.apache.struts2.dispatcher.DefaultActionSupport;

public class Hello extends DefaultActionSupport {
	@Override
	public String execute() throws Exception {
		return SUCCESS;
	}
}
