const mysql = require('mysql2');

const con = mysql.createConnection({
    host: 'localhost',
    user: 'root',
    password: '12345678'
});

con.connect((err) => {
    if (err) {
        console.error('Error connecting:', err.stack);
        return;
    }
    console.log('Connected to MySQL server');

    con.query('CREATE DATABASE IF NOT EXISTS T_db', (err, result) => {
        if (err) throw err;
       // console.log('Database T_db created or already exists');
        con.end();
    });
});
module.exports=con;
