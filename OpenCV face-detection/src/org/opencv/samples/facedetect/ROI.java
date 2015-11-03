package org.opencv.samples.facedetect;

import org.opencv.core.Mat;


public class ROI {
	public static double do_ROI(Mat roi) {
		
		 //Aquí empieza el calculo de la media del canal G
		double contador=0;
        double sumatorio=0;
        
        
       
       for(int r=0; r<roi.cols(); r++){
    	   for(int q=2; q<roi.rows(); q++){
    		   
    		  double[] m = roi.get(r, q);
    		  if(m!=null){
    		  sumatorio=sumatorio + m[1];   //m[1] se refiere al canal G 
    		  
    	      
    		  contador++;
    		  }
    	   }
       }
       double media=(sumatorio/contador);
       return media;
       
	}

}
