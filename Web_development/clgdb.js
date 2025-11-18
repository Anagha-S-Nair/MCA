const mysql = require('mysql2');

const con = mysql.createConnection({
    host: 'localhost',
    user: 'anagha',
    password: '1234',
    database: 'collegeDB'
});

con.connect((err) => {
    if (err) {
        console.error('Error connecting:', err.stack);
        return;
    }
    console.log('Connected to MySQL server');
});
module.exports=con;