function showCourses(){
    fetch("http://localhost:8080/courses")
    .then((response) => response.json())
    .then((data) =>{
           const dataTable=document.getElementById("courseTableBody");
           
           data.forEach(course => {
            var row=`<tr>
            <td>${course.courseId}</td>
            <td>${course.courseName}</td>
            <td>${course.trainerName}</td>
            <td>${course.duration}</td>
            </tr>`
            dataTable.innerHTML+=row;
           });

          
    });
}
function enrolledStudents(){
    fetch("http://localhost:8080/enrolledStudents")
    .then((response) => response.json())
    .then((st) =>{
           const dataTable=document.getElementById("courseTableBody");
           
           st.forEach(student => {
            var row=`<tr>
            <td>${student.name}</td>
            <td>${student.courseName}</td>
            <td>${student.emailId}</td>
            
            </tr>`
            dataTable.innerHTML+=row;
           });

          
    });
}