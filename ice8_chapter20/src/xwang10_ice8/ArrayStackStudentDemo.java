public class ArrayStackStudentDemo {
    public static void main(String[] args) {
        ArrayStackStudent studentList = new ArrayStackStudent(10);
        System.out.println("Pushing 5 students onto the stack.");
        studentList.push("John");
        studentList.push("Jane");
        studentList.push("Bob");
        studentList.push("Mary");
        studentList.push("Jack");
        System.out.println("Value at top of the stack is:" + studentList.peek());
        System.out.println("Poping and printing all value: ");
        while(!studentList.isEmpty()) {
            System.out.println(studentList.pop() + " ");
        }
    }
}
