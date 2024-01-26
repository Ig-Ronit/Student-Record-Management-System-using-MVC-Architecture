package MVC;
import java.awt.event.*;
public class studController implements ActionListener {
	studview fr;
	Students s1;
	studModel dm;
	public studController(studview fr)
	{
		dm = new studModel();
		s1 = new Students();
		this.fr=fr;
	}
	public void actionPerformed(ActionEvent evt)
	{
		Object obj = evt.getSource();
		if(obj==fr.b1) 
		{
			s1.setRollno(Integer.parseInt(fr.t1.getText()));
			s1.setName(fr.t2.getText());
			s1.setMarks(Integer.parseInt(fr.t3.getText()));
			dm.saveRec(s1);
		}
		else if(obj==fr.b2)
		{
			s1.setRollno(Integer.parseInt(fr.t1.getText()));
			s1.setName(fr.t2.getText());
			s1.setMarks(Integer.parseInt(fr.t3.getText()));
			dm.updateRec(s1);
		}
		else if (obj == fr.b3)
		{
			s1.setRollno(Integer.parseInt(fr.t1.getText()));
			dm.delRec(s1);
		}
		else if (obj==fr.b4)
		{
			s1.setRollno(Integer.parseInt(fr.t1.getText()));
			s1 = dm.searchRec(s1);
			fr.t2.setText(s1.getName());
			fr.t3.setText(""+s1.getMarks());
		}
		else if (obj ==fr.b5)
		{
			fr.t1.setText(" ");
			fr.t2.setText(" ");
			fr.t3.setText(" ");
		}
	}

}
