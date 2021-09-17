public class test{

  public static void main(String[] args) {
    apply();
  }
  public static  void apply()
  {
       LectureWithSortAlgorithms  dap2 = new LectureWithSortAlgorithms("dap",6);
       LectureWithSortAlgorithms  dap = new LectureWithSortAlgorithms("dap",0);

       dap.showStudent();


       Student a = new Student("Yasser","Kafe",2039483);
       Student b = new Student("Kabenke","Nana",2038473);
       Student c = new Student("Ngingn","Junior",2044533);
       Student d = new Student("Zeler","Bombardier",2045743);
       Student e = new Student("Yemeli","Ydris",2567383);
       Student f = new Student("Kalagan","Ciriaque",445483);

       dap2.add(a);
       dap2.add(b);
       dap2.add(c);
       dap2.add(d);
       dap2.add(e);
       dap2.add(f);






  }
}
