
import javax.swing.Icon;
import javax.swing.table.AbstractTableModel;


public class MyModel extends AbstractTableModel
{
    private String[] columns;
    private Object[][] rows;

    public MyModel(String[] columnsName, Object[][] data)
    {
        this.columns = columnsName;
        this.rows = data;
    }
    
    public Class getColumnClass(int col)
    {
        // the index of the image column is 8
        if(col == 8)
        {
           return Icon.class;
        }
        else 
        {
            return getValueAt(0, col).getClass();
        }
    }
    
    
    
    @Override
    public int getRowCount() {
        return this.rows.length;
    }

    @Override
    public int getColumnCount() {
        return this.columns.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return this.rows[rowIndex][columnIndex];
    }
    
    @Override
    public String getColumnName(int col)
    {
        return this.columns[col];
    }
}
