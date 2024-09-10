package emp2;

import java.util.List;
import java.util.Scanner;

public class EmpConsoleUtil {
    public EmpDTO insertEmp(Scanner sc) {
        // 입력 데이터 동적 처리
        System.out.println("========= 데이터 입력 ============");
        System.out.print("사번 : ");
        int empno = Integer.parseInt(sc.nextLine());
        System.out.print("이름 : ");
        String ename = sc.nextLine();
        System.out.print("직무 : ");
        String job = sc.nextLine();
        System.out.print("매니저번호 : ");
        int mgr = Integer.parseInt(sc.nextLine());
        System.out.print("입사일 : ");
        String hiredate = sc.nextLine();
        System.out.print("급여 : ");
        int sal = Integer.parseInt(sc.nextLine());
        System.out.print("수당 : ");
        int comm = Integer.parseInt(sc.nextLine());
        System.out.print("부서번호 : ");
        int deptno = Integer.parseInt(sc.nextLine());

        return new EmpDTO(empno, ename, job, mgr, hiredate, sal, comm, deptno);
    }

    public int getEmpNo(Scanner sc) {
        // 사번 입력받은 후 리턴
        System.out.println("조회할 사번을 입력하세요 >>");
        // int empno = Integer.parseInt(sc.nextLine());
        // return empno;
        return Integer.parseInt(sc.nextLine());
    }

    public void printEmp(EmpDTO dto) {
        // dto 내용출력
        // smith 사원
        System.out.println(dto.getEname() + "사원");
        // ================
        System.out.println("==================================");
        // 사번 : 7788
        System.out.println("사번 : " + dto.getEmpno());
        // 직무 :
        System.out.println("직무 : " + dto.getJob());
        // 입사일 :
        System.out.println("입사일 : " + dto.getHiredate());
        // 급여 :
        System.out.println("급여 : " + dto.getSal());
        // 수당 :
        System.out.println("수당 : " + dto.getComm());
        // 부서 번호 :
        System.out.println("부서 번호 : " + dto.getDeptno());
        System.out.println();
    }

    public void prinListEmp(List<EmpDTO> list) {
        // list 에 들어있는 emp 출력
        System.out.println("==========================================");
        System.out.println(
                "EMPNO  ENAME  JOB  MGR HIREDATE  SAL COMM DEPTNO");
        System.out.println("==========================================");

        for (EmpDTO empDTO : list) {
            System.out.print(empDTO.getEmpno() + "\t");
            System.out.print(empDTO.getEname() + "\t");
            System.out.print(empDTO.getJob() + "\t");
            System.out.print(empDTO.getMgr() + "\t");
            System.out.print(empDTO.getHiredate() + "\t");
            System.out.print(empDTO.getSal() + "\t");
            System.out.print(empDTO.getComm() + "\t");
            System.out.print(empDTO.getDeptno() + "\n");
        }
    }

    public EmpDTO updateInfo(Scanner sc) {
        // 수정할 정보 입력받기 => 입력받은 EmpDTO 담은 후 리턴
        System.out.println("=========== 사원정보 수정 =========");
        System.out.print("사번 : ");
        int empno = Integer.parseInt(sc.nextLine());
        System.out.print("수당 : ");
        int comm = Integer.parseInt(sc.nextLine());
        System.out.print("급여 : ");
        int sal = Integer.parseInt(sc.nextLine());

        EmpDTO dto = new EmpDTO();
        dto.setEmpno(empno);
        dto.setSal(sal);
        dto.setComm(comm);

        return dto;
    }

    public int deleteEmpNo(Scanner sc) {
        // 삭제할 empno 받은 후 리턴
        System.out.println("=========== 삭제할 사원정보 =========");
        System.out.print("삭제할 사번 : ");
        int empno = Integer.parseInt(sc.nextLine());

        return empno;

    }

}
