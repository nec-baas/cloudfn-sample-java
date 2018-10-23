cloudfn-sample-java
===================

# 利用方法

下記のように操作することで、ユーザコードのtar.gzパッケージを作成できます

    $ mvn verify

hello/target ディレクトリ以下に、下記のパッケージが作成されます。

    hello-7.0.0-SNAPSHOT-cloudfn.tar.gz

# モバイルバックエンド基盤サーバへのアップロード方法

nebula-cliを予めインストールしておいてください。

    $ cd hello
    $ nebula init-config

nebula_config.jsonが作成されるので、設定を追記してください。

    $ nebula create-code --file target/hello-7.0.0-SNAPSHOT-cloudfn.tar.gz
