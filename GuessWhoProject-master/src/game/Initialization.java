package game;

import java.util.ArrayList;

public final class Initialization {

	private static ArrayList<Face> faceslist;
	private static ArrayList<Question> questionlist;


	static{//initialization of constructor
		
		faceslist = new ArrayList<Face>();		
		questionlist = new ArrayList<Question>();	
		
	}



	public static void setFaces(){

		//boolean blackHair 0, boolean blondeHair 1, boolean whiteHair 2, boolean brownHair 3, boolean blueEyes 4,
		//boolean brownEyes 5, boolean greenEyes 6, boolean blackSkin 7, boolean glasses 8, boolean hat 9,
		//boolean faceHair 10, boolean sex 11,  int code 12

		Face fac1 = new Face(true,false,false,false,true,false,false,false,false,false,false,false,1); //����� - 1
		Face fac2 = new Face(false,true,false,false,true,false,false,false,false,false,false,false,2); //���� - 2
		Face fac3 = new Face(true,false,false,false,false,true,false,true,false,false,true,true,3); //��������� - 3
		Face fac4 = new Face(true,false,false,false,false,true,false,true,false,true,false,false,4); //����������� - 4
		Face fac5 = new Face(true,false,false,false,false,true,false,false,true,true,true,true,5); //������������ - 5
		Face fac6 = new Face(false,false,false,true,false,false,true,false,false,false,true,true,6); //������ - 6
		Face fac7 = new Face(false,false,true,false,false,true,false,false,true,false,true,true,7); //�������� - 7 
		Face fac8 = new Face(false,true,false,false,true,false,false,false,false,false,false,true,8); //��������� - 8 
		Face fac9 = new Face(false,false,true,false,false,true,false,false,false,false,false,true,9); //�������� - 9
		Face fac10 = new Face(false,false,false,true,false,false,true,true,false,false,true,true,10); //��������� - 10
		Face fac11 = new Face(false,true,false,false,false,false,true,false,false,false,false,false,11); //�������� - 11 
		Face fac12 = new Face(false,true,false,false,false,false,true,false,false,false,true,true,12); //��������� - 12
		Face fac13 = new Face(false,true,false,false,true,false,false,false,true,false,true,true,13); //�������� - 13
		Face fac14 = new Face(false,false,true,false,false,true,false,true,false,false,true,true,14); //����� - 14
		Face fac15 = new Face(false,true,false,false,false,false,true,false,false,true,false,true,15); //����� - 15
		Face fac16 = new Face(false,false,true,false,true,false,false,true,false,false,false,true,16); //����� - 16 
		Face fac17 = new Face(false,false,false,true,false,false,true,false,false,true,false,true,17); //�������� - 17
		Face fac18 = new Face(true,false,false,false,false,false,true,false,false,false,true,true,18); //������� - 18
		Face fac19 = new Face(true,false,false,false,false,true,false,false,true,false,false,false,19); //����� - 19
		Face fac20 = new Face(false,true,false,false,false,true,false,false,true,false,false,false,20); //��������� - 20
		Face fac21 = new Face(false,false,false,true,true,false,false,false,true,false,true,true,21); //������� - 21
		Face fac22 = new Face(false,true,false,false,true,false,false,false,false,false,true,true,22); //������ - 22
		Face fac23 = new Face(false,false,false,true,true,false,false,true,false,true,false,false,23); //������� - 23
		Face fac24 = new Face(true,false,false,false,false,false,true,true,false,false,false,false,24); //������� - 24
		
		//Add faces in ArrayList
		faceslist.clear();
		faceslist.add(fac1);
		faceslist.add(fac2);
		faceslist.add(fac3);
		faceslist.add(fac4);
		faceslist.add(fac5);
		faceslist.add(fac6);
		faceslist.add(fac7);
		faceslist.add(fac8);
		faceslist.add(fac9);
		faceslist.add(fac10);
		faceslist.add(fac11);
		faceslist.add(fac12);
		faceslist.add(fac13);
		faceslist.add(fac14);
		faceslist.add(fac15);
		faceslist.add(fac16);
		faceslist.add(fac17);
		faceslist.add(fac18);
		faceslist.add(fac19);
		faceslist.add(fac20);
		faceslist.add(fac21);
		faceslist.add(fac22);
		faceslist.add(fac23);
		faceslist.add(fac24);
	}
	
	//Initialize the questions
	public static void setQuestion(){
		Question Q1 = new Question(0,"����� ������");
		Question Q2 = new Question(1,"����� ������");
		Question Q3 = new Question(2,"����� ������");
		Question Q4 = new Question(3,"������� ������");
		Question Q5 = new Question(4,"���� �����");
		Question Q6 = new Question(5,"������� �����");
		Question Q7 = new Question(6,"������� �����");
		Question Q8 = new Question(7,"����� �����");
		Question Q9 = new Question(8,"������");
		Question Q10 = new Question(9,"������");
		Question Q11 = new Question(10,"��������/��������");
		Question Q12 = new Question(11,"�����");
		
		//Add questions in Arraylist
		questionlist.clear();
		questionlist.add(Q1);
		questionlist.add(Q2);
		questionlist.add(Q3);
		questionlist.add(Q4);
		questionlist.add(Q5);
		questionlist.add(Q6);
		questionlist.add(Q7);
		questionlist.add(Q8);
		questionlist.add(Q9);
		questionlist.add(Q10);
		questionlist.add(Q11);
		questionlist.add(Q12);
		
	}
	
	//Getters
	public static ArrayList<Face> getFaceslist() {
		return faceslist;
	}

	public static ArrayList<Question> getQuestionlist() {
		return questionlist;
	}
	
	


}
