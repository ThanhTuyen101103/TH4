/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package th4_lap4;

/**
 *
 * @author ASUS
 */
public class GiaoDichDat extends GiaoDich{
    private String loaiDat;
    public GiaoDichDat (){
        super();
    }
    public GiaoDichDat(String loaiDat){
        super ();
        this.loaiDat = loaiDat;
    }

    public String getLoaiDat() {
        return loaiDat;
    }

    public void setLoaiDat(String loaiDat) {
        this.loaiDat = loaiDat;
    }
    
    public void nhap (){
        super.nhap ();
        System.out.print(" Nhap loai dat (A/B/C): ");
        loaiDat = scanner.nextLine();
    }
    
    @Override
    public String toString(){
        return super.toString() + ", loai dat: " + this.loaiDat;
    }
}
