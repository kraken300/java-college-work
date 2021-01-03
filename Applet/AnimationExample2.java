import java.applet.*;
import java.awt.*;

public class AnimationExample2 extends Applet{
	Image picture1;
	Image picture2;
	Image picture3;
	Image picture4;
	//Image picture5;
	
	public void init(){
		picture1 = getImage(getDocumentBase(),"NewMan1.jfif");
		picture2 = getImage(getDocumentBase(),"NewMan2.jfif");
		picture3 = getImage(getDocumentBase(),"NewMan3.jfif");
		picture4 = getImage(getDocumentBase(),"NewMan4.jfifs");
		//picture5 = getImage(getDocumentBase(),"Man5.png");
	}
	
	public void paint(Graphics g){
		for(int i = 0; i <= 500;i=i+30){
			g.drawImage(picture1,i,0,this);
			try{
				Thread.sleep(100);
				
				for(int j = i; j <= i;j++){
				g.drawImage(picture2,j,0,this);
				try{
					Thread.sleep(100);
					}
				catch(Exception e){
					
					}	
				}
				
				for(int k = i; k <= i;k++){
				g.drawImage(picture3,k,0,this);
				try{
					Thread.sleep(100);
					}
				catch(Exception e){
					
					}	
				}
				
				for(int x = i; x <= i;x++){
				g.drawImage(picture4,x,0,this);
				try{
					Thread.sleep(100);
					}
				catch(Exception e){
					
					}	
				}
				
				// for(int y = i; y <= i;y++){
				// g.drawImage(picture5,y,0,this);
				// try{
					// Thread.sleep(100);
					// }
				// catch(Exception e){
					
					// }	
				// }
				
			}
			catch(Exception e){
		
			}
			
		}
	}
	
	
}