package android.game.menu;

import android.view.Menu;

public class GenericMenu {

	Menu mMenu;
	
	public GenericMenu(Menu menu) {
		mMenu = menu;
	}

	public void populate() {
		mMenu.add("�����������");
		mMenu.add("������");
		mMenu.add("� ����");
	}

}
