// const mysql = require('mysql2');

// const con = mysql.createConnection({
//     host: 'localhost',
//     user: 'root',
//     password: '',
//     database: 'collegeDB'
// });

// con.connect((err) => {
//     if (err) {
//         console.error('Error connecting:', err.stack);
//         return;
//     }
//     console.log('Connected to MySQL server');
// });
// module.exports=con;

const mysql = require('mysql2');

// First connect without selecting DB - to create database if not exists
const initialCon = mysql.createConnection({
    host: 'localhost',
    user: 'root',
    password: 'abc123' // add your password if set
});

// Create Database
initialCon.connect((err) => {
    if (err) throw err;
    console.log("Connected to MySQL Server!");

    initialCon.query("CREATE DATABASE IF NOT EXISTS collegeDB", (err) => {
        if (err) throw err;
        console.log("Database 'collegeDB' verified/created");

        // Now create final connection with database
        const con = mysql.createConnection({
            host: 'localhost',
            user: 'root',
            password: 'abc123', // add your password if set
            database: 'collegeDB'
        });

        con.connect((err) => {
            if (err) throw err;
            console.log("Connected to collegeDB Database");
        });

        // Export connection
        module.exports = con;

        initialCon.end(); // Close temporary connection
    });
});
