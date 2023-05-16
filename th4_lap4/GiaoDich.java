/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package th4_lap4;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class GiaoDich {

    private String maGiaoDich, ngayGiaoDich;
    private long donGia;
    private float dienTich;
    Scanner scanner = new Scanner (System.in);
    public GiaoDich (){
        super();
    }
    public GiaoDich(String maGiaoDich, String ngayGiaoDich, long donGia, float dienTich){
        super ();
        this.maGiaoDich = maGiaoDich;
        this.ngayGiaoDich = ngayGiaoDich;
        this. donGia = donGia;
        this.dienTich = dienTich;
    }
    public String getMaGiaoDich(){
        return maGiaoDich;
    }
    public void setMaGiaoDich(String maGiaoDich){
        this.maGiaoDich = maGiaoDich;
    }
    public String getNgayGiaoDich(){
        return ngayGiaoDich;
    }
    public void setNgayGiaoDich(String ngayGiaoDich){
        this.ngayGiaoDich = ngayGiaoDich;
    }
    public long getDonGia(){
        return donGia;
    }
    public void setDonGia(long donGia){
        this.donGia = donGia;
    }
    public float getDienTich(){
        return dienTich;
    }
    public void setDienTich(float dienTich){
        this.dienTich = dienTich;
    }
    public void nhap(){
        System.out.print ("Nhap ma giao dich: ");
        maGiaoDich = scanner.nextLine();
        System.out.print ("Nhap ngay giao dich (ngay/thang/nam): ");
        String ngayGiaodich = scanner.nextLine();
        System.out.print ("Nhap don gia: ");
        donGia = Long.parseLong(scanner.nextLine());
        System.out.print ("Nhap dien tich: ");
        dienTich = Float.parseFloat(scanner.nextLine());
        
    }
    
    @Override
    public String toString(){
        return "Ma giao dich: " + this.maGiaoDich + ", ngay giao dich:" + this.ngayGiaoDich + ", don gia: " + this.donGia + ", dien tich:" + this.dienTich;
    
    }
    
}
