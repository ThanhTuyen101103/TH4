/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package th4_lap4;

/**
 *
 * @author ASUS
 */
public class GiaoDichNha extends GiaoDich{
    private String loaiNha, diaChi;
    private int choose;
    
    public GiaoDichNha () {
        super();
    }
    public GiaoDichNha(String loaiNha, String diaChi){
        super();
        this.loaiNha = loaiNha;
        this.diaChi = diaChi;
    }

    public String getLoaiNha() {
        return loaiNha;
    }

    public void setLoaiNha(String loaiNha) {
        this.loaiNha = loaiNha;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    
    public void nhap(){
        super.nhap();
        System.out.print ("Nhap dia chi:");
        String diachi = scanner.nextLine();
        System.out.print(" Nhap loai nha (0: cao cap,1: thuong):");
        choose = scanner.nextInt();
        switch (choose){
            case 0:
                loaiNha = "cao cap";
                break;
            case 1:
                loaiNha = "thuong";
            default:
                System.out.println("Chon so khong hop le.");
                break;
        
        }
        
    }
    
    @Override
    public String toString(){
    return super.toString()+ ", loai nha: " + this.loaiNha +", dia chi: " + this.diaChi;
}
}
