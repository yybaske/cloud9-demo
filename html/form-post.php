<!DOCTYPE html>

<html>
    <head>
        <meta charset="utf-8">
        <title>フォームからPOSTで送信されたデータを表示 - サンプル2</title>
    </head>
<body>
<?php
    echo $_POST["name"] . "さんのメールアドレスは". $_POST["mail"] ."です。";
?>
</form>
</body>
</html>