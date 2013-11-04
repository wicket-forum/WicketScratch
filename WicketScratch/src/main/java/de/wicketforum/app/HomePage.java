package de.wicketforum.app;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;

public class HomePage extends WebPage {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1337853758160866119L;
	
	@Override
	protected void onInitialize() {
		super.onInitialize();
		
		add(new Label("helloWicket", "HelloWicketWorld"));
	}

}
