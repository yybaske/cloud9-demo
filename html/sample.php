<!DOCTYPE html>
<html>
    <head>
    <meta charset="utf-8">
    <title>フォームかPOSTで送信されたデータを表示</title>
    </head>
    <body>
        <form method="POST" action="form-post.php">
            <label>input your name</label>
            <input type="text" name="name" /><br />
            
            <label>input your mailaddress</label>
            <input type="text" name="mail" />
            <input type="submit" value="submit" />
        </form>
    </body>
</html>
<?php 
    echo date("Y-m-d H:i:s") ." 現在\n";
?>