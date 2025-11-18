const con = require('./clgdb.js');

// SQL query to insert one record
const sql = "DELETE FROM students WHERE rollno=6";

    con.query(sql, (err, result) => {
  if (err) throw err;
  console.log('Record deleted successfully!');
    con.end(); // close the connection
});