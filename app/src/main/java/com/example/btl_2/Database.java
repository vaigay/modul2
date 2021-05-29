package com.example.btl_2;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class  Database extends SQLiteOpenHelper {
    public Database(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }
    public void QueryTable(String sql){
        SQLiteDatabase database = getWritableDatabase();
        database.execSQL(sql);
    }
    public Cursor QueryData(String sql){
        SQLiteDatabase database = getReadableDatabase();
        return database.rawQuery(sql, null);
    }
    @Override
    public void onCreate(SQLiteDatabase database) {


        database.execSQL("CREATE TABLE IF NOT EXISTS trick(id INTEGER PRIMARY KEY, name VARCHAR(250) ,type INTEGER  )");
        database.execSQL("CREATE TABLE IF NOT EXISTS trick_detail(id INTEGER PRIMARY KEY AUTOINCREMENT, id_trick INTEGER ,description TEXT )");
        database.execSQL(" INSERT INTO trick VALUES(1,'Bài 3: Bài thi dừng xe và khỏi hành lên dốc',2)");
        database.execSQL(" INSERT INTO trick_detail VALUES(null,1,'Giữ động cơ khởi động'),(null,1,'Thí sinh chú ý vạch kẻ đường'),(null,1,'Lái xe theo đúng quy tắc giao thông đường bộ')");
                database.execSQL(" INSERT INTO trick VALUES(2,'Bài 4: Bài thi qua vệt bánh xe và đường vuông góc',2) ");
        database.execSQL(" INSERT INTO trick_detail VALUES(null,2,'Sau khi đi qua hàng đinh, bạn thấy người ngang với vỉa ba toa vuông góc bên trái thì đánh lái hết sang trái. Đi từ từ và trả lái')");
                database.execSQL(" INSERT INTO trick VALUES(3,'Bài 5: Qua ngã tư có tín hiệu đèn',2)");
        database.execSQL(" INSERT INTO trick_detail VALUES(null,3,'Bài này tương đối đơn giản, thí sinh cần chú ý tín hiệu đèn thì dừng lại')");
                database.execSQL(" INSERT INTO trick VALUES(4,'Bài 6: Qua đường vòng quanh co',2)");
        database.execSQL(" INSERT INTO trick_detail VALUES(null,4,'Bài thi này là hính chữ S là đường cong liên tục nên bạn phải điều chỉnh tay lái theo đường cong')");
                database.execSQL(" INSERT INTO trick VALUES(5,'Bài 7: Ghép xe dọc vào nơi đỗ',2)");
        database.execSQL(" INSERT INTO trick_detail VALUES(null,5,'Đi đúng quy định của hạng xe sát hạch, giữ tốc độ chạy không quá 24km/h')");
                database.execSQL(" INSERT INTO trick VALUES(6,'Bài 8: Ghép xe ngang vào nơi đỗ',2)");
        database.execSQL(" INSERT INTO trick_detail VALUES(null,6,'Đi đúng quy định của hạng xe sát hạch, giữ tốc độ chạy không quá 24km/h')");
                database.execSQL(" INSERT INTO trick VALUES(7,'Bài 9: Tạm dừng ở chổ có đường sắt chạy', 2)");
                        database.execSQL(" INSERT INTO trick_detail VALUES(null,7,'Dừng xe cách vạch dừng quy định không quá 500mm'),(null,7,'Giữ động cô luôn hoạt độn'),(null,7,'Lái xe đúng quy định của luột giao thông đường bộ và vận tốc không quá 24km/h')");


        database.execSQL("INSERT INTO trick VALUES(8, 'Cấp phép',1)");
        database.execSQL("INSERT INTO trick_detail VALUES(null,8,'Đường cấm dừng, cấm đỗ, cấm đi do UBND cấp tỉnh cấp.'),(null,8,'Xe quá khổ, quá tải do: Cơ quan quản lý đường bộ có thẩm quyền cấp phép.')");
                database.execSQL("INSERT INTO trick VALUES(9, 'Nồng độ cồn',1)");
        database.execSQL("INSERT INTO trick_detail VALUES(null,9,'Người điều khiển xe mô tô, ô tô, máy kéo trên đường mà trong máu hoặc hơi thở có nồng độ cồn: Bị nghiêm cấm.')");
                database.execSQL("INSERT INTO trick VALUES(10, 'Khoảng cách an toàn tối thiểu',1)");
        database.execSQL("INSERT INTO trick_detail VALUES(null,10,'35m nếu vận tốc lưu hành (V) = 60(km/h).'),(null,10,'55m nếu 60<V≤80.'),(null,10,'70m nếu 80<V≤100.'),(null,10,'100m nếu 100<V≤120.'),(null,10,'Dưới 60km/h: Chủ dộng và đảm bảo khoảng cách.')");
                database.execSQL("INSERT INTO trick VALUES(11, 'Hỏi về tuổi',1)");
        database.execSQL("INSERT INTO trick_detail VALUES(null,11,'Tuổi lấy bằng lái xe gắn máy: 16.'),(null,11,'Tuổi lấy bằng lái xe mô tô, hạng B1 và B2: 18.'),(null,11,'Tuổi lấy bằng lái xe hạng C và FB: 21.'),(null,11,'Tuổi lấy bằng lái xe hạng D và FC: 24.'),(null,11,'Tuổi lấy bằng lái xe hạng E và FD: 27.'),(null,11,'Tuổi tối đa hạng E: Nam 55, nữ 50.')");
                database.execSQL("INSERT INTO trick VALUES(12, 'Trên đường cao tốc, trong đường hầm, đường vòng, đầu dốc, nơi tầm nhìn hạn chế',1)");
        database.execSQL("INSERT INTO trick_detail VALUES(null,12,'Không được vượt đầu xe, không lùi, không vượt.'),(null,12,'Không được vượt trên cầu hẹp có 1 làn xe.'),(null,12,'Không được phép quay đầu xe ở phần đường dành cho người đi bộ qua đường.'),(null,12,'Cấm lùi xe ở khu vực cấm dừng và nơi đường bộ giao nhau.')");
                database.execSQL("INSERT INTO trick VALUES(13, 'Tại nơi giao nhau không có tín hiệu đèn',1)");
        database.execSQL("INSERT INTO trick_detail VALUES(null,13,'Có vòng xuyến: Nhường đường bên trái.'),(null,13,'Không có vòng xuyến: Nhường đường bên phải.')");
                database.execSQL("INSERT INTO trick VALUES(14, 'Niên hạn sử dụng (tính từ năm sản xuất)',1)");
        database.execSQL("INSERT INTO trick_detail VALUES(null,14,'Ô tô tải: 25 năm.'),(null,14,'Ô tô trở người trên 9 chỗ: 20 năm.')");
                database.execSQL("INSERT INTO trick VALUES(15, 'Biển báo cấm',1)");
        database.execSQL("INSERT INTO trick_detail VALUES(null,15,'Cấm ô tô (gồm: mô tô 3 bánh, xe làm, xe khách) → Cấm xe tải → Cấm máy kéo → Cấm rơ-moóc, sơ-mi rơ-moóc.')");
                database.execSQL("INSERT INTO trick VALUES(16, 'Nhất chướm, nhì ưu, tam đường, tứ hướng',1)");
        database.execSQL("INSERT INTO trick_detail VALUES(null,16,'Nhất chớm: Xe nào chớm tới vạch trước thì được đi trước.'),(null,16,'Nhì ưu: Thứ tự xe ưu tiên được đi trước: Cứu hỏa – Quân sự – Công an – Cứu thương – Hộ đê – Đoàn xe tang.'),(null,16,'Tam đường: Xe ở đường chính, đường ưu tiên.'),(null,16,'Tứ hướng: Thứ tự hướng: Bên phải trống – Rẽ phải – Đi thẳng – Rẽ trái.')");
                database.execSQL("INSERT INTO trick VALUES(17, 'Các hạng GPLX',1)");
        database.execSQL("INSERT INTO trick_detail VALUES(null,17,'A1: Mô tô dưới 175cm3 và xe 3 bánh của người khuyết tật.'),(null,17,'A2: Mô tô 175cm3 trở lên.'),(null,17,'A3: Xe mô tô 3 bánh.'),(null,17,'B1: Không hành nghề lái xe.'),(null,17,'B1, B2: Đến 9 chỗ ngồi, xe tải dưới 3500kg.'),(null,17,'C: Đến 9 chỗ ngồi, xe trên 3500kg.'),(null,17,'D: Trở đến 30 người.'),(null,17,'E: Trở trên 30 người.'),(null,17,'FC: C+kéo (ô tô đầu kéo, kéo sơ-mi rơ-moóc).')");
                database.execSQL("INSERT INTO trick VALUES(18, 'Phân nhóm biển báo hiệu',1)");
        database.execSQL("INSERT INTO trick_detail VALUES(null,18,'Biển nguy hiểm: Hình tam giác vàng.'),(null,18,'Biển cấm: Vòng tròn đỏ.'),(null,18,'Biển hiệu lệnh: Vòng tròn xanh.'),(null,18,'Biển chỉ dẫn: Vuông hoặc chữ nhật xanh.'),(null,18,'Biển phụ: Vuông hoặc chữ nhật trắng đen. Hiệu lực nằm ở biển phụ khi có đặt biển phụ.')");
                database.execSQL("INSERT INTO trick VALUES(19, 'Tốc độ tối đa trong khu vực đông dân cư',1)");
        database.execSQL("INSERT INTO trick_detail VALUES(null,19,'Đối với đường đôi hoặc đường 1 chiều có từ 2 làn xe cơ giới trở lên: 60km/h.'),(null,19,'Đối với đường 2 chiều hoặc đường 1 chiều có 1 làn xe cơ giới: 50km/h.')");
                database.execSQL("INSERT INTO trick VALUES(20, 'Tốc độ tối đa ngoài khu vực đông dân cư (trừ đường cao tốc) đối với đường đôi hoặc đường 1 chiều có từ 2 làn xe cơ giới trở lên',1)");
        database.execSQL("INSERT INTO trick_detail VALUES(null,20,'Xe ô tô con, xe ô tô trở người đến 30 chỗ (trừ xe buýt), ô tô tải có trọng tải ≤ 3.5 tấn: 90km/h.'),(null,20,'Xe ô tô trở người trên 30 chỗ (trừ xe buýt), ô tô tải có trọng tải ≥ 3.5 tấn (trừ ô tô xi téc): 80km/h.'),(null,20,'Ô tô buýt, ô tô đầu kéo kéo sơ-mi rơ-moóc, xe mô tô, ô tô chuyên dùng (trừ ô tô trộn vữa, trộn bê tông): 70km/h.'),(null,20,'Ô tô kéo rơ-moóc, ô tô kéo xe khác, ô tô trộn vữa, ô tô trộn bê tông, ô tô xi téc: 60km/h.')");
                database.execSQL("INSERT INTO trick VALUES(21, 'Tốc độ tối đa ngoài khu vực đông dân cư (trừ đường cao tốc) đối với đường 2 chiều hoặc đường 1 chiều có 1 làn xe cơ giới',1)");
        database.execSQL("INSERT INTO trick_detail VALUES(null,21,'Xe ô tô con, xe ô tô trở người đến 30 chỗ (trừ xe buýt), ô tô tải có trọng tải ≤ 3.5 tấn: 80km/h.'),(null,21,'Xe ô tô trở người trên 30 chỗ (trừ xe buýt), ô tô tải có trọng tải ≥ 3.5 tấn (trừ ô tô xi téc): 70km/h. Ô tô buýt, ô tô đầu kéo kéo sơ-mi rơ-moóc, xe mô tô, ô tô chuyên dùng (trừ ô tô trộn vữa, trộn bê tông): 60km/h.'),(null,21,'Ô tô kéo rơ-moóc, ô tô kéo xe khác, ô tô trộn vữa, ô tô trộn bê tông, ô tô xi téc: 50km/h.'),(null,21,'Xe máy chuyên dùng, xe gắn máy (kể cả xe máy điện) và các loại xe tương tự: 40km/h.')");
                database.execSQL("INSERT INTO trick VALUES(22, 'Tăng số, giảm số',1)");



    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS trick");
        db.execSQL("DROP TABLE IF EXISTS trick_detail");
        onCreate(db);
    }

    @Override
    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS trick");
        db.execSQL("DROP TABLE IF EXISTS trick_detail");
        onCreate(db);
    }
}
