<?php
$servername = "remotemysql.com";
$username = "vyhs1bMBpj";
$password = "nh3kCOBPE5";
$dbname = "vyhs1bMBpj";

// Create connection
$remotemysql = $servername;
$conn = new mysqli(remotemysql.com, vyhs1bMBpj, nh3kCOBPE5, vyhs1bMBpj);
// Check connection
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}
echo "Connected successfully";

