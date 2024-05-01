package com.mvn.DependencyInjection;

public class Marks {
      private int Maths;
      private int English;
      private int Hindi;
      public Marks(int Maths, int English, int Hindi) {
    	  this.Maths=Maths;
    	  this.English=English;
    	  this.Hindi=Hindi;
      }
      

      public void setMaths(int Maths) {
          this.Maths = Maths;
      }
      public void setEnglish(int English) {
          this.English = English;
      }
      public void setHindi(int Hindi) {
          this.Hindi = Hindi;
      }
      public int getMaths() {
          return Maths;
      }

      public int getEnglish() {
          return English;
      }

     

      public int getHindi() {
          return Hindi;
      }

      
}
