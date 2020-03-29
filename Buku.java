public class Buku {
	
	String kode, nama, peminjam, tanggal_pinjam, tanggal_pengembalian;
	public Buku(String pk, String nm, String np, String tpin, String tpem){
		this.kode = pk;
		this.nama = nm;
		this.peminjam = np;
		this.tanggal_pinjam = tpin;
		this.tanggal_pengembalian = tpem;
	}
}
