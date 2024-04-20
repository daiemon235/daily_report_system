package actions.views;

import java.time.LocalDate;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 日報情報について画面の入力値・出力値を扱うViewモデル
 *
 */
@Getter //全てのクラスフィールドについてgetterを自動生成する(Lombok)
@Setter //全てのクラスフィールドについてsetterを自動生成する(Lombok)
@NoArgsConstructor //引数なしコンストラクタを自動生成する(Lombok)
@AllArgsConstructor //全てのクラスフィールドを引数にもつ引数ありコンストラクタを自動生成する(Lombok)
public class ReportView {

    /**
     * id
     */
    private Integer id;

    /**
     * 日報を登録した従業員
     */
    private EmployeeView employee;

    /**
     * いつの日報かを示す日付
     */
    private LocalDate reportDate;

    /**
     * 日報のタイトル
     */
    private String title;

    /**
     * 日報の内容
     */
    private String content;

    /**
     * 登録日時
     */
    private LocalDateTime createdAt;

    /**
     * 更新日時
     */
    private LocalDateTime updatedAt;

    /**
     * いいね
     */
    private Integer good;

}

//----------------------------------------------------------------------------------------------------------
/**
 * 画像の表示
*/

// 引用: https://kamifuji.dyndns.org/JSupport/JAVA_Swing/JButton/index.html

/*
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Container;
import java.awt.BorderLayout;

class SSample8_1 extends JFrame{
  public static void main(String args[]){
    SSample8_1 frame = new SSample8_1("タイトル");
    frame.setVisible(true);
  }

  SSample8_1(String title){
    setTitle(title);
    setBounds(100, 100, 300, 250);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel p = new JPanel();

    ImageIcon icon1 = new ImageIcon(".images/good.png");
    JButton button1 = new JButton(icon1);

    p.add(button1);

    Container contentPane = getContentPane();
    contentPane.add(p, BorderLayout.CENTER);
  }
}

*/