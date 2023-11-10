## BMI計算アプリの説明

### 変数を二人分用意し、一度に二人分BMIを計算できるようにしました。
- height→身長　weight→体重　bmi→計算した結果を入れるための変数  

- System.out.println("BMI(一人目):" + String.format("%.2f", bmi));
 ↑String.formatの2fで小数点第二位まで表示されるようにしました。

### if文で計算で出されたbmiの数に応じてbmiの判定を出来るようにしました。
- BMIが18.5未満→低体重
- BMIが25未満→普通体重
- 上記以外→肥満

