const con = require('./Ex_db.js');

// SQL query to insert one record
const sql = "INSERT INTO t_db.students (rollno, name) VALUES (5, 'Ram')";

    con.query(sql, (err, result) => {
  if (err) throw err;
  console.log('Record inserted successfully!');
    con.end(); // close the connection
});
