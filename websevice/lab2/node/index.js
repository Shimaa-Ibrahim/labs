const express = require('express');
const PORT = process.env.PORT || 4000
const app = express();
app.use(express.json())
let students = []

app.get('/',(req,res)=>{
    res.send(students)
})

app.post('/',(req,res)=>{
    let id = students.length+1
    const { body: {name, age , courses, married } } = req;
    const student = {
        id,
        name,
        age,
        courses,
        married,
    }
    students.push(student)
    res.send(students)
})

app.put('/:id',(req,res)=>{  
    const { body: {name, age , courses, married } } = req;
    students = students.map(student=>{
        if(student.id == req.params.id){
            student.name = name,
            student.age = age,
            student.courses = courses,
            student.married = married
        }
        return student
    })
    
    res.send(students)
})

app.delete('/:id',(req,res)=>{
    students = students.filter(student=> student.id != req.params.id)   
    res.send(students)   
})

app.listen( PORT, (err)=>{
    if(!err) console.log(`success ${PORT}`)
   
})

