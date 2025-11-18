const con = require('./clgdb.js');

// SQL query to insert one record
const sql = "UPDATE students SET name='Anu' WHERE rollno=5";

    con.query(sql, (err, result) => {
  if (err) throw err;
  console.log('Record inserted successfully!');
    con.end(); // close the connection
});