package aula04;

public class xy {


        private double x;
        private double y;


        public double getY() {
            return y;
        }
    
        public double getX() {
            return x;
        }
    
    
        public xy(double x, double y) {
            this.x = x;
            this.y = y;
        }
    

        public String toString() {
            return "[x = " + x + ", y = " + y + "]";
        }
    
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            return true;
        }
    }
    
    

