/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DuLieuHeThong;


import java.util.ArrayList;
import java.util.Date;

public class Lop {

    private String maLop;
    private String tenLop;
    private Date ngayBD;
    private Date ngayKT;
    private int soBuoiHoc;
    private ArrayList<SinhVien> listSV= new ArrayList<>();

    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public void setNgayBD(Date ngayBD) {
        this.ngayBD = ngayBD;
    }

    public void setNgayKT(Date ngayKT) {
        this.ngayKT = ngayKT;
    }

    public void setSoBuoiHoc(int soBuoiHoc) {
        this.soBuoiHoc = soBuoiHoc;
    }

    public String getMaLop() {
        return maLop;
    }

    public String getTenLop() {
        return tenLop;
    }

    public Date getNgayBD() {
        return ngayBD;
    }

    public Date getNgayKT() {
        return ngayKT;
    }

    public int getSoBuoiHoc() {
        return soBuoiHoc;
    }

    public Lop() {
    }

    public Lop(String maLop, String tenLop, Date ngayBD, Date ngayKT, int soBuoiHoc) {
        this.maLop = maLop;
        this.tenLop = tenLop;
        this.ngayBD = ngayBD;
        this.ngayKT = ngayKT;
        this.soBuoiHoc = soBuoiHoc;
    }

}
