import javax.swing.JOptionPane;
public class pErt{

//In in Program Evaluation Review Technique, 'O' is optimistic timeline.
// P is the pessimistic timeline. R is the realistic timeline.
  
  
public pErt(){
}


public void calculatePert(){
for (int i =0;i<9 ;i++ ) {
  double o =  Double.parseDouble(JOptionPane.showInputDialog(null, "insert o"));
  double r =  Double.parseDouble(JOptionPane.showInputDialog(null, "insert r"));
  double p =  Double.parseDouble(JOptionPane.showInputDialog(null, "insert p"));
  JOptionPane.showMessageDialog(null,(o+4*r+p)/6);

}

}







}
