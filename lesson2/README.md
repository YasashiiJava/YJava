# Lesson 2
※コーディングする = ソースコードを書く

※TODO =「やるべきこと，課題」を指すプログラミング用語

※タイピングの練習も兼ね，ソースコードはコピペではなく（なるべく）手動で入力する．

## TODO
### 2.1
- P18のSample1.javaをコーディングし，実行する．実行するまでの手順はLesson1参照（javacコマンドでコンパイルしてからjavaコマンドで実行）．
- P20のSample2.javaをコーディングし，実行する，Sample1との違いを意識すること．

### 2.2
特にコーディングする必要はないが，プログラミングに関する重要な用語（mainメソッド，インデント，コメント，クラス，etc.）が多く出てくる．
きちんと読み，覚えること．
これらの用語やプログラミングのルールは非常に重要．大事なので二度ry.

### 2.3
- P29のSample3.javaをコーディングし，実行する．
- P32のSample4.javaをコーディングし，実行する．
- P34のSample5.javaをコーディングし，実行する．
- P36のSample6.javaをコーディングし，実行する．

### 2.4
- 練習1：
	SampleP1.javaファイルにコードを写し，実行してみる．エラーが出た場合は修正する．誤りがなかった場合も，しかるべき形にコードを整えてみよう．
- 練習2：
	SampleP2.javaファイルにコードを写し，指定されたコメントを適切な箇所に入れてみよう．
- 練習3：
	SampleP3.javaファイルに自分で考えたコードを書き，実行する．
- 練習4：
	SampleP4.javaファイルに自分で考えたコードを書き，実行する．
- 練習5：
	SampleP5.javaファイルに自分で考えたコードを書き，実行する．

## 補足：n進数（P38も合わせて参照）

プログラミングでは2進数，8進数，16進数が出てくる（一応2進数は高校数学でやってるはず…）．
よくわからない場合は今は読み飛ばしても問題ないが，余力があればこれらについて理解しておきたいところ．

昔，創研学院のI先生が授業中に言っていたが，我々に最も身近なものに60進数がある．それは時間だ．
60秒になると1分に繰り上がり，60分で1時間に繰り上がる．

〇進数とは繰り上がりの数字をどこにするか，というものである．
8進数の場合，8で桁が一つ繰り上がるので，

```
 1(8進数) = 1
 2(8進数) = 2
         :
         :
 7(8進数) = 7
10(8進数) = 8
11(8進数) = 10(8進数) + 1(8進数) = 8 + 1 = 9
20(8進数) = 16

十の位も8で繰り上がるので，
100(8進数) = 64
```
