package com.me.mygdxgame;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.EventListener;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class FinJuego extends Image {
	
		public FinJuego()
		{
			super(new Texture("Fin.png"));
			this.addListener((EventListener) new InputFin(this));
			
		}
	}


