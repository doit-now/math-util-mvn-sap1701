package com.giaolang.mathutil.core;

//class này chứa các hàm static dùng chung cho mọi nơi
//khi nào dùng static: khi ta làm các hàm mà chỉ xử lí xong rồi return
//ko cần lưu trữ lại thông tin vào instance variable - đặc tính của object
public class MathUtility {

    public static final double PI = 3.14;

    //C# public const double Pi = 3.14; static hiểu ngầm luôn
    //Hàm tính n! = 1.2.3...n
    //ko tính đc giai thừa số âm!!!!
    //0! = 1! = 1 quy ước 0! là 1
    //vì giai thừa tăng rất nhanh, 21! kiểu long chứa ko nổi (vượt 18 số 0)
    //do đó hàm getF() của chúng ta chỉ chơi với n = 0..20
    
    
    //5! = 1.2.3.4.   5
    //5! =       4! X 5 = 5 x 4!
    //4! = 1.2.3. 4
    //4! =    3!. 4 = 4 x 3!
    //3! = 3 x 2!
    //2! = 2 x 1!  - DỪNG LẠI NHEN, KO ĐUỔI NHAU NỮA 
    //N! = N X (N - 1)! -> CTHUC ĐỆ QUY XUẤT HIỆN
    //ĐỆ QUY - RECURSION - GỌI LẠI CHÍNH MÌNH VỚI QUY MÔ NHỎ HƠN
        
    public static long getFactorial(int n) { //N!

        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid n. n must be 0..20");
        }

        if (n == 0 || n == 1) 
            return 1;   //nếu n đặc biệt, ta return sớm luôn
        
        return n * getFactorial(n - 1);
        
        //tối ưu code, thay ruột của cái hàm để chạy ngon hơn
        //nhanh hơn, hoặc code viết đẹp hơn
        //hoặc fix bug thì phải sửa code
        //DÙ BẠN SỬA CODE VÌ LÍ DO GÌ, THÌ CODE PHẢI ĐC TEST LẠI
        //VÀ TEST LẠI ĐỂ ĐẢM BẢO RẰNG NÓ VẪN XANH NHƯ LẦN TRƯỚC
        //NẾU TA VIỀT CODE ĐI KÈM TEST SCRIPT THÌ VIỆC TEST LẠI CÁI
        //HÀM SẼ CỰC NHANH, KO CẦN DÙNG MẮT ĐỂ DÒ TỪNG DÒNG LỆNH ĐÚNG
        //SAI, MÀ CHỈ NHÌN MÀU XANH LÀ ĐỦ - VÌ HÀM TRẢ VỀ NHƯ EXPECTED
        //TEST LẠI NHỮNG GÌ ĐÃ TỪNG TEST -> REGRESSION TEST
        //                            KIỂM THỬ HỒI QUY
       //KIỂM THỬ LẠI HÀM LÚC NÀY CỰC NHANH, VÌ GITHUB ACTIONS LO GIÙM
       //TA CHỈ CẦN MÀU XANH, HOẶC NHẬN EMAIL CHỬI VÌ CODE ĐỎ
       

    }
        
//    public static long getFactorial(int n) {
//
//        if (n < 0 || n > 20) {
//            throw new IllegalArgumentException("Invalid n. n must be 0..20");
//        }
//
//        if (n == 0 || n == 1) 
//            return 1;   //nếu n đặc biệt, ta return sớm luôn
//        
//        long result = 1; //sống sót đến lệnh này, sure n = 2..20
//
//        for (int i = 2; i <= n; i++) 
//            result *= i;
//        
//        return result;
//
//    }

}
