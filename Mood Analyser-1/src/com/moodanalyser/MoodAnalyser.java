package com.moodanalyser;

public class MoodAnalyser {
	private String msg;

	public String analyseMood(String message) {
		if(message.contains("sad")){
			return "Sad";
		}
		return "Happy";
	}
	public MoodAnalyser() {
	}     
	public MoodAnalyser(String msg){
		this.msg = msg;
	}
	public String analyseMood() {
		if(msg.contains("sad")){
			return "Sad";
		}
		return "Happy";
	}
}