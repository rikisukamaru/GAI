package com.example.gai;

public class Elements_GAI {
    public String Gos_nomer;
    public String FIO;
    public String STS;
    public String Marka;
    public String Shtraf;
    public String Ugon;
    public String VIN;

  public Elements_GAI(String Gos_nomer,String FIO,String STS,String Marka,String Shtraf,String Ugon,String VIN)
  {
      this.Gos_nomer = Gos_nomer;
      this.FIO = FIO;
      this.STS= STS;
      this.Marka = Marka;
      this.Shtraf = Shtraf;
      this.Ugon = Ugon;
      this.VIN = VIN;
  }
  public String tooString()
  {
      return String.format("%s\n%s\n%s\n%s\n%s\n%s\n%s\n",Gos_nomer,FIO,STS,Marka,Shtraf,Ugon,VIN);
  }
    public String tooString1()
    {
        return String.format("%s\n",Shtraf);
    }

}