public class X {
    int i,j;

    public X(){
        int i,j;
    }
    public X(int i,int j){
    this.i=i;
    this.j=j;
}
public final int sum(int i, int j){
        int sum=i+j;
        return sum;
    }
    class y extends X {
        public y() {
            int i, j;
        }

        public y(int i, int j) {
            this.i = i;
            this.j = j;
        }

        public final int product(int i, int j) {
            int prod = i * j;
            return prod;
        }
    }
        class z extends y{
            int i,j;
            public z(int i,int j){
                this.i=i;
                this.j=j;
            }
            public final int diff(int i,int j){
                int diff=i-j;
                return diff;
            }

        }
   }

