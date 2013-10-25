package main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import model.Employee;
import model.Student;

public class InheritanceMain {
	public static void main(String[] args) throws
	ParseException {
		Student s = new Student();
		s.setNim("4511210001");
		s.setNama("Tria Henrico");
		s.setAlamat("Jl. Martadinata 4 F2/35");
		s.setTglLahir(new SimpleDateFormat("dd-MM-yyyy").parse("20-07-1993"));
		s.setNoHp("081514848223");
		
		Employee e = new Employee();
		e.setNip("4511210011");
		e.setNama("Boike Satrio");
		e.setAlamat("Jl. Semeru F2");
		e.setTglLahir(new SimpleDateFormat ("dd-MM-yyyy").parse("20-10-1991"));
		e.setNoHp("085692418263");
		
		showData(s);
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		showData (e);
		}
		
		static void showData(Student s){
			System.out.println("Class Student");
			System.out.println("NIM : " + s.getNim());
			System.out.println("Nama : " + s.getNama());
			System.out.println("Alamat : " + s.getAlamat());
			System.out.println("Taggal Lahir : " + new SimpleDateFormat("dd MMMMM yyyy").format(s.getTglLahir()));
			System.out.println("No telepon : " + s.getNoHp());
		}
		static void showData(Employee e){
			System.out.println("Class Employee");
			System.out.println("NIP " + e.getNip());
			System.out.println("Nama : " + e.getNama());
			System.out.println("Alamat : " + e.getAlamat());
			System.out.println("Taggal Lahir : " + new SimpleDateFormat("dd MMMMM yyyy").format(e.getTglLahir()));
			System.out.println("No telepon : " + e.getNoHp());
		}
	}