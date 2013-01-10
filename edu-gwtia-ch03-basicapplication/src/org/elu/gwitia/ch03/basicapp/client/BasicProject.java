package org.elu.gwitia.ch03.basicapp.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Event;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.FocusPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TabLayoutPanel;

public class BasicProject implements EntryPoint {

	/**
	 * The filename of our logo image
	 */
	private static final String LOGO_IMAGE_NAME = "gwtia.png";

	/**
	 * This TabLayoutPanel will hold the application's 3 "pages" of content.
	 */
	TabLayoutPanel content;

	/**
	 * This button will wrap the existing HTML button defined in the HTML page
	 * and is used for the dummy search capability.
	 */
	Button search;

	/**
	 * This panel sits on the right hand side of the page to allow user
	 * feedback. It will slide in when the mouse is over it and slides back out
	 * again if the mouse moves off it.
	 */
	FocusPanel feedback;

	/**
	 * The image logo.
	 */
	Image logo;

	@Override
	public void onModuleLoad() {
		setUpGui();
		startHistoryHandling();
		setUpEventHandling();
	}

	private void setUpEventHandling() {
		// TODO Auto-generated method stub

	}

	private void startHistoryHandling() {
		// TODO Auto-generated method stub

	}

	private void setUpGui() {
		buildTabContent();
		wrapExistingSearchButton();
		insertLogo();
		createFeedbackTab();
		styleTabPanelUsingUIObject();
		styleButtonUsingDOM();
		RootPanel.get().add(feedback);
		RootPanel logoSlot = RootPanel.get("logo");
		if (logoSlot != null)
			logoSlot.add(logo);
		RootPanel contentSlot = RootPanel.get("content");
		if (contentSlot != null)
			contentSlot.add(content);
	}

	private void styleButtonUsingDOM() {
		// TODO Auto-generated method stub

	}

	private void styleTabPanelUsingUIObject() {
		// TODO Auto-generated method stub

	}

	private void createFeedbackTab() {
		// TODO Auto-generated method stub

	}

	private void insertLogo() {
		// Create the logo image and prevent being able to drag it to browser
		// location bar by overriding its onBrowserEvent method.
		logo = new Image(GWT.getModuleBaseURL() + "../" + LOGO_IMAGE_NAME) {
			public void onBrowserEvent(Event evt) {
				// Comment out the next line to be able to drag logo to the
				// browser location
				// bar; leave it in to prevent the default browser action.
				evt.preventDefault();

				// Play nice with the event system by bubbling the event upwards
				super.onBrowserEvent(evt);
			}
		};
	}

	private void wrapExistingSearchButton() {
		// TODO Auto-generated method stub

	}

	private void buildTabContent() {
		// TODO Auto-generated method stub

	}
}
