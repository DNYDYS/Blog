import com.blog.AppRun;
import com.blog.common.base.CommonResponce;
import com.blog.model.Diary;
import com.blog.service.DiaryService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = AppRun.class)
public class DiaryTest {

    @Autowired
    private DiaryService diaryService;

    @Test
    public void TDiary(){
        CommonResponce<List<Diary>> allDiarys = diaryService.queryAllDiarys();
        List<Diary> diaryList = allDiarys.getData();
        for (Diary d:diaryList) {
            System.out.println(d);
        }
    }

}
