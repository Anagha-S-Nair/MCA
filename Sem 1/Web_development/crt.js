const con = require('./clgdb.js');

const cr_Tb = `
    CREATE TABLE IF NOT EXISTS students (
        rollno INT PRIMARY KEY,
        name VARCHAR(15)
    )
`;

// Run the query
con.query(cr_Tb, (err) => {
    if (err) {
        console.error('Error creating table',err);
        return;
    }
    console.log('Table students created');
    con.end();
});