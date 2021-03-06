package com.athudong.video;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;

public class MainActivityPK implements OnClickListener{

	private MainActivity act;
	
	private View root;
	
	public MainActivityPK(MainActivity act , View root){
		this.act = act;
		this.root = root;
		
		root.findViewById(R.id.realTopBtn01).setOnClickListener(this);
		root.findViewById(R.id.realTopBtn02).setOnClickListener(this);
		root.findViewById(R.id.realTopBtn03).setOnClickListener(this);
		root.findViewById(R.id.realTopBtn04).setOnClickListener(this);


		root.findViewById(R.id.realBottomBtn01).setOnClickListener(this);
		root.findViewById(R.id.realBottomBtn02).setOnClickListener(this);
		root.findViewById(R.id.realBottomBtn03).setOnClickListener(this);
		root.findViewById(R.id.realBottomBtn04).setOnClickListener(this);

		root.findViewById(R.id.leftThumbLayout).setOnClickListener(this);
		root.findViewById(R.id.rightThumbLayout).setOnClickListener(this);

		root.findViewById(R.id.start_thumb_btn).setOnClickListener(this);
		
		reset();
	}

	
	public void reset(){

		root.findViewById(R.id.realTopBtn01).setVisibility(View.INVISIBLE);
		root.findViewById(R.id.realTopBtn02).setVisibility(View.INVISIBLE);
		root.findViewById(R.id.realTopBtn03).setVisibility(View.INVISIBLE);
		root.findViewById(R.id.realTopBtn04).setVisibility(View.INVISIBLE);

		root.findViewById(R.id.realBottomBtn01).setVisibility(View.INVISIBLE);
		root.findViewById(R.id.realBottomBtn02).setVisibility(View.INVISIBLE);
		root.findViewById(R.id.realBottomBtn03).setVisibility(View.INVISIBLE);
		root.findViewById(R.id.realBottomBtn04).setVisibility(View.INVISIBLE);
		
		root.findViewById(R.id.leftThumbLayout).setVisibility(View.INVISIBLE);
		root.findViewById(R.id.rightThumbLayout).setVisibility(View.INVISIBLE);
	}
	
	@Override
	public void onClick(View v) {
		int id = v.getId();
		if (id == R.id.start_thumb_btn) {
			View left = act.findViewById(R.id.rightThumbLayout);
			View right = act.findViewById(R.id.leftThumbLayout);
			if (left.getVisibility() == View.INVISIBLE) {
				thumbAnimShow(left, 2.0f);
			}
			if (right.getVisibility() == View.INVISIBLE) {
				thumbAnimShow(right, -2.0f);
			}
		}else{
			act.toast(v.getId()+"");
		}
	}

	private void thumbAnimShow(View view, float fromX){
		Animation anim = new TranslateAnimation(Animation.RELATIVE_TO_SELF, fromX, Animation.RELATIVE_TO_SELF, 0.0f, Animation.RELATIVE_TO_SELF, 0.0f, Animation.RELATIVE_TO_SELF, 0.0f);
		anim.setDuration(250);
		view.setAnimation(anim);
		view.setVisibility(View.VISIBLE);
	}
	
}
