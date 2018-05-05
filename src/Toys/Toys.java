package Toys;

import java.util.Comparator;

public class Toys implements Comparable<Toys>, Comparator<Toys> {
	private Doll doll;
	private Ball ball;
	private Cubes cubes;
	private Designer designer;
	private String toy;
			
			Toys(){
				
			}
		public void setDoll(Doll doll){
			this.doll=doll;
			this.toy = "doll";
		}
		public void setBall(Ball ball){
			this.ball=ball;
			this.toy = "ball";
		}
		public void setCubes(Cubes cubes){
			this.cubes=cubes;
			this.toy = "cubes";
		}
		public void setDesigner(Designer designer){
			this.designer=designer;
			this.toy = "designer";
		}
		public Doll getDoll(){
			return doll;
		}
		public Ball getBall(){
			return ball;
		}
		public Cubes getCubes(){
			return cubes;
		}
		public Designer getDesigner(){
			return designer;
		}
		public String getStringToy(){
			return toy;
		}
		@Override
		public int compareTo(Toys t2) {
			if(this.toy.equals("doll") && t2.getStringToy().equals("doll")){
				return this.doll.getPrice()-t2.getDoll().getPrice();
			}
			if(this.toy.equals("doll") && t2.getStringToy().equals("ball")){
				return this.doll.getPrice()-t2.getBall().getPrice();
			}
			if(this.toy.equals("doll") && t2.getStringToy().equals("cubes")){
				return this.doll.getPrice()-t2.getCubes().getPrice();
			}
			if(this.toy.equals("doll") && t2.getStringToy().equals("designer")){
				return this.doll.getPrice()- t2.getDesigner().getPrice();
			}
			if(this.toy.equals("ball") && t2.getStringToy().equals("doll")){
				return this.ball.getPrice()-t2.getDoll().getPrice();
			}
			if(this.toy.equals("ball") && t2.getStringToy().equals("ball")){
				return this.ball.getPrice()-t2.getBall().getPrice();
			}
			if(this.toy.equals("ball") && t2.getStringToy().equals("cubes")){
				return this.ball.getPrice() - t2.getCubes().getPrice();
			}
			if(this.toy.equals("ball") && t2.getStringToy().equals("designer")){
				return this.ball.getPrice() - t2.getDesigner().getPrice();
			}
			if(this.toy.equals("cubes") && t2.getStringToy().equals("doll")){
				return this.cubes.getPrice()-t2.getDoll().getPrice();
			}
			if(this.toy.equals("cubes") && t2.getStringToy().equals("ball")){
				return this.cubes.getPrice()-t2.getBall().getPrice();
			}
			if(this.toy.equals("cubes") && t2.getStringToy().equals("cubes")){
				return this.cubes.getPrice()-t2.getCubes().getPrice();
			}
			if(this.toy.equals("cubes") && t2.getStringToy().equals("designer")){
				return this.cubes.getPrice()- t2.getDesigner().getPrice();
			}
			if(this.toy.equals("designer") && t2.getStringToy().equals("doll")){
				return this.designer.getPrice()-t2.getDoll().getPrice();
			}
			if(this.toy.equals("designer") && t2.getStringToy().equals("ball")){
				return this.designer.getPrice()-t2.getBall().getPrice();
			}
			if(this.toy.equals("designer") && t2.getStringToy().equals("cubes")){
				return this.designer.getPrice()-t2.getCubes().getPrice();
			}
			else{
				return this.designer.getPrice()- t2.getDesigner().getPrice();
			}
		}
		public int compareToReverse(Toys t2) {
			if(this.toy.equals("doll") && t2.getStringToy().equals("doll")){
				return t2.getDoll().getPrice() -this.doll.getPrice();
			}
			if(this.toy.equals("doll") && t2.getStringToy().equals("ball")){
				return t2.getBall().getPrice()-this.doll.getPrice();
			}
			if(this.toy.equals("doll") && t2.getStringToy().equals("cubes")){
				return t2.getCubes().getPrice()-this.doll.getPrice();
			}
			if(this.toy.equals("doll") && t2.getStringToy().equals("designer")){
				return t2.getDesigner().getPrice()-this.doll.getPrice();
			}
			if(this.toy.equals("ball") && t2.getStringToy().equals("doll")){
				return t2.getDoll().getPrice()-this.ball.getPrice();
			}
			if(this.toy.equals("ball") && t2.getStringToy().equals("ball")){
				return t2.getBall().getPrice()-this.ball.getPrice();
			}
			if(this.toy.equals("ball") && t2.getStringToy().equals("cubes")){
				return t2.getCubes().getPrice()-this.ball.getPrice();
			}
			if(this.toy.equals("ball") && t2.getStringToy().equals("designer")){
				return t2.getDesigner().getPrice()-this.ball.getPrice();
			}
			if(this.toy.equals("cubes") && t2.getStringToy().equals("doll")){
				return t2.getDoll().getPrice()-this.cubes.getPrice();
			}
			if(this.toy.equals("cubes") && t2.getStringToy().equals("ball")){
				return t2.getBall().getPrice()-this.cubes.getPrice();
			}
			if(this.toy.equals("cubes") && t2.getStringToy().equals("cubes")){
				return t2.getCubes().getPrice()-this.cubes.getPrice();
			}
			if(this.toy.equals("cubes") && t2.getStringToy().equals("designer")){
				return t2.getDesigner().getPrice()-this.cubes.getPrice();
			}
			if(this.toy.equals("designer") && t2.getStringToy().equals("doll")){
				return t2.getDoll().getPrice()-this.designer.getPrice();
			}
			if(this.toy.equals("designer") && t2.getStringToy().equals("ball")){
				return t2.getBall().getPrice()-this.designer.getPrice();
			}
			if(this.toy.equals("designer") && t2.getStringToy().equals("cubes")){
				return t2.getCubes().getPrice()-this.designer.getPrice();
			}
			else{
				return t2.getDesigner().getPrice()-this.designer.getPrice();
			}
		}
		@Override
		public int compare(Toys t1, Toys t2) {
			if(t1.getStringToy().equals("doll") && t2.getStringToy().equals("doll")){
				return t1.getDoll().getPrice()-t2.getDoll().getPrice();
			}
			if(t1.getStringToy().equals("doll") && t2.getStringToy().equals("ball")){
				return t1.getDoll().getPrice()-t2.getBall().getPrice();
			}
			if(t1.getStringToy().equals("doll") && t2.getStringToy().equals("cubes")){
				return t1.getDoll().getPrice()-t2.getCubes().getPrice();
			}
			if(t1.getStringToy().equals("doll") && t2.getStringToy().equals("designer")){
				return t1.getDoll().getPrice()- t2.getDesigner().getPrice();
			}
			if(t1.getStringToy().equals("ball") && t2.getStringToy().equals("doll")){
				return t1.getBall().getPrice()-t2.getDoll().getPrice();
			}
			if(t1.getStringToy().equals("ball") && t2.getStringToy().equals("ball")){
				return t1.getBall().getPrice()-t2.getBall().getPrice();
			}
			if(t1.getStringToy().equals("ball") && t2.getStringToy().equals("cubes")){
				return t1.getBall().getPrice() - t2.getCubes().getPrice();
			}
			if(t1.getStringToy().equals("ball") && t2.getStringToy().equals("designer")){
				return t1.getBall().getPrice() - t2.getDesigner().getPrice();
			}
			if(t1.getStringToy().equals("cubes") && t2.getStringToy().equals("doll")){
				return t1.getCubes().getPrice()-t2.getDoll().getPrice();
			}
			if(t1.getStringToy().equals("cubes") && t2.getStringToy().equals("ball")){
				return t1.getCubes().getPrice()-t2.getBall().getPrice();
			}
			if(t1.getStringToy().equals("cubes") && t2.getStringToy().equals("cubes")){
				return t1.getCubes().getPrice()-t2.getCubes().getPrice();
			}
			if(t1.getStringToy().equals("cubes") && t2.getStringToy().equals("designer")){
				return t1.getCubes().getPrice()- t2.getDesigner().getPrice();
			}
			if(t1.getStringToy().equals("designer") && t2.getStringToy().equals("doll")){
				return t1.getDesigner().getPrice()-t2.getDoll().getPrice();
			}
			if(t1.getStringToy().equals("designer") && t2.getStringToy().equals("ball")){
				return t1.getDesigner().getPrice()-t2.getBall().getPrice();
			}
			if(t1.getStringToy().equals("designer") && t2.getStringToy().equals("cubes")){
				return t1.getDesigner().getPrice()-t2.getCubes().getPrice();
			}
			else{
				return t1.getDesigner().getPrice()- t2.getDesigner().getPrice();
			}
		}
		
}	
