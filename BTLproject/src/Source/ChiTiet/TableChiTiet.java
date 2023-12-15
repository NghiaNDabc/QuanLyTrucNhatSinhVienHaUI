
package Source.ChiTiet;

import DuLieuHeThong.SinhVien;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.table.AbstractTableModel;

public class TableChiTiet extends AbstractTableModel {

    public ArrayList<SinhVien> listSV = new ArrayList<SinhVien>();
    private Date ngay;
    private String note;
    private Class classes[] = {Date.class, SinhVien.class, String.class};
    private String columnName[] = {"Ngày", "Sinh viên trực nhật", "Lưu ý"};

    public Date getNgay() {
        return ngay;
    }

    public void setNgay(Date ngay) {
        this.ngay = ngay;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public int getRowCount() {
        return listSV.size();
    }

    @Override
    public int getColumnCount() {
        return columnName.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return ngay;
            case 1:
                return listSV.get(rowIndex);
            case 2:
                return note;
            default:
                return null;
        }
    }
    @Override
    public Class getColumnClass(int columnIndex)
    {
        return classes[columnIndex];
    }

    @Override
    public String getColumnName(int column)
    {
        return columnName[column];
    }
}
