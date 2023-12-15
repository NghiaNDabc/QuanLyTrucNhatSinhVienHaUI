/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DuLieuHeThong;

import java.util.ArrayList;
import java.util.Date;

public class TrucNhat {
    private Lop lopTN;
    private Date ngayTN;
    private String luuY;
    private ArrayList<SinhVien> listSV = new ArrayList<SinhVien>();

    public void setLopTN(Lop lopTN) {
        this.lopTN = lopTN;
    }

    public void setListSV(ArrayList<SinhVien> listSV) {
        this.listSV = listSV;
    }

    public void setNgayTN(Date ngayTN) {
        this.ngayTN = ngayTN;
    }

    public void setLuuY(String luuY) {
        this.luuY = luuY;
    }

    public Lop getLopTN() {
        return lopTN;
    }

    public Date getNgayTN() {
        return ngayTN;
    }

    public ArrayList<SinhVien> getListSV() {
        return listSV;
    }

    public String getLuuY() {
        return luuY;
    }

    public TrucNhat() {
    }

    public TrucNhat(Lop lopTN, Date ngayTN, String luuY, ArrayList<SinhVien> listSV) {
        this.lopTN = lopTN;
        this.ngayTN = ngayTN;
        this.luuY = luuY;
        this.listSV= listSV;
    }
    
}
