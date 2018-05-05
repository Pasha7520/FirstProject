package Maps;

public class Team {
	private String name;
	private int games;
	private int victory;
	private int loss;
	private int draw;
	private int goals;
	private int missing;
	private int points;
		Team(){
			
		}
		
		Team(String name,int games,int victory,int loss,int draw,int goals,int missing,int point){
			this.name=name;
			this.games=games;
			this.victory=victory;
			this.loss=loss;
			this.draw=draw;
			this.goals=goals;
			this.missing=missing;
			this.points=point;
		}
		public void setGames(int games){
			this.games=games;
		}
		public void setVictory(int victory){
			this.victory=victory;
		}
		public void setLoss(int loss){
			this.loss=loss;
		}
		public void setDraw(int draw){
			this.draw=draw;
		}
		public void setGoals(int goals){
			this.goals=goals;
		}
		public void setMissing(int missing){
			this.missing=missing;
		}
		public void setPoint(int point){
			this.points=point;
		}
		public int qetGames(){
			return games;
		}
		public int qetVictory(){
			return victory;
		}
		public int qetLoss(){
			return loss;
		}
		public int qetDraw(){
			return draw;
		}
		public int qetGoals(){
			return goals;
		}
		public int qetMissing(){
			return missing;
		}
		public int qetPoint(){
			return points;
		}
public String toString(){
			return name+","+games+","+victory+","+loss+","+draw+","+goals+","+missing+","+points;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
