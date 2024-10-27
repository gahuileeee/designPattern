package adpaterPattern;

public class BCompany {
    public void start(){
        System.out.println("List 정렬을 시작합니다.");
    };
    public void sort(Boolean isSort){
        if(isSort){
            System.out.println("B회사 sort 기능 이용");
        }else{
            System.out.println("sort를 동작하지 않습니다.");
        }
    };
}
