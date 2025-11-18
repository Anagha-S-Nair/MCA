const con = require('./clgdb.js'); // your MySQL connection

// Query to get all rows
const sql = "SELECT * FROM students";

con.query(sql, (err, results) => {
  if (err) throw err;

  console.log("Student Records:");
  console.table(results); // prints a nice table in console

  con.end(); // close connection
});