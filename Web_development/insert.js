const con = require('./clgdb.js');

// SQL query to insert one record
const sql = "INSERT INTO students (rollno, name) VALUES (6 ,'Rom')";

    con.query(sql, (err, result) => {
  if (err) throw err;
  console.log('Record inserted successfully!');
    con.end(); // close the connection
});