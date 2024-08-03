import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class TrnsactionHandle {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/db_transcation";
        String user = "root";
        String password = "Ayush.9094";
        
        String debit_money = "update accounts set balance = balance - ? where account_number = ?";
        String credit_money = "update accounts set balance = balance + ? where account_number = ?";

        try{
            Connection conn = DriverManager.getConnection(url,user,password);
            System.out.println("connection successfully");
            conn.setAutoCommit(false);

            PreparedStatement debit_statment = conn.prepareStatement(debit_money);
            debit_statment.setDouble(1,200.00);
            debit_statment.setString(2,"ac1");
            int rowsAffectedDebit = debit_statment.executeUpdate();

            PreparedStatement credit_statment = conn.prepareStatement(credit_money);
            credit_statment.setDouble(1,500);
            credit_statment.setString(2,"ac12");
            int rowsAffectedCredit = credit_statment.executeUpdate();

            if (rowsAffectedDebit > 0 && rowsAffectedCredit > 0){
                conn.commit();
                System.out.println("transaction successfully!");
            }else {
                conn.rollback();
                System.out.println("transaction failed!");
            }
        }catch (Exception e){

        }
    }
}
