package com.me.mygdxgame;

import com.badlogic.gdx.scenes.scene2d.InputEvent;

public class InputFin extends PelotitaMala {

	 FinJuego f;
	 InputFin(FinJuego param)
	 {
		 super();
			f=param;
			}
		public boolean touchDown(InputEvent event, float x, float y, int pointer, int button)
		{
		f.setVisible(false);
			
			return true;
		} 
}
