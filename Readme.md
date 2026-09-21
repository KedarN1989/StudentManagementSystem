Object Creation and Management: - In the `Main` class, instantiate three `Student` objects, each with different details. - Enroll each student in 2–3 different courses. - Print the details of each student using the `printStudentInfo()` method.
Part 2: Collections and Exception Handling
4. Manage a List of Students: - In the `Main` class, create a `List<Student>` to store the student objects. - Add the three `Student` objects to this list. - Write a method `Student findStudentById(String studentId)` that searches for a student in the list by their `studentId` and returns the `Student` object. If the student is not found, throw an appropriate exception with a custom message.
5. Exception Handling: - Modify the `Main` class to handle the exception thrown by `findStudentById`. - If an exception occurs, display a message like: "Student with ID [ID] not found."
Part 3: Optional (Bonus)
6. Advanced Features: - Implement sorting of students by their `name` using `Collections.sort()` and a custom `Comparator`. - Allow users to input new students and enroll in courses through the console.
