package Maps;

import java.util.*;


public class Mean {
	
	
	public static void gamesHigh(Map<Integer,Team> m){
		List <Team> list = new ArrayList<Team>();
		Team t = new Team();
		
		for(Team test: m.values()){
			list.add(test);
		}
		for(int i=0;i < list.size();i++){
			for(int j=0;j <list.size()-1;j++){
		if(list.get(j).qetGames()<list.get(j+1).qetGames()){
			t = list.get(j+1);
			list.set(j+1, list.get(j));
			list.set(j, t);
	}
		}
		}
		for(Team test: list){
			System.out.println(test);
		}
		
	}
	public static void gamesLow(Map<Integer,Team> m){
		List <Team> list = new ArrayList<Team>();
		Team t = new Team();
		
		for(Team test: m.values()){
			list.add(test);
			//System.out.println(test);
		}
		for(int i=0;i < list.size();i++){
			for(int j=0;j < list.size()-1;j++){
		if(list.get(j).qetGames()>list.get(j+1).qetGames()){
			t = list.get(j+1);
			list.set(j+1, list.get(j));
			list.set(j, t);
	}
		}
		}
		for(Team test: list){
			System.out.println(test);
		}
		
	}
	public static void victoryHigh(Map<Integer,Team> m){
		
			List <Team> list = new ArrayList<Team>();
			Team t = new Team();
			
			for(Team test: m.values()){
				list.add(test);
				//System.out.println(test);
			}
			for(int i=0;i < list.size();i++){
				for(int j=0;j < list.size()-1;j++){
			if(list.get(j).qetVictory()<list.get(j+1).qetVictory()){
				t = list.get(j+1);
				list.set(j+1, list.get(j));
				list.set(j, t);
		}
			}
			}
			for(Team test: list){
				System.out.println(test);
			}
			
		}
	public static void victoryLow(Map<Integer,Team> m){
		
		List <Team> list = new ArrayList<Team>();
		Team t = new Team();
		
		for(Team test: m.values()){
			list.add(test);
			//System.out.println(test);
		}
		for(int i=0;i < list.size();i++){
			for(int j=0;j < list.size()-1;j++){
		if(list.get(j).qetVictory()>list.get(j+1).qetVictory()){
			t = list.get(j+1);
			list.set(j+1, list.get(j));
			list.set(j, t);
	}
		}
		}
		for(Team test: list){
			System.out.println(test);
		}
		
	}
	public static void lossHigh(Map<Integer,Team> m){
		
		List <Team> list = new ArrayList<Team>();
		Team t = new Team();
		
		for(Team test: m.values()){
			list.add(test);
			//System.out.println(test);
		}
		for(int i=0;i < list.size();i++){
			for(int j=0;j < list.size()-1;j++){
		if(list.get(j).qetLoss()<list.get(j+1).qetLoss()){
			t = list.get(j+1);
			list.set(j+1, list.get(j));
			list.set(j, t);
	}
		}
		}
		for(Team test: list){
			System.out.println(test);
		}
		
	}
	public static void lossLow(Map<Integer,Team> m){
		
		List <Team> list = new ArrayList<Team>();
		Team t = new Team();
		
		for(Team test: m.values()){
			list.add(test);
			//System.out.println(test);
		}
		for(int i=0;i < list.size();i++){
			for(int j=0;j < list.size()-1;j++){
		if(list.get(j).qetLoss()>list.get(j+1).qetLoss()){
			t = list.get(j+1);
			list.set(j+1, list.get(j));
			list.set(j, t);
	}
		}
		}
		for(Team test: list){
			System.out.println(test);
		}
		
	}
	public static void drawHigh(Map<Integer,Team> m){
		
		List <Team> list = new ArrayList<Team>();
		Team t = new Team();
		
		for(Team test: m.values()){
			list.add(test);
			//System.out.println(test);
		}
		for(int i=0;i < list.size();i++){
			for(int j=0;j < list.size()-1;j++){
		if(list.get(j).qetDraw()<list.get(j+1).qetDraw()){
			t = list.get(j+1);
			list.set(j+1, list.get(j));
			list.set(j, t);
	}
		}
		}
		for(Team test: list){
			System.out.println(test);
		}
		
	}
	public static void drawLow(Map<Integer,Team> m){
		
		List <Team> list = new ArrayList<Team>();
		Team t = new Team();
		
		for(Team test: m.values()){
			list.add(test);
			//System.out.println(test);
		}
		for(int i=0;i < list.size();i++){
			for(int j=0;j < list.size()-1;j++){
		if(list.get(j).qetDraw()>list.get(j+1).qetDraw()){
			t = list.get(j+1);
			list.set(j+1, list.get(j));
			list.set(j, t);
	}
		}
		}
		for(Team test: list){
			System.out.println(test);
		}
		
	}
	public static void goalsHigh(Map<Integer,Team> m){
		
		List <Team> list = new ArrayList<Team>();
		Team t = new Team();
		
		for(Team test: m.values()){
			list.add(test);
			//System.out.println(test);
		}
		for(int i=0;i < list.size();i++){
			for(int j=0;j < list.size()-1;j++){
		if(list.get(j).qetGoals()<list.get(j+1).qetGoals()){
			t = list.get(j+1);
			list.set(j+1, list.get(j));
			list.set(j, t);
	}
		}
		}
		for(Team test: list){
			System.out.println(test);
		}
		
	}
	public static void goalsLow(Map<Integer,Team> m){
		
		List <Team> list = new ArrayList<Team>();
		Team t = new Team();
		
		for(Team test: m.values()){
			list.add(test);
			//System.out.println(test);
		}
		for(int i=0;i < list.size();i++){
			for(int j=0;j < list.size()-1;j++){
		if(list.get(j).qetGoals()>list.get(j+1).qetGoals()){
			t = list.get(j+1);
			list.set(j+1, list.get(j));
			list.set(j, t);
	}
		}
		}
		for(Team test: list){
			System.out.println(test);
		}
		
	}
	public static void missingHigh(Map<Integer,Team> m){
		
		List <Team> list = new ArrayList<Team>();
		Team t = new Team();
		
		for(Team test: m.values()){
			list.add(test);
			//System.out.println(test);
		}
		for(int i=0;i < list.size();i++){
			for(int j=0;j < list.size()-1;j++){
		if(list.get(j).qetMissing()<list.get(j+1).qetMissing()){
			t = list.get(j+1);
			list.set(j+1, list.get(j));
			list.set(j, t);
	}
		}
		}
		for(Team test: list){
			System.out.println(test);
		}
		
	}
	public static void missingLow(Map<Integer,Team> m){
		
		List <Team> list = new ArrayList<Team>();
		Team t = new Team();
		
		for(Team test: m.values()){
			list.add(test);
			//System.out.println(test);
		}
		for(int i=0;i < list.size();i++){
			for(int j=0;j < list.size()-1;j++){
		if(list.get(j).qetMissing()>list.get(j+1).qetMissing()){
			t = list.get(j+1);
			list.set(j+1, list.get(j));
			list.set(j, t);
	}
		}
		}
		for(Team test: list){
			System.out.println(test);
		}
		
	}
	public static void pointHigh(Map<Integer,Team> m){
	
	List <Team> list = new ArrayList<Team>();
	Team t = new Team();
	
	for(Team test: m.values()){
		list.add(test);
		//System.out.println(test);
	}
	for(int i=0;i < list.size();i++){
		for(int j=0;j < list.size()-1;j++){
	if(list.get(j).qetPoint()<list.get(j+1).qetPoint()){
		t = list.get(j+1);
		list.set(j+1, list.get(j));
		list.set(j, t);
}
	}
	}
	for(Team test: list){
		System.out.println(test);
	}
	
}
	public static void pointLow(Map<Integer,Team> m){
	
	List <Team> list = new ArrayList<Team>();
	Team t = new Team();
	
	for(Team test: m.values()){
		list.add(test);
		//System.out.println(test);
	}
	for(int i=0;i < list.size();i++){
		for(int j=0;j < list.size()-1;j++){
	if(list.get(j).qetPoint()>list.get(j+1).qetPoint()){
		t = list.get(j+1);
		list.set(j+1, list.get(j));
		list.set(j, t);
}
	}
	}
	for(Team test: list){
		System.out.println(test);
	}
	
}
	}
		

