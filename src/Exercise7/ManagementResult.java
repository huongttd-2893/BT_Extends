package Exercise7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ManagementResult {
	
	public static void checkStyle(Student student) {
		if (student instanceof RegularStudent) {
			System.out.println(student.getName() + ": sinh viên chính quy");
		} else if (student instanceof InserviceStudent) {
			System.out.println(student.getName() + " : sinh viên tại chức");
		}
	}
	
	public static void main(String[] args) {
		LearningResult kq1 = new LearningResult("Học kỳ 1",9.5f);
		LearningResult kq2 = new LearningResult("Học kỳ 2",8);
		ArrayList<LearningResult> kqht1 = new ArrayList<LearningResult>();
		kqht1.add(kq1);
		kqht1.add(kq2);
		
		LearningResult kq3 = new LearningResult("Học kỳ 1",9);
		LearningResult kq4 = new LearningResult("Học kỳ 2",8);
		ArrayList<LearningResult> kqht2 = new ArrayList<LearningResult>();
		kqht2.add(kq3);
		kqht2.add(kq4);
		
		LearningResult kq5 = new LearningResult("Học kỳ 1",6);
		LearningResult kq6 = new LearningResult("Học kỳ 2",7.5f);
		ArrayList<LearningResult> kqht3 = new ArrayList<LearningResult>();
		kqht3.add(kq5);
		kqht3.add(kq6);
		
		Student huong = new RegularStudent("1911505310","Hương","16/4/2000",2018,9,kqht1);
		Student thao = new InserviceStudent("1911505311","Thảo","20/4/1998",2016,6,kqht2,"Đà Nẵng");
		Student minh = new RegularStudent("1911505312","Minh","21/5/2000",2017,7,kqht3);
		
		ArrayList <Student> stList = new ArrayList<Student>();
		stList.add(huong);
		stList.add(minh);
		stList.add(thao);
		
		huong.displaySVInfo();
		thao.displaySVInfo();
		
		//Trả về thông tin sinh viên có phải là chính quy hay không?
		System.out.print("\n");
		checkStyle(huong);
		checkStyle(thao);
		
		//Hiển thị điểm trung bình các môn học của sinh viên
		System.out.print("\n");
		huong.displayMediumScoreStudent();
		
		//Xác định tổng số sinh viên chính quy của khoa?
		System.out.print("\n");
		Department dpart1 = new Department("CNTT",stList);
		ArrayList<Department> dpart = new ArrayList<Department>();
		dpart.add(dpart1);
		Department.DepartmentRegularStudent(dpart);
		
		//Lấy ra danh sách các sinh viên tại chức tại nơi liên kết đào tạo cho trước
		System.out.print("\n");
		System.out.println("Danh sách sinh viên tại chức tại nơi đào tạo cho trước: ");
		InserviceStudent.getInserviceStudent(stList,"Đà Nẵng");
		
		//Lấy ra danh sách sinh viên có điểm trung bình ở học kỳ gần nhất (là học kỳ cuối cùng trong danh sách kết quả học tập của sinh viên) từ 8.0 trở lên
		System.out.print("\n");
		Student.GoodStudent8(stList);
		
		//Sắp xếp danh sách sinh viên tăng dần theo loại và giảm dần theo năm vào học
		System.out.print("\n");
		Student.SortByYear(stList);
		
	}
}
