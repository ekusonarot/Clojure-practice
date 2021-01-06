# Clojure-practice

Clojureの日本語ガイドで学習したことをまとめていく．

https://ayato-p.github.io/clojure-beginner/


## 使用ライブラリ一覧

* Compojure: ルーティング機能

* Ring: WebサーバとWebアプリケーションやフレームワーク間のインターフェースを定めたもの

* environ: 環境変数を取得する


## ソースコード

ここでは，サンプルコードで見つけた疑問点をまとめる．

### todo-clj/src/todo_clj/core.clj**

**26行目の@:**

```
(when-not @server
```

Clojureの機能としてrefというものがある．refの実態を取得するのに`@varname`という書式を使用する．
`@`はマクロ文字で`(deref varname)`と展開される．

```
user=> (def ref-sample (ref 0))
#'user/ref-sample
user=> (println ref-sample )
#object[clojure.lang.Ref 0x18fdb6cf {:status :ready, :val 0}]
nil
user=> (println @ref-sample)
0
nil
user=> (println (deref ref-sample ))
0
nil
```


**27行目の#'app(appはハンドラ):**

```
    (reset! server (server/run-jetty #'app {:port 3000 :join? false}))))
```
`#'app`はvarオブジェクト，`app`は関数のシンボル．
シンボルを直接渡すと`app`を束縛していたオブジェクトが直接`run-jetty`にわたってしまい，後から変更ができない．
varオブジェクトを渡せば，`run-jetty`はvarに格納されたオブジェクトをその都度参照するので，`app`の再評価だけで後から行った変更が反映される．

