package com.example.tetrixtest;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.Button;
import android.widget.RelativeLayout;

public class GameControl extends RelativeLayout implements OnClickListener, OnLongClickListener{

	BlockControl blockControl;
	Button btnLeft, btnRight, btnDown, btnRotate;
	
	
	public GameControl(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
		LayoutInflater inflater = LayoutInflater.from(context);
		inflater.inflate(R.layout.gamecontrol, this, true);
	}
	
	@Override
	protected void onFinishInflate() {
		super.onFinishInflate();
		blockControl = (BlockControl)findViewById(R.id.blockcontrol);
		
		btnLeft = (Button)findViewById(R.id.left);
		btnRight = (Button)findViewById(R.id.right);
		btnRight = (Button)findViewById(R.id.down);
		//btnRight = (Button)findViewById(R.id.rotate);
		
		btnLeft.setOnClickListener(this);
		btnRight.setOnClickListener(this);
		btnDown.setOnClickListener(this);
		//btnRotate.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(v.equals(btnLeft)) blockControl.moveLeft();
		if(v.equals(btnRight)) blockControl.moveRight();
		if(v.equals(btnDown)) blockControl.moveDown();
		if(v.equals(btnRotate)) blockControl.rotate();
	}

	@Override
	public boolean onLongClick(View v) {
		// TODO Auto-generated method stub
		return false;
	}

}
