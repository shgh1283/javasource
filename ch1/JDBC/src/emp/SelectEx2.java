package emp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectEx2 {
    public static void main(String[] args) {

        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null; // SELET 구문 시에만 사용

        try {
            // 1. 드라이버 로드
            Class.forName("oracle.jdbc.OracleDriver");
            // 2. 연결 문자열 작성
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            String use = "scott";
            String password = "TIGER";
            // 3. connection 얻기
            con = DriverManager.getConnection(url, use, password);

            // 4. connection 을 통해서 실행하고자 하는 sql 구문 전송
            String sql = "SELECT * FROM EMP ";
            pstmt = con.prepareStatement(sql);

            // 5. 전송된 sql 구문 실행
            rs = pstmt.executeQuery();

            System.out.println(
                    "===================================================================================================================================");
            System.out.println(
                    "EMPNO           ENAME           JOB             MGR              HIREDATE               SAL             COMM              DEPTNO");
            System.out.println(
                    "===================================================================================================================================");

            // 6. 결과값이 담긴 rs에서 하나씩 조회
            while (rs.next()) {
                // number => getInt() / varchar2 => getString() / date => getDate()
                // () 안에는 컬럼번호 or 컬럼명 가능
                System.out.print("EMPNO : " + rs.getInt("EMPNO") + "\t");
                System.out.print("ENAME : " + rs.getString(2) + "\t");
                System.out.print("JOB : " + rs.getString(3) + "\t");
                System.out.print("MGR : " + rs.getInt(4) + " \t");
                System.out.print("HIREDATE : " + rs.getDate(5) + "\t");
                System.out.print("SAL : " + rs.getInt(6) + "\t");
                System.out.print("COMM : " + rs.getInt(7) + "\t");
                System.out.println("DEPTNO : " + rs.getInt(8));

            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                rs.close();
                pstmt.close();
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
