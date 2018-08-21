# やさしいJava

各lessonの要点は，そのlessonのディレクトリ内のREADMEに記載しておく．
以下は各lessonの概要．
気になるところがあれば，そのlessonのディレクトリに移動してREADMEを読むとよい．
- lesson1：
    javaを動かしてみる．Sample1.javaをコンパイルした後実行し，「Hello World!」と出力させた．
- lesson2：
    

# 備忘録


## 関連用語
- 拡張子：
    ファイル名の末尾にある「.〇〇〇」の部分のこと．Javaのソースコードなら「.java」．テキストファイルなら「.txt」．
- ディレクトリ：
    フォルダの別名称．プログラミング界隈ではこの呼び方がスタンダード．
- Github：
    ソースコードを共有することができるサイトの名称
- Git：
    PCにあるソースコードをGithub上にアップロードしたり，いろいろな便利な機能が詰まったアプリ．Windows PowerShellを用いて扱う．
- Windows PowerShell：
    PCに関わる様々な処理をコマンドを用いて行うことができる．コマンドの種類などは後述する．


## Windows PowerShell
PCは数多くのファイルやディレクトリから成っている．それらを統一的に，複雑な処理もできるようにしたアプリケーション的なものがPowerShell（うまい表現がわからない...）．すべてのPCに標準でインストールされている．なお，Mac OSではTerminal（ターミナル）というアプリケーションがこれに該当する．
以下，重要なコマンドを示す．

### cd
ディレクトリ間を移動するためのコマンド．Change Directoryの略．

- `cd <ディレクトリのパス>`

として使う．ここでパスとは，ディレクトリの位置を定めるもの，すなわち住所のようなものであり，絶対パスと相対パスの二種類ある（パスに関しては省略）．cdコマンドを使う際はどちらのパスを用いてもよいが，一般的には相対パスで書くことの方が多い（？）．

以下，cdコマンドの例（cl525は俺のユーザー名）．
```
C:\Users\cl525>                        # PowerShellを起動すると，初めは「C:\Users\<ユーザー名>」にいる
C:\Users\cl525> cd Desktop             # デスクトップディレクトリに移動
C:\Users\cl525\Desktop> cd YJava       # YJavaディレクトリに移動
C:\Users\cl525\Desktop\YJava> cd ..    # 「cd ..」で一つ前のディレクトリに戻ることができる
C:\Users\cl525\Desktop> cd ..

C:\Users\cl525> cd Desktop\YJava       # このように書けば一気に移動できる
C:\Users\cl525\Desktop\YJava>
```

### ls
今いるディレクトリ内のファイルとディレクトリを列挙するコマンド．listの略．使えばわかるから例は省略．

### mkdir
今いるディレクトリ内に新しいディレクトリを作成する．

- `mkdir <ディレクトリ名>`

として使う．
例えばYJavaディレクトリ内にLesson5というディレクトリを作成したい場合は，以下のようにする．
```
C:\Users\cl525> cd Desktop\YJava
C:\Users\cl525\Desktop\YJava> mkdir Lesson5
```

実行後にlsコマンドを使えばきちんとディレクトリができているか確認できるだろう．
なお，今までと同じようにマウスの右クリックメニューから「新規作成」→「フォルダー」で作成しても同じことである．



### Git関連のコマンド
#### Githubへアップロード
YJava内で新しくディレクトリを作成したり，ソースコードファイルを作成した場合，その作業をGithubに反映させなければならない．
その方法を以下に示す．

```
C:\Users\cl525\Desktop\YJava> git add *                  # YJavaディレクトリで行う（Lesson〇〇ディレクトリにいる場合は移動する）
C:\Users\cl525\Desktop\YJava> git commit -m "update"     # updateの部分は好きに変えてもいいが，特に意味はない
C:\Users\cl525\Desktop\YJava> git push                   # このコマンドでリモートへアップデートできる
```

#### Githubからダウンロード
基本的にはみずおしかYJava関連のファイルをいじらないと思うから必要ないけど，もし俺がYJavaに何かしらの変更を加えた場合，みずおのローカルにそれを反映させないといけない．
次のコマンドでリモートからローカルへダウンロードできる．

```
C:\Users\cl525\Desktop\YJava> git pull
```
