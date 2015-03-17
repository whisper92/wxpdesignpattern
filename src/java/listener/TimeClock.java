package com.wxp.dp.listener;
/*回调接口实现事件的监听*/
public class TimeClock
{
	OnTimeChangedListener onTimeChangeListemer;
	public interface OnTimeChangedListener{
		public void onTimeChange();
	}
	
	public void setOnTimeChangedListener(OnTimeChangedListener listener){
		this.onTimeChangeListemer=listener;
	}
	public void changeTime(){
		onTimeChangeListemer.onTimeChange();
	}
}
